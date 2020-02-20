package SetA;

import java.util.Scanner;

public class A71_WayTooLongWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String word;
        int len;
        while (n-- != 0) {
            word = scanner.nextLine();
            len = word.length();
            System.out.println(len <= 10 ? word : String.valueOf(word.charAt(0)) + (len - 2) + word.charAt(len - 1));
        }
    }
}
