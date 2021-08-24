package com.bridgelabz.functionalpgms;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of a,b,c");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		int delta = (int) Math.pow(b, 2)- 4*a*c;
		double root1 = (-b + Math.sqrt(delta))/(2*a);
		double root2 = (-b - Math.sqrt(delta))/(2*a);
		System.out.println("The roots of the equation are: "+root1+" "+root2);

	}

}
