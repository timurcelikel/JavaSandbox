package java17.threads.udemy;

import static java17.threads.udemy.ThreadColor.*;
public class Main {

	public static void main(String[] args) {
		System.out.println(ANSI_PURPLE + "Hello from the main thread.");

		Thread anotherThread = new AnotherThread();
		anotherThread.setName("== Another Thread ==");
		// with start() the below prints from the above name
		// with run() the below prints from the main thread
		anotherThread.start();

		new Thread() {
			public void run() {
				System.out.println(ANSI_GREEN + "Hello from the anonymous class thread");
			}
		}.start();

		Thread myRunnableThread1 = new Thread(new MyRunnable());
		myRunnableThread1.start();

		// The below overrides the MyRunnable run() method in this anonymous class.
		// The course has an example of how we can call the Myrunnable run() method from here, with a call to super.run()
		Thread myRunnableThread2 = new Thread(new MyRunnable() {
			@Override
			public void run() {
				//super.run();  // call the MyRunnable.run() method from here.
				System.out.println(ANSI_RED + "Hello from the anonymous class's implementation of run()");
			}
		});

		myRunnableThread2.start();

		System.out.println(ANSI_PURPLE + "Hello again from the main thread.");
	}
}
