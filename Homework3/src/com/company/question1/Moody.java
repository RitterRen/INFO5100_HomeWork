package com.company.question1;

public abstract class Moody {

    //Return mood
    abstract String getMood();

    abstract void ExpressFeelings();

    public void queryMood() {
        System.out.println("I feel " + this.getMood() + " today!!");
    }

}
