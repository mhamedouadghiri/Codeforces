package SetA;

import java.math.BigInteger;
import java.util.Scanner;

public class A1196_ThreePilesOfCandies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        BigInteger TWO = new BigInteger("2");
        while (q-- != 0) {
            BigInteger a = scanner.nextBigInteger();
            BigInteger b = scanner.nextBigInteger();
            BigInteger c = scanner.nextBigInteger();
            System.out.println(a.add(b).add(c).divide(TWO));
        }
    }
}
