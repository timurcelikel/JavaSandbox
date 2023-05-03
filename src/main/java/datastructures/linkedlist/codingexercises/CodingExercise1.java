package datastructures.linkedlist.codingexercises;
public class CodingExercise1 {
	public static void main(String[] args) {

		LinkedList myLinkedList = new LinkedList(4);

		myLinkedList.printAll();

		System.out.println("\nLinked List:");
		myLinkedList.printList();

        /*
            EXPECTED OUTPUT:
            ----------------
            Head: 4
            Tail: 4
            Length: 1

            Linked List:
            4
        */
	}
}
