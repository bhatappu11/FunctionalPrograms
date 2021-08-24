package com.bridgelabz.functionalpgms;

public class Distance {
	public static void calculateDistance(int x,int y) {
		double euclideanDistance;
		euclideanDistance = Math.sqrt(Math.pow(x,2) + Math.pow(y, 2));
		System.out.println("The euclidean distance: "+euclideanDistance);
	}

	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);
		calculateDistance(x,y);
		
	}

}
