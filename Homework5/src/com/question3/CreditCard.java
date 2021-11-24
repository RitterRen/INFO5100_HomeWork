package com.question3;

public class CreditCard implements PaymentStrategy{
    private String cardNumber;

    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int money) {
        System.out.println("CreditCard : $" + money);
    }
}
