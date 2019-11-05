package SetA;

import java.util.Scanner;

public class A1173_NauuoAndVotes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        if (z == 0 && y > x)
            System.out.println("-");
        else if (z == 0 && y < x)
            System.out.println("+");
        else if (z == 0)
            System.out.println("0");
        else if (Math.min(x, y) + z < Math.max(x, y)) {
            if (Math.max(x, y) == x)
                System.out.println("+");
            else
                System.out.println("-");
        } else System.out.println("?");
    }
}
