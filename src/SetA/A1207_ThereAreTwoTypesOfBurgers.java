package SetA;

import java.util.Scanner;

public class A1207_ThereAreTwoTypesOfBurgers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int b, p, f, h, c;
        int expensive, cheap, type, type2;
        int res = 0;
        while (t-- != 0) {
            b = scanner.nextInt();
            p = scanner.nextInt();
            f = scanner.nextInt();
            h = scanner.nextInt();
            c = scanner.nextInt();
            expensive = Math.max(h, c);
            cheap = Math.min(h, c);
            type = (expensive == h) ? p : f;
            type2 = (expensive != h) ? p : f;
            while (b > 1 && type > 0) {
                res += expensive;
                b -= 2;
                type--;
            }
            while (b > 1 && type2 > 0) {
                res += cheap;
                b -= 2;
                type2--;
            }
            System.out.println(res);
            res = 0;
        }
    }
}
