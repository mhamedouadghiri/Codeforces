package SetD;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class D1165_AlmostAllDivisors {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out);
        int t = nextInt();
        while (t-- != 0) {
            int n = nextInt();
            List<Long> a = new ArrayList<>();
            List<Long> b = new ArrayList<>();
            for (int i = 0; i < n; i++)
                a.add(nextLong());
            Collections.sort(a);
            long res = a.get(0) * a.get(n - 1);
            for (int i = 2; i < Math.sqrt(res) + 1; i++) {
                if (res % i == 0 && !b.contains((long) i)) {
                    b.add((long) i);
                    if (i != res / i)
                        b.add(res / i);
                }
            }
            Collections.sort(b);
            pw.println(a.equals(b) ? res : "-1");
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