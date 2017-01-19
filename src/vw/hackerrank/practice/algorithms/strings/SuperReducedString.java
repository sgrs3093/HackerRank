/**
 * 
 */
package vw.hackerrank.practice.algorithms.strings;

import java.util.Scanner;

/**
 * @author vivek
 *
 */
public class SuperReducedString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String res = duplicate_removal(s);
		if (res.equals("")) {
			System.out.println("Empty String");
		} else {
			System.out.println(res);
		}
	}

	public static String duplicate_removal(String s) {
		if (s.length() < 2)
			return s;

		else if (s.length() == 2) {
			if (s.charAt(0) == s.charAt(1))
				s = "Empty String";
			return s;
		}

		boolean[] arr = new boolean[26];

		for (int i = 0; i < s.length(); i++) {

			if (arr[s.charAt(i) - 'a'] == false)
				arr[s.charAt(i) - 'a'] = true;

			else {
				arr[s.charAt(i - 1) - 'a'] = false;
				s = ((new StringBuilder(s)).deleteCharAt(i)).toString();
				s = ((new StringBuilder(s)).deleteCharAt(i - 1)).toString();
				i--;
				i--;
			}
		}
		return s;
	}

}
