import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] g0
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((g0[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && Integer.valueOf(g0[0]) instanceof Integer n
            && Integer.valueOf(g0[1]) instanceof Integer m
            && new int[n] instanceof int[] deg
            && IntStream.range(0, 2 * m).allMatch(j -> deg[g0[2 + j] - 1]++ >= 0)
            && new int[n + 1] instanceof int[] st
            && IntStream.range(0, n).allMatch(i -> (st[i + 1] = st[i] + deg[i]) >= 0)
            && Arrays.copyOf(st, n) instanceof int[] pos
            && new int[2 * m] instanceof int[] adj
            && new int[2 * m] instanceof int[] eid
            && IntStream.range(0, m).allMatch(e ->
                Integer.valueOf(g0[2 + 2 * e] - 1) instanceof Integer u
                && Integer.valueOf(g0[3 + 2 * e] - 1) instanceof Integer v
                && (adj[pos[u]] = v) >= 0
                && (eid[pos[u]++] = e) >= 0
                && (adj[pos[v]] = u) >= 0
                && (eid[pos[v]++] = e) >= 0)
            && new int[n] instanceof int[] depth
            && IntStream.range(0, n).allMatch(i -> (depth[i] = -1) < 0)
            && (depth[0] = 0) == 0
            && new int[n] instanceof int[] q
            && new int[]{1} instanceof int[] tl
            && new int[n] instanceof int[] par
            && new int[n] instanceof int[] pe
            && (pe[0] = -1) < 0
            && IntStream.range(0, n).allMatch(h ->
                Integer.valueOf(q[h]) instanceof Integer v
                && (IntStream.range(st[v], st[v + 1]).allMatch(j ->
                    depth[adj[j]] >= 0
                        || ((depth[adj[j]] = depth[v] + 1) > 0
                            && (par[adj[j]] = v) >= 0
                            && (pe[adj[j]] = eid[j]) >= 0
                            && (q[tl[0]++] = adj[j]) >= 0))
                    || true))
            && new int[1] instanceof int[] ex
            && IntStream.range(0, m).allMatch(e ->
                Integer.valueOf(g0[2 + 2 * e] - 1) instanceof Integer u
                && Integer.valueOf(g0[3 + 2 * e] - 1) instanceof Integer v
                && (pe[u] == e || pe[v] == e
                    || (new int[]{u, v, 0} instanceof int[] s
                        && (IntStream.range(0, n + 1).anyMatch(x ->
                            s[0] == s[1]
                                || ((depth[s[0]] >= depth[s[1]]
                                    ? (s[2] += (deg[s[0]] >= 3 ? 1 : 0)) >= 0 && (s[0] = par[s[0]]) >= 0
                                    : (s[2] += (deg[s[1]] >= 3 ? 1 : 0)) >= 0 && (s[1] = par[s[1]]) >= 0)
                                    && false))
                            || true)
                        && (s[2] + (deg[s[0]] >= 3 ? 1 : 0) > 1 || ex[0]++ >= 0))))
            && Long.valueOf(IntStream.range(0, n).filter(i -> (deg[i] & 1) == 1).count()) instanceof Long odd
            ? (odd / 2 + ex[0]) + " " + m + "\n" : "");
    }
}
