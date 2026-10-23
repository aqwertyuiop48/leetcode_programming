import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk ? CompletableFuture.supplyAsync(() -> (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && IntStream.range(0, n + 1).map(i -> -1).toArray() instanceof int[] head && new int[2 * n] instanceof int[] nxt && new int[2 * n] instanceof int[] to
            && IntStream.range(0, n - 1).allMatch(i -> (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer a && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer b
                && (to[2 * i] = b) > 0 && (nxt[2 * i] = head[a]) >= -1 && (head[a] = 2 * i) >= 0 && (to[2 * i + 1] = a) > 0 && (nxt[2 * i + 1] = head[b]) >= -1 && (head[b] = 2 * i + 1) >= 0)
            && new int[n + 1] instanceof int[] par && new int[n + 1] instanceof int[] dep && new int[n + 1] instanceof int[] tin && new int[n + 1] instanceof int[] tout && new int[n] instanceof int[] ord && new int[]{0} instanceof int[] timer
            && new Object[1] instanceof Object[] ref
            && (ref[0] = (IntBinaryOperator) (v, p) -> (par[v] = p) >= 0 && (dep[v] = p == 0 ? 0 : dep[p] + 1) >= 0 && (tin[v] = timer[0]) >= 0 && (ord[timer[0]++] = v) > 0
                && IntStream.iterate(head[v], e -> e >= 0, e -> nxt[e]).allMatch(e -> to[e] == p || ((IntBinaryOperator) ref[0]).applyAsInt(to[e], v) >= 0) && (tout[v] = timer[0] - 1) >= 0 ? 0 : 0) != null
            && ((IntBinaryOperator) ref[0]).applyAsInt(1, 0) == 0
            && new int[18][n + 1] instanceof int[][] up && IntStream.rangeClosed(1, n).allMatch(v -> (up[0][v] = par[v] == 0 ? v : par[v]) > 0)
            && IntStream.range(1, 18).allMatch(j -> IntStream.rangeClosed(1, n).allMatch(v -> (up[j][v] = up[j - 1][up[j - 1][v]]) > 0))
            && new int[18][n] instanceof int[][] mn && IntStream.range(0, n).allMatch(i -> (mn[0][i] = ord[i]) > 0)
            && IntStream.range(1, 18).allMatch(k -> IntStream.rangeClosed(0, n - (1 << k)).allMatch(i -> (mn[k][i] = dep[mn[k - 1][i]] <= dep[mn[k - 1][i + (1 << (k - 1))]] ? mn[k - 1][i] : mn[k - 1][i + (1 << (k - 1))]) > 0))
            && ((IntBinaryOperator) (u, v) -> u == v ? u : par[dep[mn[(31 - Integer.numberOfLeadingZeros(Math.max(tin[u], tin[v]) - (Math.min(tin[u], tin[v]) + 1) + 1))][(Math.min(tin[u], tin[v]) + 1)]] <= dep[mn[(31 - Integer.numberOfLeadingZeros(Math.max(tin[u], tin[v]) - (Math.min(tin[u], tin[v]) + 1) + 1))][Math.max(tin[u], tin[v]) - (1 << (31 - Integer.numberOfLeadingZeros(Math.max(tin[u], tin[v]) - (Math.min(tin[u], tin[v]) + 1) + 1))) + 1]] ? mn[(31 - Integer.numberOfLeadingZeros(Math.max(tin[u], tin[v]) - (Math.min(tin[u], tin[v]) + 1) + 1))][(Math.min(tin[u], tin[v]) + 1)] : mn[(31 - Integer.numberOfLeadingZeros(Math.max(tin[u], tin[v]) - (Math.min(tin[u], tin[v]) + 1) + 1))][Math.max(tin[u], tin[v]) - (1 << (31 - Integer.numberOfLeadingZeros(Math.max(tin[u], tin[v]) - (Math.min(tin[u], tin[v]) + 1) + 1))) + 1]]) instanceof IntBinaryOperator lca
            && ((IntBinaryOperator) (u, v) -> dep[u] + dep[v] - 2 * dep[lca.applyAsInt(u, v)]) instanceof IntBinaryOperator dist
            && ((LongBinaryOperator) (x, y) -> Math.max(Math.max(x, y), Math.max(Math.max(((long) dist.applyAsInt((int) (x >> 20 & 1048575), (int) (y >> 20 & 1048575)) << 40) | ((x >> 20 & 1048575) << 20) | (y >> 20 & 1048575), ((long) dist.applyAsInt((int) (x >> 20 & 1048575), (int) (y & 1048575)) << 40) | ((x >> 20 & 1048575) << 20) | (y & 1048575)),
                Math.max(((long) dist.applyAsInt((int) (x & 1048575), (int) (y >> 20 & 1048575)) << 40) | ((x & 1048575) << 20) | (y >> 20 & 1048575), ((long) dist.applyAsInt((int) (x & 1048575), (int) (y & 1048575)) << 40) | ((x & 1048575) << 20) | (y & 1048575))))) instanceof LongBinaryOperator mg
            && new long[18][n] instanceof long[][] D && IntStream.range(0, n).allMatch(i -> (D[0][i] = ((long) ord[i] << 20) | ord[i]) > 0)
            && IntStream.range(1, 18).allMatch(k -> IntStream.rangeClosed(0, n - (1 << k)).allMatch(i -> (D[k][i] = mg.applyAsLong(D[k - 1][i], D[k - 1][i + (1 << (k - 1))])) > 0))
            && ((IntToLongFunction) q -> 0L) != null
            && ((LongBinaryOperator) (l, r) -> (Integer) (31 - Integer.numberOfLeadingZeros((int) (r - l + 1))) instanceof Integer k ? mg.applyAsLong(D[k][(int) l], D[k][(int) (r - (1 << k) + 1)]) : 0L) instanceof LongBinaryOperator rq
            && ((ToIntBiFunction<Integer, Long>) (x, e) -> Math.max(dist.applyAsInt(x, (int) (e >> 20 & 1048575)), dist.applyAsInt(x, (int) (e & 1048575)))) instanceof ToIntBiFunction<Integer, Long> far
            ? IntStream.range(0, Integer.parseInt(tk.nextToken())).mapToObj(qi -> (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer x0 && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer y0
                && (Integer) (dep[x0] - dep[lca.applyAsInt(x0, y0)] >= dep[y0] - dep[lca.applyAsInt(x0, y0)] ? x0 : y0) instanceof Integer a && (Integer) (a.equals(x0) ? y0 : x0) instanceof Integer b
                && (Integer) (dep[a] + dep[b] - 2 * dep[lca.applyAsInt(a, b)]) instanceof Integer d && (Integer) ((d - 1) / 2) instanceof Integer t && new int[]{a} instanceof int[] cur
                && IntStream.range(0, 18).allMatch(j -> (t >> j & 1) == 0 || (cur[0] = up[j][cur[0]]) > 0)
                ? String.valueOf(Math.max(Math.max(far.applyAsInt(a, rq.applyAsLong(tin[cur[0]], tout[cur[0]])), far.applyAsInt(b, rq.applyAsLong(0, tin[cur[0]] - 1))),
                    tout[cur[0]] < n - 1 ? far.applyAsInt(b, rq.applyAsLong(tout[cur[0]] + 1, n - 1)) : 0)) : "").collect(Collectors.joining("\n")) : "", r -> new Thread(null, r, "t", 1L << 29).start()).join() : "");
    }
}
