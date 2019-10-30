package SetA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A136_Presents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> tab = new ArrayList<>();
        for (int i = 0; i < n; i++)
            tab.add(scanner.nextInt());

        for (int i = 1; i < n + 1; i++)
            System.out.print(tab.indexOf(i) + 1 + " ");
    }
}
