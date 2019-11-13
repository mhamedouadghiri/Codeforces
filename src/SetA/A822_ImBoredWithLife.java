package SetA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A822_ImBoredWithLife {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> f = new ArrayList<>();
        f.add(1);
        for (int i = 1; i <= 12; i++)
            f.add(i * f.get(i - 1));
        System.out.println(f.get(Math.min(scanner.nextInt(), scanner.nextInt())));
    }
}
