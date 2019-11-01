package SetA;

import java.util.Scanner;

public class A1244_PensAndPencils {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int a, b, c, d, k;
        double x, y;
        while (t-- != 0) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();
            d = scanner.nextInt();
            k = scanner.nextInt();
            x = Math.ceil((double) a / c);
            y = Math.ceil((double) b / d);
            if (x + y > k) System.out.print(-1);
            else System.out.print((int) x + " " + (int) y);
            System.out.println();
        }
    }
}
