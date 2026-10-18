import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            Arrays.stream(new String(System.in.readAllBytes()).trim().split("[ \r\n]+")).mapToLong(Long::parseLong).toArray() instanceof long[] t
            && Integer.valueOf((int) t[0]) instanceof Integer n
            && Integer.valueOf((int) t[1]) instanceof Integer m
            && Long.valueOf(t[2]) instanceof Long k
            && IntStream.range(0, m).mapToLong(j -> t[3 + 3 * j]).toArray() instanceof long[] a
            && IntStream.range(0, m).mapToLong(j -> t[4 + 3 * j]).toArray() instanceof long[] b
            && IntStream.range(0, m).mapToLong(j -> t[5 + 3 * j]).toArray() instanceof long[] c
            && IntStream.range(0, n).mapToObj(d -> IntStream.range(0, m).mapToObj(s -> LongStream.generate(() -> -1L).limit(101).toArray()).toArray(long[][]::new)).toArray(long[][][]::new) instanceof long[][][] dp
            && new int[n][m][101] instanceof int[][][] par
            && IntStream.range(0, m).allMatch(s -> LongStream.rangeClosed(0, b[s] - a[s]).allMatch(w -> (dp[0][s][(int) w] = a[s] + w) >= 0))
            && IntStream.range(1, n).allMatch(d -> IntStream.range(0, m).allMatch(s -> LongStream.rangeClosed(0, b[s] - a[s]).allMatch(w ->
                (Long) (a[s] + w) instanceof Long x
                && (IntStream.range(0, m).filter(p -> c[p] < c[s]).boxed().flatMap(p ->
                        LongStream.of(x - k, x % k == 0 ? x / k : -1)
                            .filter(xp -> xp >= a[p] && xp <= b[p] && dp[d - 1][p][(int) (xp - a[p])] >= 0)
                            .mapToObj(xp -> new long[]{dp[d - 1][p][(int) (xp - a[p])] + x, p * 101 + (xp - a[p])}))
                    .max(Comparator.comparingLong(r -> r[0]))
                    .map(r -> (dp[d][s][(int) w] = r[0]) >= 0 && (par[d][s][(int) w] = (int) r[1]) >= 0)
                    .isPresent() || true))))
            && IntStream.range(0, m * 101).boxed()
                .filter(i -> i % 101 <= b[i / 101] - a[i / 101])
                .max(Comparator.comparingLong(i -> dp[n - 1][i / 101][i % 101])).get() instanceof Integer best
            ? dp[n - 1][best / 101][best % 101] < 0 ? "NO"
                : Stream.iterate(new int[]{n - 1, best / 101, best % 101}, st -> st[0] >= 0,
                        st -> new int[]{st[0] - 1, par[st[0]][st[1]][st[2]] / 101, par[st[0]][st[1]][st[2]] % 101})
                    .map(st -> (st[1] + 1) + " " + (a[st[1]] + st[2])).toList() instanceof List<String> ls
                    ? "YES\n" + IntStream.range(0, ls.size()).mapToObj(i -> ls.get(ls.size() - 1 - i)).collect(Collectors.joining("\n"))
                    : ""
            : "NO");
    }
}
