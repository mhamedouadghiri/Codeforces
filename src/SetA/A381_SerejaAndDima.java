package SetA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A381_SerejaAndDima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++)
            list.add(scanner.nextInt());
        int s = 0, d = 0, max, turn = 0, maxI;
        while (!list.isEmpty()) {
            if (list.get(0) >= list.get(list.size() - 1)) {
                max = list.get(0);
                maxI = 0;
            } else {
                max = list.get(list.size() - 1);
                maxI = list.size() - 1;
            }
            if (turn % 2 == 0)
                s += max;
            else
                d += max;
            list.remove(maxI);
            turn++;
        }
        System.out.println(s + " " + d);
    }
}
