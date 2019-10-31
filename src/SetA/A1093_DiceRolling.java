package SetA;

import java.util.Scanner;

public class A1093_DiceRolling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int x;
        while (t-- != 0) {
            x = scanner.nextInt();
            if (x <= 7 && x >= 2)
                System.out.println(1);
            else System.out.println(x / 7 + 1);
        }
    }
}
