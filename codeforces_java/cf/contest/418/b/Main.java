import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedInputStream(System.in));
        st.nextToken(); int m = (int) st.nval;
        st.nextToken(); int n = (int) st.nval;
        st.nextToken(); long b = (long) st.nval;
        // first line is "n m b" in the problem: n friends, m problems
        int friends = m, probs = n;
        long[][] f = new long[friends][3];
        for (int i = 0; i < friends; i++) {
            st.nextToken(); long x = (long) st.nval;
            st.nextToken(); long k = (long) st.nval;
            st.nextToken(); int mi = (int) st.nval;
            int mask = 0;
            for (int j = 0; j < mi; j++) {
                st.nextToken(); mask |= 1 << ((int) st.nval - 1);
            }
            f[i][0] = k; f[i][1] = x; f[i][2] = mask;
        }
        Arrays.sort(f, (p, q) -> Long.compare(p[0], q[0]));
        int full = (1 << probs) - 1;
        long INF = Long.MAX_VALUE / 4;
        long[] dp = new long[1 << probs];
        Arrays.fill(dp, INF);
        dp[0] = 0;
        long ans = INF;
        for (int i = 0; i < friends; i++) {
            long x = f[i][1];
            int fm = (int) f[i][2];
            for (int mask = 0; mask <= full; mask++) {
                if (dp[mask] >= INF) continue;
                int nm = mask | fm;
                if (dp[mask] + x < dp[nm]) dp[nm] = dp[mask] + x;
            }
            if (dp[full] < INF) ans = Math.min(ans, dp[full] + f[i][0] * b);
        }
        System.out.println(ans >= INF ? -1 : ans);
    }
}
