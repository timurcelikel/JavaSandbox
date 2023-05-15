package designpatterns.singleton.eagerinitializtion;
public class EagerInitializationClient {
	public static void main(String[] args) {
		EagerSingleton singleton = EagerSingleton.getInstance();
		singleton.setData(55);
		System.out.println(singleton);
		System.out.println(singleton.getData());

		singleton.setData(65);
		EagerSingleton singleton1 = EagerSingleton.getInstance();
		System.out.println(singleton1);
		System.out.println(singleton1.getData());
	}
}
