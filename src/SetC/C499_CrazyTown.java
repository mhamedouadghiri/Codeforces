package SetC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class C499_CrazyTown {
    private static final long MOD = 1000000007;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;

    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out);
        int x1 = nextInt();
        int y1 = nextInt();
        int x2 = nextInt();
        int y2 = nextInt();
        int n = nextInt();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            double a = nextDouble();
            double b = nextDouble();
            double c = nextDouble();
            if ((a * x1 + b * y1 + c) * (a * x2 + b * y2 + c) < 0) cnt++;
        }
        pw.println(cnt);
        pw.close();
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