package SetA;

import java.util.Scanner;

public class A1234_EqualizePricesAgain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        int[] res = new int[q];
        for (int i = 0; i < q; i++) {
            int n = scanner.nextInt();
            int[] ai = new int[n];
            for (int j = 0; j < n; j++) {
                ai[j] = scanner.nextInt();
            }
            int sum = 0;
            for (int a : ai)
                sum += a;
            res[i] = (int) Math.ceil((double) sum / n);
        }
        for (int val : res)
            System.out.println(val);
    }
}
