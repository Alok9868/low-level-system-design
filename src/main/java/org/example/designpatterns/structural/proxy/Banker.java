package org.example.designpatterns.structural.proxy;

public interface Banker {

    public void doTransaction(Integer accountId, Integer amount);
    public void checkBalance(Integer accountId);
}
