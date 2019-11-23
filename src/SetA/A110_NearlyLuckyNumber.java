package SetA;

import java.util.Scanner;

public class A110_NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        long len = n.length();
        long n4 = len - n.replace("4", "").length();
        long n7 = len - n.replace("7", "").length();
        String ln = String.valueOf(n4 + n7);
        if (ln.replace("4", "").length() + ln.replace("7", "").length() == ln.length())
            System.out.println("YES");
        else System.out.println("NO");
    }
}
