/**
 * 
 */
package vw.hackerrank.practice.algorithms.strings;

import java.util.Scanner;

/**
 * @author vivek
 *
 */
public class CeasarCipher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int len = in.nextInt();
		char[] str = in.next().toCharArray();
		int inc = in.nextInt() % 26;
		for (int i = 0; i < len; i++) {
			int c = str[i];
			if ((c <= 'z' && c >= 'a')) {
				c += inc;
				if (c > 'z') {
					c = ('a' - 1) + (c % 'z');
				}
			} else if ((c <= 'Z' && c >= 'A')) {
				c += inc;
				if (c > 'Z') {
					c = ('A' - 1) + (c % 'Z');
				}
			}
			System.out.print((char) c);
		}
	}
}
