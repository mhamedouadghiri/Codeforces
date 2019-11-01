package SetA;

import java.util.Scanner;

public class A711_BusToUdayland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] bus = new String[n];
        scanner.nextLine();
        for (int i = 0; i < n; i++)
            bus[i] = scanner.nextLine();

        String[] row = new String[2];
        boolean yes = false;
        int indR = -1, indP = -1;
        for (int i = 0; i < n; i++) {
            row = bus[i].split("[|]");
            if (row[0].equals("OO")) {
                yes = true;
                indR = i;
                indP = 0;
                break;
            } else if (row[1].equals("OO")) {
                yes = true;
                indR = i;
                indP = 1;
                break;
            }
        }

        if (yes) {
            System.out.println("YES");
            for (int i = 0; i < n; i++) {
                if (i == indR) {
                    if (indP == 0)
                        System.out.println("++|" + row[1]);
                    else System.out.println(row[0] + "|++");
                } else System.out.println(bus[i]);
            }
        } else System.out.println("NO");
    }
}
