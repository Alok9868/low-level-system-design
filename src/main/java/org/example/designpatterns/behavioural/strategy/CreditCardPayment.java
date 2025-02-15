package org.example.designpatterns.behavioural.strategy;

public class CreditCardPayment implements PaymentInterface{


    String cardNo;
    String expiryDate;
    String cVV;

    public CreditCardPayment(String cardNo, String expiryDate, String cVV) {
        this.cardNo = cardNo;
        this.expiryDate = expiryDate;
        this.cVV = cVV;
    }

    @Override
    public void pay(Integer amt) {
        System.out.println("successfully debited amount from credit card");
        System.out.println(amt);
    }
}
