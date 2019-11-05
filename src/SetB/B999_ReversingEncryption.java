package SetB;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B999_ReversingEncryption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String t = scanner.nextLine();
        StringBuilder s = new StringBuilder(t);
        StringBuilder temp;
        List<Integer> divs = divisors(n);
        for (Integer d : divs) {
            temp = new StringBuilder(s.substring(0, d));
            temp.reverse();
            s = s.replace(0, d, temp.toString());
        }
        System.out.println(s);
    }

    private static List<Integer> divisors(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < n / 2 + 1; i++)
            if (n % i == 0)
                list.add(i);
        list.add(n);
        return list;
    }
}
