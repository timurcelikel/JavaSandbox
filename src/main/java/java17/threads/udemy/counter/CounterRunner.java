package java17.threads.udemy.counter;

import java17.threads.udemy.basic.ThreadColor;

public class CounterRunner {
	public static void main(String[] args) {
		Countdown countdown = new Countdown();

		CountdownThread t1 = new CountdownThread(countdown);
		t1.setName("Thread 1");

		CountdownThread t2 = new CountdownThread(countdown);
		t2.setName("Thread 2");

		t1.start();
		t2.start();
	}
}

class Countdown {

	// Note: Creating i here as an instance variable can give us some thread safety issues if we don't either synchronize the doCountdown() method
	// or wrap our for loop in a synchronized block.
	private int i;
	public void doCountdown() {
		String color = switch (Thread.currentThread().getName()) {
			case "Thread 1" -> ThreadColor.ANSI_CYAN;
			case "Thread 2" -> ThreadColor.ANSI_PURPLE;
			default -> ThreadColor.ANSI_GREEN;
		};

		synchronized(this) {
			for (i = 10; i > 0; i--) {
				System.out.println(color + Thread.currentThread().getName() + ": i=" + i);
			}
		}
	}
}

class CountdownThread extends Thread {
	private final Countdown threadCountdown;

	public CountdownThread(Countdown countDown) {
		threadCountdown = countDown;
	}
	public void run() {
		threadCountdown.doCountdown();
	}
}