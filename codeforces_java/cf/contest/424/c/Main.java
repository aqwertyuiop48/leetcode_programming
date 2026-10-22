import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long res = 0;
        for (int i = 0; i < n; i++) res ^= Long.parseLong(st.nextToken());
        long[] P = new long[n + 2];
        for (int i = 1; i <= n + 1; i++) P[i] = P[i - 1] ^ i;
        for (int j = 1; j <= n; j++) {
            long q = (n + 1) / j;
            int r = (n + 1) % j;
            if ((q & 1) == 1) res ^= P[j - 1];
            if (r > 0) res ^= P[r - 1];
        }
        System.out.println(res);
    }
}
