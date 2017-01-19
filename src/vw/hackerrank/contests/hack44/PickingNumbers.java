/**
 * 
 */
package vw.hackerrank.contests.hack44;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author vivek
 *
 */
public class PickingNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		int[] b = new int[100];
		b[0] = -1;
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
			b[a[a_i]] += 1;
		}
		int max = b[1] + b[2];
		for (int i = 3; i < b.length; i++) {
			if ((b[i] + b[i - 1]) > max) {
				max = b[i] + b[i - 1];
			}
		}
//		System.out.println(Arrays.toString(a));
//		System.out.println(Arrays.toString(b));
		System.out.println(max);
	}

}
