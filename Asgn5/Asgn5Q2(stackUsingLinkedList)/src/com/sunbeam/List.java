package com.sunbeam;

public class List {
	public class Node {
		private int data;
		private Node next;
		private Node prev;

		public Node(int value) {
			data = value;
			next = prev = null;
		}
	}

	private Node head;

	public List() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public int getPeek() {
		return head.data;
	}

	public void addFirst(int value) {
		// 1. create node
		Node nn = new Node(value);
		// 2. if list is empty
		if (isEmpty()) {
			// a. add newnode into head
			head = nn;
			// b. make list circular
			head.next = nn;
			head.prev = nn;
		}
		// 3. if list is not empty
		else {
			// a. add first node into next of newnode
			nn.next = head;
			// b. add last node into prev of newnode
			nn.prev = head.prev;
			// c. add newnode into next of last node
			head.prev.next = nn;
			// d. add newnode into prev of first node
			head.prev = nn;
			// e. move head on newnode
			head = nn;
		}
	}
	public void addLast(int value) {
		//1. create node
		Node nn = new Node(value);
		//2. if list is empty
		if(isEmpty()) {
			//a. add newnode into head
			head = nn;
			//b. make list circular
			head.next = nn;
			head.prev = nn;
		}
		//3. if list is not empty
		else {
			//a. add first node into next of newnode
			nn.next = head;
			//b. add last node into prev of newnode
			nn.prev = head.prev;
			//c. add newnode into next of last node
			head.prev.next = nn;
			//d. add newnode into prev of first node
			head.prev = nn;
		}
	}
	public void deleteFirst() {
		// 1. if list is empty
		if (isEmpty())
			return;
		// 2. if has single node
		else if (head.next == head)
			head = null;
		// 3. if list has multiple nodes
		else {
			// a. add second node into next of last node
			head.prev.next = head.next;
			// b. add last node into prev of second node
			head.next.prev = head.prev;
			// c. move head on second node
			head = head.next;
		}
	}

	public void fDisplay() {
		if (isEmpty())
			return;
		// 1. create trav and start at head
		Node trav = head;
		do {
			// 2. visit current node
			System.out.print(" " + trav.data);
			// 3. go on next node
			trav = trav.next;
		} while (trav != head); // 4. repeat step 2 and 3 till last node
		System.out.println("");
	}

}
