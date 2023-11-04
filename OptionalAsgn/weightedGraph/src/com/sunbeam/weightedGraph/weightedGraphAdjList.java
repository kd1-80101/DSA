package com.sunbeam.weightedGraph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class weightedGraphAdjList {

	private int vertexCount, edgeCount;
	private List<Edge> list[];

	public weightedGraphAdjList(int vCount) {
		vertexCount = vCount;
		list = new List[vertexCount];
		for (int i = 0; i < vCount; i++)
			list[i] = new ArrayList<Edge>();
	}

	public void acceptGraph(Scanner sc) {
		System.out.print("Enter edge count : ");
		edgeCount = sc.nextInt();
		System.out.println("Enter edges (src, dest,weigth) : ");
		for (int i = 0; i < edgeCount; i++) {
			int src = sc.nextInt();
			int dest = sc.nextInt();
			int wt = sc.nextInt();

			list[src].add(new Edge(dest, wt));
			list[dest].add(new Edge(src, wt));
		}

	}

	public void printGraph() {
		System.out.println("Graph : ");
		for (int i = 0; i < vertexCount; i++) {
			System.out.print(i + " : ");
			for (Edge j : list[i]) {
				System.out.print(j.getDest() + "(" + j.getWeigth() + ")  ");
			}
			System.out.println("");
		}
	}

}
