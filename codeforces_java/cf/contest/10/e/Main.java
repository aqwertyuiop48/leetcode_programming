import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n ->
            System.out.println(
                IntStream.range(0, n).mapToLong(i -> s.nextLong()).boxed().sorted(Comparator.reverseOrder()).mapToLong(v -> v).distinct().toArray() instanceof long[] a
                && new long[]{Long.MAX_VALUE} instanceof long[] best
                && ((LongUnaryOperator) x -> new long[]{x, 0} instanceof long[] st
                        && Arrays.stream(a).dropWhile(c -> c > x).allMatch(c -> (st[1] += st[0] / c) >= 0 && (st[0] %= c) >= 0)
                        ? st[1] : 0L) instanceof LongUnaryOperator grd
                && IntStream.range(1, a.length).allMatch(i ->
                    new long[a.length] instanceof long[] g
                    && new long[]{a[i - 1] - 1} instanceof long[] rem
                    && IntStream.range(i, a.length).allMatch(k -> (g[k] = rem[0] / a[k]) >= 0 && (rem[0] %= a[k]) >= 0)
                    && new long[]{0, 0} instanceof long[] ps
                    && IntStream.range(i, a.length).allMatch(j ->
                        (Long) (ps[0] + (g[j] + 1) * a[j]) instanceof Long x
                        && (Long) (ps[1] + g[j] + 1) instanceof Long cnt
                        && (ps[0] += g[j] * a[j]) >= 0
                        && (ps[1] += g[j]) >= 0
                        && (x >= best[0] || grd.applyAsLong(x) <= cnt || (best[0] = x) > 0)))
                ? (best[0] == Long.MAX_VALUE ? -1L : best[0])
                : -1L)));
    }
}
