package SetB;

import java.util.Scanner;

public class B912_NewYearsEve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long k = scanner.nextLong();
        System.out.println(k == 1 ? n : Long.highestOneBit(2 * n) - 1);
    }
}
