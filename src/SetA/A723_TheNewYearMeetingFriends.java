package SetA;

import java.util.Arrays;
import java.util.Scanner;

public class A723_TheNewYearMeetingFriends {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] points = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int max = Arrays.stream(points).reduce(Math::max).getAsInt();
        int min = Arrays.stream(points).reduce(Math::min).getAsInt();
        System.out.println(max - min);
    }
}
