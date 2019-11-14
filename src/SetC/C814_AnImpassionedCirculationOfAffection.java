package SetC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class C814_AnImpassionedCirculationOfAffection {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out);
        int n = nextInt();
        String string = nextLine();
        String[] line;
        int m;
        char c;
        int q = nextInt();
        while (q-- != 0) {
            line = nextLine().split(" ");
            m = Integer.parseInt(line[0]);
            c = line[1].charAt(0);
            int left = 0, right = 0, cnt = 0, shift = 0;
            for (int i = 0; i < n; i++) {
                if (string.charAt(i) == c) {
                    ++right;
                    cnt = Math.max(cnt, right - left + 1);
                    continue;
                }
                if (shift >= m) {
                    while (string.charAt(left) == c && left < right)
                        ++left;
                    --shift;
                    ++left;
                }
                ++right;
                ++shift;
                cnt = Math.max(cnt, right - left + 1);
            }
            pw.println(--cnt + " ");
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
}
