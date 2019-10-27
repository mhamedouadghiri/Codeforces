package SetA;

import java.util.Scanner;

public class A705_Hulk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        StringBuilder res = new StringBuilder();
        for (int i = 1; i < n + 1; i++) {
            if (i % 2 == 0)
                res.append("I love");
            else res.append("I hate");
            if (i < n)
                res.append(" that ");
        }
        res.append(" it");
        System.out.println(res);
    }
}
