package SetA;

import java.util.Scanner;

public class A1030_InSearchOfAnEasyProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = 0;
        while (n-- != 0)
            s += scanner.nextInt();
        if (s == 0)
            System.out.println("EASY");
        else System.out.println("HARD");
    }
}
