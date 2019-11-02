package SetA;

import java.util.Arrays;
import java.util.Scanner;

public class A1064_MakeATriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] sides = new int[3];
        for (int i = 0; i < 3; i++)
            sides[i] = scanner.nextInt();
        Arrays.sort(sides);
        if (sides[2] < sides[0] + sides[1])
            System.out.println(0);
        else
            System.out.println(sides[2] - sides[1] - sides[0] + 1);
    }
}
