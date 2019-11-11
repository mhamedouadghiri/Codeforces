package SetM;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class M847_WeatherTomorrow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++)
            list.add(scanner.nextInt());
        int step = list.get(1) - list.get(0);
        boolean flag = true;
        for (int i = 0; i < n - 1; i++) {
            if (list.get(i + 1) - list.get(i) != step) {
                flag = false;
                break;
            }
        }
        if (!flag) System.out.println(list.get(n - 1));
        else System.out.println(list.get(n - 1) + step);
    }
}
