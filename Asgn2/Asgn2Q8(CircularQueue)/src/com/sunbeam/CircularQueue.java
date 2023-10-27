package com.sunbeam;

public class CircularQueue {
	private int rear, front;
	private final int SIZE;
	private int[] arr;
	private int count = 0;

	public CircularQueue(int size) {
		SIZE = size;
		rear = -1;
		front = -1;
		arr = new int[SIZE];
	}

	public void push(int data) {
		count++;
		rear = (rear + 1) % SIZE;
		arr[rear] = data;
	}

	public void pop() {
		count--;
		front = (front + 1) % SIZE;
		if (front == rear)
			front = rear = -1;

	}

	public int peek() {
		return arr[(front + 1) % SIZE];

	}

	public boolean isFull() {
		return count == SIZE;
	}

	public boolean isEmpty() {
		return count == 0;
	}

}
