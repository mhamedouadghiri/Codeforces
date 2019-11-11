package SetB;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class B998_Cutting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int B = scanner.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++) list[i] = scanner.nextInt();

        ArrayList<Integer> diffs = new ArrayList<>();
        int even = 0, odd = 0, cnt = 0;

        for (int i = 0; i < n; i++) {
            if (list[i] % 2 == 0) even++;
            else odd++;
            if (even == odd && i != n - 1)
                diffs.add(Math.abs(list[i] - list[i + 1]));
        }
        Collections.sort(diffs);

        for (Integer diff : diffs) {
            if (diff <= B) {
                B -= diff;
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}
