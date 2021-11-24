package com.Question1;

public class LinkedList {
    LinkedNode head;
    int size = 0;

    public LinkedList( int headValue ) {
        this.head = new LinkedNode(headValue);
        this.size += 1;
    }

    public void addAtPosition(int index, int element){
        LinkedNode p = head;
        //LinkedNode pre = null;
        while ( index > 1 ) {
            p = p.next;
        }
        LinkedNode newNode = new LinkedNode(element);
        newNode.next = p.next;
        p.next = newNode;
        this.size += 1;
    }

    public void removeAtPosition(int index, int element){
        LinkedNode p = head;
        while (index > 1) {
            p = p.next;
        }
        p.next = p.next.next;
        this.size -= 1;
    }

    public int getFirst() {
        return head.value;
    }

    public int getLast() {
        LinkedNode p = head;
        while (p.next != null) {
            p = p.next;
        }
        return p.value;
    }

    public int size() {
        return this.size;
    }

}