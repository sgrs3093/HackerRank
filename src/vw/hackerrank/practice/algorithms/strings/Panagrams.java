/**
 * 
 */
package vw.hackerrank.practice.algorithms.strings;

import java.util.Scanner;

/**
 * @author vivek
 *
 */
public class Panagrams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String s = in.nextLine().toLowerCase();
		boolean pan = false;
		boolean[] bool = new boolean[26];
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 32) {
				continue;
			}
			if (bool[s.charAt(i) - 'a'] == false) {
				bool[s.charAt(i) - 'a'] = true;
			}
		}
		for (boolean b : bool) {
			if (b) {
				pan = true;
			} else {
				pan = false;
				break;
			}
		}
		System.out.println(pan?"pangram":"not pangram");

	}

}
