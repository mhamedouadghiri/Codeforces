package SetB1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class B1249_BooksExchangeEasyVersion {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out);
        int q = nextInt();
        while (q-- != 0) {
            int n = nextInt();
            int[] pi = new int[n];
            for (int i = 0; i < n; i++) {
                pi[i] = nextInt() - 1;
            }
            int[] res = new int[n];
            int cnt, x;
            for (int i = 0; i < n; i++) {
                x = i;
                cnt = 1;
                if (res[i] == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(i);
                    while (pi[x] != i) {
                        list.add(x);
                        x = pi[x];
                        cnt++;
                    }
                    for (int e : list) {
                        res[e] = cnt;
                    }
                }
            }
            for (int e : res) {
                pw.print(e + " ");
            }
            pw.println();
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