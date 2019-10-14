package SetA;

import java.util.Scanner;

public class A1228_DistinctDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int x;
        for (x = l; x < r + 1; x++) {
            String[] digits = String.valueOf(x).split("");
            if (!duplicates(digits)) {
                System.out.println(x);
                System.exit(0);
            }
        }
        System.out.println(-1);
    }

    private static boolean duplicates(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (i != j && arr[i].equals(arr[j]))
                    return true;
            }
        }
        return false;
    }
}
