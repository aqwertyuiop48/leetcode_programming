import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer n && Long.valueOf(t[1]) instanceof Long x
            && Integer.valueOf(2 + n) instanceof Integer eb && Integer.valueOf(100000000) instanceof Integer INF
            && IntStream.range(0, n).map(i -> Integer.parseInt(t[2 + i])).toArray() instanceof int[] col
            && Integer.valueOf(Arrays.stream(col).sum()) instanceof Integer B
            && new int[n + 1] instanceof int[] st
            && IntStream.range(0, n - 1).allMatch(i -> ++st[Integer.parseInt(t[eb + 3 * i])] > 0 & ++st[Integer.parseInt(t[eb + 3 * i + 1])] > 0)
            && IntStream.rangeClosed(1, n).allMatch(i -> (st[i] += st[i - 1]) >= 0)
            && Arrays.copyOf(st, n) instanceof int[] pos && new int[2 * n] instanceof int[] adj && new long[2 * n] instanceof long[] wt
            && IntStream.range(0, n - 1).allMatch(i -> Integer.valueOf(Integer.parseInt(t[eb + 3 * i]) - 1) instanceof Integer u && Integer.valueOf(Integer.parseInt(t[eb + 3 * i + 1]) - 1) instanceof Integer w
                && (wt[pos[u]] = wt[pos[w]] = Long.parseLong(t[eb + 3 * i + 2])) >= 0 && (adj[pos[u]++] = w) >= 0 && (adj[pos[w]++] = u) >= 0)
            && ((IntFunction<IntStream>) v -> IntStream.range(st[v], st[v + 1])) instanceof IntFunction<IntStream> ne
            && new long[n][n] instanceof long[][] dist
            && IntStream.range(0, n).allMatch(s -> new int[n] instanceof int[] ord && new int[n] instanceof int[] par && new int[]{1} instanceof int[] tl && (ord[0] = s) == s && (par[s] = -1) < 0
                && IntStream.range(0, n).allMatch(i -> ne.apply(ord[i]).filter(e -> adj[e] != par[ord[i]]).allMatch(e -> (par[adj[e]] = ord[i]) >= 0 && (dist[s][adj[e]] = dist[s][ord[i]] + wt[e]) >= 0 && (ord[tl[0]++] = adj[e]) >= 0)))
            && new int[n] instanceof int[] ord && new int[n] instanceof int[] par && new int[]{1} instanceof int[] tl && (par[0] = -1) < 0
            && IntStream.range(0, n).allMatch(i -> ne.apply(ord[i]).filter(e -> adj[e] != par[ord[i]]).allMatch(e -> (par[adj[e]] = ord[i]) >= 0 && (ord[tl[0]++] = adj[e]) >= 0))
            && new boolean[n][n] instanceof boolean[][] inSub && IntStream.range(0, n).allMatch(i -> (inSub[i][i] = true))
            && new int[n] instanceof int[] sz && IntStream.range(0, n).allMatch(i -> (sz[i] = 1) > 0)
            && IntStream.iterate(n - 1, i -> i > 0, i -> i - 1).allMatch(i -> (sz[par[ord[i]]] += sz[ord[i]]) > 0 && IntStream.range(0, n).allMatch(j -> (inSub[par[ord[i]]][j] |= inSub[ord[i]][j]) || true))
            && IntStream.generate(() -> INF).limit(n * (n + 2)).toArray() instanceof int[] tpl
            && new int[n][] instanceof int[][] D && new int[n][] instanceof int[][] bs
            && IntStream.iterate(n - 1, i -> i >= 0, i -> i - 1).allMatch(i -> Integer.valueOf(ord[i]) instanceof Integer v
                && Arrays.copyOf(tpl, 2 * n) instanceof int[] init
                && IntStream.range(0, n).allMatch(j -> j == v || dist[v][j] > x || (init[j] = 0) == 0)
                && (init[n + v] = 1 - col[v]) >= 0
                && new int[]{1} instanceof int[] cs && new int[][]{init} instanceof int[][] cur
                && IntStream.range(0, n).filter(j -> dist[v][j] <= x).toArray() instanceof int[] vja
                && ne.apply(v).map(e -> adj[e]).filter(u -> u != par[v]).allMatch(u -> Integer.valueOf(sz[u]) instanceof Integer tt
                    && Arrays.copyOf(tpl, (cs[0] + tt + 1) * n) instanceof int[] nw
                    && Integer.valueOf(cs[0] + 1) instanceof Integer A && Integer.valueOf(tt + 1) instanceof Integer W
                    && D[u] instanceof int[] du && bs[u] instanceof int[] bu && cur[0] instanceof int[] cr
                    && Arrays.stream(vja).allMatch(j -> Boolean.valueOf(inSub[u][j]) instanceof Boolean ins && IntStream.range(0, A * W).allMatch(id -> Integer.valueOf(id / W) instanceof Integer a && Integer.valueOf(id % W) instanceof Integer b
                        && (cr[a * n + j] >= INF || (nw[(a + b) * n + j] = Math.min(nw[(a + b) * n + j], Math.min(cr[a * n + j] + du[b * n + j], ins ? INF : cr[a * n + j] + bu[b]))) >= 0)))
                    && (cur[0] = nw) != null && (cs[0] += tt) > 0 && (D[u] = null) == null)
                && (D[v] = cur[0]) != null
                && IntStream.rangeClosed(0, sz[v]).mapToObj(b -> IntStream.range(0, n).filter(j -> inSub[v][j]).map(j -> D[v][b * n + j]).min().getAsInt()).mapToInt(b -> b).toArray() instanceof int[] bb
                && (bs[v] = bb) != null)
            ? Integer.valueOf(IntStream.range(0, n).map(j -> D[ord[0]][B * n + j]).min().getAsInt()) instanceof Integer r && r < INF ? String.valueOf(r) : "-1" : "");
    }
}
