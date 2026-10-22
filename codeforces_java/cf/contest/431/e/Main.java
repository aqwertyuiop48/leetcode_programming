import java.util.*;
import java.io.*;

public class Main {
    static int sz;
    static long[] cnt, sum;
    static long[] vals;
    static int LOG;

    static void upd(int i, long c, long v) {
        for (; i <= sz; i += i & -i) {
            cnt[i] += c;
            sum[i] += v;
        }
    }

    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedInputStream(System.in));
        st.nextToken();
        int n = (int) st.nval;
        st.nextToken();
        int q = (int) st.nval;
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            st.nextToken();
            a[i] = (long) st.nval;
        }
        int[] type = new int[q];
        long[] x = new long[q], y = new long[q];
        for (int i = 0; i < q; i++) {
            st.nextToken();
            type[i] = (int) st.nval;
            if (type[i] == 1) {
                st.nextToken();
                x[i] = (long) st.nval - 1;
                st.nextToken();
                y[i] = (long) st.nval;
            } else {
                st.nextToken();
                y[i] = (long) st.nval;
            }
        }
        long[] all = new long[n + q];
        int m = 0;
        for (int i = 0; i < n; i++) all[m++] = a[i];
        for (int i = 0; i < q; i++) if (type[i] == 1) all[m++] = y[i];
        long[] tmp = Arrays.copyOf(all, m);
        Arrays.sort(tmp);
        int u = 0;
        for (int i = 0; i < m; i++) if (i == 0 || tmp[i] != tmp[i - 1]) tmp[u++] = tmp[i];
        vals = Arrays.copyOf(tmp, u);
        sz = u;
        cnt = new long[sz + 1];
        sum = new long[sz + 1];
        LOG = 1;
        while ((1 << LOG) <= sz) LOG++;
        for (int i = 0; i < n; i++) upd(Arrays.binarySearch(vals, a[i]) + 1, 1, a[i]);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < q; i++) {
            if (type[i] == 1) {
                int p = (int) x[i];
                upd(Arrays.binarySearch(vals, a[p]) + 1, -1, -a[p]);
                a[p] = y[i];
                upd(Arrays.binarySearch(vals, a[p]) + 1, 1, a[p]);
            } else {
                long v = y[i];
                int lo = 1, hi = n;
                while (lo < hi) {
                    int mid = (lo + hi + 1) >>> 1;
                    long[] r = kth(mid);
                    // r[0]=value of kth, r[1]=sum of k smallest
                    if ((long) mid * r[0] - r[1] < v) lo = mid;
                    else hi = mid - 1;
                }
                long[] r = kth(lo);
                double ans = (double) (r[1] + v) / lo;
                sb.append(String.format("%.5f", ans)).append('\n');
            }
        }
        System.out.print(sb);
    }

    static long[] kth(int k) {
        int pos = 0;
        long c = 0, s = 0;
        for (int b = LOG; b >= 0; b--) {
            int np = pos + (1 << b);
            if (np <= sz && c + cnt[np] < k) {
                pos = np;
                c += cnt[np];
                s += sum[np];
            }
        }
        long val = vals[pos];
        long S = s + (k - c) * val;
        return new long[]{val, S};
    }
}
