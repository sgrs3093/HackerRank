/**
 * 
 */
package vw.hackerrank.practice.algorithms.implementation;

import java.util.Scanner;

/**
 * @author vivek.wisdom
 *
 */
public class DesignerPDFViewer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int n = 26;
		int height[] = new int[n];
		for (int i = 0; i < n; i++) {
			height[i] = in.nextInt();
		}

		String word = in.next();
		int length = word.length();
		int max = 0;
		for (int i = 0; i < length; i++) {
			char temp = word.charAt(i);
			max = max < height[temp - 97] ? height[temp - 97] : max;
		}
		System.err.println(max * length);
	}

}
