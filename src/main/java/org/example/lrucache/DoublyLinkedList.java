package org.example.lrucache;

public class DoublyLinkedList <V>{

    private Integer key;
    private V value;
    private DoublyLinkedList<V> next;
    private DoublyLinkedList<V> prev;

    public DoublyLinkedList<V> getNext() {
        return next;
    }

    public Integer getKey() {
        return key;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public void setNext(DoublyLinkedList<V> next) {
        this.next = next;
    }

    public DoublyLinkedList(Integer key) {
        this.key = key;
        this.next=null;
        this.prev=null;
    }

    public DoublyLinkedList<V> getPrev() {
        return prev;
    }

    public void setPrev(DoublyLinkedList<V> prev) {
        this.prev = prev;
    }


}
