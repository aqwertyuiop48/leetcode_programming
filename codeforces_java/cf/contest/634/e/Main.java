import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] b && Arrays.copyOf(b, b.length + 1) instanceof byte[] raw
            && new long[2] instanceof long[] st && new int[]{0} instanceof int[] ix && new long[raw.length / 2 + 2] instanceof long[] v
            && IntStream.range(0, raw.length).filter(k -> raw[k] > 47 && raw[k] < 58 ? (st[0] = st[0] * 10 + raw[k] - 48) < 0
                : k > 0 && raw[k - 1] > 47 && raw[k - 1] < 58 && (v[ix[0]++] = st[0]) + (st[0] = 0) < 0).count() >= 0
            && Integer.valueOf((int) v[0]) instanceof Integer n && Integer.valueOf((int) v[1]) instanceof Integer k
            && new int[n + 1] instanceof int[] head && new int[2 * n + 2] instanceof int[] nxt && new int[2 * n + 2] instanceof int[] to
            && IntStream.range(0, n - 1).filter(e -> Integer.valueOf((int) v[n + 2 + 2 * e]) instanceof Integer u && Integer.valueOf((int) v[n + 3 + 2 * e]) instanceof Integer w
                && (to[2 * e + 1] = w) + (nxt[2 * e + 1] = head[u]) + (head[u] = 2 * e + 1) + (to[2 * e + 2] = u) + (nxt[2 * e + 2] = head[w]) + (head[w] = 2 * e + 2) < 0).count() >= 0
            && new int[n] instanceof int[] ord && new int[n + 1] instanceof int[] par && new int[]{1} instanceof int[] ct && (ord[0] = 1) == 1
            && IntStream.range(0, n).filter(qi -> Integer.valueOf(ord[qi]) instanceof Integer x
                && IntStream.iterate(head[x], e -> e > 0, e -> nxt[e]).filter(e -> to[e] != par[x] && (par[to[e]] = x) > 0 && (ord[ct[0]++] = to[e]) > 0).count() < 0).count() >= 0
            && new int[n + 1] instanceof int[] sz && IntStream.rangeClosed(1, n).filter(i -> (sz[i] = 1) < 0).count() >= 0
            && IntStream.range(1, n).filter(t -> Integer.valueOf(ord[n - t]) instanceof Integer x && (sz[par[x]] += sz[x]) < 0).count() >= 0
            && new int[n + 1] instanceof int[] f && new int[n + 1] instanceof int[] sf && new int[n + 1] instanceof int[] nf1 && new int[n + 1] instanceof int[] nf2 && new int[n + 1] instanceof int[] nfi
            && new int[]{(int) IntStream.rangeClosed(1, n).mapToLong(i -> v[1 + i]).min().getAsLong(), (int) IntStream.rangeClosed(1, n).mapToLong(i -> v[1 + i]).max().getAsLong(), 0} instanceof int[] lh
            && IntStream.range(0, 21).allMatch(it -> lh[0] >= lh[1] || Integer.valueOf((lh[0] + lh[1] + 1) / 2) instanceof Integer mid
                && IntStream.rangeClosed(0, n).filter(i -> (sf[i] = nf1[i] = nf2[i] = nfi[i] = 0) < 0).count() >= 0
                && IntStream.range(0, n).filter(t -> Integer.valueOf(ord[n - 1 - t]) instanceof Integer x
                    && (f[x] = v[1 + x] >= mid ? 1 + sf[x] + nf1[x] : 0) >= 0
                    && (x == 1 || Integer.valueOf(par[x]) instanceof Integer p && Integer.valueOf(f[x]) instanceof Integer fv
                        && (fv == sz[x] ? (sf[p] += fv) : fv > nf1[p] ? (nf2[p] = nf1[p]) + (nf1[p] = fv) + (nfi[p] = x) : fv > nf2[p] ? (nf2[p] = fv) : 0) >= 0)).count() >= 0
                && (lh[2] = 0) == 0
                && IntStream.range(0, n).filter(qi -> Integer.valueOf(ord[qi]) instanceof Integer x
                    && (qi == 0 || Integer.valueOf(par[x]) instanceof Integer p && Integer.valueOf(f[x]) instanceof Integer fv && Boolean.valueOf(fv == sz[x]) instanceof Boolean fx
                        && Integer.valueOf(v[1 + p] >= mid ? 1 + sf[p] - (fx ? fv : 0) + (fx ? nf1[p] : nfi[p] == x ? nf2[p] : nf1[p]) : 0) instanceof Integer up
                        && (up == n - sz[x] ? (sf[x] += up) : up > nf1[x] ? (nf2[x] = nf1[x]) + (nf1[x] = up) + (nfi[x] = -1) : up > nf2[x] ? (nf2[x] = up) : 0) >= 0)
                    && (lh[2] = Math.max(lh[2], v[1 + x] >= mid ? 1 + sf[x] + nf1[x] : 0)) >= 0).count() >= 0
                && (lh[2] >= k ? (lh[0] = mid) : (lh[1] = mid - 1)) >= 0)
            ? lh[0] : "");
    }
}
