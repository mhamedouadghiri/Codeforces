package SetA;

import java.util.Scanner;

public class A231_Team {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int cnt = 0;
        while (n-- != 0) {
            if (scanner.nextInt() + scanner.nextInt() + scanner.nextInt() > 1)
                cnt++;
        }
        System.out.println(cnt);
    }
}
