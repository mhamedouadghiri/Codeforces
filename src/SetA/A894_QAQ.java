package SetA;

import java.util.Scanner;

public class A894_QAQ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int cnt = 0;
        for (int i = 0; i < line.length(); i++) {
            for (int j = i + 1; j < line.length(); j++) {
                for (int k = j + 1; k < line.length(); k++) {
                    if ((String.valueOf(line.charAt(i)) + line.charAt(j) + line.charAt(k)).equals("QAQ"))
                        cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
