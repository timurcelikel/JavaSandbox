package designpatterns.factorymethod.shapesabstract;

public interface ShapeFactory {

	Shape factoryMethod();

	default Shape getShape() {

		return factoryMethod();
	}
}
