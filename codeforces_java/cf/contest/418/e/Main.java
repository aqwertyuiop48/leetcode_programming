import java.util.*;
import java.io.*;

public class Main {
    static int[] cnt, cc;
    static int mx;
    static void add(int v) { cc[cnt[v]]--; cnt[v]++; cc[cnt[v]]++; if (cnt[v] > mx) mx = cnt[v]; }
    static void rem(int v) { if (cnt[v] == mx && cc[cnt[v]] == 1) mx--; cc[cnt[v]]--; cnt[v]--; cc[cnt[v]]++; }
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedInputStream(System.in, 1 << 16));
        st.nextToken(); int n = (int) st.nval;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) { st.nextToken(); a[i] = (int) st.nval; }
        st.nextToken(); int q = (int) st.nval;
        int[] ty = new int[q], x = new int[q], y = new int[q];
        for (int i = 0; i < q; i++) {
            st.nextToken(); ty[i] = (int) st.nval;
            st.nextToken(); x[i] = (int) st.nval;
            st.nextToken(); y[i] = (int) st.nval;
        }
        // compress values
        int tot = n; for (int i = 0; i < q; i++) if (ty[i] == 1) tot++;
        int[] vals = new int[tot]; int vc = 0;
        for (int i = 0; i < n; i++) vals[vc++] = a[i];
        for (int i = 0; i < q; i++) if (ty[i] == 1) vals[vc++] = y[i];
        int[] sv = vals.clone(); Arrays.sort(sv);
        int u = 0;
        for (int i = 0; i < tot; i++) if (i == 0 || sv[i] != sv[i - 1]) sv[u++] = sv[i];
        int[] ca = new int[n];
        for (int i = 0; i < n; i++) ca[i] = Arrays.binarySearch(sv, 0, u, a[i]);
        int[] cur = ca.clone();
        int uc = 0, qc = 0;
        int[] upos = new int[q], uold = new int[q], unew = new int[q];
        int[] ql = new int[q], qr = new int[q], qt = new int[q], qi = new int[q];
        for (int i = 0; i < q; i++) {
            if (ty[i] == 1) {
                int p = x[i] - 1;
                int nv = Arrays.binarySearch(sv, 0, u, y[i]);
                upos[uc] = p; uold[uc] = cur[p]; unew[uc] = nv; cur[p] = nv; uc++;
            } else {
                ql[qc] = x[i] - 1; qr[qc] = y[i] - 1; qt[qc] = uc; qi[qc] = qc; qc++;
            }
        }
        if (qc == 0) return;
        int B = Math.max(1, (int) Math.round(Math.pow(Math.max(n, 1), 2.0 / 3.0)));
        if (uc == 0) B = Math.max(1, (int) Math.sqrt(n));
        final int BB = B;
        Integer[] idx = new Integer[qc];
        for (int i = 0; i < qc; i++) idx[i] = i;
        final int[] fl = ql, fr = qr, ft = qt;
        final boolean noUpd = uc == 0;
        Arrays.sort(idx, (p1, p2) -> {
            int l1 = fl[p1] / BB, l2 = fl[p2] / BB;
            if (l1 != l2) return Integer.compare(l1, l2);
            int r1 = fr[p1] / BB, r2 = fr[p2] / BB;
            if (r1 != r2) return (l1 & 1) == 0 ? Integer.compare(r1, r2) : Integer.compare(r2, r1);
            return ((r1 & 1) == 0) ? Integer.compare(ft[p1], ft[p2]) : Integer.compare(ft[p2], ft[p1]);
        });
        cnt = new int[u + 1]; cc = new int[n + 2];
        cc[0] = u;
        int[] arr = ca.clone();
        int L = 0, R = -1, T = 0;
        mx = 0;
        int[] ans = new int[qc];
        for (int ii = 0; ii < qc; ii++) {
            int id = idx[ii];
            int l = ql[id], r = qr[id], t = qt[id];
            while (T < t) {
                int p = upos[T];
                if (p >= L && p <= R) { rem(arr[p]); add(unew[T]); }
                arr[p] = unew[T]; T++;
            }
            while (T > t) {
                T--;
                int p = upos[T];
                if (p >= L && p <= R) { rem(arr[p]); add(uold[T]); }
                arr[p] = uold[T];
            }
            while (L > l) add(arr[--L]);
            while (R < r) add(arr[++R]);
            while (L < l) rem(arr[L++]);
            while (R > r) rem(arr[R--]);
            ans[id] = mx;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < qc; i++) sb.append(ans[i]).append('\n');
        System.out.print(sb);
    }
}
