package org.example;

import org.example.lrucache.DoublyLinkedList;
import org.example.lrucache.LruCache;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

//        ShoppingCard shoppingCard=new ShoppingCard();
//        shoppingCard.setPaymentInterface(new CreditCardPayment("asdf","12","12"));
//        shoppingCard.setItem(12);
//        shoppingCard.pay(10000);
//
//
//        shoppingCard.setPaymentInterface(new PayPalPayment("asdf","12"));
//        shoppingCard.setItem(12);
//        shoppingCard.pay(10000);


        LruCache<String> lruCache = new LruCache<>(5);
        Thread t1 = new Thread(() -> {
            lruCache.put(10, "167");
            lruCache.put(12, "18");
            lruCache.put(13, "109");
            lruCache.put(14, "100");
            lruCache.put(156, "1000");
            lruCache.put(10, "5");
            lruCache.put(1, "adsf");
            System.out.println(lruCache.get(1));
        });
        Thread t2 = new Thread(() -> {
            lruCache.put(10, "167");
            lruCache.put(12, "18");
            lruCache.put(13, "109");
            lruCache.put(14, "100");
            lruCache.put(156, "1000");
            lruCache.put(10, "5");
            lruCache.put(1, "oowe");
            System.out.println(lruCache.get(1));
        });

        t1.start();
        t2.start();
        HashMap<Integer, DoublyLinkedList<String>> hashMap = lruCache.hashMap;
        hashMap.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));


    }
}