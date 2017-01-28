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
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WeightedUniformStrings implements Closeable {
	private InputReader in = new InputReader(System.in);
	private PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

	public void solve() {
		String s = in.next();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < s.length(); i++) {
			arr.add((s.charAt(i) - 96));
		}
		
		out.println(arr.toString());
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
