package concurrency.durga;
public class Display {

	public void displayn() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}

	public void displayc() {
		for (int i = 65; i <= 75; i++) {
			System.out.println(Thread.currentThread().getName() + " " + (char) i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}
