/**
 * 
 */
package vw.hackerrank.contests.week28;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author vivek.wisdom
 *
 */
public class LuckyNumberEight {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		@SuppressWarnings("unused")
		int n = in.nextInt();
		String number = in.next();
		int count = 0;
		

		ArrayList<String> comb=combinations("", number, new ArrayList<String>());
		comb.remove(0);
		for (int i = 0; i < comb.size(); i++) {
			int sub = Integer.parseInt(comb.get(i));
			if (sub % 8 == 0) {
				count += 1;
			}
		}

		count = count % ((int) Math.pow(10, 9) + 7);
		System.out.println(count);
	}

	private static ArrayList<String> combinations(String suffix, String prefix, ArrayList<String> comb) {
//		if (prefix.length() < 0) {
//			System.out.println("is it coming here");
//		}
		comb.add(suffix);
		for (int i = 0; i < prefix.length(); i++) {
			combinations(suffix + prefix.charAt(i), prefix.substring(i + 1, prefix.length()), comb);

		}
		return comb;
	}

}
