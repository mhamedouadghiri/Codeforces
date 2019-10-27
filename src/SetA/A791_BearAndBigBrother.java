package SetA;

import java.util.Scanner;

public class A791_BearAndBigBrother {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int cnt = 0;
        while (a <= b) {
            a *= 3;
            b *= 2;
            cnt++;
        }
        System.out.println(cnt);
    }
}
