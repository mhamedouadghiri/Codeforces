package SetC;

import java.util.*;

public class C1144_TwoShuffledSequences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> b = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int ai;
        for (int i = 0; i < n; i++) {
            ai = scanner.nextInt();
            if (map.get(ai) == null)
                map.put(ai, 1);
            else {
                map.replace(ai, map.get(ai) + 1);
                if (map.get(ai) > 2) {
                    System.out.println("NO");
                    System.exit(0);
                } else if (map.get(ai) == 2)
                    b.add(ai);
            }
        }

        System.out.println("YES");
        System.out.println(b.size());
        Collections.sort(b);
        for (Integer e : b) System.out.print(e + " ");

        Set<Integer> set = map.keySet();
        List<Integer> list = new ArrayList<>(set);
        list.sort(Collections.reverseOrder());
        System.out.println("\n" + set.size());
        for (Integer e : list) System.out.print(e + " ");
    }
}
