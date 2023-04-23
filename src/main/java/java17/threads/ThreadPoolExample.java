package java17.threads;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExample {

	public static void main(String[] args) {

		ExecutorService pool = Executors.newCachedThreadPool();
		String[] names = { "One", "Two", "Three" };
		for (int i = 0; i < names.length; i++) {
			pool.execute(new MyRunnable(names[i]));
		}
		System.out.println("Before shutdown: isShutdown()=" + pool.isShutdown() + ", isTerminated()=" + pool.isTerminated());
		pool.shutdown();
		// New threads cannot be added to the pool
		//pool.execute(new MyRunnable("Four"));
		//RejectedExecutionException
		System.out.println("After shutdown: isShutdown()=" + pool.isShutdown() + ", isTerminated()=" + pool.isTerminated());
		try {
			long timeout = 100;
			TimeUnit timeUnit = TimeUnit.MILLISECONDS;
			System.out.println("Waiting all threads completion for " + timeout + " " + timeUnit + "...");
			// Blocks until timeout, or all threads complete
			// execution, or the current thread is
			// interrupted, whichever happens first.
			boolean isTerminated = pool.awaitTermination(timeout, timeUnit);
			System.out.println("isTerminated()=" + isTerminated);
			if (!isTerminated) {
				System.out.println("Calling shutdownNow()...");
				List<Runnable> list = pool.shutdownNow();
				System.out.println(list.size() + " threads running");
				isTerminated = pool.awaitTermination(timeout, timeUnit);
				if (!isTerminated) {
					System.out.println("Some threads are still running");
				}
				System.out.println("Exiting");
			}
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}
}