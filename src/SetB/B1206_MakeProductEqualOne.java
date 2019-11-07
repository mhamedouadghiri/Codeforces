package SetB;

import java.util.Scanner;

public class B1206_MakeProductEqualOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ai;
        int cntN = 0, cntP = 0, cntZ = 0;
        long res = 0;
        while (n-- != 0) {
            ai = scanner.nextInt();
            if (ai < -1) {
                cntN++;
                res += -ai - 1;
            } else if (ai == -1) {
                cntN++;
            } else if (ai > 1) {
                cntP++;
                res += ai - 1;
            } else if (ai == 0) {
                cntZ++;
                res++;
            }
        }
        if ((cntN % 2 == 1 && cntZ >= 1) || cntN % 2 == 0)
            System.out.println(res);
        else System.out.println(res + 2);
    }
}
