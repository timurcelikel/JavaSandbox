package datastructures.linkedlist.codingexercises;
import org.junit.Test;

import static org.junit.Assert.*;
public class LinkedListTest {

	@Test
	public void linkedListAppendTest() {

		LinkedList myList = new LinkedList(10);
		myList.append(23);
		myList.append(11);
		assertEquals(3, myList.getSize());
	}
	@Test
	public void linkedListRemoveLastTest() {

		LinkedList myList = new LinkedList(10);
		myList.append(23);
		myList.append(11);
		Node node = myList.removeLast();
		assertEquals(11, node.getValue());
	}
	@Test
	public void linkedListPrependingTest() {

		LinkedList myList = new LinkedList(10);
		myList.append(23);
		myList.append(11);
		myList.prepend(15);
		Node node = myList.get(0);
		assertEquals(15, node.getValue());
	}
	@Test
	public void linkedListRemoveFirstNodeTest() {

		LinkedList myList = new LinkedList(10);
		myList.append(23);
		myList.append(11);
		Node node = myList.removeFirst();
		assertEquals(10, node.getValue());
	}
	@Test
	public void linkedListGetNodeTest() {

		LinkedList myList = new LinkedList(10);
		myList.append(23);
		myList.append(11);

		assertEquals(10, myList.get(0).getValue());
		assertEquals(23, myList.get(1).getValue());
		assertEquals(11, myList.get(2).getValue());
		assertNull(myList.get(3));
		assertNull(myList.get(-1));
	}

	@Test
	public void linkedListSetNodeTest() {

		LinkedList myList = new LinkedList(10);
		myList.append(23);
		myList.append(11);
		myList.printList();

		boolean wasAbleToSet = myList.set(1, 99);
		assertTrue(wasAbleToSet);
		assertEquals(99, myList.get(1).getValue());
		myList.printList();

		boolean wasAbleToSet2 = myList.set(4, 99);
		assertFalse(wasAbleToSet2);
	}

	@Test
	public void linkedListInsertNodeTest() {

		LinkedList myList = new LinkedList(10);
		myList.append(11);
		myList.append(13);
		myList.printList();                // Prints 10 11 13

		boolean wasAbleToInsert = myList.insert(0, 9);
		myList.printList();            // Prints 9 10 11 13
		assertTrue(wasAbleToInsert);
		assertEquals(9, myList.get(0).getValue());

		boolean wasAbleToInsert2 = myList.insert(3, 12);
		myList.printList();            // Prints 9 10 11 12 13
		assertTrue(wasAbleToInsert2);
		assertEquals(12, myList.get(3).getValue());

		boolean wasAbleToInsert3 = myList.insert(5, 14);
		myList.printList();
		assertTrue(wasAbleToInsert3);
		assertEquals(14, myList.get(5).getValue());

		boolean wasAbleToInsert4 = myList.insert(7, 15);
		assertFalse(wasAbleToInsert4);
	}

	@Test
	public void linkedListRemoveNodeTest() {

		LinkedList myList = new LinkedList(10);
		myList.append(11);
		myList.append(13);
		myList.printList();
		Node removedNode = myList.remove(1);
		myList.printList();            // prints 10 13
		assertEquals(11, removedNode.getValue());

		Node removedNode2 = myList.remove(1);
		myList.printList();            // prints 10
		assertEquals(13, removedNode2.getValue());

		Node removedNode3 = myList.remove(1);
		assertNull(removedNode3);

		Node removedNode4 = myList.remove(0);
		myList.printList();
		assertEquals(10, removedNode4.getValue());
	}
}