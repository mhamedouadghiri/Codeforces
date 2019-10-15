package SetB;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B625_WarOfTheCorporations {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String gogol = br.readLine();
        String pine = br.readLine();

        int cnt = 0;
        int ind = gogol.indexOf(pine);

        while (ind != -1) {
            cnt++;
            ind = gogol.indexOf(pine, ind + pine.length());
        }

        System.out.println(cnt);
    }
}
