package designpatterns.strategy;

public class PerformOperationContext {

	private PerformOperationStrategy performOperationStrategy;

	public void setPerformOperationStrategy(final PerformOperationStrategy performOperationStrategy) {

		this.performOperationStrategy = performOperationStrategy;
	}

	public void executeStrategy(int number1, int number2) {
		performOperationStrategy.performOperation(number1, number2);
	}
}
