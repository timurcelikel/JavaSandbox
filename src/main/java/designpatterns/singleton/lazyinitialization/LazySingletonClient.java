package designpatterns.singleton.lazyinitialization;

public class LazySingletonClient {

	public static void main(String[] args) {

		LazySingleton singleton = LazySingleton.getInstance();

		// Set data value
		singleton.setData(55);

		System.out.println("First reference: " + singleton);
		System.out.println("Singleton data value is: " + singleton.getData());

		// Get another reference to the Singleton - Is it the same object?
		singleton = null;
		singleton = LazySingleton.getInstance();

		System.out.println("Second reference: " + singleton);
		System.out.println("Singleton data value is: " + singleton.getData());
	}
}
