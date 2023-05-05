package datastructures.linkedlist.codingexercises;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    public LinkedList(final int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public void printAll() {
        System.out.println("Head: " + head.value);
        System.out.println("Tail: " + tail.value);
        System.out.println("Length: " + length);
    }

    public void printList() {
        Node temp = head;        // Start at head
        System.out.println("Printing List... ");
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;    // Iterate through LL until we are at the end (null)
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    class Node {
        int value;
        Node next;

        public Node(final int value) {
            this.value = value;
        }
    }
}
