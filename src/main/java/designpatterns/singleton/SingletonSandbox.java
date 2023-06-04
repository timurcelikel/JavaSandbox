package designpatterns.singleton;
public class SingletonSandbox {
	public static void main(String[] args) {
		Singleton s = Singleton.getInstance();
		System.out.println("Value: " + s.getData());
		s.setData(10);
		Singleton s1 = Singleton.getInstance();
		System.out.println("Value: " + s1.getData());
	}
}

class Singleton {
	private static Singleton uniqueValue = null;
	private int data;
	private Singleton() {
	}
	public static Singleton getInstance() {
		if (uniqueValue == null) {
			uniqueValue = new Singleton();
		}
		return uniqueValue;
	}
	public int getData() {

		return data;
	}

	public void setData(int data) {

		this.data = data;
	}
}

class Singleton2 {
	private static Singleton2 uniqueValue = null;
	private int value;
	private Singleton2() {

	}

	private static Singleton2 getUniqueValue() {

		if (uniqueValue == null) {
			uniqueValue = new Singleton2();
		}
		return uniqueValue;
	}

	public int getValue() {
		return value;
	}

	public void setValue(final int value) {
		this.value = value;
	}
}
