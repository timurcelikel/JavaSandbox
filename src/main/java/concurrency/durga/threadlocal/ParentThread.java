package concurrency.durga.threadlocal;
class ParentThread extends Thread {

	// public static ThreadLocal tl = new ThreadLocal(); -- child thread: null
	// public static InheritableThreadLocal tl = new InheritableThreadLocal(); -- child thread: pp
	public static InheritableThreadLocal tl = new InheritableThreadLocal() {
		public Object childValue(Object p) {
			return "CC";
		}
	};

	public void run() {
		tl.set("pp");
		System.out.println("Parent Thread Value: " + tl.get());
		ChildThread ct = new ChildThread();
		ct.start();
	}
}
