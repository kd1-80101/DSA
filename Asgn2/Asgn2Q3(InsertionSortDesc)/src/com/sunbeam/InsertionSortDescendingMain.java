package com.sunbeam;

import java.util.Arrays;

public class InsertionSortDescendingMain {

	public static int insertionSortDescending(int[] arr, int size) {
		int count = 0;
		for (int i = 1; i < size; i++) {
			int temp = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] < temp) {
				arr[j + 1] = arr[j];
				j--;
				count++;
			}
			arr[j + 1] = temp;
		}
		return count;
	}

	public static void main(String[] args) {
//		int arr[] = { 44, 11, 55, 22, 66, 33 };
		int arr[] = { 33, 22, 66, 55, 44, 11 };
//		int arr[] = { 11, 22, 33, 44, 55, 66 };
		System.out.println("before sorting :" + Arrays.toString(arr));
		int count = insertionSortDescending(arr, arr.length);
		System.out.println("after sorting :" + Arrays.toString(arr));
		System.out.println("Number of comparisions : " + count);
	}

}
