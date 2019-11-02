package SetB;

import java.util.Scanner;

public class B746_Decoding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();
        StringBuilder res = new StringBuilder();
        if (n % 2 == 1) {
            for (int i = n - 2; i > 0; i -= 2)
                res.append(s.charAt(i));
            for (int i = 0; i < n; i += 2)
                res.append(s.charAt(i));
        } else {
            for (int i = n - 2; i >= 0; i -= 2)
                res.append(s.charAt(i));
            for (int i = 1; i < n; i += 2)
                res.append(s.charAt(i));
        }
        System.out.println(res);
    }
}
