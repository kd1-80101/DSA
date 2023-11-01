package com.sunbeam;

public class TesterMain {
	public static void main(String[] args) {
		StackUsingCircularList stack = new StackUsingCircularList();
		System.out.print("Stack :");

		stack.push(60);
		stack.push(50);
		stack.push(40);
		stack.push(30);
		stack.push(20);
		stack.push(10);
		System.out.print("Stack :");
		stack.display();
		System.out.println("peek :" + stack.peek() + "\n");

		stack.pop();
		stack.pop();
		System.out.print("Stack :");
		stack.display();
		System.out.println("peek :" + stack.peek() + "\n");
		System.out.println("----------------------------------------");
		System.out.print("Queue :");
		QueueUsingCircularList queue = new QueueUsingCircularList();
		queue.push(60);
		queue.push(50);
		queue.push(40);
		queue.push(30);
		queue.push(20);
		queue.push(10);
		System.out.print("Queue :");
		queue.display();
		System.out.println("peek :" + queue.peek() + "\n");

		queue.pop();
		queue.pop();
		System.out.print("Queue :");
		queue.display();
		System.out.println("peek :" + queue.peek() + "\n");
		System.out.println("----------------------------------------");

	}
}
