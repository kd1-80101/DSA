package com.sunbeam;

import java.util.Scanner;

public class NthOccurenceMain {

	public static int nthOccurence(int[] arr, int key) {
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (key == arr[i])
				index = i;
		}
		return index;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
		System.out.println("enter the key ");
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		int index = nthOccurence(arr, key);
		if (index == 0)
			System.out.println("key is not present in array");
		else
			System.out.println("key : " + key + " last occurance is at index : " + index);
		sc.close();
	}
}
