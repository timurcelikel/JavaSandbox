package designpatterns.singleton.doublechecked;
public class DoubleCheckedLockingSingleton {

	private volatile static DoubleCheckedLockingSingleton uniqueInstance = null;

	int data;

	private DoubleCheckedLockingSingleton() {
	}

	public static DoubleCheckedLockingSingleton getInstance() {
		if (uniqueInstance == null) {
			synchronized (DoubleCheckedLockingSingleton.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new DoubleCheckedLockingSingleton();
				}
			}
		}
		return uniqueInstance;
	}
	public int getData() {
		return data;
	}
	public void setData(final int data) {
		this.data = data;
	}
}
