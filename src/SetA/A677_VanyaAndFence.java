package SetA;

import java.util.Scanner;

public class A677_VanyaAndFence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int h = scanner.nextInt();
        int[] heights = new int[n];
        for (int i = 0; i < n; i++)
            heights[i] = scanner.nextInt();
        int sum = 0;
        for (int height : heights)
            if (height > h)
                sum += 2;
            else sum++;
        System.out.println(sum);
    }
}
