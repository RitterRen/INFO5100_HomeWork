package com.company.question1;

public class Psychiatris {

    public void examine(Moody moody){
        moody.queryMood();
        System.out.println();
    }

    public void observe(Moody moody){
        moody.ExpressFeelings();
        System.out.println(this.toString() + moody.toString());
    }

    @Override
    public String toString(){
        return "Observation: ";
    }
}
