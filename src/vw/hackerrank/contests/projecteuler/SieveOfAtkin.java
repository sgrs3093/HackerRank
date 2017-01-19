/**
 * 
 */
package vw.hackerrank.contests.projecteuler;

/**
 * @author vivek.wisdom
 *
 */
public class SieveOfAtkin {

	public boolean[] calcPrimes(int limit) {
		boolean[] prime = new boolean[limit + 1];

		prime[2] = true;
		prime[3] = true;

		int root = (int) Math.ceil(Math.sqrt(limit));

		/**
		 * put in candidate primes: integers which have an odd number of
		 * representations by certain quadratic forms
		 **/

		for (int x = 1; x < root; x++) {
			for (int y = 1; y < root; y++) {
				// 4*X*X + Y*Y
				int n = 4 * x * x + y * y;

				if (n <= limit && (n % 12 == 1 || n % 12 == 5))
					prime[n] = !prime[n];

				n = 3 * x * x + y * y;

				if (n <= limit && n % 12 == 7)
					prime[n] = !prime[n];

				n = 3 * x * x - y * y;

				if ((x > y) && (n <= limit) && (n % 12 == 11))
					prime[n] = !prime[n];
			}

		}

		/** eliminate composites by sieving, omit multiples of its square **/

		for (int i = 5; i < root; i++) {
			if (prime[i])
				for (int j = i * i; j < limit; j += i * i)
					prime[j] = false;
		}
		return prime;
	}

}
