package com.sunbeam;

public class SinglyLinkendList {

	public class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	private int count;
	private Node head;
	private Node tail;

	public SinglyLinkendList() {
		this.count = 0;
		this.head = null;
		this.tail = null;
	}

	public int getCount() {
		return count;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addFirst(int data) {
		Node newnode = new Node(data);
		if (isEmpty()) {
			head = newnode;
			tail = newnode;
		} else {
			newnode.next = head;
			head = newnode;
		}
		count++;

	}

	public void addLast(int data) {
		Node newnode = new Node(data);
		if (isEmpty()) {
			head = newnode;
			tail = newnode;
		} else {
			tail.next = newnode;
			tail = newnode;
		}
		count++;
	}

	public void displayList() {
		Node trav = head;
		System.out.print("List :");
		while (trav != null) {
			System.out.print(" " + trav.data);
			trav = trav.next;
		}

	}

	public void delFirst() {
		if (isEmpty()) {
			System.out.println("List is already empty");
			return;

		} else if (head.next == null) {
			head = null;
			tail = null;

		} else {
			head = head.next;
		}
		count--;
	}

	public void delLast() {
		if (isEmpty()) {
			System.out.println("List is already empty");
			return;
		} else if (head.next == null) {
			head = tail = null;
		} else {
			Node trav = head;
			while (trav.next.next != null) {
				trav = trav.next;
			}
			tail = trav;
			trav.next = null;
		}
		count--;

	}

	public int middleElementMethod() {
		Node fast, slow;
		fast = slow = head;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow.data;

	}

	public void reverseList() {
		Node prev = null, current = head, next;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;

	}
}
