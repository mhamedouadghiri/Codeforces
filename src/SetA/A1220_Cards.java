package SetA;

import java.util.Scanner;

public class A1220_Cards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();
        int len = s.length();
        int z = len - s.replace("z", "").length();
        int n = len - s.replace("n", "").length();
        for (int i = 0; i < n; i++)
            System.out.print("1 ");
        for (int i = 0; i < z; i++)
            System.out.print("0 ");
    }
}
