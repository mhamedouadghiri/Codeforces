package SetB;

import java.util.Scanner;

public class B1093_LettersRearranging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        String s;
        while (t-- != 0) {
            s = scanner.nextLine();
            int i;
            for (i = 0; i < s.length(); i++)
                if (s.charAt(i) != s.charAt(0))
                    break;
            if (i == s.length()) {
                System.out.println(-1);
                continue;
            }
            if (s.charAt(0) != s.charAt(s.length() - 1))
                System.out.println(s);
            else {
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) != s.charAt(0)) {
                        System.out.println(swap(s, 0, j));
                        break;
                    }
                }
            }
        }
    }

    private static String swap(String s, int a, int b) {
        StringBuilder temp = new StringBuilder(s);
        temp.setCharAt(a, s.charAt(b));
        temp.setCharAt(b, s.charAt(a));
        return temp.toString();
    }
}
