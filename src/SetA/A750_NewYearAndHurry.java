package SetA;

import java.util.Scanner;

public class A750_NewYearAndHurry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int rem = 240 - k;
        int i = 0;
        while (i <= n && rem >= 0) {
            i++;
            rem -= 5 * i;
        }
        System.out.println(i - 1);
    }
}
