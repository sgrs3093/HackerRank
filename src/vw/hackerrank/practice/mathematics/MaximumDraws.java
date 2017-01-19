/**
 * 
 */
package vw.hackerrank.practice.mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author vivek.wisdom
 *
 */
public class MaximumDraws {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int numberOfInput = Integer.parseInt(br.readLine());

		for (int i = 0; i < numberOfInput; i++) {
			int pairOfSocks = Integer.parseInt(br.readLine());


			System.out.println(pairOfSocks+1);
		}

	}

}
