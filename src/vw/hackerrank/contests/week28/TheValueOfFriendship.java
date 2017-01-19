/**
 * 
 */
package vw.hackerrank.contests.week28;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author vivek
 *
 */
public class TheValueOfFriendship {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			int m = in.nextInt();
			int total = 0;
			int[] num_friends = new int[n];
			for (int a1 = 0; a1 < m; a1++) {
				int x = in.nextInt();
				int y = in.nextInt();
				if(num_friends[x] != 0 || num_friends[y] != 0){
					num_friends[x - 1] += 1;
					num_friends[y - 1] += 1;
				}else{
					num_friends[x - 1] += 1;
					num_friends[y - 1] += 1;
				}
				
			}
			for (int i = 0; i < num_friends.length; i++) {
				total += num_friends[i];
			}
			System.out.println(Arrays.toString(num_friends));
			System.out.println(total);
		}

	}

}
