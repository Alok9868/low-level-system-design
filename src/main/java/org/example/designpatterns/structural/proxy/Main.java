package org.example.designpatterns.structural.proxy;

public class Main {


//    The Proxy Design Pattern is a structural design pattern that provides an object (proxy)
//    as a substitute for another object (real subject). The proxy acts as an intermediary,
//    controlling access to the real object while adding additional functionality like caching,
//    security, logging, or lazy initialization.

    // examples are - filter , interceptors , AOP -  they work on proxy pattern
    public static void main(String[] args) {

        Banker banker = new BankerImpl();
        BankerProxy bankerProxy = new BankerProxy(banker);
        // here we are doing operation on proxy compare to direct object
        bankerProxy.doTransaction(1, 100);
        bankerProxy.checkBalance(1);
        // here we are sending null so that the request not even goes to real object
        // and it is return from proxy itself , for security purposes .
        bankerProxy.doTransaction(null, 100);
    }
}
