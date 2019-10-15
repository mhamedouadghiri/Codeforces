package SetA;

import java.util.Scanner;

public class A393_Nineteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int len = s.length();
        int e = (len - s.replace("e", "").length());
        int n = (len - s.replace("n", "").length());
        int i = len - s.replace("i", "").length();
        int t = len - s.replace("t", "").length();
        e /= 3;
        if (n > 3) {
            n -= 3;
            n /= 2;
            n++;
        } else n /= 3;
        System.out.println(Math.min(e, Math.min(n, Math.min(i, t))));
    }
}
