package SetA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A721_OneDimensionalJapaneseCrossword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String line = scanner.nextLine();

        List<Integer> blocks = new ArrayList<>();
        int cnt = 0, j;
        for (int i = 0; i < n; i++) {
            j = i;
            while (j < n && line.charAt(j) == 'B') {
                cnt++;
                j++;
            }
            if (cnt != 0)
                blocks.add(cnt);
            i = j;
            cnt = 0;
        }

        System.out.println(blocks.size());
        if (blocks.size() != 0)
            for (Integer e : blocks)
                System.out.print(e + " ");
    }
}
