package SetA;

import java.util.Scanner;

public class A835_KeyRaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int v1 = scanner.nextInt();
        int v2 = scanner.nextInt();
        int t1 = scanner.nextInt();
        int t2 = scanner.nextInt();

        int first = s * v1 + 2 * t1;
        int second = s * v2 + 2 * t2;
        if (first < second)
            System.out.println("First");
        else if (second < first)
            System.out.println("Second");
        else System.out.println("Friendship");
    }
}
