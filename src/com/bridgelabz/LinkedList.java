package com.bridgelabz;

public class LinkedList {
    Node head;
    // node creation
    class Node {
        int data;
        Node next;
    //Constructor
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    /*
     * This is the method to add first element
     */
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
}
