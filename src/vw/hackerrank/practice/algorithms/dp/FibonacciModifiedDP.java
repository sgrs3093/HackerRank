/**
 * 
 */
package vw.hackerrank.practice.algorithms.dp;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author vivek.wisdom
 * Dynamic Programming Bottom Up Approach
 *
 */
public class FibonacciModifiedDP {

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

		System.out.println(val.toString().toCharArray().length);

	}

	private static BigInteger computeNthTerm(BigInteger t1, BigInteger t2, int n) {
		BigInteger[] memo = new BigInteger[n + 1];

		memo[0] = t1;
		memo[1] = t2;

		for (int i = 2; i < n + 1; i++) {
			memo[i] = memo[i - 2].add(memo[i - 1].pow(2));
		}
		return memo[n - 1];
	}

}
