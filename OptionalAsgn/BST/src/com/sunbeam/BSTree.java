package com.sunbeam;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BSTree {
	public class Node {
		private int data;
		private Node left;
		private Node right;

		public Node(int value) {
			data = value;
			left = null;
			right = null;
		}
	}

	private Node root;

	public BSTree() {
		root = null;
	}

	public boolean isEmpty() {
		return root == null;
	}

	private void addNode(Node trav, int value) {
		if (value < trav.data) {
			if (trav.left == null)
				trav.left = new Node(value);
			else
				addNode(trav.left, value);
		} else {
			if (trav.right == null)
				trav.right = new Node(value);
			else
				addNode(trav.right, value);
		}

	}

	public void addName(int value) {
		if (root == null)
			root = new Node(value);
		else
			addNode(root, value);
	}

	private void preOrder(Node trav) {
		if (trav == null)
			return;
		System.out.println(" " + trav.data);
		preOrder(trav.left);
		preOrder(trav.right);

	}

	public void preOrder() {
		System.out.print("Preorder : ");
		preOrder(root);
		System.out.println(" ");
	}

	private void inOrder(Node trav) {
		if (trav == null)
			return;
		inOrder(trav.left);
		System.out.println(" " + trav.data);
		inOrder(trav.right);
	}

	public void inOrder() {
		System.out.print("Inorder : ");
		inOrder(root);
		System.out.println(" ");
	}

	private void postOrder(Node trav) {
		if (trav == null)
			return;
		postOrder(trav.left);
		postOrder(trav.right);
		System.out.println(" " + trav.data);
	}

	public void postOrder() {
		System.out.print("Postorder : ");
		postOrder(root);
		System.out.println("");
	}

	public void DFSTraversal() {
		Stack<Node> st = new Stack<>();
		System.out.print("DFS : ");
		st.push(root);
		while (!st.isEmpty()) {
			Node trav = st.pop();
			System.out.print(" " + trav.data);
			if (trav.right != null)
				st.push(trav.right);
			if (trav.left != null)
				st.push(trav.left);
	}	System.out.println("");

	}

	public void BFSTraversal() {
		Queue<Node> q = new LinkedList<>();
		System.out.print("BFS : ");
		q.offer(root);
		while (!q.isEmpty()) {
			Node trav = q.poll();
			System.out.print(" " + trav.data);
			if (trav.left != null)
				q.offer(trav.left);
			if (trav.right != null)
				q.offer(trav.right);
	}	System.out.println("");
	}

	public Node binarySearch(int key) {
		Node trav = root;
		while (trav != null) {
			if (key == trav.data)
				return trav;
			else if (key < trav.data)
				trav = trav.left;
			else
			trav = trav.right;
		}return null;
	}

	public Node[] binarySearchWithParent(int key) {
		Node trav = root;
		Node parent = null;
		while (trav != null) {
			if (key == trav.data)
				break;
			parent = trav;
			if (key < trav.data)
				trav = trav.left;
			else
	}			trav = trav.right;
		if (trav == null)
			parent = null;
		return new Node[] { trav, parent };
	}

	public void deleteNode(int key) {
		Node arr[] = binarySearchWithParent(key);
		Node temp = arr[0], parent = arr[1];
		if (temp == null)
			return;
		if (temp.left != null && temp.right != null) {
			Node trav = temp.left;
			parent = temp;
			while (trav.right != null) {
				parent = trav;
				trav = trav.right;
			}
			temp.data = trav.data;
			temp = trav;
		}
		if (temp.left == null) {
			if (temp == root)
				root = temp.right;
			else if (temp == parent.left)
				parent.left = temp.right;
			else 
				parent.right = temp.right;
		}else {
		if (temp == root)
				root = temp.left;
			else if (temp == parent.left)
				parent.left = temp.left;
			else parent.right = temp.left;
		}
	}

	public int height(Node trav) {
		if (trav == null)
			return 0;
		int hl = height(trav.left);
		int hr = height(trav.right);
		int max = Integer.max(hl, hr);
		return max + 1;
	}

	public int height() {
		return height(root);
	}

}
