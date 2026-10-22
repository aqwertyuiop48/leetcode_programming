import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().trim();
        int n = s.length();
        final long MOD = 1_000_000_007L;
        // dp[a][b]: a = mine at i-1, b = mine at i ; constraints for cells < i verified
        long[][] dp = new long[2][2];
        for (int b = 0; b < 2; b++) if (ok0(s.charAt(0), b)) dp[0][b] = 1;
        for (int i = 0; i + 1 < n; i++) {
            long[][] nd = new long[2][2];
            char ch = s.charAt(i), nc = s.charAt(i + 1);
            for (int a = 0; a < 2; a++)
                for (int b = 0; b < 2; b++) {
                    long v = dp[a][b];
                    if (v == 0) continue;
                    for (int c = 0; c < 2; c++) {
                        if (!ok0(nc, c)) continue;
                        if (ch >= '0' && ch <= '2' && ch - '0' != a + c) continue;
                        nd[b][c] = (nd[b][c] + v) % MOD;
                    }
                }
            dp = nd;
        }
        long res = 0;
        char last = s.charAt(n - 1);
        for (int a = 0; a < 2; a++)
            for (int b = 0; b < 2; b++) {
                if (dp[a][b] == 0) continue;
                if (last >= '0' && last <= '2' && last - '0' != a) continue;
                res = (res + dp[a][b]) % MOD;
            }
        System.out.println(res);
    }

    // cell character compatible with being mine (b=1) or not
    static boolean ok0(char c, int b) {
        if (c == '*') return b == 1;
        if (c == '?') return true;
        return b == 0;
    }
}
