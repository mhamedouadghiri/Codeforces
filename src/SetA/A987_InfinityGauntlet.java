package SetA;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A987_InfinityGauntlet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> map = new HashMap<>();
        map.put("purple", "Power");
        map.put("green", "Time");
        map.put("blue", "Space");
        map.put("orange", "Soul");
        map.put("red", "Reality");
        map.put("yellow", "Mind");
        int n = scanner.nextInt();
        System.out.println(6 - n);
        scanner.nextLine();
        for (int i = 0; i < n; i++)
            map.remove(scanner.nextLine());
        for (String value : map.values())
            System.out.println(value);
    }
}
