import java.util.*;
import java.io.*;

public class Main {
    static long[] sum;
    static int[] mx;
    static int[] a;

    static void build(int o, int l, int r) {
        if (l == r) { sum[o] = a[l]; mx[o] = a[l]; return; }
        int m = (l + r) >> 1;
        build(o * 2, l, m); build(o * 2 + 1, m + 1, r);
        pull(o);
    }
    static void pull(int o) {
        sum[o] = sum[o * 2] + sum[o * 2 + 1];
        mx[o] = Math.max(mx[o * 2], mx[o * 2 + 1]);
    }
    static void mod(int o, int l, int r, int ql, int qr, int x) {
        if (qr < l || r < ql || mx[o] < x) return;
        if (l == r) { sum[o] %= x; mx[o] = (int) sum[o]; return; }
        int m = (l + r) >> 1;
        mod(o * 2, l, m, ql, qr, x); mod(o * 2 + 1, m + 1, r, ql, qr, x);
        pull(o);
    }
    static void set(int o, int l, int r, int p, int v) {
        if (l == r) { sum[o] = v; mx[o] = v; return; }
        int m = (l + r) >> 1;
        if (p <= m) set(o * 2, l, m, p, v); else set(o * 2 + 1, m + 1, r, p, v);
        pull(o);
    }
    static long query(int o, int l, int r, int ql, int qr) {
        if (qr < l || r < ql) return 0;
        if (ql <= l && r <= qr) return sum[o];
        int m = (l + r) >> 1;
        return query(o * 2, l, m, ql, qr) + query(o * 2 + 1, m + 1, r, ql, qr);
    }
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedInputStream(System.in));
        st.nextToken(); int n = (int) st.nval;
        st.nextToken(); int m = (int) st.nval;
        a = new int[n + 1];
        for (int i = 1; i <= n; i++) { st.nextToken(); a[i] = (int) st.nval; }
        sum = new long[4 * n + 4]; mx = new int[4 * n + 4];
        build(1, 1, n);
        StringBuilder sb = new StringBuilder();
        while (m-- > 0) {
            st.nextToken(); int t = (int) st.nval;
            if (t == 1) {
                st.nextToken(); int l = (int) st.nval;
                st.nextToken(); int r = (int) st.nval;
                sb.append(query(1, 1, n, l, r)).append('\n');
            } else if (t == 2) {
                st.nextToken(); int l = (int) st.nval;
                st.nextToken(); int r = (int) st.nval;
                st.nextToken(); int x = (int) st.nval;
                mod(1, 1, n, l, r, x);
            } else {
                st.nextToken(); int k = (int) st.nval;
                st.nextToken(); int x = (int) st.nval;
                set(1, 1, n, k, x);
            }
        }
        System.out.print(sb);
    }
}
