package designpatterns.strategy;

public class UdemyStrategyChallenge {

	public static void main(String[] args) {

		System.out.println("Perform Addition Operation...");
		PerformOperationStrategy additionStrategy = new AdditionOperationStrategy();
		PerformOperationContext addContext = new PerformOperationContext();
		addContext.setPerformOperationStrategy(additionStrategy);
		addContext.executeStrategy(5, 3);

		System.out.println("Perform Subtraction Operation...");
		PerformOperationStrategy subtractionStrategy = new SubtractionOperationStrategy();
		PerformOperationContext subtractionContext = new PerformOperationContext();
		subtractionContext.setPerformOperationStrategy(subtractionStrategy);
		subtractionContext.executeStrategy(5, 3);
	}
}
