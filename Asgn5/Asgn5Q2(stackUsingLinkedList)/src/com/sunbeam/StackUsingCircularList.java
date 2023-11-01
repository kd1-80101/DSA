package com.sunbeam;

public class StackUsingCircularList {
	private List list;

	public StackUsingCircularList() {
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
