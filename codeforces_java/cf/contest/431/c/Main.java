import java.util.*;
import java.io.*;

public class Main {
    static final long MOD = 1000000007L;

    static long count(int n, int k, int maxEdge) {
        long[] f = new long[n + 1];
        f[0] = 1;
        for (int i = 1; i <= n; i++) {
            long s = 0;
            for (int e = 1; e <= maxEdge && e <= i; e++) s += f[i - e];
            f[i] = s % MOD;
        }
        return f[n];
    }

    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedInputStream(System.in));
        st.nextToken();
        int n = (int) st.nval;
        st.nextToken();
        int k = (int) st.nval;
        st.nextToken();
        int d = (int) st.nval;
        long ans = (count(n, k, k) - count(n, k, d - 1) + MOD) % MOD;
        System.out.println(ans);
    }
}
