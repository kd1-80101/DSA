package com.sunbeam;

public class TesterMain {
	public static void main(String[] args) {
		StackUsingQueue stack = new StackUsingQueue();

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
		
		
	}
}
