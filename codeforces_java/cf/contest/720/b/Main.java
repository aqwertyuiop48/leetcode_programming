import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            ? CompletableFuture.supplyAsync((Supplier<String>) () -> Integer.valueOf(tk.nextToken()) instanceof Integer n && Integer.valueOf(tk.nextToken()) instanceof Integer m
                && new int[m] instanceof int[] eu && new int[m] instanceof int[] ev && new int[m] instanceof int[] ec
                && IntStream.range(0, m).allMatch(i -> (eu[i] = Integer.parseInt(tk.nextToken())) > 0 && (ev[i] = Integer.parseInt(tk.nextToken())) > 0 && (ec[i] = Integer.parseInt(tk.nextToken())) > Integer.MIN_VALUE || true)
                && Arrays.stream(ec).distinct().sorted().toArray() instanceof int[] cs
                && Integer.valueOf(cs.length) instanceof Integer nc
                && IntStream.range(0, m).map(i -> Arrays.binarySearch(cs, ec[i])).toArray() instanceof int[] col
                && new int[n + 1] instanceof int[] head && new int[2 * m] instanceof int[] to && new int[2 * m] instanceof int[] nx
                && IntStream.rangeClosed(0, n).allMatch(i -> (head[i] = -1) < 0)
                && IntStream.range(0, m).allMatch(i -> (to[2 * i] = ev[i]) > 0 && (nx[2 * i] = head[eu[i]]) > -5 && (head[eu[i]] = 2 * i) >= 0
                    && (to[2 * i + 1] = eu[i]) > 0 && (nx[2 * i + 1] = head[ev[i]]) > -5 && (head[ev[i]] = 2 * i + 1) >= 0)
                && new int[n + 1] instanceof int[] depth && new int[n + 1] instanceof int[] pe && new int[n + 1] instanceof int[] pv
                && IntStream.rangeClosed(0, n).allMatch(i -> (depth[i] = -1) < 0 && (pe[i] = -1) < 0)
                && new int[m + 2] instanceof int[] cycStart && new int[m + 2] instanceof int[] colArr && new boolean[m] instanceof boolean[] inCyc && new int[2] instanceof int[] cnt
                && new AtomicReference<IntUnaryOperator>() instanceof AtomicReference<IntUnaryOperator> dfs1
                && dfs1.updateAndGet(z -> v -> IntStream.iterate(head[v], e -> e >= 0, e -> nx[e]).allMatch(e -> Integer.valueOf(e >> 1) instanceof Integer id && Integer.valueOf(to[e]) instanceof Integer w
                    && (id == pe[v] || (depth[w] < 0
                        ? (depth[w] = depth[v] + 1) > 0 && (pv[w] = v) > 0 && (pe[w] = id) >= 0 && dfs1.get().applyAsInt(w) >= 0
                        : depth[w] >= depth[v] || ((cycStart[cnt[0]] = cnt[1]) >= 0 && (colArr[cnt[1]++] = col[id]) >= 0 && (inCyc[id] = true)
                            && IntStream.iterate(v, x -> x != w, x -> pv[x]).allMatch(x -> (colArr[cnt[1]++] = col[pe[x]]) >= 0 && (inCyc[pe[x]] = true))
                            && ++cnt[0] > 0))) || true) ? 0 : 0) != null
                && (depth[1] = 0) == 0 && dfs1.get().applyAsInt(1) == 0
                && Integer.valueOf(cnt[0]) instanceof Integer kk && (cycStart[kk] = cnt[1]) >= 0
                && new boolean[nc] instanceof boolean[] safe && new int[nc] instanceof int[] d && new int[nc] instanceof int[] stamp && new int[nc] instanceof int[] stamp2
                && IntStream.range(0, nc).allMatch(i -> (stamp[i] = -1) < 0 && (stamp2[i] = -1) < 0)
                && IntStream.range(0, m).filter(e -> !inCyc[e]).allMatch(e -> safe[col[e]] = true)
                && IntStream.range(0, kk).allMatch(k -> IntStream.range(cycStart[k], cycStart[k + 1]).allMatch(p -> Integer.valueOf(colArr[p]) instanceof Integer cc
                    && (stamp[cc] == k ? (safe[cc] = true) : (stamp[cc] = k) >= 0 && ++d[cc] > 0)))
                && Integer.valueOf(2 + kk + nc) instanceof Integer nn
                && Integer.valueOf(2 * (kk + cnt[1] + nc + 2)) instanceof Integer fm
                && new int[nn] instanceof int[] fh && new int[fm] instanceof int[] fto && new int[fm] instanceof int[] fnx && new int[fm] instanceof int[] fcap && new int[]{0} instanceof int[] fec
                && IntStream.range(0, nn).allMatch(i -> (fh[i] = -1) < 0)
                && ((Predicate<int[]>) a -> (fto[fec[0]] = a[1]) >= 0 && (fcap[fec[0]] = a[2]) >= 0 && (fnx[fec[0]] = fh[a[0]]) > -5 && (fh[a[0]] = fec[0]) >= 0
                    && (fto[fec[0] + 1] = a[0]) >= 0 && (fcap[fec[0] + 1] = 0) == 0 && (fnx[fec[0] + 1] = fh[a[1]]) > -5 && (fh[a[1]] = fec[0] + 1) >= 0 && (fec[0] += 2) > 0) instanceof Predicate<int[]> add
                && IntStream.range(0, kk).allMatch(k -> add.test(new int[]{0, 2 + k, 1})
                    && IntStream.range(cycStart[k], cycStart[k + 1]).allMatch(p -> stamp2[colArr[p]] == k || ((stamp2[colArr[p]] = k) >= 0 && add.test(new int[]{2 + k, 2 + kk + colArr[p], 1}))))
                && IntStream.range(0, nc).allMatch(cx -> d[cx] == 0 || add.test(new int[]{2 + kk + cx, 1, safe[cx] ? 1000000000 : d[cx] - 1}))
                && new int[nn] instanceof int[] level && new int[nn] instanceof int[] it && new int[nn + 1] instanceof int[] qu && new int[]{0, 0} instanceof int[] qt && new long[]{0} instanceof long[] flow
                && new AtomicReference<IntBinaryOperator>() instanceof AtomicReference<IntBinaryOperator> dfs2
                && dfs2.updateAndGet(z -> (u, f) -> u == 1 ? f : new int[]{0} instanceof int[] res
                    && IntStream.iterate(it[u], e -> e >= 0, e -> fnx[e]).filter(e -> (it[u] = e) >= 0 && fcap[e] > 0 && level[fto[e]] == level[u] + 1
                        && Integer.valueOf(dfs2.get().applyAsInt(fto[e], Math.min(f, fcap[e]))) instanceof Integer dd && dd > 0
                        && (fcap[e] -= dd) >= 0 && (fcap[e ^ 1] += dd) > 0 && (res[0] = dd) > 0).findFirst().isPresent()
                    ? res[0] : ((level[u] = -1) < 0 ? 0 : 0)) != null
                && (IntStream.range(0, nn + 2).allMatch(phase ->
                    IntStream.range(0, nn).allMatch(i -> (level[i] = -1) < 0 && (it[i] = fh[i]) >= -1)
                    && (level[0] = 0) == 0 && (qu[0] = 0) == 0 && (qt[0] = 0) == 0 && (qt[1] = 1) == 1
                    && IntStream.iterate(0, i -> i < qt[1], i -> i + 1).allMatch(i -> Integer.valueOf(qu[i]) instanceof Integer u0
                        && IntStream.iterate(fh[u0], e -> e >= 0, e -> fnx[e]).allMatch(e -> fcap[e] <= 0 || level[fto[e]] >= 0
                            || ((level[fto[e]] = level[u0] + 1) >= 0 && (qu[qt[1]++] = fto[e]) >= 0)) || true)
                    && level[1] >= 0
                    && IntStream.generate(() -> dfs2.get().applyAsInt(0, 1000000000)).takeWhile(g -> g > 0).map(g -> (int) (flow[0] += g)).count() >= 0) || true)
                ? String.valueOf(nc - (kk - flow[0])) : "", r -> new Thread(null, r, "t", 1L << 29).start()).join() : "");
    }
}
