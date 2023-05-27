package concurrency.durga.threadlocal;
public class ThreadLocalDemo {

	public static void main(String[] args) {
		CustomerThread c1 = new CustomerThread("Customer Thread-1");
		CustomerThread c2 = new CustomerThread("Customer Thread-2");
		CustomerThread c3 = new CustomerThread("Customer Thread-3");
		CustomerThread c4 = new CustomerThread("Customer Thread-4");
		c1.start();
		c2.start();
		c3.start();
		c4.start();
	}
}
