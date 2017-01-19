/**
 * 
 */
package vw.hackerrank.contests.projecteuler;

//Incomplete 
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author vivek.wisdom
 *
 */
public class PrimeSummations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		SieveOfAtkin soa = new SieveOfAtkin();
		int limit = 1000;
		boolean primes[] = soa.calcPrimes(limit);

		int testCases = in.nextInt();
		for (int i = 0; i < testCases; i++) {
			int N = in.nextInt();
			int[] primesUnderN= new int[N/2];
			int count = 0;
			for (int j = 0; j < N; j++) {
				if(primes[j]){
					primesUnderN[count] = j;
					count++;
				}
			}
			System.out.println(Arrays.toString(primesUnderN));

		}

	}

}
