package SetA;

import java.util.Scanner;

public class A977_WrongSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        while (k-- != 0)
            n = sub(n);
        System.out.println(n);
    }

    private static int sub(int n) {
        return n % 10 != 0 ? n - 1 : n / 10;
    }
}
