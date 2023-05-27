package concurrency.durga.threadlocal;
public class ChildThread extends Thread {
	public void run() {
		System.out.println("Child Thread Value: " + ParentThread.tl.get());
	}
}
