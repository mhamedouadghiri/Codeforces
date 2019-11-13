package SetA;

import java.util.Arrays;
import java.util.Scanner;

public class A1041_Heist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] ind = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(Arrays.stream(ind).reduce(Math::max).getAsInt()
                - Arrays.stream(ind).reduce(Math::min).getAsInt() + 1 - n);
    }
}
