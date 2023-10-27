package com.sunbeam;

import java.util.Arrays;

public class BubbleSortMain {
	public static int bubbleSort(int[] arr, int size) {
		int count = 0;
		int iteration = 0;
		for (int i = 0; i < size; i++) {
			iteration++;
			int flag = 0;
			for (int j = 0; j < size - i; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					flag++;
				}
				count++;
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
		System.out.println("before sorting :" + Arrays.toString(arr));
		int count = bubbleSort(arr, arr.length);
		System.out.println("after sorting :" + Arrays.toString(arr));

	}

}
