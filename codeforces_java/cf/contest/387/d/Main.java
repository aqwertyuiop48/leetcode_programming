import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] buf && new int[1] instanceof int[] ps
            && ((IntSupplier) () -> new int[1] instanceof int[] r
                && !IntStream.iterate(0, z -> z + 1).allMatch(z -> buf[ps[0]] < '0' && ++ps[0] > 0)
                && !IntStream.iterate(0, z -> z + 1).allMatch(z -> ps[0] < buf.length && buf[ps[0]] >= '0' && (r[0] = r[0] * 10 + buf[ps[0]++] - '0') >= 0)
                ? r[0] : 0) instanceof IntSupplier nx
            && Integer.valueOf(nx.getAsInt()) instanceof Integer n && Integer.valueOf(nx.getAsInt()) instanceof Integer m
            && new boolean[n][n] instanceof boolean[][] adj
            && IntStream.range(0, m).allMatch(i -> (adj[nx.getAsInt() - 1][nx.getAsInt() - 1] = true))
            && IntStream.range(0, n).mapToObj(u -> IntStream.range(0, n).filter(v -> adj[u][v]).toArray()).toArray(int[][]::new) instanceof int[][] g
            && Integer.valueOf(Arrays.stream(g).mapToInt(a -> a.length).sum()) instanceof Integer tot
            && new int[n] instanceof int[] mt && new int[n] instanceof int[] ml && new boolean[n] instanceof boolean[] vis
            && IntStream.range(0, n).allMatch(i -> (mt[i] = -1) < 0 && (ml[i] = -1) < 0)
            && new AtomicReference<IntPredicate>() instanceof AtomicReference<IntPredicate> tr
            && tr.compareAndSet(null, u -> Arrays.stream(g[u]).anyMatch(v -> !vis[v] && (vis[v] = true) && (mt[v] < 0 || tr.get().test(mt[v])) && (mt[v] = u) >= 0 && (ml[u] = v) >= 0))
            && IntStream.range(0, n).allMatch(u -> IntStream.range(0, n).allMatch(i -> !(vis[i] = false)) && (tr.get().test(u) || true))
            && mt.clone() instanceof int[] bmt && ml.clone() instanceof int[] bml
            && Integer.valueOf((int) Arrays.stream(bml).filter(x -> x >= 0).count()) instanceof Integer m0
            ? IntStream.range(0, n).mapToLong(c -> IntStream.range(0, n).allMatch(i -> (mt[i] = bmt[i]) < n && (ml[i] = bml[i]) < n)
                && Integer.valueOf((ml[c] >= 0 ? 1 : 0) + (mt[c] >= 0 && mt[c] != c ? 1 : 0)) instanceof Integer rem
                && (ml[c] < 0 || (mt[ml[c]] = -1) < 0) && (mt[c] < 0 || (ml[mt[c]] = -1) < 0) && (ml[c] = -1) < 0 && (mt[c] = -1) < 0
                && new int[]{m0 - rem} instanceof int[] M
                && (IntStream.iterate(0, z -> z + 1).allMatch(z -> IntStream.range(0, n).allMatch(i -> !(vis[i] = false)) && (vis[c] = true)
                    && IntStream.range(0, n).filter(u -> u != c && ml[u] < 0).anyMatch(u -> tr.get().test(u)) && ++M[0] > 0) || true)
                && Integer.valueOf((adj[c][c] ? 1 : 0) + IntStream.range(0, n).filter(u -> u != c).map(u -> (adj[c][u] ? 1 : 0) + (adj[u][c] ? 1 : 0)).sum()) instanceof Integer e
                ? 3L * n - 2 + tot - 2L * e - 2L * M[0] : Long.MAX_VALUE).min().getAsLong() : "");
    }
}
