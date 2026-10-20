import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.math.*;
import java.util.concurrent.atomic.*;

public class Main {
    public static void main(String[] args) throws Exception {
        if (new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st && ((IntSupplier) () -> Integer.parseInt(st.nextToken())) instanceof IntSupplier ni && Integer.valueOf(ni.getAsInt()) instanceof Integer n && IntStream.concat(IntStream.of(0), IntStream.generate(ni).limit(n)).asLongStream().toArray() instanceof long[] a
            && IntStream.range(1, n).mapToObj(i -> new int[] {ni.getAsInt(), ni.getAsInt()}).toArray(int[][]::new) instanceof int[][] ed
            && IntStream.generate(() -> -1).limit(n + 1).toArray() instanceof int[] hd && new int[2 * n] instanceof int[] nxt && new int[2 * n] instanceof int[] to
            && IntStream.range(0, n - 1).map(i -> (to[2 * i] = ed[i][1]) + (nxt[2 * i] = hd[ed[i][0]]) + (hd[ed[i][0]] = 2 * i) + (to[2 * i + 1] = ed[i][0]) + (nxt[2 * i + 1] = hd[ed[i][1]]) + (hd[ed[i][1]] = 2 * i + 1)).summaryStatistics() != null
            && new int[n] instanceof int[] ord && new int[n + 1] instanceof int[] par && new int[] {1} instanceof int[] tail && Integer.valueOf(ord[0] = 1) != null
            && IntStream.range(0, n).map(i -> IntStream.iterate(hd[ord[i]], e -> e >= 0, e -> nxt[e]).filter(e -> to[e] != par[ord[i]]).map(e -> (par[to[e]] = ord[i]) + (ord[tail[0]++] = to[e])).sum()).summaryStatistics() != null
            && LongStream.generate(() -> Long.MAX_VALUE).limit(n + 1).toArray() instanceof long[] mn && LongStream.generate(() -> 1).limit(n + 1).toArray() instanceof long[] g && new int[n + 1] instanceof int[] cnt && new long[n + 1] instanceof long[] bs && new long[n + 1] instanceof long[] gg
            && (BinaryOperator<Long>) ((x, y) -> Long.valueOf(BigInteger.valueOf(x).gcd(BigInteger.valueOf(y)).longValue()) instanceof Long d && x / d <= 1000000000000000L / y ? x / d * y : 1000000000000000L) instanceof BinaryOperator<Long> lcm
            && IntStream.iterate(n - 1, i -> i >= 0, i -> i - 1).map(i -> Integer.valueOf(ord[i]) instanceof Integer v && (bs[v] = cnt[v] == 0 ? a[v] : mn[v] / g[v] * g[v] * cnt[v]) >= 0 && (gg[v] = cnt[v] == 0 ? 1 : g[v] > 1000000000000000L / cnt[v] ? 1000000000000000L : g[v] * cnt[v]) > 0 && (par[v] == 0 || Integer.valueOf(par[v]) instanceof Integer p && (mn[p] = Math.min(mn[p], bs[v])) >= 0 && (g[p] = lcm.apply(g[p], gg[v])) > 0 && ++cnt[p] > 0) ? 1 : 0).sum() >= 0)
            System.out.print(Arrays.stream(a).sum() - bs[1]);
    }
}
