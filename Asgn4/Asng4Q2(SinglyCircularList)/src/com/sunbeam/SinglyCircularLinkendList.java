package com.sunbeam;

public class SinglyCircularLinkendList {

	public class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	private int count;
	private Node tail;

	public SinglyCircularLinkendList() {
		this.count = 0;
		this.tail = null;
	}

	public int getCount() {
		return count;
	}

	public boolean isEmpty() {
		return tail == null;
	}

	public void addFirst(int data) {
		Node newnode = new Node(data);
		if (isEmpty()) {
			tail = newnode;
			newnode.next = tail;
		} else {
			newnode.next = tail.next;
			tail.next = newnode;

		}
		count++;

	}

	public void addLast(int data) {
		Node newnode = new Node(data);
		if (isEmpty()) {
			tail = newnode;
			newnode.next = tail;
		} else {
			newnode.next = tail.next;
			tail.next = newnode;
			tail = newnode;
		}
		count++;
	}

	public void displayList() {
		Node trav = tail.next;
		System.out.print("List :");
		do {
			System.out.print(" " + trav.data);
			trav = trav.next;
		} while (trav != tail.next);

	}

	public void delFirst() {
		if (isEmpty()) {
			System.out.println("List is already empty");
			return;

		} else if (tail.next == tail) {
			tail = null;

		} else {
			tail.next = tail.next.next;
		}
		count--;
	}

	public void delLast() {
		if (isEmpty()) {
			System.out.println("List is already empty");
			return;
		} else if (tail.next == tail) {
			tail = null;
		} else {
			Node trav = tail.next;
			while (trav.next != tail) {
				trav = trav.next;
			}
			trav.next = tail.next;
			tail = trav;
		}
		count--;

	}

}
