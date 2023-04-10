package java17.threads;

import java.util.concurrent.TimeUnit;

class MyRunnable implements Runnable {

	private String name;

	public MyRunnable(String name) {

		this.name = name;
	}

	public void run() {

		try {
			while (true) {
				System.out.println(this.name + " is working...");
				TimeUnit.SECONDS.sleep(1);
			}
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			System.out.println(this.name + " was interrupted\n" + this.name + " Thread.currentThread().isInterrupted()="
					+ Thread.currentThread().isInterrupted());
		}
	}
}
