package SetG;

import java.util.Scanner;

public class G802_FakeNewsEasy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String fake = "heidi";
        System.out.println(isSubsequence(fake, string, fake.length(), string.length()) ? "YES" : "NO");
    }

    private static boolean isSubsequence(String str1, String str2, int len1, int len2) {
        if (len1 == 0)
            return true;
        if (len2 == 0)
            return false;
        if (str1.charAt(len1 - 1) == str2.charAt(len2 - 1))
            return isSubsequence(str1, str2, len1 - 1, len2 - 1);
        return isSubsequence(str1, str2, len1, len2 - 1);
    }
}
