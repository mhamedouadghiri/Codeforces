package SetA;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A785_AntonAndPolyhedrons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Map<String, Integer> map = new HashMap<>();
        map.put("Tetrahedron", 4);
        map.put("Cube", 6);
        map.put("Octahedron", 8);
        map.put("Dodecahedron", 12);
        map.put("Icosahedron", 20);

        int cnt = 0;
        scanner.nextLine();
        for (int i = 0; i < n; i++)
            cnt += map.get(scanner.nextLine());

        System.out.println(cnt);
    }
}
