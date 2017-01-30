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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class WeightedUniformStrings implements Closeable {
	private InputReader in = new InputReader(System.in);
	private PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

	public void solve() {
		String s = in.next();
		String[] arr = new String[s.length()];
		ArrayList<Integer> union = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					arr[i] = s.substring(i, j + 1);
				} else {
					arr[j] = String.valueOf(s.charAt(j));
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			int one = (arr[i].charAt(0) - 96);
			union.add(one * (arr[i].length()));
		}
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			int k = in.nextInt();
			if (union.indexOf(k) != -1) {
				out.println("Yes");
			} else {
				out.println("No");
			}
		}
		out.println(Arrays.toString(arr));
		out.println(union.toString());
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
		try (WeightedUniformStrings instance = new WeightedUniformStrings()) {
			instance.solve();
		}
	}
}
