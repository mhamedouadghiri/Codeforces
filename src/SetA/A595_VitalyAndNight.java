package SetA;

import java.util.Scanner;

public class A595_VitalyAndNight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int res = 0;
        for (int i = 0; i < n * m; i++)
            res += scanner.nextInt() | scanner.nextInt();
        System.out.println(res);
    }
}
