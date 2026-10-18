import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && Integer.valueOf(sc.nextInt()) instanceof Integer m
            && Integer.valueOf(m + 2) instanceof Integer W
            && Integer.valueOf((n + 2) * W) instanceof Integer N
            && new boolean[N] instanceof boolean[] one
            && IntStream.range(0, n).allMatch(i -> sc.next() instanceof String row
                && IntStream.range(0, m).allMatch(j -> row.charAt(j) != '1' || (one[(i + 1) * W + j + 1] = true)))
            && IntStream.range(0, N).toArray() instanceof int[] par
            && new int[N] instanceof int[] sz
            && IntStream.range(0, N).allMatch(i -> (sz[i] = 1) > 0)
            && new AtomicReference<IntUnaryOperator>() instanceof AtomicReference<IntUnaryOperator> fr
            && fr.getAndSet(x -> par[x] == x ? x : fr.get().applyAsInt(par[x])) == null
            && fr.get() instanceof IntUnaryOperator find
            && IntStream.range(0, N).filter(p -> !one[p]).allMatch(p -> IntStream.of(1, W - 1, W, W + 1).allMatch(d ->
                p + d >= N || one[p + d]
                || (Integer.valueOf(find.applyAsInt(p)) instanceof Integer a
                    && Integer.valueOf(find.applyAsInt(p + d)) instanceof Integer b
                    && (a.equals(b)
                        || (sz[a] < sz[b]
                            ? (par[a] = b) >= 0 && (sz[b] += sz[a]) > 0
                            : (par[b] = a) >= 0 && (sz[a] += sz[b]) > 0)))))
            && Integer.valueOf(find.applyAsInt(0)) instanceof Integer out
            && new int[]{-W - 1, -W, -W + 1, -1, 1, W - 1, W, W + 1} instanceof int[] dirs
            && LongStream.range(0, 8L * N)
                .filter(x -> one[(int) (x >> 3)] && !one[(int) (x >> 3) + dirs[(int) (x & 7)]]
                    && find.applyAsInt((int) (x >> 3) + dirs[(int) (x & 7)]) != out)
                .map(x -> (long) find.applyAsInt((int) (x >> 3) + dirs[(int) (x & 7)]) * N + (x >> 3))
                .sorted().distinct().toArray() instanceof long[] keys
            && IntStream.range(0, keys.length).filter(i -> i == 0 || keys[i] / N != keys[i - 1] / N).toArray() instanceof int[] st
            && new int[N] instanceof int[] mk
            ? Math.max(
                IntStream.range(0, N - W - 1).anyMatch(p -> one[p] && one[p + 1] && one[p + W] && one[p + W + 1]) ? 4 : 0,
                IntStream.range(0, st.length).map(g ->
                    Integer.valueOf(st[g]) instanceof Integer s
                    && Integer.valueOf(g + 1 < st.length ? st[g + 1] : keys.length) instanceof Integer e
                    && Integer.valueOf(e - s) instanceof Integer L
                    && IntStream.range(s, e).allMatch(i -> (mk[(int) (keys[i] % N)] = g + 1) > 0)
                    && IntStream.range(s, e).allMatch(i -> Integer.valueOf((int) (keys[i] % N)) instanceof Integer p
                        && (mk[p - 1] == g + 1 ? 1 : 0) + (mk[p + 1] == g + 1 ? 1 : 0) + (mk[p - W] == g + 1 ? 1 : 0) + (mk[p + W] == g + 1 ? 1 : 0) == 2)
                    && Integer.valueOf((int) (keys[s] % N)) instanceof Integer start
                    && Stream.iterate(new int[]{-1, start},
                            q -> !(q[0] != -1 && q[1] == start),
                            q -> new int[]{q[1], IntStream.of(q[1] - 1, q[1] + 1, q[1] - W, q[1] + W)
                                .filter(z -> mk[z] == g + 1 && z != q[0]).findFirst().getAsInt()})
                        .mapToInt(q -> q[1]).toArray() instanceof int[] cyc
                    && cyc.length == L
                    && Long.valueOf(Math.abs(IntStream.range(0, L).mapToLong(i ->
                        (long) (cyc[i] / W) * (cyc[(i + 1) % L] % W) - (long) (cyc[(i + 1) % L] / W) * (cyc[i] % W)).sum())) instanceof Long area2
                    && (area2 - L) / 2 + 1 == sz[(int) (keys[s] / N)]
                    ? L : 0).max().orElse(0))
            : 0);
    }
}
