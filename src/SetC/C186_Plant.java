package SetC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class C186_Plant {
    private static final long MOD = 1000000007;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;

    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out);
        long n = nextLong();
        long x = modPow(2, n - 1, MOD);
        pw.println(n == 0 ? 1 : x * (2 * x + 1) % MOD);
        pw.close();
    }

    private static long modPow(long x, long y, long m) {
        int res = 1;
        x = x % m;
        while (y > 0) {
            if ((y & 1) == 1)
                res = (int) ((res * x) % m);
            y = y >> 1;
            x = (x * x) % m;
        }
        return res;
    }

    private static String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    private static String nextLine() {
        String str = "";
        try {
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }

    private static int nextInt() {
        return Integer.parseInt(next());
    }

    private static long nextLong() {
        return Long.parseLong(next());
    }

    private static double nextDouble() {
        return Double.parseDouble(next());
    }
}