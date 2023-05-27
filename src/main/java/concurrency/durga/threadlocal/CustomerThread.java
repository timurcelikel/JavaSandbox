package concurrency.durga.threadlocal;
public class CustomerThread extends Thread {
	static Integer custId = 0;
	private ThreadLocal tl = new ThreadLocal() {
		protected Integer initialValue() {
			return ++custId;
		}
	};
	CustomerThread(String name) {
		super(name);
	}
	public void run() {
		//int custId = 0;
		//custId++;
		//ThreadLocal tl = new ThreadLocal();
		//tl.set(custId);
		System.out.println(Thread.currentThread().getName() + " executing with Customer Id: " + tl.get());
	}
}


