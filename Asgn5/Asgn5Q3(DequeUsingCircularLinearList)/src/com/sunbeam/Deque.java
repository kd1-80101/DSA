package com.sunbeam;

public class Deque {
	private List list;

	public Deque() {
		list = new List();
	}

	public void addFront(int data) {
		list.addFirst(data);
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public void deleterear() {
		list.deleteFirst();
	}

	public int peek() {
		return list.getPeek();
	}

	public void display() {
		list.fDisplay();
	}

}
