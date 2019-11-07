package SetD;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class D1073_BerlandFair {
    public static void main(String[] args) {
        long n = nextLong();
        long T = nextLong();
        long[] prices = new long[(int) n];
        long minPrice = Long.MAX_VALUE;
        long price;
        for (int i = 0; i < n; i++) {
            price = nextLong();
            prices[i] = price;
            minPrice = Math.min(price, minPrice);
        }
        long cnt = 0;
        while (T > 0 && T >= minPrice) {
            long tempSum = 0;
            long tempCnt = 0;
            for (int i = 0; i < n; i++) {
                if (T >= prices[i] + tempSum) {
                    tempSum += prices[i];
                    tempCnt++;
                }
            }
            cnt += (T / tempSum) * tempCnt;
            T %= tempSum;
        }
        System.out.println(cnt);
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

    private static long nextLong() {
        return Long.parseLong(next());
    }
}