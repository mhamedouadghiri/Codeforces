package SetB;

import java.util.Scanner;

public class B734_AntonAndDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k2 = scanner.nextInt();
        int k3 = scanner.nextInt();
        int k5 = scanner.nextInt();
        int k6 = scanner.nextInt();
        int a = Math.min(k2, Math.min(k5, k6));
        int b = Math.min(k2 - a, k3);
        System.out.println(a * 256 + b * 32);
    }
}
