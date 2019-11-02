package SetA;

import java.util.Scanner;

public class A980_LinksAndPearls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String necklace = scanner.nextLine();
        int nbo = necklace.length() - necklace.replace("o", "").length();
        int nb_ = necklace.length() - necklace.replace("-", "").length();
        if (nbo == 0)
            System.out.println("YES");
        else if (nb_ % nbo == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
