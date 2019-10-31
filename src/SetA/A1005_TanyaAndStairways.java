package SetA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class A1005_TanyaAndStairways {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ai, n = scanner.nextInt();
        List<Integer> a = new ArrayList<>(n);
        List<Integer> b = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            ai = scanner.nextInt();
            a.add(ai);
            b.add(ai);
        }

        Collections.sort(b);
        int t = 0;
        for (int i = 0; i < n; i++) {
            if (b.get(i) == 1) {
                t++;
            }
        }
        System.out.println(t);

        for (int i = 1; i < n; i++) {
            if (a.get(i) == 1) {
                System.out.print(a.get(i - 1) + " ");
            }
        }
        System.out.print(a.get(n - 1));
    }
}
