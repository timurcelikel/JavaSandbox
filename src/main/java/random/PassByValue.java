package random;
public class PassByValue {

	public static void main(String[] args) {
		Integer integerVal = 10;
		changeIt(integerVal);
		System.out.println(integerVal);
		String stringVal = "hello";
		changeIt(stringVal);
		System.out.println(stringVal);
		Employee emp1 = new Employee(1, "John", "Doe");
	}

	public static void changeIt(Integer value) {
		value = 20;
	}
	public static void changeIt(String value) {
		value = "world";
	}

	static class Employee {

		Integer id;
		String firstName;
		String lastName;

		public Employee(Integer id, String firstName, String lastName) {
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
		}
	}
}
