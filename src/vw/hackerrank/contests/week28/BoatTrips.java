/**
 * 
 */
package vw.hackerrank.contests.week28;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author vivek
 *
 */
public class BoatTrips {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c = in.nextInt();
        int m = in.nextInt();
        int val = -1;
        int[] p = new int[n];
        for(int p_i=0; p_i < n; p_i++){
            p[p_i] = in.nextInt();
            if(p[p_i] > val){
            	val = p[p_i];
            }
        }
        
        if(val > m*c){
        	System.out.println("No");
        }else{
        	System.out.println("Yes");
        }
        
    }

}
