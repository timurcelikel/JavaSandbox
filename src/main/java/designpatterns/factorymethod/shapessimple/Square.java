package designpatterns.factorymethod.shapessimple;

public class Square implements Shape {

	@Override
	public void draw() {

		System.out.println("Inside Square::draw() method");
	}
}
