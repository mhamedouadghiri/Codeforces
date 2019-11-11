package SetB;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class B230_Tprimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        scanner.nextInt();
        scanner.nextLine();
        long[] xi = Arrays.stream(scanner.nextLine().split(" ")).mapToLong(Long::parseLong).toArray();
        sieve();
        for (long bi : xi) {
            if (bi == 1) {
                pw.println("NO");
                continue;
            }
            pw.println(t_prime(bi) ? "YES" : "NO");
        }
        pw.close();
    }

    private static boolean[] prime = new boolean[1000002];

    private static void sieve() {
        for (int i = 0; i < 1000001; i++)
            prime[i] = true;
        for (int p = 2; p * p <= 1000001; p++) {
            if (prime[p]) {
                for (int i = p * 2; i <= 1000001; i += p)
                    prime[i] = false;
            }
        }
    }

    private static boolean t_prime(long xi) {
        long sq = (long) Math.sqrt(xi);
        if (sq * sq != xi)
            return false;
        return prime[(int) sq];
    }
}