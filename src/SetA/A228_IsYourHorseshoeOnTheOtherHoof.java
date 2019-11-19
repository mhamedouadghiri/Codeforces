package SetA;

import java.util.Arrays;
import java.util.Scanner;

public class A228_IsYourHorseshoeOnTheOtherHoof {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(4 - Arrays.stream(scanner.nextLine().split(" ")).distinct().count());
    }
}
