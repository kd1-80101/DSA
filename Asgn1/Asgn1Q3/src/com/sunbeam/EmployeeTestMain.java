package com.sunbeam;

import java.util.Scanner;

public class EmployeeTestMain {

	public static int employeeSearchByName(Employee[] arr, Employee key) {

		for (int i = 0; i < arr.length; i++) {
			if (key.getName().equals(arr[i].getName()))
				return i;
		}

		return -1;

	}

	public static int employeeSearchByEmpid(Employee[] arr, Employee key) {

		for (int i = 0; i < arr.length; i++) {
			if ((Integer.compare(key.getEmpid(), arr[i].getEmpid())) == 0)
				return i;
		}

		return -1;

	}

	public static int employeeSearchBySalary(Employee[] arr, Employee key) {

		for (int i = 0; i < arr.length; i++) {
			if ((Double.compare(key.getSalary(), arr[i].getSalary())) == 0)
				return i;
		}

		return -1;

	}

	public static void main(String[] args) {
		Employee e1 = new Employee(111, "Prasann", 55000.00);
		Employee e2 = new Employee(222, "Akhilesh", 20000.00);
		Employee e3 = new Employee(333, "Pavan", 20500.00);
		Employee e4 = new Employee(444, "Suyash", 21000.00);
		Employee e5 = new Employee(555, "Akash", 80000.00);

		Employee[] arr = { e1, e2, e3, e4, e5 };
		Scanner sc = new Scanner(System.in);
		int index = 0;
		int choice = 0;
		Employee key;

		do {
			System.out.println("1.search employee by name");
			System.out.println("2.search employee by empid");
			System.out.println("3.search employee by salary");
			System.out.println("0.exit");
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter Employee name to search : ");
				String name = sc.next();
				key = new Employee();
				key.setName(name);
				index = employeeSearchByName(arr, key);
				if (index != -1)
					System.out.println("Key is found at index : " + index);
				else
					System.out.println("Key is not found");
			}
				break;
			case 2: {
				System.out.println("Enter Employee empid to search : ");
				int empid = sc.nextInt();
				key = new Employee();
				key.setEmpid(empid);
				index = employeeSearchByEmpid(arr, key);
				if (index != -1)
					System.out.println("Key is found at index : " + index);
				else
					System.out.println("Key is not found");
			}
				break;
			case 3: {
				System.out.println("Enter Employee salary to search : ");
				double salary = sc.nextDouble();
				key = new Employee();
				key.setSalary(salary);
				index = employeeSearchBySalary(arr, key);
				if (index != -1)
					System.out.println("Key is found at index : " + index);
				else
					System.out.println("Key is not found");
			}
				break;

			default:
				break;
			}

		} while (choice != 0);

		sc.close();

	}
}
