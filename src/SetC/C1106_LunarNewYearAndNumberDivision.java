package SetC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class C1106_LunarNewYearAndNumberDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> ai = new ArrayList<>();
        for (int i = 0; i < n; i++)
            ai.add(scanner.nextInt());
        Collections.sort(ai);
        long res = 0;
        for (int i = 0; i < n / 2; i++)
            res += Math.pow(ai.get(i) + ai.get(n - 1 - i), 2);
        System.out.println(res);
    }
}
