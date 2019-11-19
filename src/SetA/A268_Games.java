package SetA;

import java.util.Scanner;

public class A268_Games {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] hi = new int[n];
        int[] ai = new int[n];
        for (int i = 0; i < n; i++) {
            hi[i] = scanner.nextInt();
            ai[i] = scanner.nextInt();
        }
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (hi[i] == ai[j])
                    cnt++;
                if (ai[i] == hi[j])
                    cnt++;
            }
        }
        System.out.println(cnt);
    }
}
