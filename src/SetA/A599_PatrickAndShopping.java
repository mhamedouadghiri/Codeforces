package SetA;

import java.util.Arrays;
import java.util.Scanner;

public class A599_PatrickAndShopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d1 = scanner.nextInt();
        int d2 = scanner.nextInt();
        int d3 = scanner.nextInt();
        int[] arr = new int[4];
        arr[0] = 2 * (d1 + d2);
        arr[1] = d1 + d2 + d3;
        arr[2] = 2 * (d1 + d3);
        arr[3] = 2 * (d2 + d3);
        System.out.println(Arrays.stream(arr).reduce(Math::min).getAsInt());
    }
}
