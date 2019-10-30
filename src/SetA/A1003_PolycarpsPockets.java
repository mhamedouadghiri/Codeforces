package SetA;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class A1003_PolycarpsPockets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[] a = scanner.nextLine().split(" ");

        Map<String, Long> map = Arrays.stream(a).collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        System.out.println(Collections.max(map.values()));
    }
}
