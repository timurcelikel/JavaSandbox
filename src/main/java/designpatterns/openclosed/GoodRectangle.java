package designpatterns.openclosed;

public class GoodRectangle implements Shape {

	private double length;

	private double width;

	public double getLength() {

		return length;
	}

	public void setLength(final double length) {

		this.length = length;
	}

	public double getWidth() {

		return width;
	}

	public void setWidth(final double width) {

		this.width = width;
	}

	@Override
	public double calculateArea() {

		return this.getLength() * this.getWidth();
	}
}
