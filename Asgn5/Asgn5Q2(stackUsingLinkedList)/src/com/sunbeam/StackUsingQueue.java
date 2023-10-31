package com.sunbeam;

public class StackUsingQueue {
	private List list;

	public StackUsingQueue() {
		list = new List();
	}

	public void push(int data) {
		list.addFirst(data);
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public void pop() {
		list.deleteFirst();
	}

	public int peek() {
		return list.getPeek();
	}

	public void display() {
		list.fDisplay();
	}
}
