package designpatterns.factorymethod.shapesabstract;

public class SquareFactory implements ShapeFactory {

	@Override
	public Shape factoryMethod() {

		return new Square();
	}
}
