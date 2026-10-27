import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new StringTokenizer(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().collect(Collectors.joining(" ")))).ifPresent(sc ->
            System.out.println(
                Integer.valueOf(Integer.parseInt(sc.nextToken())) instanceof Integer n
                && Long.valueOf(Long.parseLong(sc.nextToken())) instanceof Long x
                && Long.valueOf(Long.parseLong(sc.nextToken())) instanceof Long y
                && Long.valueOf(Long.parseLong(sc.nextToken())) instanceof Long p
                && IntStream.range(0, n).mapToLong(i -> Long.parseLong(sc.nextToken())).toArray() instanceof long[] a
                && ((Function<Long, long[]>) t -> IntStream.iterate(62, i -> i >= 0, i -> i - 1).boxed().reduce(new long[]{1 % p, 0},
                    (st, i) -> new long[]{st[0] * st[0] % p, st[1] * ((st[0] + 1) % p) % p} instanceof long[] d
                        ? ((t >> i & 1) == 1 ? new long[]{3 * d[0] % p, (3 * d[1] + 1) % p} : d)
                        : st,
                    (u, w) -> u)) instanceof Function<Long, long[]> pg
                && ((Function<Long, long[]>) t -> IntStream.iterate(62, i -> i >= 0, i -> i - 1).boxed().reduce(new long[]{0, 1 % p},
                    (st, i) -> new long[]{st[0] * ((2 * st[1] - st[0] + p) % p) % p, (st[0] * st[0] + st[1] * st[1]) % p} instanceof long[] d
                        ? ((t >> i & 1) == 1 ? new long[]{d[1], (d[0] + d[1]) % p} : d)
                        : st,
                    (u, w) -> u)) instanceof Function<Long, long[]> fib
                ? (n == 1 ? a[0] % p
                    : pg.apply(x) instanceof long[] px
                    && fib.apply(x) instanceof long[] fx
                    && pg.apply(y) instanceof long[] py
                    && Long.valueOf(((px[0] * (Arrays.stream(a).map(q -> q % p).sum() % p) - (a[0] + a[n - 1]) % p * px[1]) % p + p) % p) instanceof Long sx
                    && Long.valueOf((fx[0] * (a[n - 2] % p) + fx[1] * (a[n - 1] % p)) % p) instanceof Long mx
                    ? ((py[0] * sx - (a[0] + mx) % p * py[1]) % p + p) % p
                    : 0L)
                : 0L));
    }
}





