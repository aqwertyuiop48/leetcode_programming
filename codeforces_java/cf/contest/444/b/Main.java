import java.util.*;
import java.io.*;

public class Main {
    static long x;
    static long next() {
        x = (x * 37 + 10007) % 1000000007L;
        return x;
    }
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedInputStream(System.in));
        st.nextToken(); int n = (int) st.nval;
        st.nextToken(); int d = (int) st.nval;
        st.nextToken(); x = (long) st.nval;
        int[] a = new int[n], b = new int[n];
        for (int i = 0; i < n; i++) a[i] = i + 1;
        for (int i = 0; i < n; i++) { int j = (int) (next() % (i + 1)); int t = a[i]; a[i] = a[j]; a[j] = t; }
        for (int i = 0; i < n; i++) b[i] = i < d ? 1 : 0;
        for (int i = 0; i < n; i++) { int j = (int) (next() % (i + 1)); int t = b[i]; b[i] = b[j]; b[j] = t; }
        int[] pos = new int[n + 1];
        for (int i = 0; i < n; i++) pos[a[i]] = i;
        int[] ones = new int[d];
        int oc = 0;
        for (int i = 0; i < n; i++) if (b[i] == 1) ones[oc++] = i;
        StringBuilder sb = new StringBuilder();
        final int S = 40;
        for (int i = 0; i < n; i++) {
            int res = -1;
            for (int t = 0; t < S && n - t >= 1; t++) {
                int v = n - t;
                int j = pos[v];
                if (j <= i && b[i - j] == 1) { res = v; break; }
            }
            if (res < 0) {
                res = 0;
                for (int t = 0; t < oc; t++) {
                    int q = ones[t];
                    if (q > i) break;
                    if (a[i - q] > res) res = a[i - q];
                }
            }
            sb.append(res).append('\n');
        }
        System.out.print(sb);
    }
}
