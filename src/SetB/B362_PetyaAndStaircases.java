package SetB;

import java.util.Arrays;
import java.util.Scanner;

public class B362_PetyaAndStaircases {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        if (m == 0) {
            System.out.print("YES");
            return;
        }
        int[] dirty = new int[m];
        for (int i = 0; i < m; i++) dirty[i] = scanner.nextInt();
        Arrays.sort(dirty);
        if (dirty[0] == 1 || dirty[m - 1] == n) {
            System.out.print("NO");
            return;
        }

        for (int i = 0; i < dirty.length - 2; i++) {
            if ((dirty[i + 1] - dirty[i] == 1) && (dirty[i + 2] - dirty[i] == 2)) {
                System.out.print("NO");
                return;
            }
        }
        System.out.print("YES");
    }
}
