package java17.nestedclasses;

import java.util.Comparator;

public class EmployeeComparator<T extends Employee> implements Comparator<Employee> {

	@Override
	public int compare(final Employee o1, final Employee o2) {
		// The below line throws a CE because yearStarted is private and no getter.
		// return o1.yearStarted - o2.yearStarted;
		return o1.getName().compareTo(o2.getName());
	}
}
