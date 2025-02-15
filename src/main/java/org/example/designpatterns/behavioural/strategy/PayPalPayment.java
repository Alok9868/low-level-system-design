package org.example.designpatterns.behavioural.strategy;

public class PayPalPayment implements PaymentInterface {

    String email;
    String password;

    public PayPalPayment(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(Integer amt) {

        System.out.println("Successfully debited from paypal account amount");
        System.out.println(amt);
    }
}
