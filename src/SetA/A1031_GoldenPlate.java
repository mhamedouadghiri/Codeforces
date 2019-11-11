package SetA;

import java.util.Scanner;

public class A1031_GoldenPlate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long w = scanner.nextLong();
        long h = scanner.nextLong();
        long k = scanner.nextLong();
        long res = (w + h - 2) << 1;
        for (int i = 2; i < k + 1; i++)
            res += (w + h - 8 * (i - 1) - 2) << 1;
        System.out.println(res);
    }
}
