/**
 * 
 */
package vw.hackerrank.practice.algorithms.implementation;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author vivek.wisdom
 *
 */
public class MiniMaxSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		long a = in.nextLong();
		long b = in.nextLong();
		long c = in.nextLong();
		long d = in.nextLong();
		long e = in.nextLong();

		long val[] = { a, b, c, d, e };

		BigInteger sum = BigInteger.valueOf(0);

		Arrays.sort(val);

		for (int i = 0; i < val.length; i++) {
			sum = sum.add(BigInteger.valueOf(val[i]));
		}

		System.out.println(
				sum.subtract(BigInteger.valueOf(val[val.length - 1])) + " " + sum.subtract(BigInteger.valueOf(val[0])));

	}

}
