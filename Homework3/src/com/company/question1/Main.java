package com.company.question1;

public class Main {
    public static void main(String[] args){
        Moody happy = new Happy();
        Moody sad = new Sad();
        Psychiatris psychiatris = new Psychiatris();

        System.out.println("How are you feeling today?");
        psychiatris.examine(happy);
        psychiatris.observe(happy);

        System.out.println();
        System.out.println();

        System.out.println("How are you feeling today?");
        psychiatris.examine(sad);
        psychiatris.observe(sad);
    }
}
