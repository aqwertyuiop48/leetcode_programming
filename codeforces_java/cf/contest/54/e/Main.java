import java.math.BigInteger;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n ->
            System.out.println(
                IntStream.range(0, n).mapToObj(i -> new long[]{s.nextLong(), s.nextLong()}).toArray(long[][]::new) instanceof long[][] raw
                && (IntStream.range(0, n).mapToLong(i -> raw[i][0] * raw[(i + 1) % n][1] - raw[i][1] * raw[(i + 1) % n][0]).sum() < 0
                    ? IntStream.range(0, n).mapToObj(i -> raw[n - 1 - i]).toArray(long[][]::new)
                    : raw) instanceof long[][] q
                && ((ToLongFunction<long[]>) a -> a[0] * a[3] - a[1] * a[2]) instanceof ToLongFunction<long[]> cr
                && ((ToLongFunction<long[]>) a -> a[0] * a[2] + a[1] * a[3]) instanceof ToLongFunction<long[]> dt
                && ((Function<long[][], Double>) pt -> new long[2 * n + 1] instanceof long[] pre
                    && IntStream.range(0, 2 * n).allMatch(t -> (pre[t + 1] = pre[t] + cr.applyAsLong(new long[]{pt[t % n][0], pt[t % n][1], pt[(t + 1) % n][0], pt[(t + 1) % n][1]})) > Long.MIN_VALUE)
                    && new int[n] instanceof int[] jj
                    && IntStream.range(0, n).allMatch(i -> new long[]{pt[(i + 1) % n][0] - pt[i][0], pt[(i + 1) % n][1] - pt[i][1]} instanceof long[] u
                        && (jj[i] = Math.max(i + 1, i > 0 ? jj[i - 1] : 0)) > 0
                        && (jj[i] += (int) IntStream.iterate(jj[i], t -> t + 1 < i + 1 + n && dt.applyAsLong(new long[]{pt[(t + 1) % n][0] - pt[t % n][0], pt[(t + 1) % n][1] - pt[t % n][1], u[0], u[1]}) > 0, t -> t + 1).count()) > 0)
                    ? IntStream.range(0, n).mapToDouble(i -> new long[]{pt[(i + 1) % n][0] - pt[i][0], pt[(i + 1) % n][1] - pt[i][1]} instanceof long[] u
                        && new long[]{pt[jj[i] % n][0] - pt[(i + 1) % n][0], pt[jj[i] % n][1] - pt[(i + 1) % n][1]} instanceof long[] w
                        ? new BigInteger[]{BigInteger.valueOf(dt.applyAsLong(new long[]{w[0], w[1], u[0], u[1]})).multiply(BigInteger.valueOf(cr.applyAsLong(new long[]{u[0], u[1], w[0], w[1]})))
                            .subtract(BigInteger.valueOf(pre[jj[i]] - pre[i + 1] + cr.applyAsLong(new long[]{pt[jj[i] % n][0], pt[jj[i] % n][1], pt[(i + 1) % n][0], pt[(i + 1) % n][1]})).multiply(BigInteger.valueOf(u[0] * u[0] + u[1] * u[1])))} instanceof BigInteger[] nu
                            ? nu[0].doubleValue() / (2.0 * (u[0] * u[0] + u[1] * u[1]))
                            : 0.0
                        : 0.0).min().getAsDouble()
                    : 0.0) instanceof Function<long[][], Double> g
                ? String.format(Locale.US, "%.10f", Math.min(g.apply(q), g.apply(IntStream.range(0, n).mapToObj(i -> new long[]{-q[n - 1 - i][0], q[n - 1 - i][1]}).toArray(long[][]::new))))
                : "")));
    }
}
