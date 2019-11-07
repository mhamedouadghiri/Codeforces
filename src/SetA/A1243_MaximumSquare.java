package SetA;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class A1243_MaximumSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        List<Integer> planks = new ArrayList<>();
        while (k-- != 0) {
            int n = scanner.nextInt();
            for (int i = 0; i < n; i++)
                planks.add(scanner.nextInt());
            planks.sort(Comparator.reverseOrder());
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                if (cnt < planks.get(i)) cnt++;
                else break;
            }
            System.out.println(cnt);
            planks = new ArrayList<>();
        }
    }
}
