package SetA;

import java.util.Scanner;

public class A686_FreeIceCream {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long x = scanner.nextInt();
        scanner.nextLine();
        String[] line;
        long dis = 0, d;
        while (n-- != 0) {
            line = scanner.nextLine().split(" ");
            d = Long.parseLong(line[1]);
            if (line[0].equals("+"))
                x += d;
            else {
                dis += x < d ? 1 : 0;
                x -= x < d ? 0 : d;
            }
        }
        System.out.println(x + " " + dis);
    }
}
