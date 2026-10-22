import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedInputStream(System.in));
        st.nextToken(); int n = (int) st.nval;
        int N = 1 << n;
        int[] a = new int[N];
        for (int i = 0; i < N; i++) { st.nextToken(); a[i] = (int) st.nval; }
        long[] inv = new long[n + 1], asc = new long[n + 1];
        int[] b = new int[N];
        for (int d = 1; d <= n; d++) {
            int bs = 1 << d, h = bs >> 1;
            long iv = 0, as = 0;
            for (int s = 0; s < N; s += bs) {
                // a[s..s+h) and a[s+h..s+bs) are sorted
                int p = s + h, q = s + h; // pointers in right half
                // inversions: l > r  -> count r < l ; asc: r > l
                int lo = s + h, hi = s + h;
                for (int i = s; i < s + h; i++) {
                    while (lo < s + bs && a[lo] < a[i]) lo++;
                    while (hi < s + bs && a[hi] <= a[i]) hi++;
                    iv += lo - (s + h);
                    as += (s + bs) - hi;
                }
                // merge
                int i = s, j = s + h, k = s;
                while (i < s + h && j < s + bs) b[k++] = a[i] <= a[j] ? a[i++] : a[j++];
                while (i < s + h) b[k++] = a[i++];
                while (j < s + bs) b[k++] = a[j++];
            }
            System.arraycopy(b, 0, a, 0, N);
            inv[d] = iv; asc[d] = as;
        }
        st.nextToken(); int q = (int) st.nval;
        StringBuilder sb = new StringBuilder();
        while (q-- > 0) {
            st.nextToken(); int x = (int) st.nval;
            for (int d = 1; d <= x; d++) { long t = inv[d]; inv[d] = asc[d]; asc[d] = t; }
            long s = 0;
            for (int d = 1; d <= n; d++) s += inv[d];
            sb.append(s).append('\n');
        }
        System.out.print(sb);
    }
}
