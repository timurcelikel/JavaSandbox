package designpatterns.codetointerface;

public class Computer {

	private DisplayModule displayModule;

	public void setDisplayModule(final DisplayModule displayModule) {

		this.displayModule = displayModule;
	}

	public void display() {

		displayModule.display();
	}
}
