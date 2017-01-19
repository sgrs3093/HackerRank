/**
 * 
 */
package vw.hackerrank.contests.hack45;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author vivek
 *
 */
public class SequenceEquation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(0, -1);
		for (int i = 1; i <= n; i++) {
			arr.add(i, in.nextInt());
		}
		System.out.println(arr);
		for (int i = 1; i < arr.size(); i++) {
			int index = arr.indexOf(i);
			int res = arr.indexOf(index);
			System.out.println(res);
		}

	}

}
