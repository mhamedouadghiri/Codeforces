package SetC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class C1131_Birthday {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out);
        int n = nextInt();
        int[] heights = Arrays.stream(nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(heights);
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                res.add(heights[i]);
            else
                res.add(0, heights[i]);
        }
        for (int i = 0; i < n; i++)
            pw.print(res.get(i) + " ");
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