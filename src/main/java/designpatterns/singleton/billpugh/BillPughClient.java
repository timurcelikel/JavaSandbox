package designpatterns.singleton.billpugh;
public class BillPughClient {

	public static void main(String[] args) {
		BillPughSingleton singleton = BillPughSingleton.getInstance();
		singleton.setData(55);
		System.out.println(singleton);
		System.out.println(singleton.getData());
		BillPughSingleton singleton1 = BillPughSingleton.getInstance();
		singleton1.setData(65);
		System.out.println(singleton1);
		System.out.println(singleton1.getData());
	}
}
