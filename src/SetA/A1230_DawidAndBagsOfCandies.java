package SetA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A1230_DawidAndBagsOfCandies {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out);
        int[] A = Arrays.stream(nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(A);
        pw.println(A[0] + A[3] == A[1] + A[2] || A[0] + A[1] + A[2] == A[3] ? "YES" : "NO");
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