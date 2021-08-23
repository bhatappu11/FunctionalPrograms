package com.bridgelabz.functionalpgms;

import java.io.*;
import java.util.*;

public class TwoDArray {

	public static void main(String[] args) {
		int numberOfRowsM,numberOfColumnsN;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows and columns");
		numberOfRowsM = sc.nextInt();
		numberOfColumnsN = sc.nextInt();
		int twoDArray [][] = new int[numberOfRowsM][numberOfColumnsN];
		System.out.println("Enter the values to array");
		for (int rowIndex = 0; rowIndex < numberOfRowsM; rowIndex++) {
			for (int columnIndex = 0; columnIndex < numberOfColumnsN; columnIndex++) {
				twoDArray[rowIndex][columnIndex] = sc.nextInt();
			}
		}
		sc.close();
		System.out.println("The 2D array is");
	    PrintWriter writer = new PrintWriter(System.out);
	    for (int rowIndex = 0; rowIndex < numberOfRowsM; rowIndex++) {
			for (int columnIndex = 0; columnIndex < numberOfColumnsN; columnIndex++) {
				writer.print(twoDArray[rowIndex][columnIndex]+"\t");
			}
			writer.println();
	    }
		writer.close();

	}

}
