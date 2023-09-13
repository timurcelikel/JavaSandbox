package sandbox;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerManager {
	private ArrayList<Customer> customers;
	private Scanner scanner;

	public CustomerManager() {
		this.customers = new ArrayList<Customer>();
		this.scanner = new Scanner(System.in);
	}

	public void run() {
		boolean exit = false;
		while (!exit) {
			System.out.println("Please select an option:");
			System.out.println("1. Add multiple new customers");
			System.out.println("2. Add single new customer");
			System.out.println("3. Display all customers");
			System.out.println("4. Retrieve specific customer's data");
			System.out.println("5. Retrieve customers with total sales based on the range");
			System.out.println("6. Exit");

			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				addMultipleCustomers();
				break;
			case 2:
				addSingleCustomer();
				break;
			case 3:
				displayAllCustomers();
				break;
			case 4:
				retrieveCustomerData();
				break;
			case 5:
				retrieveCustomersBySalesRange();
				break;
			case 6:
				exit = true;
				break;
			default:
				System.out.println("Invalid choice.");
				break;
			}
		}
	}

	private void addMultipleCustomers() {
		System.out.println("Enter the number of customers to be loaded: ");
		int numCustomers = scanner.nextInt();
		scanner.nextLine();

		for (int i = 0; i < numCustomers; i++) {
			System.out.println("Enter customer name: ");
			String name = scanner.nextLine();

			System.out.println("Enter customer id (5-digit number): ");
			int id = scanner.nextInt();
			scanner.nextLine();

			System.out.println("Enter total sales: ");
			double sales = scanner.nextDouble();
			scanner.nextLine();

			Customer customer = new Customer(name, id, sales);
			customers.add(customer);
		}

		System.out.println("Customers added successfully.");
	}

	private void addSingleCustomer() {
		System.out.println("Enter customer name: ");
		String name = scanner.nextLine();

		System.out.println("Enter customer id (5-digit number): ");
		int id = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Enter total sales: ");
		double sales = scanner.nextDouble();
		scanner.nextLine();

		Customer customer = new Customer(name, id, sales);
		customers.add(customer);

		System.out.println("Customer added successfully.");
	}

	private void displayAllCustomers() {
		for (Customer customer : customers) {
			System.out.println(customer);
		}
	}

	private void retrieveCustomerData() {
		System.out.println("Enter customer id: ");
		int id = scanner.nextInt();
		scanner.nextLine();

		for (Customer customer : customers) {
			if (customer.id() == id) {
				System.out.println(customer);
				return;
			}
		}

		System.out.println("Customer not found.");
	}

	private void retrieveCustomersBySalesRange() {
		System.out.println("Enter the lowest total sales: ");
		double minSales = scanner.nextDouble();
		scanner.nextLine();

		System.out.println("Enter the highest total sales: ");
		double maxSales = scanner.nextDouble();
		scanner.nextLine();

		for (Customer customer : customers) {
			if (customer.sales() >= minSales && customer.sales() <= maxSales) {
				System.out.println(customer);
			}
		}
	}

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		customerManager.run();
	}
}

record Customer(String name, int id, double sales) {};
