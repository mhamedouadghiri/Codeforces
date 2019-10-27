package SetA;

import java.util.Scanner;

public class A959_MahmoudAndEhabAndTheEvenOddGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 2 == 0) {
            System.out.println("Mahmoud");
            System.exit(0);
        }
        System.out.println("Ehab");
    }
}
