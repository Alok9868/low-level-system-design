package org.example.designpatterns.structural.proxy;

public class BankerProxy implements Banker {

    Banker banker;

    BankerProxy(Banker banker) {
        this.banker = banker;
    }

    @Override
    public void doTransaction(Integer accountId, Integer amount) {

        // check if that account even exists
        if (accountId!=null)
        {
            banker.doTransaction(accountId, amount);
        }
        else
        {
            System.out.println("accountId is null");
        }

    }

    @Override
    public void checkBalance(Integer accountId) {
        if (accountId!=null) {
            banker.checkBalance(accountId);
        }
        else
        {
            System.out.println("accountId is null");
        }
    }
}
