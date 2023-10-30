package com.sunbeam;

public class TesterMain {

	public static void main(String[] args) {
		SinglyCircularLinkendList sgl = new SinglyCircularLinkendList();

		sgl.addFirst(40);
		sgl.addFirst(30);
		sgl.addFirst(20);
		sgl.addFirst(10);
		sgl.displayList();
		System.out.println("\n");

		sgl.addLast(50);
		sgl.addLast(60);
		sgl.addLast(70);
		sgl.addLast(80);
		sgl.displayList();
		System.out.println("\n");

		sgl.delFirst();
		sgl.delFirst();
		sgl.delFirst();
		sgl.delLast();
		sgl.delLast();
		sgl.delLast();
		sgl.displayList();
		System.out.println("\n");

	}

}
