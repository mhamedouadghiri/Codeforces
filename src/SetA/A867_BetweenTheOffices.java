package SetA;

import java.util.Scanner;

public class A867_BetweenTheOffices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String flights = scanner.nextLine();
        int yes = 0, no = 0;
        for (int i = 0; i < flights.length() - 1; i++) {
            if (flights.charAt(i) != flights.charAt(i + 1)) {
                if (flights.charAt(i) == 'S') yes++;
                else no++;
            }
        }
        if (yes > no) System.out.println("YES");
        else System.out.println("NO");
    }
}
