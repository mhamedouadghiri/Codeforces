package SetA;

import java.util.Scanner;

public class A281_WordCapitalization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        System.out.println(word.length() > 0 ? word.substring(0, 1).toUpperCase() + word.substring(1) : "");
    }
}
