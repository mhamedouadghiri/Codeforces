package SetA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Comparator;
import java.util.HashMap;
import java.util.StringTokenizer;

public class A2_Winner {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out);
        int n = nextInt();
        HashMap<String, Integer> map = new HashMap<>();
        int[] scores = new int[n];
        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            String[] line = nextLine().split(" ");
            String name = line[0];
            int score = Integer.parseInt(line[1]);
            names[i] = name;
            if (!map.containsKey(name))
                map.put(name, score);
            else map.put(name, score + map.get(name));
            scores[i] = map.get(name);
        }
        int max = map.values().stream().max(Comparator.comparingInt(Integer::valueOf)).get();
        for (int i = 0; i < n; i++) {
            if (map.get(names[i]) == max && scores[i] >= max) {
                pw.println(names[i]);
                break;
            }
        }
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