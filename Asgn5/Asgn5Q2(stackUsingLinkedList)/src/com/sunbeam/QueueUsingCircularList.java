package com.sunbeam;

public class QueueUsingCircularList {
	private List list;

	public QueueUsingCircularList() {
		list = new List();
	}

	public void push(int data) {
		list.addLast(data);
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
