package SetA;

import java.util.Scanner;

public class A731_NightAtTheMuseum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        word = 'a' + word;
        int cnt = 0, t;
        for (int i = 1; i < word.length(); i++) {
            t = Math.abs(word.charAt(i - 1) - word.charAt(i));
            cnt += Math.min(t, 26 - t);
        }
        System.out.println(cnt);
    }
}
