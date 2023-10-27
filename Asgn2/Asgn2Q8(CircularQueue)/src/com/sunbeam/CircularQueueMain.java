package com.sunbeam;

import java.util.Scanner;

public class CircularQueueMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CircularQueue que = new CircularQueue(10);
		int choice = 0;
		do {

			System.out.println(
					"1.Push number in queue \n2.Pop number from queue \n3.Peek number on top \n0.Exit \nEnter your choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				if (que.isFull())
					System.out.println("Queue is Full...");
				else {
					System.out.println("Enter the number :");
					int num = sc.nextInt();
					que.push(num);
				}
				break;
			case 2:
				if (que.isEmpty())
					System.out.println("Queue is Empty...");
				else {
					que.pop();
					System.out.println("Number popped");
				}
				break;
			case 3: {
				if (que.isEmpty())
					System.out.println("Queue is Empty");
				else
					System.out.println("Peeked Data : " + que.peek());
				break;
			}
			}
		} while (choice != 0);
		sc.close();
	}
}
