package SetA;

import java.util.Scanner;

public class A245_SystemAdministrator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int aliveA = 0, aliveB = 0, deadA = 0, deadB = 0;

        while (n-- != 0) {
            if (scanner.nextInt() == 1) {
                aliveA += scanner.nextInt();
                deadA += scanner.nextInt();
            } else {
                aliveB += scanner.nextInt();
                deadB += scanner.nextInt();
            }
        }
        System.out.println(aliveA >= deadA ? "LIVE" : "DEAD");
        System.out.println(aliveB >= deadB ? "LIVE" : "DEAD");
    }
}
