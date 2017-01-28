/**
 * 
 */
package vw.hackerrank.practice.algorithms.strings;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * @author vivek
 *
 */
public class GemStones implements Closeable {
	private InputReader in = new InputReader(System.in);
	private PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

	public void solve() {
		int n = in.nextInt();
		int[] arr = new int[26];
		int count = 0;
		Set<Character> charSet = new HashSet<Character>();
		for (int i = 0; i < n; i++) {
			String str = in.next();
			for (Character c : str.toCharArray()) {
				charSet.add(c);
			}
			for (Character c : charSet) {
				arr[c - 97]++;
				if (arr[c - 97] >= n) {
					count++;
				}
			}
			charSet.clear();
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
		try (GemStones instance = new GemStones()) {
			instance.solve();
		}
	}
}