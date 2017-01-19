/**
 * 
 */
package vw.hackerrank.practice.algorithms.bitmanipulation;

import java.util.Scanner;

/**
 * @author vivek
 *
 */
public class LonelyInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] num = new int[n];
		int[] check = new int[100];
		for (int i = 0; i < num.length; i++) {
			num[i] = in.nextInt();
		}
		for (int i = 0; i < num.length; i++) {
			check[num[i]] += 1;
		}

		for (int i = 0; i < check.length; i++) {
			if (check[i] == 1) {
				System.out.println(i);
				break;
			}else{
				continue;
			}
		}

	}

}
