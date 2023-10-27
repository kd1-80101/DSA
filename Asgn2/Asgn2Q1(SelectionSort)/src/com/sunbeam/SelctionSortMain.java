package com.sunbeam;

import java.util.Arrays;

public class SelctionSortMain {

	public static int selectionSort(int[] arr, int size) {
		int count = 0;
		int iteration = 0;
		for (int i = 0; i < size - 1; i++) {
			iteration++;
			for (int j = i + 1; j < size; j++) {
				count++;
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("No of passes :" + iteration);

		return count;
	}

	public static void main(String[] args) {

		int arr[] = { 44, 11, 55, 22, 66, 33 };

		System.out.println("Before sort :" + Arrays.toString(arr));
		int count = selectionSort(arr, arr.length);
		System.out.println("after sort :" + Arrays.toString(arr));
		System.out.println("No of comparisions :" + count);
	}
}
