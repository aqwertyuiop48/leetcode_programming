import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] v && new int[4] instanceof int[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] >= 48 ? (st[0] = st[0] * 10 + raw[i] - 48) < 0 : raw[i] == 45 ? (st[2] = 1) < 0 : i > 0 && raw[i - 1] > 32 && (v[st[3]++] = st[2] == 1 ? -st[0] : st[0]) * 0 == 0 && (st[0] = st[2] = 0) < 0).count() >= 0
            && Integer.valueOf(v[0]) instanceof Integer n && new int[n + 2] instanceof int[] off && new int[n + 2] instanceof int[] pos && new int[2 * n] instanceof int[] adj
            && IntStream.range(0, n - 1).allMatch(e -> ++off[v[1 + 2 * e] + 1] + ++off[v[2 + 2 * e] + 1] > 0)
            && IntStream.rangeClosed(1, n).allMatch(u -> (off[u + 1] += off[u]) >= 0 && (pos[u] = off[u]) >= 0)
            && IntStream.range(0, n - 1).allMatch(e -> (adj[pos[v[1 + 2 * e]]++] = v[2 + 2 * e]) > 0 && (adj[pos[v[2 + 2 * e]]++] = v[1 + 2 * e]) > 0)
            && new int[n + 1] instanceof int[] par && new int[n + 1] instanceof int[] order && new int[]{0} instanceof int[] tl && (order[0] = 1) == 1
            && IntStream.range(0, n).allMatch(t -> Integer.valueOf(order[t]) instanceof Integer u
                && IntStream.range(off[u], off[u + 1]).filter(e -> adj[e] != par[u] && (par[adj[e]] = u) > 0 && (order[++tl[0]] = adj[e]) > 0).count() >= 0)
            && new int[n + 1] instanceof int[] sz && IntStream.rangeClosed(1, n).allMatch(u -> (sz[u] = 1) > 0)
            && IntStream.range(1, n).allMatch(t -> Integer.valueOf(order[n - t]) instanceof Integer u && (sz[par[u]] += sz[u]) > 0)
            && new int[n + 1] instanceof int[] tin && new int[n + 1] instanceof int[] nxt && (nxt[1] = 1) == 1
            && IntStream.range(1, n).allMatch(t -> Integer.valueOf(order[t]) instanceof Integer u && (tin[u] = nxt[par[u]]) >= 0 && (nxt[par[u]] += sz[u]) >= 0 && (nxt[u] = tin[u] + 1) > 0)
            && new int[n] instanceof int[] P2 && new int[n] instanceof int[] S2
            && IntStream.rangeClosed(1, n).allMatch(u -> (P2[tin[u]] = tin[par[u]]) >= 0 && (S2[tin[u]] = sz[u]) > 0)
            && new int[17][] instanceof int[][] up && (up[0] = P2) != null
            && IntStream.range(1, 17).allMatch(j -> (up[j] = IntStream.range(0, n).map(x -> up[j - 1][up[j - 1][x]]).toArray()) != null)
            && ((IntBinaryOperator) (a, b) -> a <= b && b < a + S2[a] ? 1 : 0) instanceof IntBinaryOperator anc
            && ((IntBinaryOperator) (a, b) -> anc.applyAsInt(a, b) == 1 ? a : anc.applyAsInt(b, a) == 1 ? b
                : up[0][IntStream.rangeClosed(0, 16).map(j -> 16 - j).reduce(a, (x, j) -> anc.applyAsInt(up[j][x], b) == 1 ? x : up[j][x])]) instanceof IntBinaryOperator lca
            && new int[n] instanceof int[] imp && new int[n] instanceof int[] cnt && new int[2] instanceof int[] qs && new int[]{2 * n} instanceof int[] ptr && new StringBuilder() instanceof StringBuilder sb
            && IntStream.rangeClosed(1, v[2 * n - 1]).allMatch(qi -> Integer.valueOf(v[ptr[0]]) instanceof Integer k
                && IntStream.range(0, k).map(j -> tin[v[ptr[0] + 1 + j]]).sorted().toArray() instanceof int[] arr
                && (ptr[0] += k + 1) > 0
                && IntStream.concat(IntStream.of(arr), IntStream.range(0, k - 1).map(j -> lca.applyAsInt(arr[j], arr[j + 1]))).sorted().distinct().toArray() instanceof int[] U
                && Arrays.stream(arr).allMatch(x -> (imp[x] = qi) > 0)
                && Arrays.stream(U).allMatch(x -> (cnt[x] = 0) == 0)
                && (qs[0] = 0) == 0 && (qs[1] = 0) == 0
                && IntStream.range(0, U.length).map(r -> U.length - 1 - r).allMatch(i -> Integer.valueOf(U[i]) instanceof Integer u
                    && Integer.valueOf(imp[u] == qi ? (qs[0] += cnt[u]) * 0 + 1 : cnt[u] >= 2 ? ++qs[0] * 0 : cnt[u]) instanceof Integer pend
                    && (i == 0 || Integer.valueOf(lca.applyAsInt(U[i - 1], U[i])) instanceof Integer p
                        && (pend == 0 || (!(imp[u] == qi && imp[p] == qi && P2[u] == p) || (qs[1] = 1) > 0) && (cnt[p] += pend) > 0)))
                && sb.append(qs[1] == 1 ? -1 : qs[0]).append('\n') != null)
            ? sb.toString().trim() : "");
    }
}
