/**
 * 
 */
package vw.hackerrank.contests.rr2;

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

public class HackerrankInAString implements Closeable {
	private InputReader in = new InputReader(System.in);
	private PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

	public void solve() {
		int q = in.nextInt();
		for (int i = 0; i < q; i++) {
			String s = in.next();
			String result = "NO";
			int h = s.indexOf('h');
			int a1 = s.indexOf('a', h);
			int c = s.indexOf('c', a1);
			int k1 = s.indexOf('k', c);
			int e = s.indexOf('e', k1);
			int r1 = s.indexOf('r', e);
			int r2 = s.indexOf('r', r1);
			int a2 = s.indexOf('a', r2);
			int n = s.indexOf('n', a2);
			int k2 = s.indexOf('k', n);

			if (h != -1 && h < a1)
				if (a1 != -1 && a1 < c)
					if (c != -1 && c < k1)
						if (k1 != -1 && k1 < e)
							if (e != -1 && e < r1)
								if (r1 != -1 && r1 < r2)
									if (r2 != -1 && r2 < a2)
										if (a2 != -1 && a2 < n)
											if (n != -1 && n < k2)
												result = "YES";
			out.println(result);
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

		public int[] nextIntArray(int n) {
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = nextInt();
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
		try (HackerrankInAString instance = new HackerrankInAString()) {
			instance.solve();
		}
	}
}
