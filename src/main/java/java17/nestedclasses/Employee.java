package java17.nestedclasses;

import java.util.Comparator;

public class Employee {

	private int employeeId;

	private String name;

	private int yearStarted;

	public Employee() {

	}

	public Employee(final int employeeId, final String name, final int yearStarted) {

		this.employeeId = employeeId;
		this.name = name;
		this.yearStarted = yearStarted;
	}

	public String getName() {

		return name;
	}

	@Override
	public String toString() {

		return "%d %-8s %d".formatted(employeeId, name, yearStarted);
	}

	public static class EmployeeComparator<T extends Employee> implements Comparator<Employee> {

		private final String sortType;

		public EmployeeComparator() {

			this("name");
		}

		public EmployeeComparator(final String sortType) {

			this.sortType = sortType;
		}

		@Override
		public int compare(final Employee o1, final Employee o2) {

			if (sortType.equalsIgnoreCase("yearStarted")) {
				return o1.yearStarted - o2.yearStarted;
			}
			return o1.getName().compareTo(o2.getName());
		}
	}
}
