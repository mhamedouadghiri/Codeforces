

import java.util.Scanner;

public class A344_Magnets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int cnt = 1;
        int[] magnets = new int[n];
        for (int i = 0; i < n; i++)
            magnets[i] = scanner.nextInt();
        for (int i = 0; i < n - 1; i++) {
            if (magnets[i] != magnets[i + 1])
                cnt++;
        }
        System.out.println(cnt);
    }
}
