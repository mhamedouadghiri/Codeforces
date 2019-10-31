package SetA;

import java.util.Scanner;

public class A581_VasyaTheHipster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(Math.min(a, b) + " " + Math.abs(a - b) / 2);
    }
}
