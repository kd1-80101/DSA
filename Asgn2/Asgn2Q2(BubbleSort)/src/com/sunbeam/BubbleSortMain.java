package com.sunbeam;

import java.util.Arrays;

public class BubbleSortMain {
	public static int bubbleSort(int[] arr, int size) {
		int count = 0;
		int iteration = 0;
		int flag;
		for (int i = 1; i < size; i++) {
			iteration++;
			flag = 0;
			for (int j = 0; j < size - i; j++) {
				count++;
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = 1;
				}
			}
			if (flag == 0)
				break;

		}
		System.out.println("The number of iteration : " + iteration);
		return count;

	}

	public static void main(String[] args) {
//		int arr[] = { 44, 11, 55, 22, 66, 33 };
		int arr[] = { 33, 22, 66, 55, 44, 11 };
//		int arr[] = { 11, 22, 33, 44, 55, 66 };
		System.out.println("before sorting :" + Arrays.toString(arr));
		int count = bubbleSort(arr, arr.length);
		System.out.println("after sorting :" + Arrays.toString(arr));
		System.out.println("Number of comparisions : " + count);

	}

}
