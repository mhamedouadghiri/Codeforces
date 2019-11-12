package SetA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A994_Fingerprints {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<Integer> xi = new ArrayList<>(n);
        List<Integer> yi = new ArrayList<>(m);
        for (int i = 0; i < n; i++) xi.add(scanner.nextInt());
        for (int i = 0; i < m; i++) yi.add(scanner.nextInt());
        StringBuilder code = new StringBuilder();
        for (int e : xi)
            if (yi.contains(e))
                code.append(e).append(" ");
        System.out.println(code);
    }
}
