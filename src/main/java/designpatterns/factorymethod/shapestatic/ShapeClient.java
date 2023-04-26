package designpatterns.factorymethod.shapestatic;

public class ShapeClient {

	public static void main(String[] args) {

		Shape circle = ShapeFactory.getShape("circle");
		circle.draw();

		Shape rectangle = ShapeFactory.getShape("rectangle");
		rectangle.draw();

		Shape square = ShapeFactory.getShape("square");
		square.draw();
	}
}
