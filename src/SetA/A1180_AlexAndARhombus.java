package SetA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A1180_AlexAndARhombus {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out);
        int n = nextInt();
        Arrays.fill(dp, 0);
        dp[1] = 1;
        for (int i = 1; i <= n; i++)
            dp[i + 1] = dp[i] + 4 * i;
        pw.println(dp[n]);
        pw.close();
    }

    private static long[] dp = new long[102];

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