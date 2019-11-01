package SetA;

import java.util.Scanner;

public class A734_AntonAndDanik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String str = scanner.nextLine();
        int a = str.length() - str.replace("A", "").length();
        int d = str.length() - str.replace("D", "").length();
        if (a > d) System.out.println("Anton");
        else if (d > a) System.out.println("Danik");
        else System.out.println("Friendship");
    }
}
