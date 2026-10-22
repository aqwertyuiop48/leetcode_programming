import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedInputStream(System.in));
        st.nextToken(); int n = (int) st.nval;
        st.nextToken(); int k = (int) st.nval;
        final long M = 1000000007L;
        int T = 1 << k; // target value 2^k
        int S = T / 2;  // states s/2 for even s in [0, T)
        long[] dp = new long[S], nd = new long[S];
        long win = 0;
        dp[0] = 1;
        for (int i = 0; i < n; i++) {
            st.nextToken(); int x = (int) st.nval;
            Arrays.fill(nd, 0);
            long nw = 0;
            boolean c2 = x == 0 || x == 2, c4 = x == 0 || x == 4;
            nw = win * (x == 0 ? 2 : 1) % M;
            for (int h = 0; h < S; h++) {
                long v = dp[h];
                if (v == 0) continue;
                int s = h * 2;
                if (c2) {
                    int t = s + 2;
                    if (t == T) nw = (nw + v) % M; else nd[t / 2] = (nd[t / 2] + v) % M;
                }
                if (c4) {
                    if ((s & 2) != 0) nd[2] = (nd[2] + v) % M; // 4 -> index 2
                    else {
                        int t = s + 4;
                        if (t == T) nw = (nw + v) % M; else nd[t / 2] = (nd[t / 2] + v) % M;
                    }
                }
            }
            long[] tmp = dp; dp = nd; nd = tmp; win = nw;
        }
        System.out.println(win % M);
    }
}
