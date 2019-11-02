package SetB;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B831_KeyboardLayouts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String layout1 = scanner.nextLine();
        String layout2 = scanner.nextLine();
        String text = scanner.nextLine();
        StringBuilder result = new StringBuilder();
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < 26; i++)
            map.put(layout1.charAt(i), layout2.charAt(i));
        for (int i = 0; i < text.length(); i++) {
            if (!Character.isLetter(text.charAt(i)))
                result.append(text.charAt(i));
            else {
                if (Character.isLowerCase(text.charAt(i)))
                    result.append(map.get(text.charAt(i)));
                else
                    result.append(Character.toUpperCase(map.get(Character.toLowerCase(text.charAt(i)))));
            }
        }
        System.out.println(result);
    }
}
