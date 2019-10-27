package SetA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A1145_Thanos_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++)
            list.add(sc.nextInt());

        if (isSorted(list)) {
            System.out.println(n);
            System.exit(0);
        }

        List<Integer> list1 = list.subList(0, n / 2);
        List<Integer> list2 = list.subList(n / 2, n);
        if (isSorted(list1) || isSorted(list2)) {
            System.out.println(n / 2);
            System.exit(0);
        }

        List<Integer> list11 = list1.subList(0, n / 4);
        List<Integer> list12 = list1.subList(n / 4, n / 2);
        List<Integer> list21 = list2.subList(0, n / 4);
        List<Integer> list22 = list2.subList(n / 4, n / 2);
        if (isSorted(list11) || isSorted(list12) || isSorted(list21) || isSorted(list22)) {
            System.out.println(n / 4);
            System.exit(0);
        }

        List<Integer> list111 = list11.subList(0, n / 8);
        List<Integer> list112 = list11.subList(n / 8, n / 4);
        List<Integer> list121 = list12.subList(0, n / 8);
        List<Integer> list122 = list12.subList(n / 8, n / 4);
        List<Integer> list211 = list21.subList(0, n / 8);
        List<Integer> list212 = list21.subList(n / 8, n / 4);
        List<Integer> list221 = list22.subList(0, n / 8);
        List<Integer> list222 = list22.subList(n / 8, n / 4);
        if (isSorted(list111) || isSorted(list112) || isSorted(list121) || isSorted(list122) || isSorted(list211)
                || isSorted(list212) || isSorted(list221) || isSorted(list222)) {
            System.out.println(n / 8);
            System.exit(0);
        }

        System.out.println(1);
    }

    private static boolean isSorted(List<Integer> lst) {
        for (int i = 0; i < lst.size() - 1; i++)
            if (lst.get(i + 1).compareTo(lst.get(i)) < 0)
                return false;
        return true;
    }
}
