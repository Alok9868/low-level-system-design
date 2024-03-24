package org.example.lrucache;

import java.util.HashMap;
import java.util.Objects;

public class LruCache<V> {

    DoublyLinkedList<V> head;
    DoublyLinkedList<V> tail;
    public HashMap<Integer, DoublyLinkedList<V>> hashMap;
    Integer capacity;
    Integer currSize;

    public LruCache(Integer capacity) {
        head = new DoublyLinkedList<V>(-1);
        tail = new DoublyLinkedList<V>(-1);
        head.setNext(tail);
        tail.setPrev(head);
        this.hashMap = new HashMap<>();
        this.capacity = capacity;
        this.currSize = 0;
    }

    public void put(Integer key, V value) {
        DoublyLinkedList<V> node = hashMap.get(key);
        if (node != null) {
            // remove that node from the hashmap and added a new node in front of the linked list
            deleteNodeFromLinkedList(node);
            addNodeInFrontOfLinkedList(key, value);
        } else {
            // check if we reach the capacity
            if (Objects.equals(currSize, capacity)) {
                // delete the lru key and add a new key
                deleteNodeFromLinkedList(tail.getPrev());
            }
            // add the new key in hashmap and linkedlist
            addNodeInFrontOfLinkedList(key, value);
        }
    }

    public V get(Integer key) {
        DoublyLinkedList<V> node = hashMap.get(key);
        if (node != null) {
            // delete that node from its current position and insert it in the front of the linkedlist
            deleteNodeFromLinkedList(node);
            addNodeInFrontOfLinkedList(key, node.getValue());
            return node.getValue();
        }
        return null;
    }

    private void addNodeInFrontOfLinkedList(Integer key, V value) {
        DoublyLinkedList<V> node = new DoublyLinkedList<>(key);
        node.setValue(value);
        hashMap.put(key, node);
        node.setNext(head.getNext());
        node.getNext().setPrev(node);
        head.setNext(node);
        node.setPrev(head);
        currSize++;
    }

    private void deleteNodeFromLinkedList(DoublyLinkedList<V> node) {
        Integer key = node.getKey();
        hashMap.remove(key);
        node.getPrev().setNext(node.getNext());
        node.getNext().setPrev(node.getPrev());
        currSize--;
    }


}
