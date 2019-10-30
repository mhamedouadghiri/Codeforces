package SetA;

import java.util.Scanner;

public class A1223_CME {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        int n;
        while (q-- != 0) {
            n = scanner.nextInt();
            if (n == 2) {
                System.out.println(2);
                continue;
            }
            if (n % 2 == 0)
                System.out.println(0);
            else
                System.out.println(1);
        }
    }
}
