package SetA;

import java.util.Scanner;

public class A394_CountingSticks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] arr = line.replace("+", " ").replace("=", " ").split(" ");
        int A = arr[0].length();
        int B = arr[1].length();
        int C = arr[2].length();

        if (A + B == C) {
            System.out.print(line);
        } else if (A + B + 1 == C - 1) {
            for (int i = 0; i < A + 1; i++)
                System.out.print("|");
            System.out.print("+");
            for (int i = 0; i < B; i++)
                System.out.print("|");
            System.out.print("=");
            for (int i = 0; i < C - 1; i++)
                System.out.print("|");
        } else if (A + B - 1 == C + 1) {
            if (A == 1) B--;
            else A--;
            for (int i = 0; i < A; i++)
                System.out.print("|");
            System.out.print("+");
            for (int i = 0; i < B; i++)
                System.out.print("|");
            System.out.print("=");
            for (int i = 0; i < C + 1; i++)
                System.out.print("|");
        } else System.out.print("Impossible");
    }
}
