package designpatterns.codetointerface;

public class Monitor implements DisplayModule {

	@Override
	public void display() {

		System.out.println("Display using a monitor");
	}
}
