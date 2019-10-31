package SetA;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class A758_HolidayOfEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] welfare = new Integer[n];
        for (int i = 0; i < n; i++)
            welfare[i] = scanner.nextInt();
        int max = Collections.max(Arrays.asList(welfare));
        int res = 0;
        for (int w : welfare)
            res += max - w;
        System.out.println(res);
    }
}
