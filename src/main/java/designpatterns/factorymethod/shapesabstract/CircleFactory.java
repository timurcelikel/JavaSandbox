package designpatterns.factorymethod.shapesabstract;

public class CircleFactory implements ShapeFactory {

	@Override
	public Shape factoryMethod() {

		return new Circle();
	}
}
