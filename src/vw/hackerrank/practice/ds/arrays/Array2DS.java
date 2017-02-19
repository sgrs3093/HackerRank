package vw.hackerrank.practice.ds.arrays;

/**
 * @author vivek
 *
 */

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Array2DS implements Closeable {
	private InputReader in = new InputReader(System.in);
	private PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

	public void solve() {
		int[][] arr = new int[6][6];
		int total = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		int maxY = 3, maxX = 3;
		for (int y = 0; y <= maxY; y++) {
			for (int x = 0; x <= maxX; x++) {
				int sum = arr[y][x] + arr[y][x + 1] + arr[y][x + 2];

				sum += arr[y + 1][x + 1];

				sum += arr[y + 2][x] + arr[y + 2][x + 1] + arr[y + 2][x + 2];
				
				if(total < sum)
					total = sum;
			}
		}
		out.println(total);
	}

	@Override
	public void close() throws IOException {
		in.close();
		out.close();
	}

	static class InputReader {
		public BufferedReader reader;
		public StringTokenizer tokenizer;

		public InputReader(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream), 32768);
			tokenizer = null;
		}

		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

		public long nextLong() {
			return Long.parseLong(next());
		}

		public void close() throws IOException {
			reader.close();
		}
	}

	public static void main(String[] args) throws IOException {
		try (Array2DS instance = new Array2DS()) {
			instance.solve();
		}
	}
}
