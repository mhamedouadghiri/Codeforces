package SetA;

import java.util.Scanner;

public class A732_BuyAShovel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int r = scanner.nextInt();
        int temp;
        for (int i = 1; i < 10; i++) {
            temp = (i * k) % 10;
            if (temp == 0 || temp == r) {
                System.out.println(i);
                System.exit(0);
            }
        }
    }
}
