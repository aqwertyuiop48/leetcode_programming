import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && LongStream.generate(sc::nextLong).limit(2 * n).toArray() instanceof long[] seg
            && IntStream.range(0, n).mapToLong(i -> seg[2 * i]).toArray() instanceof long[] l
            && IntStream.range(0, n).mapToLong(i -> seg[2 * i + 1]).toArray() instanceof long[] r
            && LongStream.concat(Arrays.stream(l), Arrays.stream(r)).distinct().sorted().toArray() instanceof long[] xs
            && new double[n][n + 2] instanceof double[][] res
            && IntStream.range(0, xs.length - 1).allMatch(e -> Long.valueOf(xs[e]) instanceof Long x && Long.valueOf(xs[e + 1]) instanceof Long y
                && IntStream.range(0, n).filter(i -> l[i] <= x && y <= r[i]).toArray() instanceof int[] cov
                && Integer.valueOf(cov.length) instanceof Integer m && Integer.valueOf(m + 1) instanceof Integer w
                && (m == 0 || Long.valueOf(IntStream.range(0, n).filter(i -> r[i] <= x).count()) instanceof Long off
                    && Arrays.stream(cov).mapToDouble(i -> (double) (x - l[i]) / (r[i] - l[i])).toArray() instanceof double[] pf
                    && Arrays.stream(cov).mapToDouble(i -> (double) (y - x) / (r[i] - l[i])).toArray() instanceof double[] qf
                    && Arrays.stream(cov).mapToDouble(i -> (double) (r[i] - y) / (r[i] - l[i])).toArray() instanceof double[] sf
                    && ((BiFunction<double[], int[], Boolean>) (c, td) -> IntStream.iterate(td[1] + 1, a -> a >= 0, a -> a - 1).allMatch(a -> IntStream.iterate(td[1] + 1 - a, k -> k >= 0, k -> k - 1)
                        .allMatch(k -> (c[a * w + k] = sf[td[0]] * c[a * w + k] + (a > 0 ? pf[td[0]] * c[(a - 1) * w + k] : 0) + (k > 0 ? qf[td[0]] * c[a * w + k - 1] : 0)) > -1))) instanceof BiFunction<double[], int[], Boolean> mul
                    && new AtomicReference<BiFunction<int[], double[], Boolean>>() instanceof AtomicReference<BiFunction<int[], double[], Boolean>> rec
                    && rec.getAndSet((lh, c) -> lh[1] - lh[0] == 1
                        ? Integer.valueOf(cov[lh[0]]) instanceof Integer who && new double[n + 3] instanceof double[] df
                            && IntStream.range(0, m).allMatch(a -> IntStream.range(0, m - a).allMatch(k -> c[a * w + k] == 0
                                || Double.valueOf(c[a * w + k] * qf[lh[0]] / (k + 1)) instanceof Double wt && (df[(int) (off + a + 1)] += wt) > -Double.MAX_VALUE && (df[(int) (off + a + k + 2)] -= wt) < Double.MAX_VALUE))
                            && IntStream.rangeClosed(1, n).allMatch(pl -> (res[who][pl] += (df[pl] += df[pl - 1])) > -1)
                        : Integer.valueOf((lh[0] + lh[1]) / 2) instanceof Integer mid && Integer.valueOf(m - (lh[1] - lh[0])) instanceof Integer d
                            && c.clone() instanceof double[] c1 && IntStream.range(mid, lh[1]).allMatch(t -> mul.apply(c1, new int[] {t, d + t - mid}))
                            && rec.get().apply(new int[] {lh[0], mid}, c1)
                            && c.clone() instanceof double[] c2 && IntStream.range(lh[0], mid).allMatch(t -> mul.apply(c2, new int[] {t, d + t - lh[0]}))
                            && rec.get().apply(new int[] {mid, lh[1]}, c2)) == null
                    && new double[w * w] instanceof double[] c0 && (c0[0] = 1) > 0
                    && rec.get().apply(new int[] {0, m}, c0)))
            ? Arrays.stream(res).map(row -> Arrays.stream(row, 1, n + 1).mapToObj(v -> String.format(Locale.US, "%.10f", Math.max(0, v))).collect(Collectors.joining(" "))).collect(Collectors.joining("\n")) : "");
    }
}
