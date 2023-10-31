package com.sunbeam;

public class TesterMain {

	public static void main(String[] args) {
		DoublyCircularLinkedlist list = new DoublyCircularLinkedlist();
		list.addFirst(40);
		list.addFirst(30);
		list.addFirst(20);
		list.addFirst(10);
		list.fDisplay();
		list.rDisplay();
		System.out.println("\n");

		list.addLast(50);
		list.addLast(60);
		list.fDisplay();
		list.rDisplay();
		System.out.println("\n");

//		list.addAtPos(1, 1);
		list.addAtPos(3, 1);
		list.delAtPos(9);
		list.fDisplay();
		list.rDisplay();
		System.out.println("\n");

	}

}
