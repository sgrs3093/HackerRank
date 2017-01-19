/**
 * 
 */
package vw.hackerrank.contests.hack45;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author vivek
 *
 */
public class TheChooseOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		if (n == 1) {
			System.out.println(n + 1);
		}

	}

}
