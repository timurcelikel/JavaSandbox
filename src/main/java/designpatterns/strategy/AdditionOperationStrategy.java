package designpatterns.strategy;

public class AdditionOperationStrategy implements  PerformOperationStrategy {

	@Override
	public void performOperation(final int number1, final int number2) {

		int sum = number1 + number2;
		System.out.println("Result of addition = " + sum);
	}
}
