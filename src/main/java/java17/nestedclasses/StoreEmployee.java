package java17.nestedclasses;

import java.util.Comparator;

public class StoreEmployee extends Employee {

	private String store;

	public StoreEmployee() {

	}

	public StoreEmployee(final int employeeId, final String name, final int yearStarted, final String store) {

		super(employeeId, name, yearStarted);
		this.store = store;
	}

	@Override
	public String toString() {
		// Interesting use of super.toString() here
		return "%-8s%s".formatted(store, super.toString());
	}

	public class StoreComparator<T extends StoreEmployee> implements Comparator<StoreEmployee> {

		@Override
		public int compare(final StoreEmployee o1, final StoreEmployee o2) {

			int result = o1.store.compareTo(o2.store);
			if (result == 0) {
				return new Employee.EmployeeComparator<>("yearStarted").compare(o1, o2);
			}
			return result;
		}
	}
}
