package SetA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A1136_NastyaIsReadingABook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> pages = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            scanner.nextInt();
            pages.add(scanner.nextInt());
        }
        int k = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            if (k <= pages.get(i)) {
                System.out.println(n - i);
                break;
            }
        }
    }
}
