package vw.hackerrank.practice.algorithms.sorting;

import java.util.Scanner;

public class InsertionSortPartTwo {
	public static void insertionSortPart2(int[] ar) {
		for (int i = 1; i < ar.length; i++) {
			int e = ar[i];
			for(int j = i; j > 0; j--){
		        if(ar[j] < ar[j - 1]){
		            ar[j] = ar[j -1];
		            ar[j - 1] = e;
		        }
		    }
	        printArray(ar);
		}
		
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for (int i = 0; i < s; i++) {
			ar[i] = in.nextInt();
		}
		insertionSortPart2(ar);

	}

	private static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}
}
