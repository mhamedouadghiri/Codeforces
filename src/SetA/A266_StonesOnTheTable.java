package SetA;

import java.util.Scanner;

public class A266_StonesOnTheTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String stones = scanner.nextLine();
        int cnt = 0;
        for (int i = 1; i < n; i++) {
            if (stones.charAt(i) == stones.charAt(i - 1))
                cnt++;
        }
        System.out.println(cnt);
    }
}
