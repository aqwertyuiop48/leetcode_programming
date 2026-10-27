import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && Integer.valueOf(s.nextInt()) instanceof Integer m
            && Integer.valueOf(s.nextInt()) instanceof Integer k
            && IntStream.generate(s::nextInt).limit(n * m).toArray() instanceof int[] a
            && IntStream.range(0, k).map(i -> (s.nextInt() - 1) * m + s.nextInt() - 1).toArray() instanceof int[] t
            && Integer.valueOf((1 << k) - 1) instanceof Integer full
            && Stream.generate(() -> IntStream.generate(() -> 500_000_000).limit(n * m).toArray()).limit(1 << k).toArray(int[][]::new) instanceof int[][] dp
            && new int[1 << k][n * m] instanceof int[][] pt
            && new boolean[n * m] instanceof boolean[] mark
            && new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}} instanceof int[][] dirs
            && IntStream.range(0, k).allMatch(i -> (dp[1 << i][t[i]] = a[t[i]]) > 0)
            && IntStream.rangeClosed(1, full).allMatch(mask ->
                IntStream.range(0, n * m).allMatch(v -> IntStream.iterate((mask - 1) & mask, sub -> sub > 0, sub -> (sub - 1) & mask)
                    .allMatch(sub -> dp[sub][v] + dp[mask ^ sub][v] - a[v] < dp[mask][v]
                        ? (dp[mask][v] = dp[sub][v] + dp[mask ^ sub][v] - a[v]) > 0 && (pt[mask][v] = sub) > 0 : true))
                && new PriorityQueue<int[]>(Comparator.comparingInt(e -> e[0])) instanceof PriorityQueue<int[]> pq
                && IntStream.range(0, n * m).filter(v -> dp[mask][v] < 500_000_000).allMatch(v -> pq.add(new int[]{dp[mask][v], v}))
                && Stream.generate(pq::poll).takeWhile(Objects::nonNull).filter(e -> e[0] == dp[mask][e[1]]).allMatch(e ->
                    Arrays.stream(dirs).allMatch(d -> Integer.valueOf(e[1] / m + d[0]) instanceof Integer ni
                        && Integer.valueOf(e[1] % m + d[1]) instanceof Integer nj
                        && (ni < 0 || nj < 0 || ni >= n || nj >= m
                            || e[0] + a[ni * m + nj] >= dp[mask][ni * m + nj]
                            || ((dp[mask][ni * m + nj] = e[0] + a[ni * m + nj]) > 0 && (pt[mask][ni * m + nj] = -(e[1] + 1)) < 0 && pq.add(new int[]{dp[mask][ni * m + nj], ni * m + nj})))
                        || true)))
            && new AtomicReference<IntBinaryOperator>() instanceof AtomicReference<IntBinaryOperator> rec
            && rec.compareAndSet(null, (mk, v) -> (mark[v] = true) && pt[mk][v] > 0
                ? rec.get().applyAsInt(pt[mk][v], v) + rec.get().applyAsInt(mk ^ pt[mk][v], v)
                : pt[mk][v] < 0 ? rec.get().applyAsInt(mk, -pt[mk][v] - 1) : 0)
            && rec.get().applyAsInt(full, t[0]) >= 0
            ? dp[full][t[0]] + "\n" + IntStream.range(0, n).mapToObj(i -> IntStream.range(0, m).mapToObj(j -> mark[i * m + j] ? "X" : ".").collect(Collectors.joining())).collect(Collectors.joining("\n"))
            : "");
    }
}

