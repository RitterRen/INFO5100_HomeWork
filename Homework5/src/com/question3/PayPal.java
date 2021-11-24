package com.question3;

public class PayPal implements PaymentStrategy{
    private String email;

    public PayPal(String email){
        this.email = email;
    }

    @Override
    public void pay(int money) {
        System.out.println("Paypal : $" + money);
    }
}
