package concurrency.durga;
public class MyThread2 extends Thread {

	Display d;
	public MyThread2(Display d) {
		this.d = d;
	}

	@Override
	public void run() {
		d.displayc();
	}
}
