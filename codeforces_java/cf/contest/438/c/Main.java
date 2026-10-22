import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedInputStream(System.in));
        st.nextToken();
        int n = (int) st.nval;
        long[] x = new long[n], y = new long[n];
        for (int i = 0; i < n; i++) {
            st.nextToken(); x[i] = (long) st.nval;
            st.nextToken(); y[i] = (long) st.nval;
        }
        long area = 0;
        for (int i = 0; i < n; i++) {
            int j = (i + 1) % n;
            area += x[i] * y[j] - x[j] * y[i];
        }
        if (area < 0) {
            for (int i = 0, j = n - 1; i < j; i++, j--) {
                long t = x[i]; x[i] = x[j]; x[j] = t;
                t = y[i]; y[i] = y[j]; y[j] = t;
            }
        }
        final long M = 1000000007L;
        long[][] dp = new long[n][n];
        for (int i = 0; i + 1 < n; i++) dp[i][i + 1] = 1;
        for (int len = 2; len < n; len++) {
            for (int i = 0; i + len < n; i++) {
                int j = i + len;
                long s = 0;
                for (int k = i + 1; k < j; k++) {
                    long cr = (x[k] - x[i]) * (y[j] - y[i]) - (y[k] - y[i]) * (x[j] - x[i]);
                    if (cr > 0) s = (s + dp[i][k] * dp[k][j]) % M;
                }
                dp[i][j] = s;
            }
        }
        System.out.println(dp[0][n - 1] % M);
    }
}
