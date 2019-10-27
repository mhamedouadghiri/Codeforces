package SetA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A1154_RestoringThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int x3 = scanner.nextInt();
        int x4 = scanner.nextInt();
        int abc = Math.max(x1, Math.max(x2, Math.max(x3, x4)));
        List<Integer> SET = new ArrayList<>();
        SET.add(x1);
        SET.add(x2);
        SET.add(x3);
        SET.add(x4);
        SET.remove((Integer) abc);
        int a, b, c;
        a = SET.get(0) + SET.get(1) - abc;
        b = SET.get(0) + SET.get(2) - abc;
        c = SET.get(1) + SET.get(2) - abc;
        System.out.print(a + " " + b + " " + c);
    }
}
