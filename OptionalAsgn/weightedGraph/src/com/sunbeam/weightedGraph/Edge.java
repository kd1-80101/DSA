package com.sunbeam.weightedGraph;

public class Edge {
	private int dest;
	private int weigth;

	public int getDest() {
		return dest;
	}

	public int getWeigth() {
		return weigth;
	}

	public Edge(int dest, int weigth) {
		this.dest = dest;
		this.weigth = weigth;
	}

}
