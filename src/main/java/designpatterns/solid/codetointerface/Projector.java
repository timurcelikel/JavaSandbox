package designpatterns.solid.codetointerface;

public class Projector implements DisplayModule {

	@Override
	public void display() {

		System.out.println("Display using a projector");
	}
}
