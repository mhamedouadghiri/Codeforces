package SetA;

import java.util.Scanner;

public class A546_SoldierAndBananas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        int w = scanner.nextInt();
        System.out.println(Math.max(0, k * w * (w + 1) / 2 - n));
    }
}
