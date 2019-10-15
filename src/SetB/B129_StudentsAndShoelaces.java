package SetB;

import java.util.Scanner;

public class B129_StudentsAndShoelaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int a, b;
        int[][] nodes = new int[n][n];

        for (int i = 0; i < m; i++) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            nodes[a - 1][b - 1] = 1;
            nodes[b - 1][a - 1] = 1;
        }

        int cnt = 0;
        boolean recheck = true;
        int[] misbehave = new int[n];

        while (recheck) {
            recheck = false;
            int size = 0;
            for (int i = 0; i < n; i++) {
                int sum = 0;
                for (int j = 0; j < n; j++)
                    sum += nodes[i][j];
                if (sum == 1) {
                    misbehave[size] = i;
                    size++;
                    recheck = true;
                }
            }
            if (recheck)
                cnt++;

            // removal
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < n; j++) {
                    nodes[misbehave[i]][j] = 0;
                    nodes[j][misbehave[i]] = 0;
                }
            }
        }

        System.out.println(cnt);
    }
}
