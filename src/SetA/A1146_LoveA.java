package SetA;

import java.util.Scanner;

public class A1146_LoveA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int len = string.length();
        int a = len - string.replace("a", "").length();
        if (a > len / 2) {
            System.out.println(len);
            System.exit(0);
        }
        System.out.println(2 * a - 1);
    }
}
