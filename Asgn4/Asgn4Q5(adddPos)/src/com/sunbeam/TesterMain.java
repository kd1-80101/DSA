package com.sunbeam;

public class TesterMain {
	public static void main(String[] args) {
		SinglyLinkedList sgl = new SinglyLinkedList();

		sgl.insertAfter(1,20);
		sgl.insertAfter(1,10);
		sgl.insertAfter(2,30);
		sgl.insertAfter(3,40);
		sgl.displayList();
		System.out.println("\n");

		sgl.insertBefore(5,50);
		sgl.insertBefore(6,60);
		sgl.insertBefore(7,70);
		sgl.insertBefore(8,80);
		sgl.displayList();
		System.out.println("\n");
	}
}
