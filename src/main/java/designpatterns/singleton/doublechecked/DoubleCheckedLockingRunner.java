package designpatterns.singleton.doublechecked;
public class DoubleCheckedLockingRunner {
	public static void main(String[] args) {
		DoubleCheckedLockingSingleton dcls = DoubleCheckedLockingSingleton.getInstance();
		dcls.setData(55);
		System.out.println(dcls);
		System.out.println(dcls.getData());
		DoubleCheckedLockingSingleton dcls2 = DoubleCheckedLockingSingleton.getInstance();
		System.out.println(dcls2);
		System.out.println(dcls2.getData());
	}
}
