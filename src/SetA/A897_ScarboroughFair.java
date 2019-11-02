package SetA;

import java.util.Scanner;

public class A897_ScarboroughFair {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();
        String str = scanner.nextLine();
        String[] tmp;
        for (int i = 0; i < m; i++) {
            tmp = scanner.nextLine().split(" ");
            str = str.substring(0, Integer.parseInt(tmp[0]) - 1)
                    + str.substring(Integer.parseInt(tmp[0]) - 1, Integer.parseInt(tmp[1])).replace(tmp[2], tmp[3])
                    + str.substring(Integer.parseInt(tmp[1]), n);
        }
        System.out.println(str);
    }
}
