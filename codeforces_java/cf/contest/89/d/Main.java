import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            DoubleStream.generate(s::nextDouble).limit(7).toArray() instanceof double[] ds
            && (Integer) s.nextInt() instanceof Integer n
            && ((BiFunction<double[], Double, Double>) (sg, t) ->
                new double[]{ds[0] + ds[3] * t - sg[0], ds[1] + ds[4] * t - sg[1], ds[2] + ds[5] * t - sg[2]} instanceof double[] w
                && new double[]{sg[3] - sg[0], sg[4] - sg[1], sg[5] - sg[2]} instanceof double[] d
                && (Double) (d[0] * d[0] + d[1] * d[1] + d[2] * d[2]) instanceof Double l2
                && (Double) (l2 == 0 ? 0.0 : Math.max(0, Math.min(1, (w[0] * d[0] + w[1] * d[1] + w[2] * d[2]) / l2))) instanceof Double u
                ? Math.hypot(Math.hypot(w[0] - u * d[0], w[1] - u * d[1]), w[2] - u * d[2])
                : 0.0) instanceof BiFunction<double[], Double, Double> g
            && ((ToDoubleFunction<double[]>) sg ->
                (Double) ((Math.hypot(Math.hypot(ds[0] - sg[0], ds[1] - sg[1]), ds[2] - sg[2]) + Math.hypot(Math.hypot(sg[3] - sg[0], sg[4] - sg[1]), sg[5] - sg[2]))
                    / Math.max(1e-9, Math.hypot(Math.hypot(ds[3], ds[4]), ds[5])) + 1) instanceof Double top
                && new double[]{0, top} instanceof double[] lh
                && IntStream.range(0, 100).allMatch(i -> (g.apply(sg, lh[0] + (lh[1] - lh[0]) / 3) < g.apply(sg, lh[1] - (lh[1] - lh[0]) / 3)
                    ? (lh[1] = lh[1] - (lh[1] - lh[0]) / 3) : (lh[0] = lh[0] + (lh[1] - lh[0]) / 3)) >= 0)
                && g.apply(sg, lh[0]) <= sg[6]
                && new double[]{0, lh[0]} instanceof double[] bh
                && IntStream.range(0, 100).allMatch(i -> (g.apply(sg, (bh[0] + bh[1]) / 2) <= sg[6]
                    ? (bh[1] = (bh[0] + bh[1]) / 2) : (bh[0] = (bh[0] + bh[1]) / 2)) >= 0)
                ? bh[1] : Double.POSITIVE_INFINITY) instanceof ToDoubleFunction<double[]> first
            && (Double) IntStream.range(0, n).mapToDouble(i -> DoubleStream.generate(s::nextDouble).limit(4).toArray() instanceof double[] o
                && (Integer) s.nextInt() instanceof Integer cnt
                ? DoubleStream.concat(
                    DoubleStream.of(first.applyAsDouble(new double[]{o[0], o[1], o[2], o[0], o[1], o[2], ds[6] + o[3]})),
                    IntStream.range(0, cnt).mapToDouble(j -> DoubleStream.generate(s::nextDouble).limit(3).toArray() instanceof double[] pv
                        ? first.applyAsDouble(new double[]{o[0], o[1], o[2], o[0] + pv[0], o[1] + pv[1], o[2] + pv[2], ds[6]})
                        : Double.POSITIVE_INFINITY)).min().getAsDouble()
                : Double.POSITIVE_INFINITY).min().getAsDouble() instanceof Double ans
            ? ans.isInfinite() ? "-1" : String.format(Locale.US, "%.10f", ans)
            : ""));
    }
}
