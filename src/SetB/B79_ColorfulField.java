package SetB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class B79_ColorfulField {
    private static final long MOD = 1000000007;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringTokenizer st;

    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out);
        int n = nextInt();
        int m = nextInt();
        int k = nextInt();
        int t = nextInt();
        TreeSet<Pair> wastes = new TreeSet<>();
        for (int i = 0; i < k; i++) wastes.add(new Pair(nextInt(), nextInt()));
        int cnt = 1;
        for (Pair pair : wastes) pair.position = cnt++;
        while (t-- != 0) {
            int x = nextInt();
            int y = nextInt();
            Pair p = wastes.ceiling(new Pair(x, y));
            if (p == null) {
                int pos = m * (x - 1) + y - k;
                if (pos % 3 == 0) pw.println("Grapes");
                else if (pos % 3 == 1) pw.println("Carrots");
                else pw.println("Kiwis");
            } else {
                if (p.x == x && p.y == y) pw.println("Waste");
                else {
                    int pos = m * (x - 1) + y - p.position + 1;
                    if (pos % 3 == 0) pw.println("Grapes");
                    else if (pos % 3 == 1) pw.println("Carrots");
                    else pw.println("Kiwis");
                }
            }
        }
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

class Pair implements Comparable<Pair> {
    int x, y, position;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Pair o) {
        return x != o.x ? x - o.x : y - o.y;
    }
}
