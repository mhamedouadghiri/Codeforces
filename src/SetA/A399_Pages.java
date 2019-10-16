package SetA;

import java.util.Scanner;

public class A399_Pages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = scanner.nextInt();
        int k = scanner.nextInt();

        int min = Math.max(p - k, 1);
        int max = Math.min(p + k, n);

        if (min != 1)
            System.out.print("<< ");
        for (int i = min; i <= max; i++) {
            if (i == p)
                System.out.print("(" + p + ") ");
            else
                System.out.print(i + " ");
        }
        if (max != n)
            System.out.print(">>");
    }
}
