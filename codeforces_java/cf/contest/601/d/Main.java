import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 2] instanceof int[] a
            && new int[raw.length / 2 + 2] instanceof int[] sc
            && new int[5] instanceof int[] st
            && IntStream.rangeClosed(0, raw.length).map(i -> i < raw.length ? raw[i] : 32).map(c -> (c > 96 ? (sc[st[4]++] = c - 97) : c > 47 && c < 58 ? (st[1] = st[1] * 10 + c - 48) + (st[3] = 1) : c == 45 ? (st[2] = 1) : st[3] == 0 ? 0 : (a[st[0]++] = st[2] == 1 ? -st[1] : st[1]) + (st[1] = 0) + (st[2] = 0) + (st[3] = 0)) * 0).sum() == 0
            && (Integer) a[0] instanceof Integer n
            && new int[n + 1] instanceof int[] deg && new int[n + 1] instanceof int[] xr
            && IntStream.range(0, n - 1).map(e -> ((deg[a[n + 1 + 2 * e]]++) + (deg[a[n + 2 + 2 * e]]++) + (xr[a[n + 1 + 2 * e]] ^= a[n + 2 + 2 * e]) + (xr[a[n + 2 + 2 * e]] ^= a[n + 1 + 2 * e])) * 0).sum() == 0
            && (deg[1]++) >= 0
            && new int[n + 1] instanceof int[] pq && new int[]{0, 0, 0, 26, 0, 0, 0} instanceof int[] ctl
            && IntStream.rangeClosed(1, n).filter(v -> deg[v] == 1 && (pq[ctl[6]++] = v) > 0).count() >= 0
            && new int[(n + 1) * 26] instanceof int[] ch && new int[n + 1] instanceof int[] sz
            && new int[n + 5] instanceof int[] sa && new int[n + 5] instanceof int[] sb
            && new long[]{Long.MIN_VALUE, 0} instanceof long[] best
            && IntStream.range(0, 28 * n + 30).filter(t -> !(ctl[3] < 26
                ? (Integer) ctl[3]++ instanceof Integer c && (ch[ctl[5] * 26 + c] == 0 || (ch[ctl[4] * 26 + c] == 0
                    ? (ch[ctl[4] * 26 + c] = ch[ctl[5] * 26 + c]) > 0
                    : (sz[ctl[2]]--) > -5 && (sa[ctl[0]] = ch[ctl[4] * 26 + c]) > 0 && (sb[ctl[0]++] = ch[ctl[5] * 26 + c]) > 0))
                : ctl[0] > 0
                ? (ctl[4] = sa[ctl[0] - 1]) > 0 && (ctl[5] = sb[--ctl[0]]) > 0 && (ctl[3] = 0) == 0
                : ctl[1] >= ctl[6] || ((Integer) pq[ctl[1]++] instanceof Integer v
                    && (Long) ((long) sz[v] + 1 + a[v]) instanceof Long val
                    && (best[1] = val.longValue() > best[0] ? 1 : val.longValue() == best[0] ? best[1] + 1 : best[1]) >= 0
                    && (best[0] = Math.max(best[0], val)) > Long.MIN_VALUE
                    && (Integer) xr[v] instanceof Integer p
                    && (v == 1 || ((ctl[2] = p) > 0 && (deg[p]--) > 0 && (xr[p] ^= v) >= 0 && (deg[p] != 1 || (pq[ctl[6]++] = p) > 0)
                        && (ch[p * 26 + sc[v - 1]] == 0
                            ? (ch[p * 26 + sc[v - 1]] = v) > 0 && (sz[p] += sz[v] + 1) > 0
                            : (sz[p] += sz[v]) >= 0 && (sa[ctl[0]] = ch[p * 26 + sc[v - 1]]) > 0 && (sb[ctl[0]++] = v) > 0))))))
                .count() == 0
            ? best[0] + "\n" + best[1] : "");
    }
}
