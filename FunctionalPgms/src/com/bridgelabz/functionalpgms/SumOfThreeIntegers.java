package com.bridgelabz.functionalpgms;

import java.util.*;

public class SumOfThreeIntegers {

	public static void main(String[] args) {
		int sizeOfArray;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		sizeOfArray = sc.nextInt();
		int arrayToCheck[] = new int[sizeOfArray];
		System.out.println("enter the numbers");
		for (int index = 0; index < sizeOfArray; index++) {
			arrayToCheck[index] = sc.nextInt();
		}
		boolean found = false;
		for (int i=0; i<sizeOfArray-2; i++){
	        for (int j=i+1; j<sizeOfArray-1; j++){
	            for (int k=j+1; k<sizeOfArray; k++){
	                if (arrayToCheck[i]+arrayToCheck[j]+arrayToCheck[k] == 0)
	                {
	                    System.out.print(arrayToCheck[i]);
	                    System.out.print(" ");
	                    System.out.print(arrayToCheck[j]);
	                    System.out.print(" ");
	                    System.out.print(arrayToCheck[k]);
	                    System.out.print("\n");
	                    found = true;
	                }
	            }
	        }
	    }
		if(found == false)
			System.out.println("no triplets found");

	}

}
