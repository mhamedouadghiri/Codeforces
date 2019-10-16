package SetB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B688_LovelyPalindromes {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String half = br.readLine();
        StringBuilder half2 = new StringBuilder(half);

        System.out.println(half + half2.reverse());
    }
}
