import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] g
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((g[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && Integer.valueOf(g[0]) instanceof Integer n
            && new int[n + 2] instanceof int[] off
            && IntStream.range(0, n - 1).allMatch(e -> ++off[g[1 + 2 * e] + 1] > 0 && ++off[g[2 + 2 * e] + 1] > 0)
            && IntStream.rangeClosed(1, n + 1).allMatch(i -> (off[i] += off[i - 1]) >= 0)
            && off.clone() instanceof int[] ptr
            && new int[2 * n] instanceof int[] adj
            && IntStream.range(0, n - 1).allMatch(e ->
                (adj[ptr[g[1 + 2 * e]]++] = g[2 + 2 * e]) > 0 && (adj[ptr[g[2 + 2 * e]]++] = g[1 + 2 * e]) > 0)
            && off.clone() instanceof int[] nx
            && new int[n + 1] instanceof int[] par
            && new int[n + 1] instanceof int[] dep
            && new int[n + 1] instanceof int[] tin
            && new int[n + 1] instanceof int[] tout
            && new int[n + 1] instanceof int[] stack
            && new int[]{1, 1} instanceof int[] sp
            && (stack[0] = 1) > 0
            && IntStream.range(0, 3 * n).allMatch(step ->
                sp[0] == 0
                || Integer.valueOf(stack[sp[0] - 1]) instanceof Integer u
                && (nx[u] < off[u + 1]
                    ? Integer.valueOf(adj[nx[u]++]) instanceof Integer c
                        && (c == par[u] || ((par[c] = u) >= 0 && (dep[c] = dep[u] + 1) > 0 && (tin[c] = sp[1]++) >= 0 && (stack[sp[0]++] = c) > 0))
                    : (tout[u] = sp[1]) >= 0 && --sp[0] >= 0))
            && new int[n] instanceof int[] tour
            && IntStream.rangeClosed(1, n).allMatch(v -> (tour[tin[v]] = v) > 0)
            && IntStream.range(0, 18).mapToObj(k -> new long[n]).toArray(long[][]::new) instanceof long[][] st
            && IntStream.range(0, n).allMatch(i -> (st[0][i] = i >= 1 ? ((long) dep[par[tour[i]]] << 18) | par[tour[i]] : 0) >= 0)
            && IntStream.range(1, 18).peek(k -> Arrays.setAll(st[k], i ->
                i + (1 << (k - 1)) < n ? Math.min(st[k - 1][i], st[k - 1][i + (1 << (k - 1))]) : st[k - 1][i])).sum() > 0
            && (IntBinaryOperator) ((u, v) ->
                u == v
                    ? u
                    : new int[]{Math.min(tin[u], tin[v]) + 1, Math.max(tin[u], tin[v]), 0} instanceof int[] t
                        && (t[2] = 31 - Integer.numberOfLeadingZeros(t[1] - t[0] + 1)) >= 0
                            ? (int) (Math.min(st[t[2]][t[0]], st[t[2]][t[1] - (1 << t[2]) + 1]) & 0x3FFFF)
                            : 0) instanceof IntBinaryOperator lca
            && (IntBinaryOperator) ((a, b) -> tin[a] <= tin[b] && tin[b] < tout[a] ? 1 : 0) instanceof IntBinaryOperator anc
            && new AtomicReference<LongBinaryOperator>() instanceof AtomicReference<LongBinaryOperator> gr
            && gr.compareAndSet(null, (a, b) -> b == 0 ? a : gr.get().applyAsLong(b, a % b))
            && new AtomicReference<LongBinaryOperator>() instanceof AtomicReference<LongBinaryOperator> ir
            && ir.compareAndSet(null, (a, m) -> a == 1 ? 1 : ((1 - m * ir.get().applyAsLong(m % a, a)) / a % m + m) % m)
            && new AtomicReference<Function<long[], Long>>() instanceof AtomicReference<Function<long[], Long>> gor
            && gor.compareAndSet(null, ar ->
                ar[2] == 0
                    ? 0L
                    : ar[0] == 0
                        ? -1L
                        : 2 * ar[0] > ar[1]
                            ? gor.get().apply(new long[]{ar[1] - ar[0], ar[1], ar[1] - ar[2] - ar[3], ar[3]})
                            : (ar[2] + ar[0] - 1) / ar[0] * ar[0] <= ar[2] + ar[3]
                                ? (ar[2] + ar[0] - 1) / ar[0]
                                : gor.get().apply(new long[]{(ar[0] - ar[1] % ar[0]) % ar[0], ar[0], ar[2] % ar[0], ar[3]}) instanceof Long y
                                    ? y < 0
                                        ? -1L
                                        : Long.valueOf((long) Math.floor(((double) ar[1] * y + ar[2]) / ar[0])) instanceof Long q0
                                            && Long.valueOf(ar[1] * y + ar[2] - q0 * ar[0]) instanceof Long r0
                                            ? q0 + Math.floorDiv(r0, ar[0]) + (Math.floorMod(r0, ar[0]) > 0 ? 1 : 0)
                                            : -1L
                                    : -1L)
            && (IntFunction<long[]>) (j ->
                new int[]{g[2 * n + 4 * j], g[2 * n + 4 * j + 1], g[2 * n + 4 * j + 2], g[2 * n + 4 * j + 3], 0, 0, 0, 0} instanceof int[] w
                && (w[4] = lca.applyAsInt(w[0], w[1])) >= 0
                && (w[5] = lca.applyAsInt(w[2], w[3])) >= 0
                && (w[6] = dep[w[0]] + dep[w[1]] - 2 * dep[w[4]]) >= 0
                && (w[7] = dep[w[2]] + dep[w[3]] - 2 * dep[w[5]]) >= 0
                && (IntToLongFunction) (c ->
                    anc.applyAsInt(w[4], c) == 1 && (anc.applyAsInt(c, w[0]) == 1 || anc.applyAsInt(c, w[1]) == 1)
                    && anc.applyAsInt(w[5], c) == 1 && (anc.applyAsInt(c, w[2]) == 1 || anc.applyAsInt(c, w[3]) == 1)
                        ? ((long) (anc.applyAsInt(c, w[0]) == 1 ? dep[w[0]] - dep[c] : w[6] - dep[w[1]] + dep[c]) << 20) | c
                        : Long.MAX_VALUE) instanceof IntToLongFunction kf
                && (LongUnaryOperator) (k -> k == Long.MAX_VALUE ? -1 : k) instanceof LongUnaryOperator ng
                && new long[]{kf.applyAsLong(w[4]), kf.applyAsLong(w[5]), kf.applyAsLong(lca.applyAsInt(w[0], w[2])),
                    kf.applyAsLong(lca.applyAsInt(w[0], w[3])), kf.applyAsLong(lca.applyAsInt(w[1], w[2])),
                    kf.applyAsLong(lca.applyAsInt(w[1], w[3]))} instanceof long[] kk
                && new long[]{
                    Math.min(Math.min(Math.min(kk[0], kk[1]), Math.min(kk[2], kk[3])), Math.min(kk[4], kk[5])),
                    Math.max(Math.max(Math.max(ng.applyAsLong(kk[0]), ng.applyAsLong(kk[1])), Math.max(ng.applyAsLong(kk[2]), ng.applyAsLong(kk[3]))),
                        Math.max(ng.applyAsLong(kk[4]), ng.applyAsLong(kk[5])))} instanceof long[] mm
                && mm[1] >= 0
                && new long[]{mm[0] >> 20, mm[1] >> 20, 0, 0, 0, 0} instanceof long[] z
                && (z[2] = anc.applyAsInt((int) (mm[0] & 0xFFFFF), w[2]) == 1 ? dep[w[2]] - dep[(int) (mm[0] & 0xFFFFF)] : w[7] - dep[w[3]] + dep[(int) (mm[0] & 0xFFFFF)]) >= 0
                && (z[3] = anc.applyAsInt((int) (mm[1] & 0xFFFFF), w[2]) == 1 ? dep[w[2]] - dep[(int) (mm[1] & 0xFFFFF)] : w[7] - dep[w[3]] + dep[(int) (mm[1] & 0xFFFFF)]) >= 0
                && (z[4] = gr.get().applyAsLong(w[6], w[7])) > 0
                && (z[5] = w[7] / z[4]) > 0
                    ? new long[]{z[0], z[1] - z[0], z[2], z[1] == z[0] || z[3] > z[2] ? 1 : -1, w[6], w[7], z[4], 2L * w[6] * w[7] / z[4], z[5],
                        z[5] == 1 ? 0 : ir.get().applyAsLong((w[6] / z[4]) % z[5], z[5])}
                    : null) instanceof IntFunction<long[]> inter
            && (ToLongBiFunction<long[], Integer>) ((d, cb) ->
                new long[20] instanceof long[] w
                && (w[0] = cb % 2 == 0 ? 1 : -1) != 0
                && (w[1] = cb / 2 == 0 ? 1 : -1) != 0
                && (w[2] = w[0] * d[0]) > Long.MIN_VALUE
                && (w[3] = w[1] * d[2]) > Long.MIN_VALUE
                    ? w[0] == w[1] * d[3]
                        ? Math.floorMod(w[3] - w[2], 2 * d[6]) != 0
                            ? Long.MAX_VALUE
                            : (w[4] = Math.floorMod(w[2] + 2 * d[4] * (Math.floorMod((w[3] - w[2]) / (2 * d[6]), d[8]) * d[9] % d[8]), d[7])) >= 0
                                ? (w[0] == 1 ? Math.max(0L, w[4] + d[1] >= d[7] ? w[4] - d[7] : w[4]) : Math.max(0L, w[4] - d[1]))
                                : Long.MAX_VALUE
                        : Math.floorMod(w[2] + w[3], 2L) != 0
                            ? Long.MAX_VALUE
                            : (w[4] = Math.floorMod(Math.floorDiv(w[2] + w[3], 2L), d[6])) >= 0
                                && (w[5] = (w[2] + w[3] - 2 * w[4]) / (2 * d[6])) > Long.MIN_VALUE
                                && (w[6] = Math.floorMod(w[4] - w[2] + 2 * d[4] * (Math.floorMod(w[5], d[8]) * d[9] % d[8]), d[7])) >= 0
                                && (w[7] = Math.floorMod(d[6] - 2 * d[4] * d[9], d[7])) >= 0
                                && (w[8] = Math.floorMod((w[0] == 1 ? 0L : -d[1]) - w[6], d[7])) >= 0
                                && (w[9] = w[8] + d[1] >= d[7] ? 0L : gor.get().apply(new long[]{w[7], d[7], w[8], d[1]})) > Long.MIN_VALUE
                                    ? w[9] < 0 ? Long.MAX_VALUE : w[4] + d[6] * w[9]
                                    : Long.MAX_VALUE
                    : Long.MAX_VALUE) instanceof ToLongBiFunction<long[], Integer> comb
            && Integer.valueOf(g[1 + 2 * (n - 1)]) instanceof Integer tq
            ? IntStream.range(0, tq).mapToLong(j ->
                inter.apply(j) instanceof long[] dd
                && Long.valueOf(IntStream.range(0, 4).mapToLong(cb -> comb.applyAsLong(dd, cb)).min().getAsLong()) instanceof Long best
                    ? best == Long.MAX_VALUE ? -1L : best
                    : -1L)
                .mapToObj(String::valueOf).collect(Collectors.joining("\n"))
            : "");
    }
}
