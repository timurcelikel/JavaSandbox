package designpatterns.factorymethod.shapestatic;

public class Square implements Shape {

	@Override
	public void draw() {

		System.out.println("Inside Square::draw() method");
	}
}
