package designpatterns.singleton.billpugh;
public class BillPughSingleton {

	int data;

	private BillPughSingleton() {
	}
	public static BillPughSingleton getInstance() {
		return SingletonHelper.uniqueInstance;
	}
	public int getData() {
		return data;
	}
	public void setData(final int data) {
		this.data = data;
	}
	// Here is the magic. Unlike the Eager Singleton this inner class does not get called until we hit the getInstance method for the first time.
	// After that we always just get uniqueInstance because our object is static. This satisfies the criteria of being thread safe, performant
	// without synchronization, and only being used when called.
	private static class SingletonHelper {
		private static final BillPughSingleton uniqueInstance = new BillPughSingleton();
	}
}
