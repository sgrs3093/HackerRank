/**
 * 
 */
package vw.hackerrank.contests.week28;

import java.util.Scanner;

/**
 * @author vivek.wisdom
 *
 */
public class TheGreatXOR {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		for (int a0 = 0; a0 < q; a0++) {
			long x = in.nextLong();
			long count = 0;
			long log2 = (long) (Math.log(x) / Math.log(2));
			long max = (long) Math.pow(2, log2) - 1;
			count = max - (x - max) + 1;
			System.out.println(count);

		}
		// System.out.println(maxXor(0, 1000));

	}

	static int maxXor(int l, int r) {
		int c = 0;
		int exp = 0;
		while (l != 0 || r != 0) {
			c++;
			if ((l & 1) != (r & 1)) {
				exp = c;
			}
			l >>= 1;
			r >>= 1;
		}
		System.out.println(exp);
		return (1 << exp) - 1;
	}

}
