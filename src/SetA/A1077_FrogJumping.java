package SetA;

import java.math.BigInteger;
import java.util.Scanner;

public class A1077_FrogJumping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        BigInteger a, b, k, k2;
        BigInteger TWO = new BigInteger("2");
        while (t-- != 0) {
            a = scanner.nextBigInteger();
            b = scanner.nextBigInteger();
            k = scanner.nextBigInteger();
            k2 = k.divide(TWO);
            if (k.mod(TWO).equals(BigInteger.ZERO))
                System.out.println(a.multiply(k2).subtract(b.multiply(k2)));
            else System.out.println(a.multiply(k2.add(BigInteger.ONE)).subtract(b.multiply(k2)));
        }
    }
}
