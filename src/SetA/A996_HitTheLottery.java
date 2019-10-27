package SetA;

import java.util.Scanner;

public class A996_HitTheLottery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int cnt = 0;
        while (n >= 100) {
            n -= 100;
            cnt++;
        }
        while (n >= 20) {
            n -= 20;
            cnt++;
        }
        while (n >= 10) {
            n -= 10;
            cnt++;
        }
        while (n >= 5) {
            n -= 5;
            cnt++;
        }
        while (n >= 1) {
            n -= 1;
            cnt++;
        }
        System.out.println(cnt);
    }
}
