package SetC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class C357_KnightTournament {
    private static final long MOD = 1000000007;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;

    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out);
        int n = nextInt();
        int m = nextInt();
        Integer[] res = new Integer[n];
        Arrays.fill(res, 0);
        TreeSet<Integer> ts = new TreeSet<>();
        for (int i = 1; i < n + 1; i++) ts.add(i);
        Set<Integer> sub;
        while (m-- != 0) {
            int x = nextInt();
            int y = nextInt();
            int z = nextInt();
            sub = ts.subSet(x, y + 1);
            for (int elt : sub) {
                if (elt != z)
                    res[elt - 1] = z;
            }
            for (Iterator<Integer> iterator = sub.iterator(); iterator.hasNext(); ) {
                iterator.next();
                iterator.remove();
            }
            ts.add(z);
        }
        for (Integer elt : res)
            pw.print(elt + " ");
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