package SetA;

import java.util.Scanner;

public class A509_MaximumInTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(res(n, n, n));
    }

    private static int res(int n, int i, int j) {
        if (n == 1 || i == 1 || j == 1)
            return 1;
        return res(n, i - 1, j) + res(n, i, j - 1);
    }
}
