package SetA;

import java.util.Scanner;

public class A467_GeorgeAndAccommodation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int cnt = 0;
        while (n-- != 0)
            cnt += -scanner.nextInt() + scanner.nextInt() >= 2 ? 1 : 0;
        System.out.println(cnt);
    }
}
