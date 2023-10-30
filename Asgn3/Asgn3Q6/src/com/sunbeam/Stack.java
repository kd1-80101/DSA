package com.sunbeam;

public class Stack {
	private Queue queue1;
	private Queue queue2;

	public Stack(int capacity) {
		queue1 = new Queue(capacity);
		queue2 = new Queue(capacity);
	}

	public boolean isEmpty() {
		return queue1.isEmpty();
	}

	public void push(int value) {
		if (queue1.isFull()) {
			System.out.println("Stack is full. Cannot push.");
			return;
		} else
			queue1.enqueue(value);
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty. Cannot pop.");
			return -1;
		} else {
			while (queue1.size() > 1) {
				int value = queue1.dequeue();
				queue2.enqueue(value);
			}
			int popped = queue1.dequeue();
			Queue temp = queue1;
			queue1 = queue2;
			queue2 = temp;
			return popped;
		}
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty. Cannot get top.");
			return -1;
		} else {
			int peek = 0;
			while (!queue1.isEmpty()) {
				peek = queue1.dequeue();
				queue2.enqueue(peek);
			}
			Queue temp = queue1;
			queue1 = queue2;
			queue2 = temp;
			return peek;
		}
	}

	public static void main(String[] args) {
		Stack stack = new Stack(5);
		stack.push(1);
		stack.push(2);
		stack.push(3);

		System.out.println("Top element: " + stack.peek());
		System.out.println("Popped element: " + stack.pop());
		System.out.println("Top element: " + stack.peek());
	}
}
