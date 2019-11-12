package SetC;

import java.util.Scanner;
import java.util.StringTokenizer;

public class C472_DesignTutorialMakeItNondeterministic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String[][] names = new String[n][2];
        String[] name;
        for (int i = 0; i < n; i++) {
            name = scanner.nextLine().split(" ");
            names[i][0] = name[0];
            names[i][1] = name[1];
        }

        boolean ok = true;
        String handle = "";

        StringTokenizer st = new StringTokenizer(scanner.nextLine());

        while (st.hasMoreElements()) {
            int i = Integer.parseInt((String) st.nextElement()) - 1;
            String small, big;
            if (names[i][0].compareTo(names[i][1]) <= 0) {
                small = names[i][0];
                big = names[i][1];
            } else {
                small = names[i][1];
                big = names[i][0];
            }
            if (small.compareTo(handle) >= 0) handle = small;
            else if (big.compareTo(handle) >= 0) handle = big;
            else {
                ok = false;
                break;
            }
        }
        System.out.println(ok ? "YES" : "NO");
    }
}
