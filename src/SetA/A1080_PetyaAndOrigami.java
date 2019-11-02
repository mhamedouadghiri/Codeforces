package SetA;

import java.util.Scanner;

public class A1080_PetyaAndOrigami {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int a = n * 2;
        int b = n * 5;
        int c = n * 8;
        System.out.println((int) (Math.ceil((double) a / k) + Math.ceil((double) b / k) + Math.ceil((double) c / k)));
    }
}
