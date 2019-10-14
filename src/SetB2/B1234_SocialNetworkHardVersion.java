package SetB2;

import java.util.HashSet;
import java.util.Scanner;

public class B1234_SocialNetworkHardVersion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scanner.nextInt();

        HashSet<Integer> hs = new HashSet<>();
        int[] result = new int[n];
        result[0] = arr[0];
        hs.add(arr[0]);
        int stored = 1, start = 0, end = 0;

        for (int i = 1; i < n; i++) {
            if (!hs.contains(arr[i])) {
                if (stored < k) {
                    hs.add(arr[i]);
                    result[end + 1] = arr[i];
                } else {
                    hs.remove(result[start]);
                    hs.add(arr[i]);
                    result[end + 1] = arr[i];
                    start++;
                }
                end++;
                stored++;
            }
        }

        System.out.println(end - start + 1);
        for (int i = end; i >= start; i--)
            System.out.print(result[i] + " ");
    }
}
