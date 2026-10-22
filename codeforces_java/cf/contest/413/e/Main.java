import java.util.*;
import java.io.*;
public class Main {
    static final long INF = 1000000000L;
    static long[] mul(long[] x, long[] y) {
        long[] r = new long[4];
        for (int i = 0; i < 2; i++) for (int j = 0; j < 2; j++) {
            long b = INF;
            for (int k = 0; k < 2; k++) b = Math.min(b, x[i * 2 + k] + y[k * 2 + j]);
            r[i * 2 + j] = b;
        }
        return r;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
        String[] g = {br.readLine().trim(), br.readLine().trim()};
        boolean[][] op = new boolean[2][n];
        for (int r = 0; r < 2; r++) for (int c = 0; c < n; c++) op[r][c] = g[r].charAt(c) == '.';
        long[][] V = new long[n][4];
        for (int c = 0; c < n; c++) {
            V[c][0] = op[0][c] ? 0 : INF; V[c][3] = op[1][c] ? 0 : INF;
            V[c][1] = V[c][2] = (op[0][c] && op[1][c]) ? 1 : INF;
        }
        int sz = 1; while (sz < n) sz <<= 1;
        long[] id = {0, INF, INF, 0};
        long[][] tr = new long[2 * sz][];
        for (int i = 0; i < 2 * sz; i++) tr[i] = id;
        for (int c = 1; c < n; c++) {
            long[] R = {INF, INF, INF, INF};
            if (op[0][c - 1] && op[0][c]) R[0] = 1;
            if (op[1][c - 1] && op[1][c]) R[3] = 1;
            tr[sz + c] = mul(R, V[c]);
        }
        for (int i = sz - 1; i >= 1; i--) tr[i] = mul(tr[2 * i], tr[2 * i + 1]);
        StringBuilder sb = new StringBuilder();
        for (int q = 0; q < m; q++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken()) - 1, v = Integer.parseInt(st.nextToken()) - 1;
            int ru = u / n, cu = u % n, rv = v / n, cv = v % n;
            if (cu > cv) { int t = ru; ru = rv; rv = t; t = cu; cu = cv; cv = t; }
            long res;
            if (cu == cv) res = V[cu][ru * 2 + rv];
            else {
                // product of leaves cu+1..cv
                long[] left = id, right = id;
                int lo = cu + 1 + sz, hi = cv + 1 + sz; // [lo,hi)
                while (lo < hi) {
                    if ((lo & 1) == 1) left = mul(left, tr[lo++]);
                    if ((hi & 1) == 1) right = mul(tr[--hi], right);
                    lo >>= 1; hi >>= 1;
                }
                long[] P = mul(V[cu], mul(left, right));
                res = P[ru * 2 + rv];
            }
            sb.append(res >= INF ? -1 : res).append('\n');
        }
        System.out.print(sb);
    }
}
