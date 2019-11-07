package SetG;

import java.util.Arrays;
import java.util.Scanner;

public class G847_UniversityClasses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = {0, 0, 0, 0, 0, 0, 0};
        scanner.nextLine();
        String line;
        for (int i = 0; i < n; i++) {
            line = scanner.nextLine();
            for (int j = 0; j < 7; j++)
                a[j] += Integer.parseInt(String.valueOf(line.charAt(j)));
        }
        System.out.println(Arrays.stream(a).max().getAsInt());
    }
}
