package SetA;

import java.util.Scanner;

public class A116_Tram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int res = 0, temp = 0;
        while (n-- != 0) {
            temp += -scanner.nextInt() + scanner.nextInt();
            res = Math.max(res, temp);
        }
        System.out.println(res);
    }
}
