package SetC1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class C1249_GoodNumbersEasyVersion {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out);
        int q = nextInt();
        while (q-- != 0) {
            char[] chars = Long.toString(nextLong(), 3).toCharArray();
            for (int i = chars.length - 1; i > 0; i--) {
                if (chars[i] >= '2') {
                    for (int j = i; j < chars.length; j++) {
                        chars[j] = '0';
                    }
                    chars[i - 1]++;
                }
            }
            if (chars[0] >= '2') {
                String zeros = "1" + "0".repeat(chars.length);
                pw.println(Long.parseLong(zeros, 3));
            } else {
                pw.println(Long.parseLong(new String(chars), 3));
            }
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