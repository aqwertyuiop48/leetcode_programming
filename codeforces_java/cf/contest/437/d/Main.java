import java.util.*;
import java.io.*;

public class Main {
    static int[] par, size;

    static int find(int x) {
        while (par[x] != x) {
            par[x] = par[par[x]];
            x = par[x];
        }
        return x;
    }

    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedInputStream(System.in));
        st.nextToken();
        int n = (int) st.nval;
        st.nextToken();
        int m = (int) st.nval;
        long[] v = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            st.nextToken();
            v[i] = (long) st.nval;
        }
        long[] e = new long[m]; // weight * 2^40 ... encode (w, idx)
        int[] ea = new int[m], eb = new int[m];
        for (int i = 0; i < m; i++) {
            st.nextToken();
            ea[i] = (int) st.nval;
            st.nextToken();
            eb[i] = (int) st.nval;
            long w = Math.min(v[ea[i]], v[eb[i]]);
            e[i] = w * (1L << 20) + i;
        }
        Arrays.sort(e);
        par = new int[n + 1];
        size = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            par[i] = i;
            size[i] = 1;
        }
        double total = 0;
        for (int k = m - 1; k >= 0; k--) {
            int idx = (int) (e[k] & ((1 << 20) - 1));
            long w = e[k] >> 20;
            int a = find(ea[idx]), b = find(eb[idx]);
            if (a == b) continue;
            total += (double) w * size[a] * size[b];
            if (size[a] < size[b]) {
                int t = a;
                a = b;
                b = t;
            }
            par[b] = a;
            size[a] += size[b];
        }
        System.out.printf("%.6f%n", total * 2.0 / ((double) n * (n - 1)));
    }
}
