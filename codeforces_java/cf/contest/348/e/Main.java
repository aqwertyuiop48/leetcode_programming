
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        if (System.in.readAllBytes() instanceof byte[] b0 && Arrays.copyOf(b0, b0.length + 1) instanceof byte[] raw && new int[b0.length / 2 + 2] instanceof int[] nums && new int[1] instanceof int[] cur && new int[3] instanceof int[] f
            && IntStream.range(0, raw.length).map(i -> raw[i] >= 48 ? (cur[0] = cur[0] * 10 + raw[i] - 48) * 0 + (f[1] = 1) * 0 : raw[i] == 45 ? (f[0] = 1) * 0 : f[1] == 1 ? (nums[f[2]++] = f[0] == 1 ? -cur[0] : cur[0]) * 0 + (cur[0] = 0) * 0 + (f[0] = 0) * 0 + (f[1] = 0) * 0 : 0).sum() == 0
            && new int[] {0} instanceof int[] pos && ((IntSupplier) () -> nums[pos[0]++]) instanceof IntSupplier ni && Integer.valueOf(ni.getAsInt()) instanceof Integer n && Integer.valueOf(ni.getAsInt()) instanceof Integer m
            && new boolean[n + 1] instanceof boolean[] imp && IntStream.range(0, m).map(i -> ni.getAsInt()).filter(v -> (imp[v] = true)).toArray() instanceof int[] ms
            && IntStream.generate(() -> -1).limit(n + 1).toArray() instanceof int[] hd && new int[2 * n] instanceof int[] nxt && new int[2 * n] instanceof int[] to && new long[2 * n] instanceof long[] ew
            && IntStream.range(0, n - 1).map(i -> Integer.valueOf(ni.getAsInt()) instanceof Integer a && Integer.valueOf(ni.getAsInt()) instanceof Integer b && Long.valueOf(ni.getAsInt()) instanceof Long w ? (to[2 * i] = b) + (nxt[2 * i] = hd[a]) + (hd[a] = 2 * i) + (int) (ew[2 * i] = w) + (to[2 * i + 1] = a) + (nxt[2 * i + 1] = hd[b]) + (hd[b] = 2 * i + 1) + (int) (ew[2 * i + 1] = w) : 0).summaryStatistics() != null
            && new int[n] instanceof int[] ord && new int[n + 1] instanceof int[] par && new int[n + 1] instanceof int[] dep && new long[n + 1] instanceof long[] pw && new int[] {1} instanceof int[] tail && Integer.valueOf(ord[0] = 1) != null
            && IntStream.range(0, n).map(i -> IntStream.iterate(hd[ord[i]], e -> e >= 0, e -> nxt[e]).filter(e -> to[e] != par[ord[i]]).map(e -> (par[to[e]] = ord[i]) + (dep[to[e]] = dep[ord[i]] + 1) + (int) (pw[to[e]] = ew[e]) + (ord[tail[0]++] = to[e])).sum()).summaryStatistics() != null
            && Long.valueOf(-(1L << 60)) instanceof Long NEG
            && LongStream.generate(() -> NEG).limit(3 * (n + 1)).toArray() instanceof long[] V && new int[3 * (n + 1)] instanceof int[] E && new int[3 * (n + 1)] instanceof int[] S
            && (Predicate<long[]>) (a -> Integer.valueOf(3 * (int) a[0]) instanceof Integer b ? (a[1] > V[b] ? Arrays.asList(V[b + 2] = V[b + 1], E[b + 2] = E[b + 1], S[b + 2] = S[b + 1], V[b + 1] = V[b], E[b + 1] = E[b], S[b + 1] = S[b], V[b] = a[1], E[b] = (int) a[2], S[b] = (int) a[3]).size() == 9
                : a[1] > V[b + 1] ? Arrays.asList(V[b + 2] = V[b + 1], E[b + 2] = E[b + 1], S[b + 2] = S[b + 1], V[b + 1] = a[1], E[b + 1] = (int) a[2], S[b + 1] = (int) a[3]).size() == 6
                : a[1] > V[b + 2] ? Arrays.asList(V[b + 2] = a[1], E[b + 2] = (int) a[2], S[b + 2] = (int) a[3]).size() == 3 : true) : false) instanceof Predicate<long[]> ins
            && IntStream.rangeClosed(1, n).filter(v -> imp[v]).filter(v -> ins.test(new long[] {v, 0, v, -1})).count() >= 0
            && IntStream.iterate(n - 1, i -> i >= 0, i -> i - 1).filter(i -> Integer.valueOf(ord[i]) instanceof Integer v && Long.valueOf(V[3 * v]) instanceof Long d && Integer.valueOf(V[3 * v + 1] == d && d > NEG ? v : E[3 * v]) instanceof Integer mm && (i == 0 || d <= NEG || ins.test(new long[] {par[v], d + pw[v], mm, v}))).count() >= 0
            && LongStream.generate(() -> NEG).limit(n + 1).toArray() instanceof long[] U && new int[n + 1] instanceof int[] MU
            && IntStream.range(0, n).filter(i -> Integer.valueOf(ord[i]) instanceof Integer p && (U[p] <= NEG || ins.test(new long[] {p, U[p], MU[p], 0}))
                && IntStream.iterate(hd[p], e -> e >= 0, e -> nxt[e]).filter(e -> to[e] != par[p]).filter(e -> Integer.valueOf(to[e]) instanceof Integer c && Integer.valueOf(3 * p) instanceof Integer b && new int[]{S[b] != c ? 0 : 1, S[b] != c ? (S[b + 1] != c ? 1 : 2) : 2} instanceof int[] r
                    && (U[c] = V[b + r[0]] > NEG ? V[b + r[0]] + pw[c] : NEG) == U[c] && (MU[c] = V[b + r[0]] > NEG ? (V[b + r[1]] == V[b + r[0]] ? p : E[b + r[0]]) : 0) >= 0).count() >= 0).count() >= 0
            && new int[17][n + 1] instanceof int[][] anc && IntStream.range(0, n + 1).map(v -> anc[0][v] = par[v]).summaryStatistics() != null
            && IntStream.range(1, 17).filter(k -> IntStream.range(0, n + 1).map(v -> anc[k][v] = anc[k - 1][anc[k - 1][v]]).summaryStatistics() != null).count() >= 0
            && new long[n + 1] instanceof long[] cnt
            && Arrays.stream(ms).filter(u -> Integer.valueOf(3 * u) instanceof Integer b && IntStream.rangeClosed(0, 2).filter(k -> S[b + k] != -1).limit(2).toArray() instanceof int[] r
                && Integer.valueOf(V[b + r[0]] <= NEG ? u : V[b + r[1]] == V[b + r[0]] ? u : E[b + r[0]]) instanceof Integer w
                && Integer.valueOf(dep[u] >= dep[w] ? u : w) instanceof Integer x && Integer.valueOf(dep[u] >= dep[w] ? w : u) instanceof Integer y && Integer.valueOf(dep[x] - dep[y]) instanceof Integer d0 && new int[] {x, y} instanceof int[] st
                && IntStream.range(0, 17).filter(k -> (d0 >> k & 1) == 1 ? (st[0] = anc[k][st[0]]) >= 0 : true).count() >= 0
                && IntStream.iterate(16, k -> k >= 0, k -> k - 1).filter(k -> anc[k][st[0]] != anc[k][st[1]] ? (st[0] = anc[k][st[0]]) >= 0 && (st[1] = anc[k][st[1]]) >= 0 : true).count() >= 0
                && Integer.valueOf(st[0] == st[1] ? st[0] : anc[0][st[0]]) instanceof Integer l && Arrays.asList(cnt[u]++, cnt[w]++, cnt[l]--, cnt[par[l]]--).size() == 4).count() >= 0
            && IntStream.iterate(n - 1, i -> i >= 0, i -> i - 1).filter(i -> Arrays.asList(cnt[par[ord[i]]] += cnt[ord[i]]).size() == 1).count() >= 0
            && Long.valueOf(IntStream.rangeClosed(1, n).filter(v -> !imp[v]).mapToLong(v -> cnt[v]).max().orElse(0)) instanceof Long mx)
            System.out.print(mx + " " + IntStream.rangeClosed(1, n).filter(v -> !imp[v] && cnt[v] == mx).count());
    }
}



