import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] t
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((t[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && (Integer) t[0] instanceof Integer n && (Integer) t[1] instanceof Integer m
            && new int[n + 2] instanceof int[] off
            && IntStream.range(0, m).allMatch(i -> ++off[t[2 + 2 * i] + 1] > 0 && ++off[t[3 + 2 * i] + 1] > 0)
            && IntStream.rangeClosed(1, n + 1).allMatch(v -> (off[v] += off[v - 1]) >= 0)
            && off.clone() instanceof int[] fp && new int[2 * m + 1] instanceof int[] adj
            && IntStream.range(0, m).allMatch(i -> (adj[fp[t[2 + 2 * i]]++] = t[3 + 2 * i]) > 0 && (adj[fp[t[3 + 2 * i]]++] = t[2 + 2 * i]) > 0)
            && off.clone() instanceof int[] ptr
            && new int[n + 2] instanceof int[] par && new int[n + 2] instanceof int[] dep && new boolean[n + 2] instanceof boolean[] vis
            && new int[n + 2] instanceof int[] stk && new int[n + 2] instanceof int[] ord && new int[n + 2] instanceof int[] cycleOf && new int[n + 2] instanceof int[] topCycle
            && new int[]{1, 1, 0} instanceof int[] sp
            && (vis[1] = true) && (stk[0] = 1) == 1 && (ord[0] = 1) == 1
            && (IntStream.range(0, 2 * m + n + 5).allMatch(s -> sp[0] > 0
                && ((Integer) stk[sp[0] - 1] instanceof Integer v
                    ? ptr[v] < off[v + 1]
                        ? (Integer) adj[ptr[v]++] instanceof Integer u
                            ? u == par[v] ? true
                                : !vis[u] ? (vis[u] = true) && (par[u] = v) > 0 && (dep[u] = dep[v] + 1) > 0 && (stk[sp[0]++] = u) > 0 && (ord[sp[1]++] = u) > 0
                                : dep[u] > dep[v] ? true
                                : ++sp[2] > 0 && (topCycle[u] = sp[2]) > 0 && IntStream.iterate(v, x -> x != u, x -> par[x]).allMatch(x -> (cycleOf[x] = sp[2]) > 0)
                            : true
                        : --sp[0] >= 0
                    : true)) | true)
            && (Integer) (n + sp[2]) instanceof Integer N
            && new int[18][N + 1] instanceof int[][] up && new int[N + 1] instanceof int[] d && new int[N + 1] instanceof int[] cy
            && IntStream.rangeClosed(0, n).map(x -> x == 0 ? 0 : cycleOf[x] > 0 ? n + cycleOf[x] : topCycle[x] > 0 ? n + topCycle[x] : x).toArray() instanceof int[] comp
            && IntStream.range(0, n).allMatch(i -> (Integer) ord[i] instanceof Integer x && (Integer) comp[x] instanceof Integer nd && (Integer) (x == 1 ? nd : comp[par[x]]) instanceof Integer pn
                && (cycleOf[x] > 0 || (up[0][nd] = pn) > 0 && (d[nd] = x == 1 ? 0 : d[pn] + 1) >= 0 && (cy[nd] = (x == 1 ? 0 : cy[pn]) + (nd > n ? 1 : 0)) >= 0))
            && IntStream.range(1, 18).allMatch(j -> IntStream.rangeClosed(1, N).allMatch(x -> (up[j][x] = up[j - 1][up[j - 1][x]]) >= 0))
            && new long[N + 2] instanceof long[] p2 && (p2[0] = 1) == 1 && IntStream.rangeClosed(1, N + 1).allMatch(i -> (p2[i] = p2[i - 1] * 2 % 1000000007L) > 0)
            && new LongBinaryOperator[2] instanceof LongBinaryOperator[] rec
            && (rec[0] = (a, diff) -> diff == 0 ? a : rec[0].applyAsLong(up[Long.numberOfTrailingZeros(diff)][(int) a], diff & (diff - 1))) != null
            && (rec[1] = (j, pair) -> j < 0 ? pair : up[(int) j][(int) (pair >> 20)] == up[(int) j][(int) (pair & 1048575)] ? rec[1].applyAsLong(j - 1, pair)
                : rec[1].applyAsLong(j - 1, ((long) up[(int) j][(int) (pair >> 20)] << 20) | up[(int) j][(int) (pair & 1048575)])) != null
            && ((IntBinaryOperator) (a0, b0) -> (Integer) (d[a0] >= d[b0] ? a0 : b0) instanceof Integer a && (Integer) (d[a0] >= d[b0] ? b0 : a0) instanceof Integer b
                && (Long) rec[0].applyAsLong(a, d[a] - d[b]) instanceof Long a1
                ? a1 == (long) b ? b : up[0][(int) (rec[1].applyAsLong(17, (a1 << 20) | b) >> 20)] : 0) instanceof IntBinaryOperator lca
            && (Integer) t[2 + 2 * m] instanceof Integer q
            ? IntStream.range(0, q).mapToObj(i -> (Integer) t[3 + 2 * m + 2 * i] instanceof Integer x && (Integer) t[4 + 2 * m + 2 * i] instanceof Integer y && (Integer) lca.applyAsInt(comp[x], comp[y]) instanceof Integer l
                ? String.valueOf(p2[cy[comp[x]] + cy[comp[y]] - 2 * cy[l] + (l > n ? 1 : 0)]) : "").collect(Collectors.joining("\n")) : "");
    }
}
