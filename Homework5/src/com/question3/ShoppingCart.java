package com.question3;

public class ShoppingCart {
    private int price;

    public ShoppingCart(){

    }

    public void addItem(Item item){
        this.price += item.getPrice();
    }

    public void removeItem(Item item) {
        this.price -= item.getPrice();
    }

    public int calculateTotal(){
        return price;
    }

    public void pay(PaymentStrategy paymentStrategy){
        paymentStrategy.pay(price);
    }
}
