package SetB1;

import java.util.Scanner;

public class B177_RectangularGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int cnt = 0;
        while (n != 1) {
            cnt += n;
            int N = 1;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    N = n / i;
                    break;
                }
            }
            n = N;
        }
        System.out.println(++cnt);
    }
}
