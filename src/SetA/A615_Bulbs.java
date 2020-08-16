package SetA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

public class A615_Bulbs {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out);
        int n = nextInt();
        int m = nextInt();
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int x = nextInt();
            ArrayList<Integer> al = new ArrayList<>();
            for (int j = 0; j < x; j++)
                al.add(nextInt());
            hs.addAll(al);
        }
        pw.println(hs.size() == m ? "YES" : "NO");
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