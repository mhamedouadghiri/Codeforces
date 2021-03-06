package SetA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class A378_PlayingWithDice {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out);
        int a = nextInt();
        int b = nextInt();
        int x = 0, y = 0, z = 0;
        for (int i = 1; i <= 6; i++) {
            if (Math.abs(a - i) == Math.abs(b - i)) y++;
            else if (Math.abs(a - i) < Math.abs(b - i)) x++;
            else z++;
        }
        pw.println(x + " " + y + " " + z);
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