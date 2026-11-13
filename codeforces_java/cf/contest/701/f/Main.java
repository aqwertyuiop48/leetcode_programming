import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0
            ? CompletableFuture.supplyAsync(() -> Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw
                && new long[raw.length / 2 + 2] instanceof long[] t
                && new long[4] instanceof long[] st
                && IntStream.range(0, raw.length).filter(i -> (raw[i] > 47 ? (st[0] = st[0] * 10 + raw[i] - 48) + (st[1] = 1) : raw[i] == 45 ? (st[2] = 1) : st[1] == 1 ? (t[(int) st[3]++] = st[2] == 1 ? -st[0] : st[0]) + (st[0] = 0) + (st[1] = 0) + (st[2] = 0) : 0) < 0).count() >= 0
                && Integer.valueOf((int) t[0]) instanceof Integer n && Integer.valueOf((int) t[1]) instanceof Integer m
                && Integer.valueOf((int) t[2]) instanceof Integer s && Integer.valueOf((int) t[3]) instanceof Integer tv
                && IntStream.rangeClosed(0, m).map(i -> i == 0 ? 0 : (int) t[4 + 3 * (i - 1)]).toArray() instanceof int[] ex
                && IntStream.rangeClosed(0, m).map(i -> i == 0 ? 0 : (int) t[5 + 3 * (i - 1)]).toArray() instanceof int[] ey
                && IntStream.rangeClosed(0, m).mapToLong(i -> i == 0 ? 0 : t[6 + 3 * (i - 1)]).toArray() instanceof long[] ew
                && new long[]{-1} instanceof long[] pp && new int[]{0} instanceof int[] rk
                && IntStream.rangeClosed(1, m).filter(i -> ex[i] != ey[i]).boxed()
                    .sorted(Comparator.comparingLong(i -> ((long) (Math.min(ex[i], ey[i]) * 1001 + Math.max(ex[i], ey[i])) << 31) | ew[i]))
                    .filter(i -> (pp[0] == Math.min(ex[i], ey[i]) * 1001 + Math.max(ex[i], ey[i]) ? ++rk[0] : (rk[0] = 0) * 0 + (pp[0] = Math.min(ex[i], ey[i]) * 1001 + Math.max(ex[i], ey[i])) * 0) < 3)
                    .mapToInt(i -> i).toArray() instanceof int[] kept
                && new int[n + 2] instanceof int[] adjS && new int[kept.length * 2 + 1] instanceof int[] adjE && new int[n + 2] instanceof int[] cur
                && Arrays.stream(kept).filter(i -> ++adjS[ex[i] + 1] + ++adjS[ey[i] + 1] < 0).count() == 0
                && IntStream.rangeClosed(1, n + 1).filter(i -> (adjS[i] += adjS[i - 1]) < 0).count() == 0
                && IntStream.rangeClosed(0, n + 1).filter(i -> (cur[i] = adjS[i]) < 0).count() == 0
                && Arrays.stream(kept).filter(i -> (adjE[cur[ex[i]]++] = i) + (adjE[cur[ey[i]]++] = i) < 0).count() == 0
                && new boolean[n + 1] instanceof boolean[] vis && new int[n + 1] instanceof int[] pe && new int[n + 1] instanceof int[] q && new int[]{1} instanceof int[] tail
                && (vis[s] = true) && (q[0] = s) == s
                && IntStream.range(0, n).filter(qi -> qi < tail[0] && IntStream.range(adjS[q[qi]], adjS[q[qi] + 1]).filter(k -> !vis[ex[adjE[k]] ^ ey[adjE[k]] ^ q[qi]] && (vis[ex[adjE[k]] ^ ey[adjE[k]] ^ q[qi]] = true)
                    && (pe[ex[adjE[k]] ^ ey[adjE[k]] ^ q[qi]] = adjE[k]) + (q[tail[0]++] = ex[adjE[k]] ^ ey[adjE[k]] ^ q[qi]) < -5).count() < 0).count() == 0
                ? (!vis[tv] ? "0\n0"
                    : IntStream.iterate(tv, v -> v != s, v -> ex[pe[v]] ^ ey[pe[v]] ^ v).map(v -> pe[v]).toArray() instanceof int[] path
                    && new int[n + 1] instanceof int[] tin && new int[n + 1] instanceof int[] low && new int[n + 1] instanceof int[] parE && new int[]{0, 0} instanceof int[] tm
                    && new IntBinaryOperator[1] instanceof IntBinaryOperator[] dfs
                    && (dfs[0] = (v, pEdge) -> (tin[v] = low[v] = ++tm[0]) * 0 + (int) IntStream.range(adjS[v], adjS[v + 1]).filter(k -> adjE[k] != tm[1] && adjE[k] != pEdge
                        && Integer.valueOf(ex[adjE[k]] ^ ey[adjE[k]] ^ v) instanceof Integer u
                        && (tin[u] == 0 ? (parE[u] = adjE[k]) + dfs[0].applyAsInt(u, adjE[k]) + (low[v] = Math.min(low[v], low[u])) : (low[v] = Math.min(low[v], tin[u]))) < -1).count()) != null
                    && new long[]{Long.MAX_VALUE, 0, 0} instanceof long[] best
                    && Arrays.stream(path).filter(e ->
                        IntStream.rangeClosed(0, n).filter(i -> (tin[i] = 0) + (low[i] = 0) + (parE[i] = 0) > 0).count() == 0
                        && (tm[0] = 0) == 0 && (tm[1] = e) == e && dfs[0].applyAsInt(s, -1) >= 0
                        && (tin[tv] == 0
                            ? ew[e] < best[0] && (best[0] = ew[e]) > 0 && (best[1] = e) + (best[2] = 0) >= 0
                            : IntStream.iterate(tv, v -> v != s, v -> ex[parE[v]] ^ ey[parE[v]] ^ v).filter(v -> low[v] > tin[ex[parE[v]] ^ ey[parE[v]] ^ v]).map(v -> parE[v]).boxed()
                                .min(Comparator.comparingLong(b -> ew[b])) instanceof Optional<Integer> ob
                                && ob.isPresent() && ew[e] + ew[ob.get()] < best[0] && (best[0] = ew[e] + ew[ob.get()]) > 0 && (best[1] = e) + (best[2] = ob.get()) >= 0)).count() >= 0
                    ? (best[0] == Long.MAX_VALUE ? "-1" : best[0] + "\n" + (best[2] == 0 ? "1\n" + best[1] : "2\n" + best[1] + " " + best[2])) : "")
                : "",
                r -> new Thread(null, r, "t", 1L << 29).start()).join() : "");
    }
}
