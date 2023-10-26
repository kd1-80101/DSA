package com.sunbeam;

import java.util.Scanner;

public class BinarySreachMain {
	public static int binarySreach(int arr[], int key) {
		int count = 1, left = 0, right = arr.length - 1, mid;
		while (left <= right) {
			mid = (left + right) / 2;
			if (key == arr[mid])
				return count;
			else if (key < arr[mid]) {
				right = mid - 1;
				count++;
			} else {
				left = mid + 1;
				count++;
			}
		}

		if (count > arr.length) {
			return -1;
		} else
			return count;
	}

	public static void main(String[] args) {
		int arr[] = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter key to be searched : ");
		int key = sc.nextInt();

		int index = binarySreach(arr, key);
		if (index == -1) {
			System.out.println("key is not found after : " + (arr.length + 1) + " comparisons");
		} else
			System.out.println("Key is found after : " + index + " comparisons ");

		sc.close();

	}

}
