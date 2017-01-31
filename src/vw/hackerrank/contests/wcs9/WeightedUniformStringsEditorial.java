/**
 * 
 */
package vw.hackerrank.contests.wcs9;

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
import java.util.HashMap;
import java.util.StringTokenizer;

public class WeightedUniformStringsEditorial implements Closeable {
	private InputReader in = new InputReader(System.in);
	private PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

	public void solve() {
		String s = in.next();
		int t = in.nextInt();
		HashMap<Integer, Integer> arr = new HashMap<>();
		int w = 0;
		for (int i = 0; i < s.length(); i++) {
			if (i == 0 || s.charAt(i) != s.charAt(i - 1)) {
				w = (s.charAt(i) - 'a') + 1;
			} else {
				w = w + ((s.charAt(i) - 'a') + 1);
			}
			arr.put(w, 1);
		}
		for (int i = 0; i < t; i++) {
			int test = in.nextInt();
			if (arr.containsKey(test)) {
				out.println("Yes");
			} else {
				out.println("No");
			}
		}
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
		try (WeightedUniformStringsEditorial instance = new WeightedUniformStringsEditorial()) {
			instance.solve();
		}
	}
}
