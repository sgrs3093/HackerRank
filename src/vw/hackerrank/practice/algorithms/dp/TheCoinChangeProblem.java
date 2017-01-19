/**
 * 
 */
package vw.hackerrank.practice.algorithms.dp;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author vivek.wisdom
 *
 */
public class TheCoinChangeProblem {

	private static long makeChange(int[] coins, int money) {
		return makeChange(coins, money, 0, new HashMap<String, Long>());

	}

	private static long makeChange(int[] coins, int money, int index, HashMap<String, Long> memo) {
		int amountWithCoin = 0;
		long ways = 0;

		if (money == 0) {
			return 1;
		}
		if (index >= coins.length) {
			return 0;
		}
		String key = money + "-" + index;
		if (memo.containsKey(key)) {
			return memo.get(key);
		}
		while (amountWithCoin <= money) {
			int remaining = money - amountWithCoin;
			ways += makeChange(coins, remaining, index + 1, memo);
			amountWithCoin += coins[index];
		}
		memo.put(key, ways);

		return ways;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int money = in.nextInt();
		int coinsSet = in.nextInt();
		int[] coins = new int[coinsSet];

		for (int i = 0; i < coinsSet; i++) {
			coins[i] = in.nextInt();
		}

		long ways = makeChange(coins, money);
		System.out.println(ways);
	}

}
