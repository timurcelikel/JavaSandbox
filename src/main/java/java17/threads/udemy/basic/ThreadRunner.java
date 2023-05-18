package java17.threads.udemy.basic;

import static java17.threads.udemy.basic.ThreadColor.*;
public class ThreadRunner {

	public static void main(String[] args) {
		System.out.println(ANSI_PURPLE + "Hello from the main thread.");

		Thread anotherThread = new AnotherThread();
		anotherThread.setName("== Another Thread ==");
		// with start() the below prints from the Another Thread thread
		// if we use run() instead of start(), the below prints from the main thread
		anotherThread.start();

		new Thread() {
			public void run() {
				System.out.println(ANSI_GREEN + "Hello from the anonymous class thread");
			}
		}.start();

		Thread myRunnableThread1 = new Thread(new MyRunnable());
		myRunnableThread1.start();
		//anotherThread.interrupt();

		// The below overrides the MyRunnable run() method in this anonymous class.
		// The course has an example of how we can call the Myrunnable run() method from here, with a call to super.run()
		Thread myRunnableThread2 = new Thread(new MyRunnable() {
			@Override
			public void run() {
				//super.run();  // call the MyRunnable.run() method from here.
				System.out.println(ANSI_RED + "Hello from the anonymous class's implementation of run()");
				try {
					anotherThread.join();
					//anotherThread.join(2000); 		// This will time out the thread after 2s in the event that AnotherThread goes unresponsive
					System.out.println(ANSI_RED + "AnotherThread terminated, so I'm running again");		// This has to wait for anotherThread
					// to finish
				} catch(InterruptedException e) {
					System.out.println(ANSI_RED + "I couldn't wait after all. I was interrupted");
				}
			}
		});

		myRunnableThread2.start();

		System.out.println(ANSI_PURPLE + "Hello again from the main thread.");
	}
}
