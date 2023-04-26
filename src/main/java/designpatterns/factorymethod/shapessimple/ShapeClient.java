package designpatterns.factorymethod.shapessimple;

public class ShapeClient {

	public static void main(String[] args) {

		ShapeFactory shapeFactory = new ShapeFactory();

		Shape circle = shapeFactory.getShape("circle");
		circle.draw();

		Shape rectangle = shapeFactory.getShape("rectangle");
		rectangle.draw();

		Shape square = shapeFactory.getShape("square");
		square.draw();
	}
}
