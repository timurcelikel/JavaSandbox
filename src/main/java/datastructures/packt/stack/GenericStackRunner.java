package datastructures.packt.stack;

public class GenericStackRunner {

	public static void main(String[] args) {
		StackGeneric<String> stack = new StackGeneric<>("hello");
		System.out.println("--- Stack after init ---");
		stack.printStack();
		stack.push("world");
		System.out.println("--- Stack after push ---");
		stack.printStack();
		Element<String> poppedElement = stack.pop();
		System.out.println("Popped element: " + poppedElement.value);
		System.out.println("--- Stack after pop ---");
		stack.printStack();

		StackGeneric<Integer> integerStack = new StackGeneric<>(10);
		System.out.println("--- Int Stack after init ---");
		integerStack.printStack();
		integerStack.push(9);
		System.out.println("--- Int Stack after push ---");
		integerStack.printStack();

		System.out.println("--- Int Stack peek at top ---");
		System.out.println("Peeking at top: " + integerStack.peek().value);
	}
}
