package SetA;

import java.util.Scanner;

public class A749_BachgoldProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(n / 2);
        for (int i = 0; i < n / 2 - 1; i++) {
            System.out.print(2 + " ");
        }
        if (n % 2 == 0)
            System.out.print(2);
        if (n % 2 == 1)
            System.out.print(3);
    }
}
