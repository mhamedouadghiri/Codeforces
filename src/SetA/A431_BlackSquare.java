package SetA;

import java.util.Arrays;
import java.util.Scanner;

public class A431_BlackSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int a3 = scanner.nextInt();
        int a4 = scanner.nextInt();
        int[] a = {a1, a2, a3, a4};
        scanner.nextLine();
        String s = scanner.nextLine();

        String[] sA = s.split("");
        int[] integers = Arrays.stream(sA).mapToInt(Integer::parseInt).toArray();
        int res = 0;
        for (int integer : integers) res += a[integer - 1];

        System.out.print(res);
    }
}
