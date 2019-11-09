package SetA1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A177_GoodMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        List<int[]> elements = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == n / 2 || j == n / 2 || i == j || i == n - j - 1) && !elements.contains(new int[]{i, j})) {
                    sum += matrix[i][j];
                    elements.add(new int[]{i, j});
                }
            }
        }
        System.out.println(sum);
    }
}
