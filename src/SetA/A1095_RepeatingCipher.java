package SetA;

import java.util.Scanner;

public class A1095_RepeatingCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String t = scanner.nextLine();

        int cnt = 0;
        int jump = 1;
        StringBuilder res = new StringBuilder();
        while (cnt < n) {
            res.append(t.charAt(cnt));
            cnt += jump;
            jump += 1;
        }
        System.out.println(res);
    }
}
