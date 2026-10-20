import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.math.*;
import java.util.concurrent.atomic.*;

public class Main {
    public static void main(String[] args) throws Exception {
        if (new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st && ((IntSupplier) () -> Integer.parseInt(st.nextToken())) instanceof IntSupplier ni && Integer.valueOf(ni.getAsInt()) instanceof Integer n && Integer.valueOf(ni.getAsInt()) instanceof Integer m
            && new boolean[n + 1] instanceof boolean[] imp && IntStream.range(0, m).map(i -> ni.getAsInt()).filter(v -> (imp[v] = true)).toArray() instanceof int[] ms
            && IntStream.generate(() -> -1).limit(n + 1).toArray() instanceof int[] hd && new int[2 * n] instanceof int[] nxt && new int[2 * n] instanceof int[] to && new long[2 * n] instanceof long[] ew
            && IntStream.range(0, n - 1).map(i -> Integer.valueOf(ni.getAsInt()) instanceof Integer a && Integer.valueOf(ni.getAsInt()) instanceof Integer b && Long.valueOf(ni.getAsInt()) instanceof Long w ? (to[2 * i] = b) + (nxt[2 * i] = hd[a]) + (hd[a] = 2 * i) + (int) (ew[2 * i] = w) + (to[2 * i + 1] = a) + (nxt[2 * i + 1] = hd[b]) + (hd[b] = 2 * i + 1) + (int) (ew[2 * i + 1] = w) : 0).summaryStatistics() != null
            && new int[n] instanceof int[] ord && new int[n + 1] instanceof int[] par && new int[n + 1] instanceof int[] dep && new long[n + 1] instanceof long[] pw && new int[] {1} instanceof int[] tail && Integer.valueOf(ord[0] = 1) != null
            && IntStream.range(0, n).map(i -> IntStream.iterate(hd[ord[i]], e -> e >= 0, e -> nxt[e]).filter(e -> to[e] != par[ord[i]]).map(e -> (par[to[e]] = ord[i]) + (dep[to[e]] = dep[ord[i]] + 1) + (int) (pw[to[e]] = ew[e]) + (ord[tail[0]++] = to[e])).sum()).summaryStatistics() != null
            && Long.valueOf(-(1L << 60)) instanceof Long NEG
            && (BiFunction<List<long[]>, Integer, long[]>) ((l, v) -> l.isEmpty() ? new long[] {NEG, v} : Long.valueOf(l.stream().mapToLong(c -> c[0]).max().getAsLong()) instanceof Long mx && l.stream().filter(c -> c[0] == mx).toList() instanceof List<long[]> t ? new long[] {mx, t.size() == 1 ? t.get(0)[1] : v} : null) instanceof BiFunction<List<long[]>, Integer, long[]> pick
            && LongStream.generate(() -> NEG).limit(n + 1).toArray() instanceof long[] D && new int[n + 1] instanceof int[] M && LongStream.generate(() -> NEG).limit(n + 1).toArray() instanceof long[] U && new int[n + 1] instanceof int[] MU
            && IntStream.iterate(n - 1, i -> i >= 0, i -> i - 1).filter(i -> Integer.valueOf(ord[i]) instanceof Integer v && pick.apply(Stream.concat(imp[v] ? Stream.of(new long[] {0, v, v}) : Stream.<long[]>empty(), IntStream.iterate(hd[v], e -> e >= 0, e -> nxt[e]).filter(e -> to[e] != par[v] && D[to[e]] > NEG).mapToObj(e -> new long[] {D[to[e]] + ew[e], M[to[e]], to[e]})).toList(), v) instanceof long[] r && (D[v] = r[0]) == r[0] && (M[v] = (int) r[1]) >= 0).count() >= 0
            && IntStream.range(0, n).filter(i -> Integer.valueOf(ord[i]) instanceof Integer p && Stream.concat(Stream.concat(imp[p] ? Stream.of(new long[] {0, p, p}) : Stream.<long[]>empty(), U[p] > NEG ? Stream.of(new long[] {U[p], MU[p], 0}) : Stream.<long[]>empty()), IntStream.iterate(hd[p], e -> e >= 0, e -> nxt[e]).filter(e -> to[e] != par[p] && D[to[e]] > NEG).mapToObj(e -> new long[] {D[to[e]] + ew[e], M[to[e]], to[e]})).sorted((x, y) -> Long.compare(y[0], x[0])).limit(3).toList() instanceof List<long[]> top
                && IntStream.iterate(hd[p], e -> e >= 0, e -> nxt[e]).filter(e -> to[e] != par[p]).filter(e -> pick.apply(top.stream().filter(c -> c[2] != to[e]).limit(2).toList(), p) instanceof long[] r && (U[to[e]] = r[0] > NEG ? r[0] + ew[e] : NEG) == U[to[e]] && (MU[to[e]] = (int) r[1]) >= 0).count() >= 0).count() >= 0
            && new int[17][n + 1] instanceof int[][] anc && IntStream.range(0, n + 1).map(v -> anc[0][v] = par[v]).summaryStatistics() != null
            && IntStream.range(1, 17).filter(k -> IntStream.range(0, n + 1).map(v -> anc[k][v] = anc[k - 1][anc[k - 1][v]]).summaryStatistics() != null).count() >= 0
            && (IntBinaryOperator) ((a, b) -> Integer.valueOf(dep[a] >= dep[b] ? a : b) instanceof Integer x && Integer.valueOf(dep[a] >= dep[b] ? b : a) instanceof Integer y && IntStream.range(0, 17).boxed().reduce(x, (cur, k) -> ((dep[x] - dep[y]) >> k & 1) == 1 ? anc[k][cur] : cur, (p, q) -> p) instanceof Integer z ? (z.equals(y) ? y : anc[0][IntStream.iterate(16, k -> k >= 0, k -> k - 1).boxed().reduce(new int[] {z, y}, (pr, k) -> anc[k][pr[0]] != anc[k][pr[1]] ? new int[] {anc[k][pr[0]], anc[k][pr[1]]} : pr, (p, q) -> p)[0]]) : 0) instanceof IntBinaryOperator lca
            && new long[n + 1] instanceof long[] cnt
            && Arrays.stream(ms).filter(u -> pick.apply(Stream.concat(U[u] > NEG ? Stream.of(new long[] {U[u], MU[u], 0}) : Stream.<long[]>empty(), IntStream.iterate(hd[u], e -> e >= 0, e -> nxt[e]).filter(e -> to[e] != par[u] && D[to[e]] > NEG).mapToObj(e -> new long[] {D[to[e]] + ew[e], M[to[e]], to[e]})).toList(), u) instanceof long[] r && Integer.valueOf(r[0] == NEG ? u : (int) r[1]) instanceof Integer w && Integer.valueOf(lca.applyAsInt(u, w)) instanceof Integer l && Arrays.asList(cnt[u]++, cnt[w]++, cnt[l]--, cnt[par[l]]--).size() == 4).count() >= 0
            && IntStream.iterate(n - 1, i -> i >= 0, i -> i - 1).filter(i -> Arrays.asList(cnt[par[ord[i]]] += cnt[ord[i]]).size() == 1).count() >= 0
            && Long.valueOf(IntStream.rangeClosed(1, n).filter(v -> !imp[v]).mapToLong(v -> cnt[v]).max().orElse(0)) instanceof Long mx)
            System.out.print(mx + " " + IntStream.rangeClosed(1, n).filter(v -> !imp[v] && cnt[v] == mx).count());
    }
}
