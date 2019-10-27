package SetA;

import java.util.Scanner;

public class A935_FafaAndHisCompany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int cnt = 0;
        for (int i = 1; i < n / 2 + 1; i++) {
            if ((n - i) % i == 0)
                cnt++;
        }
        System.out.println(cnt);
    }
}
