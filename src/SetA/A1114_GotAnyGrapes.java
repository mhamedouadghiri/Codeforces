package SetA;

import java.util.Scanner;

public class A1114_GotAnyGrapes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        a -= x;
        if (a < 0) {
            System.out.println("NO");
            System.exit(0);
        }
        if (y > a + b) {
            System.out.println("NO");
            System.exit(0);
        }
        if (y + z > a + b + c)
            System.out.println("NO");
        else System.out.println("YES");
    }
}
