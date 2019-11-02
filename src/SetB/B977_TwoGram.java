package SetB;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B977_TwoGram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();
        Map<String, Integer> map = new HashMap<>();
        String tmp;
        for (int i = 0; i < n - 1; i++) {
            tmp = s.substring(i, i + 2);
            map.putIfAbsent(tmp, 0);
            map.put(tmp, map.get(tmp) + 1);
        }
        Map.Entry<String, Integer> max = null;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (max == null || entry.getValue().compareTo(max.getValue()) > 0)
                max = entry;
        }
        assert max != null;
        System.out.println(max.getKey());
    }
}
