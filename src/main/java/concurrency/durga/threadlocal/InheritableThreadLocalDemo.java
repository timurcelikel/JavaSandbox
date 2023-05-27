package concurrency.durga.threadlocal;
public class InheritableThreadLocalDemo {

	public static void main(String[] args) {
		ParentThread pt = new ParentThread();
		pt.start();
	}
}
