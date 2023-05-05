package datastructures.linkedlist;

class Node {

    int value;
    Node next;

    public Node(int value) {
        this.value = value;
    }
}

class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value) {
        Node temp = new Node(value);
        head = temp;
        tail = temp;
        length = 1;
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
            // 11 15 23
            Node temp = tail;
            tail = head;
            while (tail.next != null) {
                temp = tail;
                tail = tail.next;
            }
            Node pre = tail;
            tail = temp;
            tail.next = null;
            length--;
            System.out.println("Removed Node: " + pre.value);
            return pre;
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
}

public class LL_Scratch {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList(10);
        myList.printList();
        myList.append(23);
        myList.append(11);
        myList.printList();

        myList.removeLast();
        myList.printList();

        myList.removeLast();
        myList.printList();

        myList.removeLast();
        myList.removeLast();
    }
}