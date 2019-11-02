package SetA;

import java.util.Scanner;

public class A1006_AdjacentReplacements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0)
                System.out.print(a[i] - 1 + " ");
            else System.out.print(a[i] + " ");
        }
    }
}
