package SetC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class C379_NewYearRatingsChange {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out);
        int n = nextInt();
        Integer[] ratings = new Integer[n];
        Integer[] indexes = new Integer[n];
        for (int i = 0; i < n; i++) {
            ratings[i] = nextInt();
            indexes[i] = i;
        }
        Arrays.sort(indexes, Comparator.comparingInt(s -> ratings[s]));

        int temp, extra = 0, max;
        Integer[] result = new Integer[n];
        for (int i = 0; i < n; i++) {
            temp = indexes[i];
            max = Math.max(extra + 1, ratings[temp]);
            result[temp] = max;
            extra = max;
        }

        for (Integer e : result) {
            pw.print(e + " ");
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

    private static int nextInt() {
        return Integer.parseInt(next());
    }
}
