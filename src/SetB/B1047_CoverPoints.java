package SetB;

import java.util.Scanner;

public class B1047_CoverPoints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long res = 0;
        while (n-- != 0)
            res = Math.max(res, scanner.nextInt() + scanner.nextInt());
        System.out.println(res);
    }
}
