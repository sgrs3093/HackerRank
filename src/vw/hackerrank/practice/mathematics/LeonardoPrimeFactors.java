/**
 * 
 */
package vw.hackerrank.practice.mathematics;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author vivek.wisdom
 *
 */
public class LeonardoPrimeFactors {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

		int noOfTestCases = in.nextInt(), i, count, j;

		long primes[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61 }, number;
		BigInteger pf = BigInteger.valueOf(0);

		for (i = 0; i < noOfTestCases; i++) {
			count = 0;
			number = in.nextLong();
			pf = BigInteger.valueOf(primes[0]);
			for (j = 1; j < primes.length && pf.compareTo(BigInteger.valueOf(number)) >= 0 && number != 1; j++) {
				pf = pf.multiply(BigInteger.valueOf(primes[j]));
				count++;
			}
			System.out.println(count);
		}

	}

}
