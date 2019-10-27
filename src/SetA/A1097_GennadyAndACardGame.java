package SetA;

import java.util.Scanner;

public class A1097_GennadyAndACardGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String table = scanner.nextLine();
        String[] cards = scanner.nextLine().split(" ");
        for (int i = 0; i < 5; i++) {
            if (table.charAt(0) == cards[i].charAt(0)) {
                System.out.println("YES");
                System.exit(0);
            }
            if (table.charAt(1) == cards[i].charAt(1)) {
                System.out.println("YES");
                System.exit(0);
            }
        }
        System.out.println("NO");
    }
}
