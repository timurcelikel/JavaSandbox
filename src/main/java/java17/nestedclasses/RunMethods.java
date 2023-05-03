package java17.nestedclasses;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RunMethods {

	public static void main(String[] args) {

		List<StoreEmployee> storeEmployees = new ArrayList<>(List.of(
				new StoreEmployee(10015, "Meg", 2019, "Target"),
				new StoreEmployee(10515, "Joe", 2021, "Walmart"),
				new StoreEmployee(10515, "Tom", 2020, "Macys"),
				new StoreEmployee(10515, "Marty", 2018, "Walmart"),
				new StoreEmployee(10515, "Bud", 2016, "Target")));

		var c0 = new EmployeeComparator<StoreEmployee>();
		var c1 = new Employee.EmployeeComparator<StoreEmployee>();
		var c2 = new StoreEmployee().new StoreComparator<>();

		// Using local class
		class NameSort<T> implements Comparator<StoreEmployee> {

			@Override
			public int compare(final StoreEmployee o1, final StoreEmployee o2) {

				return o1.getName().compareTo(o2.getName());
			}
		}

		var c3 = new NameSort<>();

		// Using anonymous class
		var c4 = new Comparator<StoreEmployee>() {

			@Override
			public int compare(final StoreEmployee o1, final StoreEmployee o2) {

				return o1.getName().compareTo(o2.getName());
			}
		};

		sortIt(storeEmployees, c0);
		sortIt(storeEmployees, c1);
		sortIt(storeEmployees, c2);
		sortIt(storeEmployees, c3);
		//sortIt(storeEmployees, c4);
		// This also works (which can also be turned into a lambda)
		sortIt(storeEmployees, new Comparator<StoreEmployee>() {

			@Override
			public int compare(final StoreEmployee o1, final StoreEmployee o2) {

				return o1.getName().compareTo(o2.getName());
			}
		});

		// This is the same as the above code using lambdas
		sortIt(storeEmployees, (o1, o2) -> o1.getName().compareTo(o2.getName()));

		// Same as the above now with Comparator.comparing
		sortIt(storeEmployees, Comparator.comparing(Employee::getName));
	}

	// The below generic method takes a generic List and a Comparator with T or parent of T
	public static <T> void sortIt(List<T> list, Comparator<? super T> comparator) {

		System.out.println("Sorting with Comparator: " + comparator.toString());
		list.sort(comparator);
		list.forEach(System.out::println);
	}
}
