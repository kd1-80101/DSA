package com.sunbeam;

public class TesterMain {
	public static void main(String[] args) {
		Deque queue = new Deque();
		queue.addFront(60);
		queue.addFront(50);
		queue.addFront(40);
		queue.addFront(30);
		queue.addFront(20);
		queue.addFront(10);
		System.out.println("(ADD FRONT DELETE REAR)");
		System.out.print("Dequeue :");
		queue.display();
		System.out.println("toop :" + queue.peek() + "\n");

		queue.deleterear();
		queue.deleterear();
		System.out.print("Dequeue :");
		queue.display();
		System.out.println("top :" + queue.peek());
		System.out.println("----------------------------------------");

	}
}
