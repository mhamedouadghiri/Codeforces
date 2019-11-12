package SetA;

import java.util.Scanner;

public class A1108_TwoDistinctPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        int l1, l2, r2;
        while (q-- != 0) {
            l1 = scanner.nextInt();
            scanner.nextInt();
            l2 = scanner.nextInt();
            r2 = scanner.nextInt();
            System.out.println(l1 + " " + (r2 != l1 ? r2 : l2));
        }
    }
}
