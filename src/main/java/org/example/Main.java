package org.example;

import org.example.designpatterns.singleton.Samosa;
import org.example.designpatterns.strategy.CreditCardPayment;
import org.example.designpatterns.strategy.PayPalPayment;
import org.example.designpatterns.strategy.ShoppingCard;

public class Main {
    public static void main(String[] args) {

        ShoppingCard shoppingCard=new ShoppingCard();
        shoppingCard.setPaymentInterface(new CreditCardPayment("asdf","12","12"));
        shoppingCard.setItem(12);
        shoppingCard.pay(10000);


        shoppingCard.setPaymentInterface(new PayPalPayment("asdf","12"));
        shoppingCard.setItem(12);
        shoppingCard.pay(10000);




    }
}