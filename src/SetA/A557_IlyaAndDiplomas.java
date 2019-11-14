package SetA;

import java.util.Scanner;

public class A557_IlyaAndDiplomas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int min1 = scanner.nextInt();
        int max1 = scanner.nextInt();
        int min2 = scanner.nextInt();
        int max2 = scanner.nextInt();
        int min3 = scanner.nextInt();
        int max3 = scanner.nextInt();
        n -= (min1 + min2 + min3);
        while (n != 0 && max1 - min1 > 0) {
            n--;
            min1++;
        }
        while (n != 0 && max2 - min2 > 0) {
            n--;
            min2++;
        }
        while (n != 0 && max3 - min3 > 0) {
            n--;
            min3++;
        }
        System.out.println(min1 + " " + min2 + " " + min3);
    }
}
