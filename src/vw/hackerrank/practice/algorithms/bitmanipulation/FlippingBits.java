/**
 * 
 */
package vw.hackerrank.practice.algorithms.bitmanipulation;

import java.util.Scanner;

/**
 * @author vivek
 *
 */
public class FlippingBits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			long num = in.nextInt();
			System.out.println(num ^ (long) (Math.pow(2, 32) - 1));
		}

	}

}
