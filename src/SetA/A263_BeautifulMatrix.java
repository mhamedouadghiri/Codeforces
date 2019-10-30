package SetA;

import java.util.Scanner;

public class A263_BeautifulMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = -1, y = -1;
        String lineT;
        String[] line;
        for (int i = 0; i < 5; i++) {
            lineT = scanner.nextLine();
            line = lineT.split(" ");
            if (x == -1) {
                for (int j = 0; j < 5; j++) {
                    if (line[j].equals("1")) {
                        x = i;
                        y = j;
                    }
                }
            }
        }
        System.out.println(Math.abs(x - 2) + Math.abs(y - 2));
    }
}
