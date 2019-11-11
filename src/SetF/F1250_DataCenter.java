package SetF;

import java.util.Scanner;

public class F1250_DataCenter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int minPer = Integer.MAX_VALUE;
        for (int i = 1; i < n / 2 + 2; i++) {
            if (n % i == 0) {
                if (2 * (i + n / i) < minPer)
                    minPer = 2 * (i + n / i);
            }
        }
        System.out.println(minPer);
    }
}
