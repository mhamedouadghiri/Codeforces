package SetC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class C1221_PerfectTeam {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out);
        int q = nextInt();
        while (q-- != 0) {
            int c = nextInt();
            int m = nextInt();
            int x = nextInt();
            int min1 = Math.min(c, Math.min(m, x));
            int res = min1;
            c -= min1;
            m -= min1;
            x -= min1;
            if (c != 0 && m != 0 && c + m + x >= 3)
                res += Math.min(Math.min(c, m), (c + m) / 3);
            pw.println(res);
        }
        pw.close();
    }

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