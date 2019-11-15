package SetA;

import java.util.Scanner;

public class A443_AntonAndLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.nextLine().chars().filter(Character::isLetter).distinct().count());
    }
}
