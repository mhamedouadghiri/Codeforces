package SetA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class A1017_TheRank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> scores = new ArrayList<>();
        while (n-- != 0)
            scores.add(scanner.nextInt() + scanner.nextInt() + scanner.nextInt() + scanner.nextInt());
        int thomasScore = scores.get(0);
        Collections.sort(scores);
        Collections.reverse(scores);
        System.out.println(scores.indexOf(thomasScore) + 1);
    }
}
