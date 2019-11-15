package SetA;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class A701_Cards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<int[]> list = new ArrayList<>();
        int v, goal = 0;
        for (int i = 0; i < n; i++) {
            v = scanner.nextInt();
            list.add(new int[]{v, i + 1});
            goal += v;
        }
        goal /= n >> 1;
        list.sort(Comparator.comparingInt(o -> o[0]));
        int i = 0, j = list.size() - 1, t;
        while (n-- != 0) {
            while (i < j) {
                t = list.get(i)[0] + list.get(j)[0];
                if (t < goal)
                    i++;
                else if (t > goal)
                    j--;
                else {
                    System.out.println(list.get(i)[1] + " " + list.get(j)[1]);
                    list.remove(j);
                    list.remove(i);
                    i = 0;
                    j = list.size() - 1;
                }
            }
        }
    }
}
