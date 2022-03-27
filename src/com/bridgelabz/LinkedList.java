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
    /*
     * This is the method to add last element
     */
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }
    /*
     * This is the method to display elements
     */
    public void printList() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");    // print the currentNode data
            currentNode = currentNode.next;                 // update the current node
        }
        System.out.println("NULL");                         // print the null
    }
    /*
     * This is the method to delete first element
     */
    public void deleteFirst() {
        if
        (head == null) {
            System.out.println("The list is empty");
            return;
        }
        head = head.next;
    }
}
