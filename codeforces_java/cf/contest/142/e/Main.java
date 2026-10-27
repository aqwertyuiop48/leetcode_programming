import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc ->
            Optional.of(IntStream.range(0, 8).mapToDouble(i -> Double.parseDouble(sc.next())).toArray()).ifPresent(v ->
                System.out.println(
                    ((ToDoubleFunction<double[]>) a ->
                        Double.valueOf((v[1] - a[1]) / v[1] * Math.hypot(v[0], v[1])) instanceof Double da
                        && Double.valueOf((v[1] - a[3]) / v[1] * Math.hypot(v[0], v[1])) instanceof Double db
                        && Double.valueOf(Math.abs(a[0] - a[2]) % (2 * Math.PI)) instanceof Double d
                        && Double.valueOf(Math.min(d, 2 * Math.PI - d) * v[0] / Math.hypot(v[0], v[1])) instanceof Double ang
                            ? Math.sqrt(Math.max(0, da * da + db * db - 2 * da * db * Math.cos(ang)))
                            : 0.0) instanceof ToDoubleFunction<double[]> lat
                    && ((ToDoubleFunction<DoubleUnaryOperator>) fn ->
                        IntStream.range(0, 720).mapToDouble(i -> fn.applyAsDouble(i * 2 * Math.PI / 720)).toArray() instanceof double[] vals
                        && IntStream.range(0, 720).boxed().min(Comparator.comparingDouble(i -> vals[i])).get() instanceof Integer bi
                            ? Math.min(vals[bi], fn.applyAsDouble(Stream.iterate(
                                    new double[]{(bi - 1) * 2 * Math.PI / 720, (bi + 1) * 2 * Math.PI / 720},
                                    a -> fn.applyAsDouble(a[0] + (a[1] - a[0]) / 3) < fn.applyAsDouble(a[1] - (a[1] - a[0]) / 3)
                                        ? new double[]{a[0], a[1] - (a[1] - a[0]) / 3}
                                        : new double[]{a[0] + (a[1] - a[0]) / 3, a[1]})
                                .limit(60).reduce((x, y) -> y).map(a -> (a[0] + a[1]) / 2).get()))
                            : 0.0) instanceof ToDoubleFunction<DoubleUnaryOperator> mn
                    && Stream.of(new double[]{v[2], v[3], v[4]}, new double[]{v[5], v[6], v[7]})
                        .sorted(Comparator.comparingDouble(p -> p[2])).toList() instanceof List<double[]> pt
                        ? String.format(Locale.US, "%.9f",
                            pt.get(1)[2] < 1e-9
                                ? Math.hypot(pt.get(0)[0] - pt.get(1)[0], pt.get(0)[1] - pt.get(1)[1])
                                : pt.get(0)[2] < 1e-9
                                    ? mn.applyAsDouble(phi ->
                                        Math.hypot(pt.get(0)[0] - v[0] * Math.cos(phi), pt.get(0)[1] - v[0] * Math.sin(phi))
                                        + lat.applyAsDouble(new double[]{phi, 0, Math.atan2(pt.get(1)[1], pt.get(1)[0]), pt.get(1)[2]}))
                                    : Math.min(
                                        lat.applyAsDouble(new double[]{Math.atan2(pt.get(0)[1], pt.get(0)[0]), pt.get(0)[2], Math.atan2(pt.get(1)[1], pt.get(1)[0]), pt.get(1)[2]}),
                                        mn.applyAsDouble(f1 ->
                                            lat.applyAsDouble(new double[]{Math.atan2(pt.get(0)[1], pt.get(0)[0]), pt.get(0)[2], f1, 0})
                                            + mn.applyAsDouble(f2 ->
                                                2 * v[0] * Math.abs(Math.sin((f1 - f2) / 2))
                                                + lat.applyAsDouble(new double[]{f2, 0, Math.atan2(pt.get(1)[1], pt.get(1)[0]), pt.get(1)[2]})))))
                        : "")));
    }
}

