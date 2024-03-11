package org.example.designpatterns.strategy;


public class ShoppingCard {
    Integer item;
    Integer amount;

    public Integer getItem() {
        return item;
    }

    public void setItem(Integer item) {
        this.item = item;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public PaymentInterface getPaymentInterface() {
        return paymentInterface;
    }

    public void setPaymentInterface(PaymentInterface paymentInterface) {
        this.paymentInterface = paymentInterface;
    }

    PaymentInterface paymentInterface;

    public void pay(Integer amt)
    {
        paymentInterface.pay(amt);
    }
    public void purchase(Integer item)
    {
        System.out.println("Successfully added item to cart");
    }

}
