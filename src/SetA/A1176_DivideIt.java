package SetA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A1176_DivideIt {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out);
        int q = nextInt();
        while (q-- != 0) {
            long n = nextLong();
            int cnt = 0;
            while (n != 1) {
                if (n % 2 == 0) {
                    n /= 2;
                    cnt++;
                } else if (n % 3 == 0) {
                    n = 2 * n / 3;
                    cnt++;
                } else if (n % 5 == 0) {
                    n = 4 * n / 5;
                    cnt++;
                } else break;
            }
            pw.println(n == 1 ? cnt : -1);
        }
        pw.close();
    }

    private static final long MOD = (long) (Math.pow(10, 9) + 7);

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;

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