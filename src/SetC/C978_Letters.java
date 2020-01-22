package SetC;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C978_Letters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<Long> ai = new ArrayList<>();
        long bi;
        for (int i = 0; i < n; i++)
            ai.add(scanner.nextLong());

        long sum = 0, sum1 = 0;
        int i = 0;
        while (m-- != 0) {
            bi = scanner.nextLong();
            while (bi > sum) {
                sum1 = sum;
                sum += ai.get(i);
                i++;
            }
            System.out.println(i + " " + (bi - sum1));
        }
    }
}
