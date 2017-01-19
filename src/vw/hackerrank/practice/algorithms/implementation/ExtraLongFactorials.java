/**
 * 
 */
package vw.hackerrank.practice.algorithms.implementation;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author vivek
 *
 */
public class ExtraLongFactorials {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		BigInteger fact = new BigInteger("1");
		while (n > 1) {
			fact = fact.multiply(BigInteger.valueOf(n));
			n--;
		}
		System.out.println(fact);
	}

}
