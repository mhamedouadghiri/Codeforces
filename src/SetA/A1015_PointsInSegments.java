package SetA;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class A1015_PointsInSegments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int l, r;
        Set<Integer> set = new HashSet<>();
        while (n-- != 0) {
            l = scanner.nextInt();
            r = scanner.nextInt();
            for (int i = l; i <= r; i++)
                set.add(i);
        }
        System.out.println(m - set.size());
        for (int i = 1; i <= m; i++) {
            if (!set.contains(i))
                System.out.print(i + " ");
        }
    }
}
