import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        char[] s = st.nextToken().toCharArray();
        int k = Integer.parseInt(st.nextToken());
        int n = s.length;
        for (int i = 0; i < n && k > 0; i++) {
            int best = i;
            for (int j = i + 1; j < n && j - i <= k; j++) {
                if (s[j] > s[best]) best = j;
            }
            if (best != i) {
                char c = s[best];
                for (int j = best; j > i; j--) s[j] = s[j - 1];
                s[i] = c;
                k -= best - i;
            }
        }
        System.out.println(new String(s));
    }
}
