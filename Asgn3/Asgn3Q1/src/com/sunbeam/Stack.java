package com.sunbeam;

public class Stack {
	private final int SIZE;
	private int top;
	private int[] arr;

	public Stack(int size) {
		SIZE = size;
		arr = new int[SIZE];
		top = -1;

	}

	public void push(int data) {
		top++;
		arr[top] = data;
	}

	public int pop() {
		int data = arr[top];
		top--;
		return data;
	}

	public int peek() {

		return arr[top];
	}

	public boolean isFull() {
		return top == -1;
	}

	public boolean isEmpty() {

		return top == SIZE - 1;
	}
}
