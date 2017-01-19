/**
 * 
 */
package vw.hackerrank.practice.algorithms.strings;

import java.util.Scanner;

/**
 * @author vivek.wisdom
 *
 */
public class CamelCase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
        String[] s = in.next().split("(?=\\p{Upper})");
        
        System.out.println(s.length);

	}

}
