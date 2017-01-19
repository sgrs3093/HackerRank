/**
 * 
 */
package vw.hackerrank.practice.mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author vivek.wisdom
 * solved on 12/30/2016
 */
public class FindThePoint {

	/**
	 * @param args
	 * @throws IOException
	 * @throws NumberFormatException
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int numberOfInput = Integer.parseInt(br.readLine());

		for (int i = 0; i < numberOfInput; i++) {
			String[] cords = br.readLine().split(" ");

			int px = Integer.parseInt(cords[0]);
			int py = Integer.parseInt(cords[1]);
			int qx = Integer.parseInt(cords[2]);
			int qy = Integer.parseInt(cords[3]);

			int rx = qx + (qx - px);
			int ry = qy + (qy - py);

			System.out.println(rx + " " + ry);
		}

	}

}


