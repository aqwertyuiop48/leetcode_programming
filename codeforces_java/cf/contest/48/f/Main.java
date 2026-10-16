import java.math.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new int[]{s.nextInt(), s.nextInt()}).ifPresent(nm ->
            Optional.of(s.nextLong()).ifPresent(W ->
                System.out.println(
                    IntStream.range(0, nm[1]).mapToLong(i -> s.nextLong()).toArray() instanceof long[] w
                    && IntStream.range(0, nm[1]).mapToLong(i -> s.nextLong()).toArray() instanceof long[] c
                    && IntStream.range(0, nm[1]).mapToLong(i -> s.nextLong()).toArray() instanceof long[] a
                    && new long[1] instanceof long[] r
                    && new BigDecimal[]{BigDecimal.ZERO} instanceof BigDecimal[] tot
                    && IntStream.range(0, nm[0]).allMatch(t -> ((r[0] = W) > 0
                        && IntStream.range(0, nm[1]).boxed()
                            .sorted((x, y) -> Long.compare((c[x] - (long) t * a[x]) * w[y], (c[y] - (long) t * a[y]) * w[x]))
                            .allMatch(i -> (tot[0] = tot[0].add(BigDecimal.valueOf(c[i] - (long) t * a[i]).multiply(BigDecimal.valueOf(Math.min(r[0], w[i])))
                                    .divide(BigDecimal.valueOf(w[i]), 30, RoundingMode.HALF_EVEN))) != null
                                && (r[0] -= Math.min(r[0], w[i])) > 0)) || true)
                    ? tot[0].setScale(15, RoundingMode.UP).toPlainString() : ""))));
    }
}




