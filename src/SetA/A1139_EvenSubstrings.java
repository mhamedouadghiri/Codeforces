package SetA;

import java.util.Scanner;

public class A1139_EvenSubstrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (Integer.parseInt(String.valueOf(s.charAt(i))) % 2 == 0)
                cnt += i + 1;
        }
        System.out.println(cnt);
    }
}
