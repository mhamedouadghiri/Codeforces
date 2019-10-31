package SetB;

import java.util.Scanner;

public class B978_FileName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String name = scanner.nextLine();

        if (!name.contains("xxx")) {
            System.out.println(0);
            System.exit(0);
        }
        int cnt = 0, res = 0;
        for (int i = 0; i < n; i++) {
            if (name.charAt(i) == 'x') cnt++;
            else cnt = 0;
            if (cnt > 2) res++;
        }
        System.out.println(res);
    }
}
