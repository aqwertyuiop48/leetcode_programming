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
                && new int[nodes] instanceof int[] head && new int[2 * maxE] instanceof int[] to && new int[2 * maxE] instanceof int[] nxt && new int[2 * maxE] instanceof int[] cap
                && new int[nodes] instanceof int[] level && new int[nodes] instanceof int[] it && new int[]{0} instanceof int[] ec
                && ((IntBinaryOperator) (u, v) -> (to[ec[0]] = v) >= 0 && (cap[ec[0]] = 1) > 0 && (nxt[ec[0]] = head[u]) >= -1 && (head[u] = ec[0]++) >= 0
                    && (to[ec[0]] = u) >= 0 && (cap[ec[0]] = 0) == 0 && (nxt[ec[0]] = head[v]) >= -1 && (head[v] = ec[0]++) >= 0 ? 0 : 1) instanceof IntBinaryOperator addEdge
                && new IntBinaryOperator[1] instanceof IntBinaryOperator[] dfs
                && (dfs[0] = (u, f) -> u == nodes - 1 ? f : IntStream.iterate(it[u], e -> e >= 0, e -> nxt[e]).map(e -> (it[u] = e) >= 0 && cap[e] > 0 && level[to[e]] == level[u] + 1
                    ? (Integer) dfs[0].applyAsInt(to[e], Math.min(f, cap[e])) instanceof Integer dd && dd > 0 && (cap[e] -= dd) >= 0 && (cap[e ^ 1] += dd) > 0 ? dd : 0 : 0).filter(dd -> dd > 0).findFirst().orElse(0)) != null
                && ((LongPredicate) tt -> IntStream.range(0, nodes).allMatch(i -> (head[i] = -1) < 0) && (ec[0] = 0) == 0
                    && IntStream.range(0, k).allMatch(i -> addEdge.applyAsInt(0, 1 + i) == 0 && addEdge.applyAsInt(1 + k + 2 * cells + i, nodes - 1) == 0
                        && IntStream.range(0, cells).allMatch(c -> (cm.get(i)[c] > tt || addEdge.applyAsInt(1 + i, 1 + k + c) == 0) && (cf.get(i)[c] > tt || addEdge.applyAsInt(1 + k + cells + c, 1 + k + 2 * cells + i) == 0)))
                    && IntStream.range(0, cells).allMatch(c -> addEdge.applyAsInt(1 + k + c, 1 + k + cells + c) == 0)
                    && Stream.generate(() -> 0).takeWhile(z -> IntStream.range(0, nodes).allMatch(i -> (level[i] = -1) < 0) && (level[0] = 0) == 0 && new ArrayDeque<Integer>(List.of(0)) instanceof ArrayDeque<Integer> bq
                        && Stream.generate(bq::poll).takeWhile(Objects::nonNull).allMatch(u -> IntStream.iterate(head[u], e -> e >= 0, e -> nxt[e]).allMatch(e -> cap[e] <= 0 || level[to[e]] >= 0 || (level[to[e]] = level[u] + 1) > 0 && bq.add(to[e])))
                        && level[nodes - 1] >= 0 && IntStream.range(0, nodes).allMatch(i -> (it[i] = head[i]) >= -1))
                        .mapToInt(z -> IntStream.generate(() -> 0).map(y -> dfs[0].applyAsInt(0, 1000000)).takeWhile(f -> f > 0).sum()).sum() == k) instanceof LongPredicate feas
                && new long[]{-1, 1000000000000L} instanceof long[] bs
                ? !feas.test(bs[1]) ? -1L : IntStream.range(0, 45).allMatch(z -> (Long) ((bs[0] + bs[1]) / 2) instanceof Long mid && (feas.test(mid) ? (bs[1] = mid) >= 0 : (bs[0] = mid) >= -1)) ? bs[1] : 0L : 0L : 0L);
    }
}
