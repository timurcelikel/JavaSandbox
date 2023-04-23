package designpatterns.openclosed;

public class GoodSquare implements Shape {

	private double radius;

	public double getRadius() {

		return radius;
	}

	public void setRadius(final double radius) {

		this.radius = radius;
	}

	@Override
	public double calculateArea() {

		return (22 / 7) * this.getRadius() * this.getRadius();
	}
}
