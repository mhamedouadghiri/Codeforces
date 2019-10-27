package SetA;

import java.util.Scanner;

public class A1186_VusTheCossackAndAContest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        if (m < n || k < n)
            System.out.println("NO");
        else System.out.println("YES");
    }
}
