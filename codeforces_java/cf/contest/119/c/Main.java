import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            Arrays.stream(new String(System.in.readAllBytes()).trim().split("\\s+")).mapToLong(Long::parseLong).toArray() instanceof long[] t
            && Integer.valueOf((int) t[0]) instanceof Integer n
            && Integer.valueOf((int) t[1]) instanceof Integer m
            && Long.valueOf(t[2]) instanceof Long k
            && IntStream.range(0, m).mapToLong(j -> t[3 + 3 * j]).toArray() instanceof long[] a
            && IntStream.range(0, m).mapToLong(j -> t[4 + 3 * j]).toArray() instanceof long[] b
            && IntStream.range(0, m).mapToLong(j -> t[5 + 3 * j]).toArray() instanceof long[] c
            && new long[n][m][101] instanceof long[][][] dp
            && ((LongBinaryOperator) (pd, xp) -> xp >= a[(int) (pd % m)] && xp <= b[(int) (pd % m)]
                ? dp[(int) (pd / m)][(int) (pd % m)][(int) (xp - a[(int) (pd % m)])] : 0L) instanceof LongBinaryOperator g
            && IntStream.range(0, m).allMatch(s -> LongStream.rangeClosed(0, b[s] - a[s]).allMatch(w -> (dp[0][s][(int) w] = a[s] + w) > 0))
            && IntStream.range(1, n).allMatch(d -> IntStream.range(0, m).allMatch(s -> LongStream.rangeClosed(0, b[s] - a[s]).allMatch(w ->
                Long.valueOf(a[s] + w) instanceof Long x
                && dp[d - 1] instanceof long[][] pv
                && Long.valueOf(x % k == 0 ? x / k : -1L) instanceof Long xd
                && Long.valueOf(IntStream.range(0, m).filter(p -> c[p] < c[s])
                    .mapToLong(p -> Math.max(
                        x - k - a[p] >= 0 && x - k - a[p] <= b[p] - a[p] ? pv[p][(int) (x - k - a[p])] : 0L,
                        xd - a[p] >= 0 && xd - a[p] <= b[p] - a[p] ? pv[p][(int) (xd - a[p])] : 0L))
                    .max().orElse(0L)) instanceof Long mx
                && (dp[d][s][(int) w] = mx > 0 ? mx + x : 0L) >= 0)))
            && Integer.valueOf(IntStream.range(0, m * 101).filter(i -> i % 101 <= b[i / 101] - a[i / 101])
                .reduce((u, v) -> dp[n - 1][v / 101][v % 101] > dp[n - 1][u / 101][u % 101] ? v : u).getAsInt()) instanceof Integer best
            ? dp[n - 1][best / 101][best % 101] <= 0 ? "NO"
                : Stream.iterate(new long[]{n - 1, best / 101, a[best / 101] + best % 101}, st -> st[0] >= 0,
                        st -> st[0] == 0 ? new long[]{-1, 0, 0}
                            : IntStream.range(0, 2 * m)
                                .filter(q -> c[q / 2] < c[(int) st[1]]
                                    && g.applyAsLong((st[0] - 1) * m + q / 2, q % 2 == 0 ? st[2] - k : st[2] % k == 0 ? st[2] / k : -1L) > 0
                                    && g.applyAsLong((st[0] - 1) * m + q / 2, q % 2 == 0 ? st[2] - k : st[2] / k)
                                        == dp[(int) st[0]][(int) st[1]][(int) (st[2] - a[(int) st[1]])] - st[2])
                                .mapToObj(q -> new long[]{st[0] - 1, q / 2, q % 2 == 0 ? st[2] - k : st[2] / k}).findFirst().get())
                    .filter(st -> st[0] >= 0).map(st -> (st[1] + 1) + " " + st[2]).toList() instanceof List<String> ls
                    ? "YES\n" + IntStream.range(0, ls.size()).mapToObj(i -> ls.get(ls.size() - 1 - i)).collect(Collectors.joining("\n"))
                    : ""
            : "NO");
    }


}
