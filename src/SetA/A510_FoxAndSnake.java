package SetA;

import java.util.Scanner;

public class A510_FoxAndSnake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        for (int i = 1; i < n + 1; i++) {
            if (i % 2 != 0)
                System.out.println("#".repeat(m));
            else if (i % 4 == 0)
                System.out.println("#" + ".".repeat(m - 1));
            else System.out.println(".".repeat(m - 1) + "#");
        }
    }
}
