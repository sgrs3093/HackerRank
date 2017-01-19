/**
 * 
 */
package vw.hackerrank.contests.hack45;

import java.util.Scanner;

/**
 * @author vivek
 * Not Complete Solution
 *
 */
public class MinEdgesInLayeredGraph {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();

		if (n < k) {
			System.out.println("-1");
		} else if (n == k) {
			System.out.println(n - 1);
		} else if (n - k == 1) {
			System.out.println(n);
		} else if (k == 2 && n > 2) {
			System.out.println("-1");
		} else {
			System.out.println(Math.ceil(((n - 2) / (k - 2))) + 2);
		}

	}

}
