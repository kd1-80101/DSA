package com.sunbeam;

public class TesterMain {

	public static void main(String[] args) {
		SortList list = new SortList();

		list.addLast(1);
		list.addLast(5);
		list.addLast(3);
		list.addLast(6);
		list.addLast(4);
		list.addLast(2);
		list.display();

		list.sortList();

		list.display();
	}
}
