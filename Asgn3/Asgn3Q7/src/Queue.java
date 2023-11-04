package com.sunbeam;

public class Queue {
    private int[] array;
    private int front, rear, size;

    public Queue(int capacity) {
        array = new int[capacity];
        front = rear = 0;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == array.length;
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue.");
            return;
        }
        array[rear] = value;
        rear = (rear + 1) % array.length;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        int value = array[front];
        front = (front + 1) % array.length;
        size--;
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot peek.");
            return -1;
        }
        return array[front];
    }

    public int size() {
        return size;
    }
}
