package SetA;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class A855_TomRiddlesDiary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        Set<String> set = new HashSet<>();
        String name;
        for (int i = 0; i < n; i++) {
            name = scanner.nextLine();
            System.out.println(!set.contains(name) ? "NO" : "YES");
            set.add(name);
        }
    }
}
