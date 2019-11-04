package SetA;

import java.util.Scanner;

public class A1167_TelephoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int n;
        String s;
        while (t-- != 0) {
            n = scanner.nextInt();
            scanner.nextLine();
            s = scanner.nextLine();
            if (!s.contains("8") || n < 11 || (n == 11 && s.charAt(0) != '8'))
                System.out.println("NO");
            else if (s.indexOf("8") > n - 11)
                System.out.println("NO");
            else System.out.println("YES");
        }
    }
}
