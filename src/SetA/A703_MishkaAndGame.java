package SetA;

import java.util.Scanner;

public class A703_MishkaAndGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int mi, ci;
        int winM = 0, winC = 0;
        for (int i = 0; i < n; i++) {
            mi = scanner.nextInt();
            ci = scanner.nextInt();
            if (mi > ci)
                winM++;
            else if (mi < ci)
                winC++;
        }
        if (winM > winC)
            System.out.println("Mishka");
        else if (winC > winM)
            System.out.println("Chris");
        else System.out.println("Friendship is magic!^^");
    }
}
