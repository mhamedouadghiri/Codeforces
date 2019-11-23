package SetA;

import java.util.Scanner;

public class A236_BoyOrGirl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println((scanner.nextLine().chars().distinct().count() & 1) == 0 ? "CHAT WITH HER!" : "IGNORE HIM!");
    }
}
