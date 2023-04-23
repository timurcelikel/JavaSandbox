package designpatterns.openclosed;

public class AreaCalculator {

	public double calculateRectangleArea(BadRectangle badRectangle) {

		return badRectangle.getLength() * badRectangle.getWidth();
	}

	public double calculateCircleArea(BadCircle badCircle) {

		return (22 / 7) * badCircle.getRadius() * badCircle.getRadius();
	}

	public double calculateShapeArea(Shape shape) {

		return shape.calculateArea();
	}
}
