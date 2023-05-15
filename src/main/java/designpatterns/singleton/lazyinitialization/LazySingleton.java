package designpatterns.singleton.lazyinitialization;

public class LazySingleton {

	// the private reference to the one and only instance
	private static LazySingleton uniqueInstance = null;

	// an instance attribute
	private int data = 0;

	// The Singleton Constructor - No client can instantiate this
	private LazySingleton() {

	}

	// The course's Synchronized Method approach literally just adds the synchronized keyword to the method below
	public static LazySingleton getInstance() {

		if (uniqueInstance == null) {
			uniqueInstance = new LazySingleton();
		}

		return uniqueInstance;
	}

	public int getData() {

		return data;
	}

	public void setData(int data) {

		this.data = data;
	}
}
