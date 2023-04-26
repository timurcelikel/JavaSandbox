package designpatterns.factorymethod.shapesabstract;

public class RectangleFactory implements ShapeFactory {

	@Override
	public Shape factoryMethod() {

		return new Rectangle();
	}
}
