package SetA;

import java.util.Scanner;

public class A1143_TheDoors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] doors = scanner.nextLine().split(" ");
        int left = 0, right = 0;
        for (int i = 0; i < n; i++) {
            if (doors[i].equals("0")) left++;
            else right++;
        }
        int cntL = 0, cntR = 0;
        for (int i = 0; i < n; i++) {
            if (doors[i].equals("0")) cntL++;
            if (cntL == left) {
                System.out.println(cntL + cntR);
                System.exit(0);
            }
            if (doors[i].equals("1")) cntR++;
            if (cntR == right) {
                System.out.println(cntR + cntL);
                System.exit(0);
            }
        }
    }
}
