package designpatterns.singleton.eagerinitializtion;
public class EagerSingleton {

	private static final EagerSingleton uniqueInstance = new EagerSingleton();
	int data;
	private EagerSingleton() {
	}

	public static EagerSingleton getInstance() {
		return uniqueInstance;
	}

	public int getData() {
		return data;
	}
	public void setData(final int data) {
		this.data = data;
	}
}
