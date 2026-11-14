import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] tok && new int[]{0, 0, 0} instanceof int[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] >= 48 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0 : st[2] == 0 || (tok[st[0]++] = st[1]) >= 0 & (st[1] = 0) == 0 & (st[2] = 0) == 0).count() >= 0
            && Integer.valueOf(tok[0]) instanceof Integer n && Integer.valueOf(tok[1]) instanceof Integer m && Integer.valueOf(tok[2]) instanceof Integer s && Integer.valueOf(tok[3]) instanceof Integer t
            && new int[n + 2] instanceof int[] off && new long[m] instanceof long[] w && new Random(20240607L).longs(m).toArray() instanceof long[] h && new int[m] instanceof int[] keep
            && IntStream.range(0, m).filter(e -> (w[e] = tok[6 + 3 * e]) > 0).count() >= 0
            && IntStream.range(0, 3).filter(r -> new int[n + 1] instanceof int[] d && new int[n + 1] instanceof int[] sz && IntStream.range(0, n + 1).filter(i -> (d[i] = i) >= 0 & (sz[i] = 1) > 0).count() >= 0
                && IntStream.range(0, m).filter(e -> keep[e] == 0
                    && Integer.valueOf(IntStream.iterate(tok[4 + 3 * e], u -> d[u] != u, u -> d[u]).reduce(tok[4 + 3 * e], (a, b) -> d[b])) instanceof Integer fx
                    && Integer.valueOf(IntStream.iterate(tok[5 + 3 * e], u -> d[u] != u, u -> d[u]).reduce(tok[5 + 3 * e], (a, b) -> d[b])) instanceof Integer fy
                    && fx.intValue() != fy.intValue() && (sz[fx] < sz[fy] ? (d[fx] = fy) + (sz[fy] += sz[fx]) : (d[fy] = fx) + (sz[fx] += sz[fy])) > 0 && (keep[e] = 1) > 0).count() >= 0).count() >= 0
            && IntStream.range(0, m).filter(e -> keep[e] == 1 && ++off[tok[4 + 3 * e] + 1] > 0 & ++off[tok[5 + 3 * e] + 1] > 0).count() >= 0
            && IntStream.rangeClosed(1, n + 1).filter(i -> (off[i] += off[i - 1]) >= 0).count() >= 0
            && off.clone() instanceof int[] fill && new int[2 * m + 2] instanceof int[] adj && new int[2 * m + 2] instanceof int[] eid
            && IntStream.range(0, m).filter(e -> keep[e] == 1 && Integer.valueOf(tok[4 + 3 * e]) instanceof Integer x && Integer.valueOf(tok[5 + 3 * e]) instanceof Integer y
                && (adj[fill[x]] = y) > 0 && (eid[fill[x]++] = e) >= 0 && (adj[fill[y]] = x) > 0 && (eid[fill[y]++] = e) >= 0).count() >= 0
            && new int[n + 1] instanceof int[] path && new int[]{0} instanceof int[] pc
            && (IntToLongFunction) (re -> new int[n + 1] instanceof int[] vis && new long[n + 1] instanceof long[] sum && new int[n + 1] instanceof int[] pe && new int[n + 1] instanceof int[] par
                && new int[n + 1] instanceof int[] q && new int[]{1, 0, 0} instanceof int[] qn
                && (vis[s] = 1) > 0 && (pe[s] = -1) < 0 && (q[0] = s) >= 0 && (qn[2] = off[s]) >= 0
                && IntStream.iterate(0, i -> qn[1] < qn[0], i -> i + 1).filter(i -> qn[2] < off[q[qn[1]] + 1]
                    ? Integer.valueOf(qn[2]++) instanceof Integer k && eid[k] != re
                        && (vis[adj[k]] == 0
                            ? (vis[adj[k]] = 1) > 0 && (pe[adj[k]] = eid[k]) >= 0 && (par[adj[k]] = q[qn[1]]) > 0 && (q[qn[0]++] = adj[k]) >= 0
                            : eid[k] != pe[q[qn[1]]] && ((sum[q[qn[1]]] ^= h[eid[k]]) | 1) != 0)
                    : ++qn[1] > 0 && (qn[1] >= qn[0] || (qn[2] = off[q[qn[1]]]) >= 0)).count() >= 0
                && IntStream.iterate(qn[0] - 1, i -> i > 0, i -> i - 1).filter(i -> ((sum[par[q[i]]] ^= sum[q[i]]) | 1) != 0).count() >= 0
                ? (vis[t] == 0
                    ? (re < 0 ? -2L : (w[re] << 32) | ((long) re << 16))
                    : re < 0
                        ? (IntStream.iterate(t, v -> v != s, v -> par[v]).filter(v -> (path[pc[0]++] = pe[v]) >= 0).count() >= 0 ? -3L : -3L)
                        : IntStream.iterate(t, v -> v != s, v -> par[v]).filter(v -> sum[v] == 0).mapToLong(v -> ((w[re] + w[pe[v]]) << 32) | ((long) re << 16) | (pe[v] + 1)).min().orElse(Long.MAX_VALUE))
                : 0L) instanceof IntToLongFunction run
            && Long.valueOf(run.applyAsLong(-1)) instanceof Long r1
            ? (r1.longValue() == -2L ? "0\n0\n"
                : IntStream.range(0, pc[0]).parallel().mapToLong(pi -> run.applyAsLong(path[pi])).min() instanceof OptionalLong ob
                    && ob.getAsLong() != Long.MAX_VALUE
                    ? (ob.getAsLong() >>> 32) + "\n" + ((ob.getAsLong() & 65535) == 0 ? 1 : 2) + "\n" + (((ob.getAsLong() >>> 16) & 65535) + 1) + ((ob.getAsLong() & 65535) == 0 ? "" : " " + (ob.getAsLong() & 65535))
                    : "-1")
            : "");
    }
}
