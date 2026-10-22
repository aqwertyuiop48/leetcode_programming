import java.util.*;
import java.io.*;

public class Main {
    static int n;
    static long[] b1, b2;
    static void add(long[] t, int i, long v) { for (; i <= n + 1; i += i & -i) t[i] += v; }
    static void rangeAdd(int l, int r, long v) {
        add(b1, l, v); add(b1, r + 1, -v);
        add(b2, l, v * (l - 1)); add(b2, r + 1, -v * r);
    }
    static long pre(int i) {
        long s1 = 0, s2 = 0;
        for (int j = i; j > 0; j -= j & -j) { s1 += b1[j]; s2 += b2[j]; }
        return s1 * i - s2;
    }
    static int[] end, col;
    static TreeSet<Integer> starts = new TreeSet<>();
    static void split(int p) {
        if (p > n) return;
        int s = starts.floor(p);
        if (s == p) return;
        end[p] = end[s]; col[p] = col[s]; end[s] = p - 1;
        starts.add(p);
    }
    public static void main(String[] args) throws IOException {
        StreamTokenizer st = new StreamTokenizer(new BufferedInputStream(System.in));
        st.nextToken(); n = (int) st.nval;
        st.nextToken(); int m = (int) st.nval;
        b1 = new long[n + 3]; b2 = new long[n + 3];
        end = new int[n + 2]; col = new int[n + 2];
        for (int i = 1; i <= n; i++) { end[i] = i; col[i] = i; starts.add(i); }
        StringBuilder sb = new StringBuilder();
        while (m-- > 0) {
            st.nextToken(); int t = (int) st.nval;
            st.nextToken(); int l = (int) st.nval;
            st.nextToken(); int r = (int) st.nval;
            if (t == 1) {
                st.nextToken(); int x = (int) st.nval;
                split(l); split(r + 1);
                NavigableSet<Integer> sub = starts.subSet(l, true, r, true);
                for (int s : sub) {
                    rangeAdd(s, end[s], Math.abs(col[s] - x));
                }
                sub.clear();
                starts.add(l);
                end[l] = r; col[l] = x;
            } else {
                sb.append(pre(r) - pre(l - 1)).append('\n');
            }
        }
        System.out.print(sb);
    }
}
