package SetA;

import java.util.Scanner;

public class A1191_TokitsukazeAndEnhancement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x % 4 == 1) {
            System.out.print("0 A");
        } else if (x % 4 == 2) {
            System.out.println("1 B");
        } else if (x % 4 == 3) {
            System.out.println("2 A");
        } else if (x % 4 == 0) {
            System.out.println("1 A");
        }
    }
}
