package SetA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A658_BearAndReverseRadewoosh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = scanner.nextInt();
        List<Integer> pi = new ArrayList<>();
        List<Integer> ti = new ArrayList<>();
        List<Integer> tiL = new ArrayList<>();
        List<Integer> tiR = new ArrayList<>();
        for (int i = 0; i < n; i++) pi.add(scanner.nextInt());
        for (int i = 0; i < n; i++) ti.add(scanner.nextInt());
        tiL.add(ti.get(0));
        tiR.add(ti.get(n - 1));
        for (int i = 1; i < n; i++) tiL.add(tiL.get(i - 1) + ti.get(i));
        for (int i = 1; i < n; i++) tiR.add(tiR.get(i - 1) + ti.get(n - i - 1));
        int L = 0, R = 0;
        for (int i = 0; i < n; i++) {
            L += Math.max(0, pi.get(i) - c * tiL.get(i));
            R += Math.max(0, pi.get(n - i - 1) - c * tiR.get(i));
        }
        System.out.println(L > R ? "Limak" : L == R ? "Tie" : "Radewoosh");
    }
}
