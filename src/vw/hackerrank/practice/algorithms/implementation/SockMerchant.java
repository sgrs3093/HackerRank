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
import java.util.StringTokenizer;

/**
 * @author vivek
 *
 */
public class SockMerchant implements Closeable {
	private InputReader in = new InputReader(System.in);
	private PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

	public void solve() {
		int testCases = in.nextInt();
		int count = 0;
		int[] arr = new int[101];
		arr[0] = -1;
		for (int i = 0; i < testCases; i++) {
			arr[in.nextInt()] += 1;
		}
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > 1) {
				count += (arr[i] / 2);
			}
		}
		out.println(count);
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
		try (SockMerchant instance = new SockMerchant()) {
			instance.solve();
		}
	}
}
