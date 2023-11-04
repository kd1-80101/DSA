package com.sunbeam;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		EmployeeList list = new EmployeeList();
		Scanner sc = new Scanner(System.in);
		Employee e;
		String name;
		int choice;
		do {
			System.out.println(
					"0 : Exit\n1 : Add Employee\n2 : Display All\n3 : Search by Name\n4 : Delete by ID\n5 : Update Salary");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 0:
				break;
			case 1:
				e = new Employee();
				e.accept();
				list.addLast(e);
				break;
			case 2:
				list.display();
				System.out.println("");
				break;
			case 3:
				System.out.print("Enter name for searching : ");
				name = sc.nextLine();
				e = list.searchByName(name);
				if (e != null) {
					System.out.println(e);
					System.out.println("");
				} else {
					System.out.println("Employee not found.");
				}
				break;
			case 4:
				int id;
				System.out.print("Enter ID for deletion : ");
				id = sc.nextInt();
				list.deleteById(id);
				break;
			case 5:
				System.out.print("Enter ID for salary update : ");
				id = sc.nextInt();
				System.out.print("Enter new salary : ");
				double salary = sc.nextDouble();
				if (list.updateSalary(id, salary)) {
					System.out.println("Salary updated successfully.");
				} else {
					System.out.println("ID not found.");
				}
				break;
			}
		} while (choice != 0);
		sc.close();
	}

}