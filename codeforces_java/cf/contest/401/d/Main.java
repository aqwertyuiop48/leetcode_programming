import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());
        String ns = tk.nextToken();
        int m = Integer.parseInt(tk.nextToken());
        int[] cnt = new int[10];
        for (char c : ns.toCharArray()) cnt[c - '0']++;
        int[] mult = new int[10];
        int total = 1;
        for (int d = 0; d < 10; d++) { mult[d] = total; total *= (cnt[d] + 1); }
        long[][] dp = new long[total][m];
        dp[0][0] = 1;
        for (int s = 0; s < total; s++) {
            int[] u = new int[10];
            int t = s;
            for (int d = 0; d < 10; d++) { u[d] = t % (cnt[d] + 1); t /= (cnt[d] + 1); }
            for (int r = 0; r < m; r++) {
                long v = dp[s][r];
                if (v == 0) continue;
                for (int d = 0; d < 10; d++) {
                    if (u[d] < cnt[d]) {
                        if (s == 0 && d == 0) continue;
                        dp[s + mult[d]][(r * 10 + d) % m] += v;
                    }
                }
            }
        }
        System.out.println(dp[total - 1][0]);
    }
}
