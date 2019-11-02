package SetA;

import java.util.Arrays;
import java.util.Scanner;

public class A984_Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = scanner.nextInt();
        Arrays.sort(a);
        if (n % 2 == 1)
            System.out.println(a[n / 2]);
        else System.out.println(a[n / 2 - 1]);
    }
}