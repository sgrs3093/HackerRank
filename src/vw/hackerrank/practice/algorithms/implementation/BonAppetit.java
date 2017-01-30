/**
 * 
 */
package vw.hackerrank.practice.algorithms.implementation;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * @author vivek
 *
 */
public class BonAppetit implements Closeable {
	private InputReader in = new InputReader(System.in);
	private PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

	public void solve() {
		int n = in.nextInt();
		int k = in.nextInt();
		ArrayList<Integer> n_arr = in.nextIntArray(n);
		int b = in.nextInt();
		n_arr.remove(k);
		long sum = 0;
		for (Integer i : n_arr) {
			sum += i;
		}
		long avg = (sum / 2);

		out.println(((b - avg) == 0) ? "Bon Appetit" : (b - avg));

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

		public ArrayList<Integer> nextIntArray(int n) {
			ArrayList<Integer> arr = new ArrayList<Integer>();
			for (int i = 0; i < n; i++) {
				arr.add(Integer.parseInt(next()));
			}
			return arr;
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
		try (BonAppetit instance = new BonAppetit()) {
			instance.solve();
		}
	}
}
