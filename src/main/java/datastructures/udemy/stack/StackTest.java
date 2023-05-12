package datastructures.udemy.stack;
import datastructures.udemy.linkedlist.codingexercises.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class StackTest {

	@Test
	public void testStackPush() {

		Stack stack = new Stack(10);
		stack.push(9);
		stack.push(8);
		stack.printStack();

		assertEquals(3, stack.getSize());

		Stack stack2 = new Stack();
		stack2.push(20);
		stack2.push(19);
		stack2.printStack();
		assertEquals(2, stack2.getSize());
	}

	@Test
	public void testStackPop() {

		Stack stack = new Stack(10);
		stack.push(9);
		stack.push(8);
		stack.printStack();
		Node node = stack.pop();
		assertEquals(8, node.getValue());
		Node node2 = stack.pop();
		Node node3 = stack.pop();
		Node node4 = stack.pop();
		assertEquals(0, stack.getSize());
	}
}
