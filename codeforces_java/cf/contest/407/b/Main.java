import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedInputStream(System.in));
        st.nextToken(); int n = (int) st.nval;
        final long M = 1000000007L;
        long[] dp = new long[n + 2], pre = new long[n + 2];
        long ans = 0;
        for (int i = 1; i <= n; i++) {
            st.nextToken(); int p = (int) st.nval;
            dp[i] = (2 + pre[i - 1] - pre[p - 1] + M) % M;
            pre[i] = (pre[i - 1] + dp[i]) % M;
            ans = (ans + dp[i]) % M;
        }
        System.out.println(ans);
    }
}
