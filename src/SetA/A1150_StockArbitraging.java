package SetA;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class A1150_StockArbitraging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int r = scanner.nextInt();
        Integer[] sell = new Integer[n];
        Integer[] buy = new Integer[m];
        for (int i = 0; i < n; i++)
            sell[i] = scanner.nextInt();
        for (int i = 0; i < m; i++)
            buy[i] = scanner.nextInt();
        int minS = Collections.min(Arrays.asList(sell));
        int maxB = Collections.max(Arrays.asList(buy));
        if (minS >= maxB) {
            System.out.println(r);
            System.exit(0);
        }
        int shares = r / minS;
        r = r % minS;
        r += maxB * shares;
        System.out.println(r);
    }
}
