import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] tok && new int[]{0, 0, 0} instanceof int[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] >= 48 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0 : st[2] == 0 || (tok[st[0]++] = st[1]) >= 0 & (st[1] = 0) == 0 & (st[2] = 0) == 0).count() >= 0
            ? CompletableFuture.supplyAsync((Supplier<String>) () -> Integer.valueOf(tok[0]) instanceof Integer n && Integer.valueOf(tok[1]) instanceof Integer m && Integer.valueOf(tok[2]) instanceof Integer s && Integer.valueOf(tok[3]) instanceof Integer t
                && new int[n + 1] instanceof int[] head && new int[2 * m + 2] instanceof int[] nxt && new int[2 * m + 2] instanceof int[] to && new long[m] instanceof long[] w
                && IntStream.range(0, m).filter(e -> (to[2 * e + 2] = tok[5 + 3 * e]) > 0 & (nxt[2 * e + 2] = head[tok[4 + 3 * e]]) >= 0 & (head[tok[4 + 3 * e]] = 2 * e + 2) > 0
                    & (to[2 * e + 3] = tok[4 + 3 * e]) > 0 & (nxt[2 * e + 3] = head[tok[5 + 3 * e]]) >= 0 & (head[tok[5 + 3 * e]] = 2 * e + 3) > 0 & (w[e] = tok[6 + 3 * e]) > 0).count() >= 0
                && new int[n + 1] instanceof int[] tin && new int[n + 1] instanceof int[] low && new int[n + 1] instanceof int[] par && new int[n + 1] instanceof int[] parE && new int[]{0, -1} instanceof int[] tm
                && new IntBinaryOperator[1] instanceof IntBinaryOperator[] dfs
                && (dfs[0] = (v, pe) -> (tin[v] = low[v] = ++tm[0]) > 0 && IntStream.iterate(head[v], a -> a != 0, a -> nxt[a]).filter(a -> Integer.valueOf((a >> 1) - 1) instanceof Integer id && id != tm[1] && id != pe && Integer.valueOf(to[a]) instanceof Integer u
                    && (tin[u] == 0 ? (par[u] = v) > 0 && (parE[u] = id) >= 0 && dfs[0].applyAsInt(u, id) == 0 && (low[v] = Math.min(low[v], low[u])) > 0 : (low[v] = Math.min(low[v], tin[u])) > 0)).count() >= 0 ? 0 : 1) != null
                && dfs[0].applyAsInt(s, -1) == 0
                ? (tin[t] == 0 ? "0\n0\n" : new int[n + 1] instanceof int[] path && new int[]{0} instanceof int[] pc && new long[]{Long.MAX_VALUE, -1, -1} instanceof long[] best
                    && IntStream.iterate(t, v -> v != s, v -> par[v]).filter(v -> (path[pc[0]++] = parE[v]) >= 0).count() >= 0
                    && IntStream.range(0, pc[0]).filter(pi -> Integer.valueOf(path[pi]) instanceof Integer e && (tm[1] = e) >= 0 && (tm[0] = 0) == 0
                        && IntStream.range(0, n + 1).filter(i -> (tin[i] = 0) == 0).count() >= 0 && dfs[0].applyAsInt(s, -1) == 0
                        && (tin[t] == 0 ? w[e] < best[0] && (best[0] = w[e]) > 0 && (best[1] = e) >= 0 && (best[2] = -1) == -1
                            : IntStream.iterate(t, v -> v != s, v -> par[v]).filter(v -> low[v] > tin[par[v]]).boxed().min(Comparator.comparingLong(v -> w[parE[v]])) instanceof Optional<Integer> ob
                                && ob.isPresent() && w[e] + w[parE[ob.get()]] < best[0] && (best[0] = w[e] + w[parE[ob.get()]]) > 0 && (best[1] = e) >= 0 && (best[2] = parE[ob.get()]) >= 0)).count() >= 0
                    ? (best[0] == Long.MAX_VALUE ? "-1" : best[0] + "\n" + (best[2] < 0 ? 1 : 2) + "\n" + (best[1] + 1) + (best[2] < 0 ? "" : " " + (best[2] + 1))) : "")
                : "", r -> new Thread(null, r, "t", 1L << 29).start()).join() : "");
    }
}
