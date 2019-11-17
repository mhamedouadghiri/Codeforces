package SetA;

import java.util.Arrays;
import java.util.Scanner;

public class A716_CrazyComputer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = scanner.nextInt();
        scanner.nextLine();
        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int w = 1;
        for (int i = 0; i < n - 1; i++)
            w = arr[i + 1] - arr[i] > c ? 1 : ++w;
        System.out.println(w);
    }
}
