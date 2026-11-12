
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer nm && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer nf
            && IntStream.range(0, n).mapToObj(i -> tk.nextToken()).collect(Collectors.joining()) instanceof String grid
            && IntStream.range(0, 1 + nm + nf).mapToObj(i -> new long[]{Long.parseLong(tk.nextToken()) - 1, Long.parseLong(tk.nextToken()) - 1, Long.parseLong(tk.nextToken())}).toList() instanceof List<long[]> sc
            ? Math.abs(nm - nf) != 1 ? -1L
                : (Integer) Math.max(nm, nf) instanceof Integer k
                && (nm > nf ? Stream.concat(sc.subList(1, 1 + nm).stream(), Stream.<long[]>empty()).toList() : Stream.concat(sc.subList(1, 1 + nm).stream(), Stream.of(sc.get(0))).toList()) instanceof List<long[]> ms
                && (nm > nf ? Stream.concat(sc.subList(1 + nm, 1 + nm + nf).stream(), Stream.of(sc.get(0))).toList() : sc.subList(1 + nm, 1 + nm + nf).stream().toList()) instanceof List<long[]> fs
                && (Integer) (n * m) instanceof Integer cells
                && ((Function<long[], long[]>) p -> new long[cells] instanceof long[] cost && IntStream.range(0, cells).allMatch(i -> (cost[i] = Long.MAX_VALUE) > 0)
                    && new int[cells] instanceof int[] d && IntStream.range(0, cells).allMatch(i -> (d[i] = -1) < 0) && (Integer) (int) (p[0] * m + p[1]) instanceof Integer s0
                    && (d[s0] = 0) == 0 && new ArrayDeque<Integer>(List.of(s0)) instanceof ArrayDeque<Integer> q
                    && Stream.generate(q::poll).takeWhile(Objects::nonNull).allMatch(u -> IntStream.of(u % m > 0 ? u - 1 : -1, u % m < m - 1 ? u + 1 : -1, u >= m ? u - m : -1, u + m < cells ? u + m : -1)
                        .filter(v -> v >= 0 && grid.charAt(v) == '.' && d[v] < 0).allMatch(v -> (d[v] = d[u] + 1) > 0 && q.add(v)))
                    && IntStream.range(0, cells).allMatch(i -> (cost[i] = d[i] < 0 ? Long.MAX_VALUE : d[i] * p[2]) >= 0) ? cost : null) instanceof Function<long[], long[]> bfs
                && ms.stream().map(bfs).toList() instanceof List<long[]> cm && fs.stream().map(bfs).toList() instanceof List<long[]> cf
                && (Integer) (2 * k + 2 * cells + 2) instanceof Integer nodes && (Integer) (2 * k * cells + 2 * k + cells + 10) instanceof Integer maxE
                && new int[maxE] instanceof int[] eu && new int[maxE] instanceof int[] ev && new long[maxE] instanceof long[] ew && new int[1] instanceof int[] ec
                && new int[nodes + 1] instanceof int[] start && new int[nodes] instanceof int[] fe && new int[nodes] instanceof int[] pos && new int[nodes] instanceof int[] pos2
                && new int[2 * maxE] instanceof int[] to && new int[2 * maxE] instanceof int[] rev && new long[2 * maxE] instanceof long[] wt
                && new int[2 * maxE] instanceof int[] cap && new int[2 * maxE] instanceof int[] capS && new int[nodes] instanceof int[] level && new int[nodes] instanceof int[] it && new int[nodes] instanceof int[] qu && new int[nodes] instanceof int[] path
                && new int[2] instanceof int[] qs && new int[2] instanceof int[] ds && new int[1] instanceof int[] fl && new int[1] instanceof int[] fS && new long[1] instanceof long[] tv
                && ((Function<long[], Boolean>) a -> (ev[ec[0]] = (int) a[1]) >= 0 && (eu[ec[0]] = (int) a[0]) >= 0 && (ew[ec[0]++] = a[2]) >= 0) instanceof Function<long[], Boolean> addEdge
                && IntStream.range(0, k).allMatch(i -> addEdge.apply(new long[]{0, 1 + i, 0}) && addEdge.apply(new long[]{1 + k + 2 * cells + i, nodes - 1, 0})
                    && IntStream.range(0, cells).allMatch(c -> (cm.get(i)[c] == Long.MAX_VALUE || addEdge.apply(new long[]{1 + i, 1 + k + c, cm.get(i)[c]}))
                        && (cf.get(i)[c] == Long.MAX_VALUE || addEdge.apply(new long[]{1 + k + cells + c, 1 + k + 2 * cells + i, cf.get(i)[c]}))))
                && IntStream.range(0, cells).allMatch(c -> addEdge.apply(new long[]{1 + k + c, 1 + k + cells + c, 0}))
                && IntStream.range(0, ec[0]).allMatch(j -> start[eu[j] + 1]++ >= 0 && start[ev[j] + 1]++ >= 0 && fe[eu[j]]++ >= 0)
                && IntStream.range(0, nodes).allMatch(i -> (start[i + 1] += start[i]) >= 0 && (fe[i] += start[i]) >= 0 && (pos[i] = start[i]) >= 0 && (pos2[i] = fe[i]) >= 0)
                && IntStream.range(0, ec[0]).mapToLong(j -> (ew[j] << 19) | j).sorted().toArray() instanceof long[] keys
                && Arrays.stream(keys).allMatch(key -> (Integer) (int) (key & 524287L) instanceof Integer j && (Integer) pos[eu[j]]++ instanceof Integer fa && (Integer) pos2[ev[j]]++ instanceof Integer ra && (to[fa] = ev[j]) >= 0 && (to[ra] = eu[j]) >= 0
                    && (wt[fa] = ew[j]) >= 0 && (wt[ra] = 0) == 0 && (rev[fa] = ra) >= 0 && (rev[ra] = fa) >= 0 && (capS[fa] = 1) > 0 && (capS[ra] = 0) == 0)
                && new IntBinaryOperator[2] instanceof IntBinaryOperator[] h
                && (h[0] = (a, u) -> a >= start[u + 1] ? 0 : a < fe[u] && wt[a] > tv[0] ? h[0].applyAsInt(fe[u], u)
                    : (cap[a] > 0 && level[to[a]] < 0 && (level[to[a]] = level[u] + 1) > 0 && (qu[qs[1]++] = to[a]) >= 0 ? 0 : 0) + h[0].applyAsInt(a + 1, u)) != null
                && (h[1] = (a, u) -> a >= start[u + 1] ? a : a < fe[u] && wt[a] > tv[0] ? h[1].applyAsInt(fe[u], u)
                    : cap[a] > 0 && level[to[a]] == level[u] + 1 ? a : h[1].applyAsInt(a + 1, u)) != null
                && ((LongPredicate) tt -> (tv[0] = tt) >= 0 && IntStream.range(0, 2 * ec[0]).allMatch(e -> (cap[e] = capS[e]) >= 0) && (fl[0] = fS[0]) >= 0
                    && (IntStream.range(0, 100000).allMatch(ph -> IntStream.range(0, nodes).allMatch(i -> (level[i] = -1) < 0) && (level[0] = 0) == 0 && (qu[0] = 0) == 0 && (qs[0] = 0) == 0 && (qs[1] = 1) == 1
                        && (IntStream.range(0, nodes).allMatch(z -> qs[0] < qs[1] && level[nodes - 1] < 0 && (Integer) qu[qs[0]++] instanceof Integer u && h[0].applyAsInt(start[u], u) >= 0) || true)
                        && level[nodes - 1] >= 0 && IntStream.range(0, nodes).allMatch(i -> (it[i] = start[i]) >= 0) && (ds[0] = 0) == 0 && (ds[1] = 0) == 0
                        && (IntStream.range(0, Integer.MAX_VALUE).allMatch(z -> (Integer) ds[0] instanceof Integer u
                            && (u == nodes - 1 ? IntStream.range(0, ds[1]).allMatch(i -> cap[path[i]]-- > 0 && cap[rev[path[i]]]++ >= 0) && fl[0]++ >= 0 && (ds[0] = 0) == 0 && (ds[1] = 0) == 0
                                : (Integer) h[1].applyAsInt(it[u], u) instanceof Integer e && (it[u] = e) >= 0
                                && (e >= start[u + 1] ? u != 0 && ds[1]-- > 0 && (Integer) path[ds[1]] instanceof Integer pe && (ds[0] = to[rev[pe]]) >= 0 && it[ds[0]]++ >= 0
                                    : (path[ds[1]++] = e) >= 0 && (ds[0] = to[e]) >= 0))) || true)) || true)
                    && (fl[0] == k || IntStream.range(0, 2 * ec[0]).allMatch(e -> (capS[e] = cap[e]) >= 0) && (fS[0] = fl[0]) < 0)) instanceof LongPredicate feas
                && Arrays.stream(keys).map(key -> key >> 19).distinct().toArray() instanceof long[] cand
                && ((IntUnaryOperator) z -> Arrays.binarySearch(cand, IntStream.range(0, 2 * ec[0]).filter(x -> wt[x] > 0 && cap[x] == 0).mapToLong(x -> wt[x]).max().orElse(0L))) instanceof IntUnaryOperator jump
                && new int[]{-1, cand.length - 1} instanceof int[] bs
                ? cand.length == 0 || !feas.test(cand[cand.length - 1]) ? -1L : (bs[1] = Math.min(bs[1], jump.applyAsInt(0))) >= 0 && IntStream.range(0, 21).allMatch(z -> bs[1] - bs[0] <= 1 || (Integer) ((bs[0] + bs[1]) / 2) instanceof Integer mid && (feas.test(cand[mid]) ? (bs[1] = Math.min(mid, jump.applyAsInt(0))) >= 0 : (bs[0] = mid) >= -1)) ? cand[bs[1]] : 0L : 0L : 0L);
    }
}



