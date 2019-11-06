package SetB;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B918_RadioStation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();
        String line;
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            line = scanner.nextLine();
            map.put(line.split(" ")[1], line.split(" ")[0]);
        }
        for (int i = 0; i < m; i++) {
            line = scanner.nextLine();
            System.out.println(line + " #" + map.get(line.split(" ")[1].replace(";", "")));
        }
    }
}
