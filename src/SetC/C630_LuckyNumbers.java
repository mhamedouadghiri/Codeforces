package SetC;

import java.math.BigInteger;
import java.util.Scanner;

public class C630_LuckyNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        BigInteger res = BigInteger.ZERO;
        BigInteger TWO = new BigInteger("2");
        for (int i = 1; i < n + 1; i++)
            res = res.add(TWO.pow(i));
        System.out.println(res);
    }
}
