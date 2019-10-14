package SetB1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class B1234_SocialNetworkEasyVersion {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer("");
        int n = Integer.parseInt(token.nextToken());
        String[] xis = br.readLine().split(" ");
        BigInteger[] xi = new BigInteger[xis.length];
        for (int i = 0; i < xis.length; i++)
            xi[i] = new BigInteger(xis[i]);
        for (BigInteger bi : xi) {
            if (t_prime(bi)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }


    private static BigInteger sqrt(BigInteger val) {
        BigInteger half = BigInteger.ZERO.setBit(val.bitLength() / 2);
        BigInteger cur = half;
        while (true) {
            BigInteger tmp = half.add(val.divide(half)).shiftRight(1);
            if (tmp.equals(half) || tmp.equals(cur))
                return tmp;
            cur = half;
            half = tmp;
        }
    }

    private static boolean t_prime(BigInteger xi) {
        BigInteger sq = sqrt(xi);
        if (!sq.multiply(sq).equals(xi))
            return false;
        return sq.isProbablePrime(1);
    }
}
