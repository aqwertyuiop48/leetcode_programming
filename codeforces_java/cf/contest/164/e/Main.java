import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && (Long) 4000000000000000000L instanceof Long INF && (Integer) (Integer.highestOneBit(n + 1) << 1) instanceof Integer N
            && new long[n + 1] instanceof long[] l && new long[n + 1] instanceof long[] r && new long[n + 1] instanceof long[] t
            && IntStream.rangeClosed(1, n).allMatch(i -> (l[i] = Long.parseLong(tk.nextToken())) > 0 && (r[i] = Long.parseLong(tk.nextToken())) > 0 && (t[i] = Long.parseLong(tk.nextToken())) > 0)
            && LongStream.range(0, 2L * N).map(x -> INF).toArray() instanceof long[] mn && new long[2 * N] instanceof long[] lz
            && LongStream.range(0, 2L * N).map(x -> -INF).toArray() instanceof long[] wt
            && IntStream.range(0, 2 * N).map(x -> x == 0 ? 0 : (x << (Integer.numberOfLeadingZeros(x) - Integer.numberOfLeadingZeros(N))) - N).toArray() instanceof int[] lo
            && IntStream.range(0, 2 * N).map(x -> x == 0 ? 0 : ((x + 1) << (Integer.numberOfLeadingZeros(x) - Integer.numberOfLeadingZeros(N))) - 1 - N).toArray() instanceof int[] hi
            && new long[3] instanceof long[] g && new long[]{0} instanceof long[] ans && new TreeSet<Integer>() instanceof TreeSet<Integer> pres
            && ((IntUnaryOperator) x -> lz[x] == 0 ? 0 : (mn[2 * x] += lz[x]) + (lz[2 * x] += lz[x]) + (mn[2 * x + 1] += lz[x]) + (lz[2 * x + 1] += lz[x]) + (lz[x] = 0) == 0 ? 0 : 0) instanceof IntUnaryOperator push
            && new IntUnaryOperator[1] instanceof IntUnaryOperator[] add && new IntUnaryOperator[1] instanceof IntUnaryOperator[] set
            && new IntUnaryOperator[1] instanceof IntUnaryOperator[] first && new IntUnaryOperator[1] instanceof IntUnaryOperator[] last && new IntToLongFunction[1] instanceof IntToLongFunction[] get
            && (add[0] = x -> g[1] < lo[x] || hi[x] < g[0] ? 0
                : (g[0] <= lo[x] && hi[x] <= g[1] ? ((mn[x] += g[2]) + (lz[x] += g[2]) == 0 ? 0 : 0)
                    : push.applyAsInt(x) + add[0].applyAsInt(2 * x) + add[0].applyAsInt(2 * x + 1) + ((mn[x] = Math.min(mn[2 * x], mn[2 * x + 1])) == 0 ? 0 : 0))) != null
            && (set[0] = x -> lo[x] == hi[x] ? ((mn[x] = g[2]) + (lz[x] = 0) == 0 ? 0 : 0)
                : push.applyAsInt(x) + set[0].applyAsInt(g[0] <= hi[2 * x] ? 2 * x : 2 * x + 1) + ((mn[x] = Math.min(mn[2 * x], mn[2 * x + 1])) == 0 ? 0 : 0)) != null
            && (get[0] = x -> lo[x] == hi[x] ? mn[x] : push.applyAsInt(x) + get[0].applyAsLong(g[0] <= hi[2 * x] ? 2 * x : 2 * x + 1)) != null
            && (first[0] = x -> hi[x] < g[0] || mn[x] >= g[2] ? -1
                : lo[x] == hi[x] ? lo[x]
                : push.applyAsInt(x) == 0 && (Integer) first[0].applyAsInt(2 * x) instanceof Integer fr && fr >= 0 ? fr : first[0].applyAsInt(2 * x + 1)) != null
            && (last[0] = x -> mn[x] >= g[2] ? -1
                : lo[x] == hi[x] ? lo[x]
                : push.applyAsInt(x) == 0 && (Integer) last[0].applyAsInt(2 * x + 1) instanceof Integer lr && lr >= 0 ? lr : last[0].applyAsInt(2 * x)) != null
            && ((LongBinaryOperator) (p, v) -> (wt[N + (int) p] = v) == 0 || IntStream.iterate((N + (int) p) >> 1, x -> x >= 1, x -> x >> 1).allMatch(x -> (wt[x] = Math.max(wt[2 * x], wt[2 * x + 1])) != 0 || true) ? 0L : 0L) instanceof LongBinaryOperator wset
            && ((LongUnaryOperator) a -> Math.max(wt[(int) a + N], IntStream.iterate((int) a + N, x -> x > 1, x -> x >> 1).mapToLong(x -> (x & 1) == 0 ? wt[x + 1] : -INF).max().orElse(-INF))) instanceof LongUnaryOperator wmax
            && ((LongToIntFunction) v -> ((IntUnaryOperator) x -> wt[2 * x + 1] >= v ? 2 * x + 1 : 2 * x).applyAsInt(IntStream.iterate(1, x -> x < N, x -> wt[2 * x + 1] >= v ? 2 * x + 1 : 2 * x).max().getAsInt()) - N) instanceof LongToIntFunction wlast
            && ((IntToLongFunction) x -> (g[0] = x) >= 0 ? get[0].applyAsLong(1) + l[x] + t[x] - 1 : 0L) instanceof IntToLongFunction E
            && ((Function<long[], Integer>) a -> (g[0] = a[0]) > Long.MIN_VALUE && (g[1] = a[1]) > Long.MIN_VALUE && (g[2] = a[2]) > Long.MIN_VALUE && add[0].applyAsInt(1) == 0 ? 0 : 0) instanceof Function<long[], Integer> ra
            && ((IntUnaryOperator) i -> (Long) (pres.isEmpty() ? 0L : E.applyAsLong(pres.last())) instanceof Long el && (Long) Math.max(el + 1, l[i]) instanceof Long s && (g[0] = i) > 0 && (g[2] = s - l[i]) >= 0
                && set[0].applyAsInt(1) == 0 && wset.applyAsLong(i, s + t[i] - 1 - el) == 0 && pres.add(i) && (ans[0] = s + t[i] - 1) > 0 ? 0 : 0) instanceof IntUnaryOperator app
            && ((LongPredicate) m -> (g[2] = m) > 0 && (Integer) last[0].applyAsInt(1) instanceof Integer L0 && wmax.applyAsLong(Math.max(L0, 0)) >= m) instanceof LongPredicate pred
            ? IntStream.rangeClosed(1, n).mapToObj(i2 -> (Long) Math.max(ans[0] + 1, l[i2]) instanceof Long s0 && s0 + t[i2] - 1 <= r[i2]
                    ? (app.applyAsInt(i2) == 0 ? "0" : "0")
                    : pres.isEmpty() ? "-1"
                    : (Long) (ans[0] + 1 - l[i2]) instanceof Long cap
                        && (Long) Stream.iterate(new long[]{1, Math.min(cap, wt[1])}, a -> pred.test((a[0] + a[1] + 1) / 2) ? new long[]{(a[0] + a[1] + 1) / 2, a[1]} : new long[]{a[0], (a[0] + a[1] + 1) / 2 - 1}).filter(a -> a[0] == a[1]).findFirst().get()[0] instanceof Long vv
                        && (Long) (Math.max(ans[0] - vv + 1, l[i2]) + t[i2] - 1) instanceof Long na && na <= r[i2] && na < ans[0]
                        && (Integer) wlast.applyAsInt(vv) instanceof Integer k && (Long) wt[N + k] instanceof Long d0
                        && (Integer) (pres.higher(k) == null ? 0 : pres.higher(k)) instanceof Integer q
                        && pres.remove(k) && wset.applyAsLong(k, -INF) == 0 && (g[0] = k) >= 0 && (g[2] = INF) > 0 && set[0].applyAsInt(1) == 0
                        && new ArrayList<Integer>() instanceof ArrayList<Integer> bd && bd.add(q)
                        && (q == 0 || Stream.iterate(new long[]{k + 1, d0}, st -> st[0] > 0, st -> (g[0] = st[0]) > 0 && (g[2] = st[1]) > 0 && (Integer) first[0].applyAsInt(1) instanceof Integer j
                                && ra.apply(new long[]{st[0], j < 0 ? i2 - 1 : j - 1, -st[1]}) == 0
                                && j >= 0 && (g[0] = j) >= 0 && (Long) get[0].applyAsLong(1) instanceof Long sj && bd.add(j) && ra.apply(new long[]{j, j, -sj}) == 0
                                ? new long[]{sj == 0 ? 0 : j + 1, sj} : new long[]{0, 0}).count() >= 0)
                        && (q == 0 || bd.stream().allMatch(x -> (Long) (pres.lower(x) == null ? 0L : E.applyAsLong(pres.lower(x))) instanceof Long ep && (Long) E.applyAsLong(x) instanceof Long ex && wset.applyAsLong(x, ex - ep) == 0 || true))
                        && app.applyAsInt(i2) == 0 ? String.valueOf(k) : "-1").collect(Collectors.joining(" ")) : "");
    }
}
