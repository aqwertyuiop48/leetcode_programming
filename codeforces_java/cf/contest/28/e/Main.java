import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.util.concurrent.atomic.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> new double[]{s.nextDouble(), s.nextDouble()}).toArray(double[][]::new) instanceof double[][] P
            && DoubleStream.generate(s::nextDouble).limit(9).toArray() instanceof double[] w
            && Double.valueOf(w[4] / -w[8]) instanceof Double r
            && Double.valueOf(w[2] * w[7] - w[3] * w[6]) instanceof Double det
            && Arrays.stream(P).map(p -> new double[]{((p[0] - w[0]) * w[7] - (p[1] - w[1]) * w[6]) / det,
                (w[2] * (p[1] - w[1]) - w[3] * (p[0] - w[0])) / det}).toArray(double[][]::new) instanceof double[][] Q
            && ((Predicate<double[]>) c -> c[0] > -1e-9 && c[1] > -1e-9 && c[1] < r * c[0] + 1e-9) instanceof Predicate<double[]> k
            && ((BiFunction<double[][], ToDoubleFunction<double[]>, Stream<double[]>>) (e, g) -> Stream.of(new double[]{
                    e[0][0] + g.applyAsDouble(e[0]) / (g.applyAsDouble(e[0]) - g.applyAsDouble(e[1])) * (e[1][0] - e[0][0]),
                    e[0][1] + g.applyAsDouble(e[0]) / (g.applyAsDouble(e[0]) - g.applyAsDouble(e[1])) * (e[1][1] - e[0][1])})
                .filter(c -> g.applyAsDouble(e[0]) * g.applyAsDouble(e[1]) < 0 && k.test(c))) instanceof BiFunction<double[][], ToDoubleFunction<double[]>, Stream<double[]>> ix
            && (Math.hypot(w[2], w[3]) > 1e-12 ? new double[]{w[2], w[3]} : new double[]{w[6], w[7]}) instanceof double[] d
            && Double.valueOf(d[0] * d[0] + d[1] * d[1]) instanceof Double dd
            && Double.valueOf(Math.hypot(w[2], w[3]) > 1e-12 ? 1 : 0) instanceof Double al
            && Double.valueOf((w[6] * d[0] + w[7] * d[1]) / dd) instanceof Double be
            && Double.valueOf(Math.max(al, al + be * r)) instanceof Double hi
            && Double.valueOf(Math.min(al, al + be * r)) instanceof Double lo
            && (Math.abs(det) > 1e-9
                ? Stream.concat(Arrays.stream(Q).filter(k),
                    IntStream.range(0, n).boxed().flatMap(i -> new double[][]{Q[i], Q[(i + 1) % n]} instanceof double[][] e
                        ? Stream.concat(ix.apply(e, c -> c[1]), ix.apply(e, c -> c[1] - r * c[0])) : Stream.<double[]>empty()))
                : IntStream.range(0, n).boxed().flatMap(i -> new double[][]{P[i], P[(i + 1) % n]} instanceof double[][] e
                        && Double.valueOf(d[0] * (e[0][1] - w[1]) - d[1] * (e[0][0] - w[0])) instanceof Double cp
                        && Double.valueOf(d[0] * (e[1][1] - w[1]) - d[1] * (e[1][0] - w[0])) instanceof Double cq
                    ? DoubleStream.concat(
                        Math.abs(cp) < 1e-9 ? DoubleStream.of(((e[0][0] - w[0]) * d[0] + (e[0][1] - w[1]) * d[1]) / dd) : DoubleStream.empty(),
                        cp * cq < 0 ? DoubleStream.of((((e[0][0] + cp / (cp - cq) * (e[1][0] - e[0][0])) - w[0]) * d[0]
                            + ((e[0][1] + cp / (cp - cq) * (e[1][1] - e[0][1])) - w[1]) * d[1]) / dd) : DoubleStream.empty()).boxed()
                    : Stream.<Double>empty())
                    .map(sv -> sv > 1e-9 && hi > 1e-9 ? new double[]{sv / hi, be >= 0 ? r * sv / hi : 0}
                        : sv < -1e-9 && lo < -1e-9 ? new double[]{sv / lo, be > 0 ? 0 : r * sv / lo} : null)
                    .filter(Objects::nonNull)) instanceof Stream<double[]> cs
            ? cs.reduce((p1, p2) -> p1[0] < p2[0] - 1e-9 ? p1 : p2[0] < p1[0] - 1e-9 ? p2 : p1[1] >= p2[1] ? p1 : p2)
                .map(c -> String.format("%.8f %.8f", c[0], Math.max(0, (w[4] * c[0] + w[8] * c[1]) / -w[5])))
                .orElse("-1.00000000 -1.00000000")
            : ""));

    }
}




