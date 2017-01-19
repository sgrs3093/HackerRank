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
public class LuckyNumberEightOptimized {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int divisor = 8;
		String number = in.next();
		final int RESULTMOD = 1000000000 + 7;

		int total = 0;
		// modtable[i] is the number of subsequences with int(sequence) % 8 = i
		int[] modTable = new int[divisor];
		
		for (int i = 0; i < n; i++) {
			int[] nextTable = new int[divisor];

			// transform table from last loop-run (shared modulo)
			for (int j = 0; j < divisor; j++) {
				nextTable[(j * 10 + number.charAt(i) - '0') % divisor] = modTable[j] % RESULTMOD;

				System.out.println("Next Table"+Arrays.toString(nextTable));
				
			}
			System.out.println("Out of divisor loop");
			// add the sequence that starts at this index to the appropriate
			// bucket
			nextTable[(number.charAt(i) - '0') % divisor]++;

			// add the count of all sequences with int(sequence) % 8 = 0 to the
			// result
			total += nextTable[0];
			total %= RESULTMOD;

			// table for next run
			modTable = nextTable;
			System.out.println(total);
			System.out.println("Mod Table "+Arrays.toString(modTable));
			System.out.println("Next Table"+Arrays.toString(nextTable));
			System.out.println();
		}
		System.out.println(total);
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
