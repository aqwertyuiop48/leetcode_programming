import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedInputStream(System.in));
        st.nextToken(); int n = (int) st.nval;
        st.nextToken(); int m = (int) st.nval;
        st.nextToken(); long k = (long) st.nval;
        boolean[] trap = new boolean[n];
        for (int i = 0; i < n; i++) { st.nextToken(); trap[i] = st.nval != 0; }
        double[][] cnt = new double[n][n];
        double[] deg = new double[n];
        for (int i = 0; i < m; i++) {
            st.nextToken(); int a = (int) st.nval - 1;
            st.nextToken(); int b = (int) st.nval - 1;
            cnt[a][b]++; cnt[b][a]++;
            deg[a]++; deg[b]++;
        }
        int[] tid = new int[n];
        int t = 0;
        int[] nid = new int[n];
        int nn = 0;
        for (int i = 0; i < n; i++) {
            tid[i] = trap[i] ? t++ : -1;
            nid[i] = trap[i] ? -1 : nn++;
        }
        if (!trap[n - 1] || k < 2) { System.out.printf("%.8f%n", 0.0); return; }
        // solve (I - Q) H = B, H[x][v] prob first trap is v from non-trap x
        double[][] A = new double[nn][nn + t];
        for (int x = 0; x < n; x++) {
            if (trap[x]) continue;
            int r = nid[x];
            A[r][r] += 1;
            for (int y = 0; y < n; y++) {
                if (cnt[x][y] == 0 || deg[x] == 0) continue;
                double p = cnt[x][y] / deg[x];
                if (trap[y]) A[r][nn + tid[y]] += p;
                else A[r][nid[y]] -= p;
            }
        }
        int R = nn;
        int[] where = new int[nn];
        Arrays.fill(where, -1);
        int row = 0;
        for (int col = 0; col < nn && row < nn; col++) {
            int piv = row;
            for (int i = row; i < nn; i++) if (Math.abs(A[i][col]) > Math.abs(A[piv][col])) piv = i;
            if (Math.abs(A[piv][col]) < 1e-12) continue;
            double[] tmp = A[piv]; A[piv] = A[row]; A[row] = tmp;
            double d = A[row][col];
            for (int j = 0; j < nn + t; j++) A[row][j] /= d;
            for (int i = 0; i < nn; i++) {
                if (i == row) continue;
                double f = A[i][col];
                if (f == 0) continue;
                for (int j = col; j < nn + t; j++) A[i][j] -= f * A[row][j];
            }
            where[col] = row;
            row++;
        }
        // H[x][v]
        double[][] H = new double[n][t];
        for (int x = 0; x < n; x++) {
            if (trap[x]) continue;
            int col = nid[x];
            if (where[col] < 0) continue;
            for (int v = 0; v < t; v++) H[x][v] = A[where[col]][nn + v];
        }
        // transition rows
        double[][] tr = new double[n][t];
        for (int u = 0; u < n; u++) {
            if (deg[u] == 0) continue;
            for (int y = 0; y < n; y++) {
                if (cnt[u][y] == 0) continue;
                double p = cnt[u][y] / deg[u];
                if (trap[y]) tr[u][tid[y]] += p;
                else for (int v = 0; v < t; v++) tr[u][v] += p * H[y][v];
            }
        }
        double[] vec = tr[0].clone();
        double[][] T = new double[t][t];
        for (int u = 0; u < n; u++) if (trap[u]) T[tid[u]] = tr[u];
        long e = k - 2;
        while (e > 0) {
            if ((e & 1) == 1) {
                double[] nv = new double[t];
                for (int i = 0; i < t; i++) {
                    if (vec[i] == 0) continue;
                    for (int j = 0; j < t; j++) nv[j] += vec[i] * T[i][j];
                }
                vec = nv;
            }
            e >>= 1;
            if (e > 0) {
                double[][] nt = new double[t][t];
                for (int i = 0; i < t; i++)
                    for (int l = 0; l < t; l++) {
                        double f = T[i][l];
                        if (f == 0) continue;
                        for (int j = 0; j < t; j++) nt[i][j] += f * T[l][j];
                    }
                T = nt;
            }
        }
        double ans = vec[tid[n - 1]];
        if (ans < 0) ans = 0;
        System.out.printf("%.8f%n", ans);
    }
}
