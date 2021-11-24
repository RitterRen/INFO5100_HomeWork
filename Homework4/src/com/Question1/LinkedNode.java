package com.Question1;

public class LinkedNode {
    int value = 0;
    LinkedNode next = null;

    public LinkedNode(int value){
        this.value = value;
    }

    public LinkedNode(int value, LinkedNode next){
        this.value = value;
        this.next = next;
    }
}
