package SetD;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class D688_RemaindersGame {
    private static final long MOD = 1000000007;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;

    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out);
        nextInt();
        int k = nextInt();
        int[] c = Arrays.stream(nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        long r = 1;
        for (int value : c) r = lcm(r, gcd(k, value));
        pw.println(r % k == 0 ? "Yes" : "No");
        pw.close();
    }

    private static long gcd(long a, long b) {
        return a == 0 ? b : gcd(b % a, a);
    }

    private static long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
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