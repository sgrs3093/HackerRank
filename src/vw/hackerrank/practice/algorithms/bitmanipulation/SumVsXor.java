/**
 * 
 */
package vw.hackerrank.practice.algorithms.bitmanipulation;

import java.util.Scanner;

/**
 * @author vivek
 *
 */
public class SumVsXor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		long n = in.nextLong();
		int zeroes = 64 - (Long.numberOfLeadingZeros(n) + Long.bitCount(n));
		System.out.println(1L << zeroes);
	}

}
