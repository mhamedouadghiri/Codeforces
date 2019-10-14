package SetA;

import java.math.BigInteger;
import java.util.Scanner;

public class A1_TheatreSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int a = scanner.nextInt();
        int x = (int) Math.ceil((double) n / a);
        int y = (int) Math.ceil((double) m / a);
        BigInteger xx = new BigInteger(String.valueOf(x));
        BigInteger yy = new BigInteger(String.valueOf(y));
        System.out.println(xx.multiply(yy));
    }
}
