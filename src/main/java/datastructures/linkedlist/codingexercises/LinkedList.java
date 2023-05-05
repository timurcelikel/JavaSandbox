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


    public void printAll() {
        System.out.println("Head: " + head.value);
        System.out.println("Tail: " + tail.value);
        System.out.println("Length: " + length);
    }

    public void printList() {
        if (length == 0) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        System.out.println("Printing list...");
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            Node temp = head;
            newNode.next = head;
            head = newNode;
            length++;
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

    public Node removeLast() {
        if (length == 0) {
            System.out.println("List is empty");
            return null;
        } else if (length == 1) {
            Node temp = tail;
            tail = null;
            head = null;
            length = 0;
            System.out.println("Removed Node: " + temp.value);
            return temp;
        } else {
            Node temp = head;
            Node pre = head;
            while (temp.next != null) {
                pre = temp;
                temp = temp.next;
            }
            tail = pre;
            tail.next = null;
            length--;
            System.out.println("Removed Node: " + temp.value);
            return temp;
        }
    }
}
