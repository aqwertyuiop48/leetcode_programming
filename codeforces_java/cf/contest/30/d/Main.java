import java.math.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc -> System.out.println(
            new int[]{sc.nextInt(), sc.nextInt()} instanceof int[] nk
            && IntStream.range(0, nk[0]).mapToDouble(j -> sc.nextDouble()).toArray() instanceof double[] xs
            && new double[]{sc.nextDouble(), sc.nextDouble()} instanceof double[] p
            && Arrays.stream(xs).sorted().toArray() instanceof double[] s
            && ((DoubleUnaryOperator) u -> Math.hypot(u - p[0], p[1])) instanceof DoubleUnaryOperator d
            && (Integer) nk[0] instanceof Integer n
            ? new BigDecimal(nk[1] > n
                ? Math.min(d.applyAsDouble(s[0]), d.applyAsDouble(s[n - 1])) + s[n - 1] - s[0]
                : (Integer) Arrays.binarySearch(s, xs[nk[1] - 1]) instanceof Integer i
                    ? (DoubleStream.concat(
                        Stream.of(
                            IntStream.concat(IntStream.rangeClosed(0, i).map(j -> i - j), IntStream.range(i + 1, n)).mapToDouble(j -> s[j]).toArray(),
                            IntStream.concat(IntStream.range(i, n), IntStream.rangeClosed(1, i).map(j -> i - j)).mapToDouble(j -> s[j]).toArray())
                        .flatMapToDouble(v -> (Double) IntStream.range(0, n - 1).mapToDouble(j -> Math.abs(v[j] - v[j + 1])).sum() instanceof Double base
                            ? DoubleStream.concat(DoubleStream.of(base + d.applyAsDouble(v[n - 1])),
                                IntStream.range(0, n - 1).mapToDouble(j -> base - Math.abs(v[j] - v[j + 1]) + (d.applyAsDouble(v[j]) + d.applyAsDouble(v[j + 1]))))
                            : DoubleStream.empty()),
                        Stream.concat(IntStream.range(i, n).mapToObj(m -> new int[]{0, m}), IntStream.rangeClosed(0, i).mapToObj(m -> new int[]{m, n - 1}))
                        .flatMapToDouble(r -> Stream.of(
                                new double[]{s[r[1]], s[i] - s[r[0]] + s[r[1]] - s[r[0]]},
                                new double[]{s[r[0]], s[r[1]] - s[i] + s[r[1]] - s[r[0]]})
                            .flatMapToDouble(ec -> r[0] == 0 && r[1] == n - 1
                                ? DoubleStream.of(ec[1] + d.applyAsDouble(ec[0]))
                                : (new double[]{r[0] == 0 ? s[r[1] + 1] : s[0], r[0] == 0 ? s[n - 1] : s[r[0] - 1]}) instanceof double[] lr
                                    ? Stream.of(new double[]{lr[0], lr[1]}, new double[]{lr[1], lr[0]})
                                        .flatMapToDouble(fg -> DoubleStream.of(
                                            ec[1] + d.applyAsDouble(ec[0]) + d.applyAsDouble(fg[0]) + lr[1] - lr[0],
                                            ec[1] + Math.abs(ec[0] - fg[0]) + lr[1] - lr[0] + d.applyAsDouble(fg[1])))
                                    : DoubleStream.empty())))
                    .toArray()) instanceof double[] cs
                    ? Arrays.stream(cs).filter(x -> x <= Arrays.stream(cs).min().getAsDouble() + 1e-9).max().getAsDouble()
                    : 0.0 : 0.0).round(new MathContext(17)).setScale(20).toPlainString()
            : ""));
    }
}

