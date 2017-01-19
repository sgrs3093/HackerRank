/**
 * 
 */
package vw.hackerrank.contests.week28;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author vivek.wisdom
 *
 */
public class LuckyNumberEightNew {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String number = in.next();
		long count = 0;
		
		for (int i = 0; i < (int)Math.pow(2, n); i++) {
			String binaryRep = Integer.toBinaryString(i);
			String str = "";
			for (int j = 0; j < binaryRep.length(); j++) {
				int index=binaryRep.length()-1-j;
				if(binaryRep.charAt(index) == '1'){
					str+=number.charAt(j)+"";
				}
			}
			
			if(str != "" && (new BigInteger(str).mod(new BigInteger("8"))).compareTo(BigInteger.ZERO) == 0){
				count+=1;
			}
			
		}

		count = count % ((int) Math.pow(10, 9) + 7);
		System.out.println(count);
	}

}
