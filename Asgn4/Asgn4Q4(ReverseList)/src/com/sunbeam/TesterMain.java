package com.sunbeam;

public class TesterMain {

	public static void main(String[] args) {
		SinglyLinkendList sll = new SinglyLinkendList();

//		sll.addFirst(50);
		sll.addFirst(40);
		sll.addFirst(30);
		sll.addFirst(20);
		sll.addFirst(10);

		int data = sll.middleElementMethod();
		System.out.println("Middle element : " + data);
		sll.reverseList();
		System.out.println("Revsersed List : ");
		sll.displayList();
	}

}
