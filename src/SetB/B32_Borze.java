package SetB;

import java.util.Scanner;

public class B32_Borze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == '-') {
                if (line.charAt(i + 1) == '-')
                    System.out.print(2);
                else
                    System.out.print(1);
                i++;
            } else System.out.print(0);
        }
    }
}
