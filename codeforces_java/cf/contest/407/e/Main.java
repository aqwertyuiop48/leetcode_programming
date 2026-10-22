import java.util.*;
import java.io.*;
public class Main {
    static long[] mn, lz;
    static void build(int o, int l, int r) {
        if (l == r) { mn[o] = l; return; }
        int m = (l + r) >> 1;
        build(o * 2, l, m); build(o * 2 + 1, m + 1, r);
        mn[o] = Math.min(mn[o * 2], mn[o * 2 + 1]);
    }
    static void add(int o, int l, int r, int ql, int qr, long v) {
        if (ql > r || qr < l) return;
        if (ql <= l && r <= qr) { mn[o] += v; lz[o] += v; return; }
        push(o);
        int m = (l + r) >> 1;
        add(o * 2, l, m, ql, qr, v); add(o * 2 + 1, m + 1, r, ql, qr, v);
        mn[o] = Math.min(mn[o * 2], mn[o * 2 + 1]);
    }
    static void push(int o) {
        if (lz[o] != 0) {
            for (int c = o * 2; c <= o * 2 + 1; c++) { mn[c] += lz[o]; lz[c] += lz[o]; }
            lz[o] = 0;
        }
    }
    // leftmost index in [ql, qr] with value <= lim, or -1
    static int find(int o, int l, int r, int ql, int qr, long lim) {
        if (ql > r || qr < l || mn[o] > lim) return -1;
        if (l == r) return l;
        push(o);
        int m = (l + r) >> 1;
        int x = find(o * 2, l, m, ql, qr, lim);
        if (x >= 0) return x;
        return find(o * 2 + 1, m + 1, r, ql, qr, lim);
    }
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedInputStream(System.in));
        st.nextToken(); int n = (int) st.nval;
        st.nextToken(); long k = (long) st.nval;
        st.nextToken(); long d = (long) st.nval;
        long[] a = new long[n];
        for (int i = 0; i < n; i++) { st.nextToken(); a[i] = (long) st.nval; }
        if (d == 0) {
            int bl = 0, bs = 0, s = 0;
            for (int i = 0; i < n; i++) {
                if (i > 0 && a[i] != a[i - 1]) s = i;
                if (i - s + 1 > bl) { bl = i - s + 1; bs = s; }
            }
            System.out.println((bs + 1) + " " + (bs + bl));
            return;
        }
        if (d < 0) d = -d;
        mn = new long[4 * n]; lz = new long[4 * n];
        build(1, 0, n - 1);
        long[] mxv = new long[n], mxs = new long[n], miv = new long[n], mis = new long[n];
        int mxt = 0, mit = 0;
        HashMap<Long, Integer> last = new HashMap<>();
        int L = 0;
        int bestLen = 0, bestL = 0;
        for (int r = 0; r < n; r++) {
            if (r > 0 && Math.floorMod(a[r], d) != Math.floorMod(a[r - 1], d)) {
                L = r; mxt = 0; mit = 0;
            }
            Integer p = last.get(a[r]);
            if (p != null) L = Math.max(L, p + 1);
            last.put(a[r], r);
            int curEnd = r - 1, ns = r;
            while (mxt > 0 && mxv[mxt - 1] <= a[r]) {
                mxt--;
                long s = mxs[mxt];
                long dv = (a[r] - mxv[mxt]) / d;
                if (dv != 0) add(1, 0, n - 1, (int) s, curEnd, dv);
                curEnd = (int) s - 1; ns = (int) s;
            }
            mxv[mxt] = a[r]; mxs[mxt] = ns; mxt++;
            curEnd = r - 1; ns = r;
            while (mit > 0 && miv[mit - 1] >= a[r]) {
                mit--;
                long s = mis[mit];
                long dv = (miv[mit] - a[r]) / d;
                if (dv != 0) add(1, 0, n - 1, (int) s, curEnd, dv);
                curEnd = (int) s - 1; ns = (int) s;
            }
            miv[mit] = a[r]; mis[mit] = ns; mit++;
            int l = find(1, 0, n - 1, L, r, k + r);
            if (l >= 0 && r - l + 1 > bestLen) { bestLen = r - l + 1; bestL = l; }
        }
        System.out.println((bestL + 1) + " " + (bestL + bestLen));
    }
}
