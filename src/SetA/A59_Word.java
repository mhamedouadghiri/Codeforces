package SetA;

import java.util.Scanner;

public class A59_Word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        long lc = s.chars().filter(Character::isLowerCase).count();
        long uc = s.chars().filter(Character::isUpperCase).count();
        System.out.println(lc >= uc ? s.toLowerCase() : s.toUpperCase());
    }
}
