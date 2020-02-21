package SetC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class C1257_DominatedSubarray {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out);
        int T = nextInt();
        while (T-- != 0) {
            int n = nextInt();
            int[] array = Arrays.stream(nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] seen = new int[n + 1];
            int res = Integer.MAX_VALUE;
            boolean flag = false;
            Arrays.fill(seen, -1);
            for (int i = 0; i < n; i++) {
                if (seen[array[i]] != -1) {
                    res = Math.min(res, i - seen[array[i]] + 1);
                    flag = true;
                }
                seen[array[i]] = i;
            }
            pw.println(flag ? res : -1);
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