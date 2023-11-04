package com.sunbeam;

import java.util.Stack;

public class ReverseArrayWithStack {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		Stack<Integer> stack = new Stack<>();
		for (int num : arr)
			stack.push(num);

		int[] arr2 = new int[arr.length];
		for (int i = 0; i < arr.length; i++)
			arr2[i] = stack.pop();

		System.out.print("Reversed Array: ");
		for (int num : arr2)
			System.out.print(num + " ");

	}
}
