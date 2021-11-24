package com.Question1;

public class SynchronizedLinkedList {
    private LinkedList linkedList;
    private Object lock = new Object();

    public SynchronizedLinkedList(int headValue) {
        this.linkedList = new LinkedList(headValue);
    }

    public void addAtPosition(int index, int element){
        synchronized (lock) {
            linkedList.addAtPosition(index, element);
        }
    }

    public void removeAtPosition(int index, int element){
        synchronized (lock) {
            linkedList.removeAtPosition(index, element);
        }
    }

    public int getFirst() {
        synchronized(lock) {
            return linkedList.getFirst();
        }
    }

    public int getLast() {
        synchronized (lock) {
            return linkedList.getLast();
        }
    }

    public int size(){
        synchronized (lock){
            return linkedList.size();
        }
    }
}
