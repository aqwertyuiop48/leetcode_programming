import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(System.in.readAllBytes() instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] v && new int[3] instanceof int[] st && IntStream.rangeClosed(0, raw.length).allMatch(i -> (i < raw.length && raw[i] >= 48 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 && (st[2] = 1) > 0 : st[2] > 0 && (v[st[0]++] = st[1]) >= 0 && (st[1] = st[2] = 0) == 0) || true)
                && (Integer) v[0] instanceof Integer n && (Integer) v[1] instanceof Integer m
                && new int[n][n] instanceof int[][] cnt && new boolean[n][n] instanceof boolean[][] br && new boolean[n][n] instanceof boolean[][] ta && new int[n] instanceof int[] tin && new int[n] instanceof int[] low && new int[1] instanceof int[] tm
                && IntStream.range(0, m).allMatch(e -> (Integer) (v[2 + 2 * e] - 1) instanceof Integer a && (Integer) (v[3 + 2 * e] - 1) instanceof Integer b && (a.equals(b) || cnt[a][b]++ >= 0 && cnt[b][a]++ >= 0))
                && new AtomicReference<IntBinaryOperator>() instanceof AtomicReference<IntBinaryOperator> dr
                && dr.getAndSet((u, par) -> (tin[u] = low[u] = ++tm[0]) > 0 && IntStream.range(0, n).filter(w -> cnt[u][w] > 0 && !(w == par && cnt[u][w] == 1)).allMatch(w -> tin[w] != 0 ? (low[u] = Math.min(low[u], tin[w])) > 0 : dr.get().applyAsInt(w, u) >= 0 && (low[u] = Math.min(low[u], low[w])) > 0 && (low[w] > tin[u] ? (br[u][w] = br[w][u] = true) : true)) ? 1 : 0) == null
                && dr.get().applyAsInt(0, -1) >= 0
                && new int[n] instanceof int[] p && IntStream.range(0, n).allMatch(i -> (p[i] = i) >= 0)
                && new AtomicReference<IntUnaryOperator>() instanceof AtomicReference<IntUnaryOperator> fr
                && fr.getAndSet(x -> p[x] == x ? x : (p[x] = fr.get().applyAsInt(p[x]))) == null
                && IntStream.range(0, n).allMatch(u -> IntStream.range(0, n).allMatch(w -> cnt[u][w] == 0 || br[u][w] || (Integer) fr.get().applyAsInt(u) instanceof Integer ru && (p[ru] = fr.get().applyAsInt(w)) >= 0))
                && new int[n] instanceof int[] sz && IntStream.range(0, n).allMatch(i -> sz[fr.get().applyAsInt(i)]++ >= 0)
                && IntStream.range(0, n).allMatch(u -> IntStream.range(0, n).allMatch(w -> !br[u][w] || (ta[fr.get().applyAsInt(u)][fr.get().applyAsInt(w)] = true)))
                && (Integer) IntStream.range(0, n).map(i -> sz[i] * sz[i]).sum() instanceof Integer s2
                && new int[n] instanceof int[] anc && new int[n] instanceof int[] sub && new int[1] instanceof int[] acc && new boolean[n + 1] instanceof boolean[] dp
                && new AtomicReference<IntBinaryOperator>() instanceof AtomicReference<IntBinaryOperator> gr
                && gr.getAndSet((a, par) -> (acc[0] += sz[a] * anc[a]) >= 0 && (sub[a] = sz[a] + IntStream.range(0, n).filter(b -> ta[a][b] && b != par).map(b -> (anc[b] = anc[a] + sz[a]) >= 0 ? gr.get().applyAsInt(b, a) : 0).sum()) > 0 ? sub[a] : 0) == null
                && (Long) IntStream.range(0, n).filter(r -> fr.get().applyAsInt(r) == r).mapToLong(r -> (acc[0] = 0) == 0 && (anc[r] = 0) == 0 && gr.get().applyAsInt(r, -1) > 0 && IntStream.range(0, n + 1).allMatch(i -> (dp[i] = i == 0) || true)
                        && IntStream.range(0, n).filter(b -> ta[r][b]).allMatch(b -> (Integer) sub[b] instanceof Integer sb && IntStream.iterate(n, s -> s >= sb, s -> s - 1).allMatch(s -> (dp[s] |= dp[s - sb]) || true))
                        && (Integer) IntStream.rangeClosed(0, n - sz[r]).filter(s -> dp[s]).map(s -> s * (n - sz[r] - s)).max().orElse(0) instanceof Integer bst ? (long) s2 + acc[0] + bst : 0L).max().getAsLong() instanceof Long ans ? ans : "");
    }
}
