package designpatterns.codetointerface;

public class InterfaceRunner {

	public static void main(String[] args) {

		Computer computerWithMonitor = new Computer();
		computerWithMonitor.setDisplayModule(new Monitor());
		computerWithMonitor.display();

		Computer computerWithProjector = new Computer();
		computerWithProjector.setDisplayModule(new Projector());
		computerWithProjector.display();
	}
}
