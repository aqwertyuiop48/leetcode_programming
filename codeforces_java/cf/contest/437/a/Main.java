import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] len = new int[4];
        for (int i = 0; i < 4; i++) len[i] = br.readLine().trim().length() - 2;
        int great = 0;
        char ans = 'C';
        for (int i = 0; i < 4; i++) {
            boolean shorter = true, longer = true;
            for (int j = 0; j < 4; j++) {
                if (i == j) continue;
                if (len[i] * 2 > len[j]) shorter = false;
                if (len[i] < len[j] * 2) longer = false;
            }
            if (shorter || longer) {
                great++;
                ans = (char) ('A' + i);
            }
        }
        System.out.println(great == 1 ? ans : 'C');
    }
}
