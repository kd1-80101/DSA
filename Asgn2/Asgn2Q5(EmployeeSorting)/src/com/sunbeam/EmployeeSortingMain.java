package com.sunbeam;

public class EmployeeSortingMain {
	public static int employeeSortingBySalary(Employee[] arr, int size) {
		int count = 0;
		for (int i = 1; i < size; i++) {
			Employee temp = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j].getSalary() > temp.getSalary()) {
				arr[j + 1] = arr[j];
				j--;
				count++;

			}
			arr[j + 1] = temp;

		}

		return count;
	}

	public static void main(String[] args) {
		Employee e1 = new Employee(111, "Prasann", 55000.00);
		Employee e2 = new Employee(222, "Akhilesh", 20000.00);
		Employee e3 = new Employee(333, "Pavan", 20500.00);
		Employee e4 = new Employee(444, "Suyash", 21000.00);
		Employee e5 = new Employee(555, "Akash", 80000.00);
		Employee[] arr = { e1, e2, e3, e4, e5 };

		System.out.println("Employee arr before sort :");
		for (Employee emp : arr) {
			System.out.println(emp);
		}

		int count = employeeSortingBySalary(arr, arr.length);

		System.out.println("Employee arr after sort :");
		for (Employee emp : arr) {
			System.out.println(emp);
		}
		System.out.println("no of comp :" + count);
	}
}
