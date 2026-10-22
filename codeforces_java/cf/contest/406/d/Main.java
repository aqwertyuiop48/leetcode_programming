import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedInputStream(System.in, 1 << 16));
        st.nextToken(); int n = (int) st.nval;
        long[] x = new long[n], y = new long[n];
        for (int i = 0; i < n; i++) {
            st.nextToken(); x[i] = (long) st.nval;
            st.nextToken(); y[i] = (long) st.nval;
        }
        int LOG = 1;
        while ((1 << LOG) < n) LOG++;
        int[][] up = new int[LOG + 1][n];
        int[] depth = new int[n];
        int[] stk = new int[n];
        int sp = 0;
        stk[sp++] = n - 1;
        for (int j = 0; j <= LOG; j++) up[j][n - 1] = n - 1;
        for (int i = n - 2; i >= 0; i--) {
            while (sp >= 2) {
                int t1 = stk[sp - 1], t2 = stk[sp - 2];
                // slope(i,t2) > slope(i,t1) ?
                long lhs = (y[t2] - y[i]) * (x[t1] - x[i]);
                long rhs = (y[t1] - y[i]) * (x[t2] - x[i]);
                if (lhs > rhs) sp--; else break;
            }
            int p = stk[sp - 1];
            up[0][i] = p;
            depth[i] = depth[p] + 1;
            stk[sp++] = i;
        }
        for (int j = 1; j <= LOG; j++)
            for (int i = 0; i < n; i++) up[j][i] = up[j - 1][up[j - 1][i]];
        st.nextToken(); int m = (int) st.nval;
        StringBuilder sb = new StringBuilder();
        while (m-- > 0) {
            st.nextToken(); int a = (int) st.nval - 1;
            st.nextToken(); int b = (int) st.nval - 1;
            if (depth[a] < depth[b]) { int t = a; a = b; b = t; }
            int diff = depth[a] - depth[b];
            for (int j = 0; j <= LOG; j++) if ((diff >> j & 1) == 1) a = up[j][a];
            if (a != b) {
                for (int j = LOG; j >= 0; j--)
                    if (up[j][a] != up[j][b]) { a = up[j][a]; b = up[j][b]; }
                a = up[0][a];
            }
            sb.append(a + 1).append(' ');
        }
        System.out.println(sb.toString().trim());
    }
}
