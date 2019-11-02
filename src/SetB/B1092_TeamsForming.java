package SetB;

import java.util.Arrays;
import java.util.Scanner;

public class B1092_TeamsForming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] skills = new int[n];
        for (int i = 0; i < n; i++)
            skills[i] = scanner.nextInt();

        Arrays.sort(skills);
        int res = 0;
        for (int i = 0; i < n - 1; i += 2)
            res += skills[i + 1] - skills[i];
        System.out.println(res);
    }
}
