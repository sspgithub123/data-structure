package com.bridgelabz;

public class Stack {
    // LIFO
    LinkedList linkedList = new LinkedList();
    // Push : Adding elements
    public void push(int data) {
        linkedList.addFirst(data);
    }
    // Pop : Deleting elements
    public void pop() {
        linkedList.deleteFirst();
    }
    // TO display
    public void displayStack() {
        linkedList.printList();
    }
}