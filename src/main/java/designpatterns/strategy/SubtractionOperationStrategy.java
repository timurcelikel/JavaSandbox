package designpatterns.strategy;

public class SubtractionOperationStrategy implements PerformOperationStrategy {

	@Override
	public void performOperation(final int number1, final int number2) {

		int result = number1 - number2;
		System.out.println("Result of Subtraction = " + result);
	}
}
