package com.sunbeam;

public class FindingNumMain {
	public static int findFirstNonRepeating(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (i != j && arr[i] == arr[j]) {
					count++;
					break;
				}
			}
			if (count == 0)
				return arr[i];
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
		int firstNonRepeating = findFirstNonRepeating(arr);
		if (firstNonRepeating != -1) {
			System.out.println("First non-repeating element: " + firstNonRepeating);
		} else {
			System.out.println("There are no non-repeating elements in the array.");
		}
	}

}