package datastructures.linkedlist.codingexercises;

public class CodingExercise1 {

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
        myList.append(100);
        myList.prepend(99);
        myList.prepend(88);
        myList.printList();

    }
}
