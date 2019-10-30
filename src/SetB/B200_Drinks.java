package SetB;

import java.util.Scanner;

public class B200_Drinks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] L = new int[n];
        for (int i = 0; i < n; i++)
            L[i] = scanner.nextInt();
        double res = 0;
        for (int e : L)
            res += e;
        System.out.println(res/n);
    }
}
