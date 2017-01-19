/**
 * 
 */
package vw.hackerrank.practice.algorithms.dp;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author vivek.wisdom
 *
 */
public class FibonacciModified {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		BigInteger t1 = in.nextBigInteger();
		BigInteger t2 = in.nextBigInteger();
		int N = in.nextInt();
		BigInteger val = computeNthTerm(t1, t2, N);
		System.out.println(val);


	}

	private static BigInteger computeNthTerm(BigInteger t1, BigInteger t2, int n) {
		n = n - 1;

		if (n == 1) {
			return t2;
		}
		return computeNthTerm(t2, t2.pow(2).add(t1), n);
	}


}
