package SetA;

import java.util.Scanner;

public class A617_Elephant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int cnt = 0;
        while (x >= 5) {
            x -= 5;
            cnt++;
        }
        while (x >= 4) {
            x -= 4;
            cnt++;
        }
        while (x >= 3) {
            x -= 3;
            cnt++;
        }
        while (x >= 2) {
            x -= 2;
            cnt++;
        }
        while (x >= 1) {
            x -= 1;
            cnt++;
        }
        System.out.println(cnt);
    }
}
