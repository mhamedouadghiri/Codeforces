package SetA;

import java.util.Scanner;

public class A472_PoliceRecruits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int off = 0, cnt = 0, event;
        for (int i = 0; i < n; i++) {
            event = scanner.nextInt();
            if (event == -1 && off == 0)
                cnt++;
            else off += event;
        }
        System.out.println(cnt);
    }
}
