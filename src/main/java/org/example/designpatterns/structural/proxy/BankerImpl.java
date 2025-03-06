package org.example.designpatterns.structural.proxy;

public class BankerImpl implements Banker {


    @Override
    public void doTransaction(Integer accountId, Integer amount) {

        System.out.println("transaction for accountId: " + accountId + " amount: " + amount + "is done");
    }

    @Override
    public void checkBalance(Integer accountId) {
        System.out.println("check balance for accountId: " + accountId + "is done");
    }
}
