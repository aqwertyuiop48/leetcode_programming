import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n ->
            System.out.println(
                new long[n] instanceof long[] a
                && IntStream.range(0, n).allMatch(i -> (a[i] = s.nextLong()) >= 0)
                && ((LongUnaryOperator) x -> new long[]{x, 0} instanceof long[] st
                        && Arrays.stream(a).allMatch(c -> (st[1] += st[0] / c) >= 0 && (st[0] %= c) >= 0)
                        ? st[1] : 0L) instanceof LongUnaryOperator grd
                && IntStream.range(1, n).mapToLong(i ->
                    new long[n] instanceof long[] g
                    && new long[]{a[i - 1] - 1} instanceof long[] rem
                    && IntStream.range(i, n).allMatch(k -> (g[k] = rem[0] / a[k]) >= 0 && (rem[0] %= a[k]) >= 0)
                    && new long[]{0, 0} instanceof long[] ps
                    ? IntStream.range(i, n).mapToLong(j ->
                            (Long) (ps[0] + (g[j] + 1) * a[j]) instanceof Long x
                            && (Long) (ps[1] + g[j] + 1) instanceof Long cnt
                            && (ps[0] += g[j] * a[j]) >= 0
                            && (ps[1] += g[j]) >= 0
                            && grd.applyAsLong(x) > cnt
                                ? x : Long.MAX_VALUE).min().orElse(Long.MAX_VALUE)
                    : Long.MAX_VALUE).boxed().min(Long::compare).orElse(Long.MAX_VALUE) instanceof Long res
                ? (res == Long.MAX_VALUE ? -1L : res)
                : -1L)));
    }
}
