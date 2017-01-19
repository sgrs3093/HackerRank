/**
 * 
 */
package vw.hackerrank.practice.mathematics;

import java.util.Scanner;

/**
 * @author vivek.wisdom
 *
 */
public class HandShake {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int a0 = 0; a0 < T; a0++){
            int N = in.nextInt();
            System.out.println((N*(N-1))/2);
        }

	}

}
