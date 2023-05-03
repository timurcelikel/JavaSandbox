package java17.nestedclasses;

import java.util.ArrayList;
import java.util.List;

public class NestedClassClient {

	public static void main(String[] args) {

		/* STATIC NESTED CLASS */
		List<Employee> employees = new ArrayList<>(List.of(
				new Employee(10001, "Ralph", 2015),
				new Employee(10005, "Carole", 2021),
				new Employee(10022, "Jane", 2013),
				new Employee(13151, "Laura", 2020),
				new Employee(10050, "Jim", 2018)));

		// We were only able to sort by name with this one as the other fields were private and no getters
		//var comparator = new EmployeeComparator<>();
		//employees.sort(comparator);

		//employees.sort(new Employee.EmployeeComparator<>()); // sorts on name by default
		employees.sort(new Employee.EmployeeComparator<>("yearStarted").reversed());
		employees.forEach(System.out::println);

		/* INNER CLASS */
		System.out.println("Store Members");

		List<StoreEmployee> storeEmployees = new ArrayList<>(List.of(
				new StoreEmployee(10015, "Meg", 2019, "Target"),
				new StoreEmployee(10515, "Joe", 2021, "Walmart"),
				new StoreEmployee(10515, "Tom", 2020, "Macys"),
				new StoreEmployee(10515, "Marty", 2018, "Walmart"),
				new StoreEmployee(10515, "Bud", 2016, "Target")));

		// We can do this because StoreEmployee inherits from Employee
		var comparator = new Employee.EmployeeComparator<>();
		storeEmployees.sort(comparator);
		
		var genericEmployee = new StoreEmployee();
		var comparator2 = genericEmployee.new StoreComparator<>();
		// This also works by chaining the constructors
		//var comparator2 = new StoreEmployee(). new StoreComparator<>();

		storeEmployees.sort(comparator2);

		storeEmployees.forEach(System.out::println);
	}
}
