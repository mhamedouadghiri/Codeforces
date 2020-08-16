package SetA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A999_MishkaAndContest {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out);
        int n = nextInt();
        int k = nextInt();
        int[] lst = Arrays.stream(nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int cnt = 0;
        int x = 0;
        for (int i = 0; i < n; i++) {
            if (lst[i] <= k) {
                cnt++;
                x = i;
            } else break;
        }
        for (int i = n - 1; i > x; i--) {
            if (lst[i] <= k) {
                cnt++;
            } else break;
        }
        pw.println(cnt);
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