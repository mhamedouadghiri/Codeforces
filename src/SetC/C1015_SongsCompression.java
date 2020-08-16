package SetC;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class C1015_SongsCompression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        ArrayList<Long> diff = new ArrayList<>();

        long res = 0;
        long sum = 0;
        long ai, bi;

        for (int i = 0; i < n; i++) {
            ai = scanner.nextLong();
            bi = scanner.nextLong();
            sum += ai;
            diff.add(ai - bi);
        }

        diff.sort(Comparator.reverseOrder());
        for (int i = 0; i < n && sum > m; i++) {
            sum -= diff.get(i);
            res++;
        }
        System.out.println((sum > m) ? -1 : res);
    }
}
