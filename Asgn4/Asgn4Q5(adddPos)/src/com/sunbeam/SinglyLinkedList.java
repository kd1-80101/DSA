package com.sunbeam;

public class SinglyLinkedList {
	private class Node {
		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	private Node head;

	public SinglyLinkedList() {
		head = null;
	}

	public void insertAfter(int pos, int newData) {
		Node newNode = new Node(newData);
		if (pos <= 1 || head == null) {
			newNode.next = head;
			head = newNode;
		} else {
			Node previousNode = head;
			for (int i = 1; i < pos && previousNode != null; i++)
				previousNode = previousNode.next;

			if (previousNode != null) {
				newNode.next = previousNode.next;
				previousNode.next = newNode;
			}
		}
	}

	public void insertBefore(int pos, int newData) {
		Node newNode = new Node(newData);
		if (pos <= 1 || head == null) {
			newNode.next = head;
			head = newNode;
		} else {
			Node previousNode = null;
			Node trav = head;

			for (int i = 1; i < pos && trav != null; i++) {
				previousNode = trav;
				trav = trav.next;
			}
			if (previousNode != null) {
				previousNode.next = newNode;
				newNode.next = trav;
			}
		}
	}

	public void displayList() {
		Node trav = head;
		while (trav != null) {
			System.out.print(trav.data + " -> ");
			trav = trav.next;
		}
		System.out.println("null");
	}

	public void addFirst(int newData) {
		Node newNode = new Node(newData);
		newNode.next = head;
		head = newNode;
	}

	public void addLast(int newData) {
		Node newNode = new Node(newData);
		if (head == null) {
			head = newNode;
		} else {
			Node trav = head;
			while (trav.next != null)
				trav = trav.next;

			trav.next = newNode;
		}
	}

	public void deleteFirst() {
		if (head != null)
			head = head.next;

	}

	public void deleteLast() {
		if (head == null) {
			return;
		}
		if (head.next == null) {
			head = null;
		} else {
			Node trav = head;
			while (trav.next.next != null)
				trav = trav.next;

			trav.next = null;
		}
	}
}
