import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            System.out.printf("%.4f%n",
                DoubleStream.generate(s::nextDouble).limit(4).toArray() instanceof double[] ab
                && Integer.valueOf(s.nextInt()) instanceof Integer n
                && IntStream.range(0, n).mapToObj(i -> new double[]{s.nextDouble(), s.nextDouble(), s.nextDouble(), s.nextDouble()}).toList() instanceof List<double[]> raw
                && Integer.valueOf(s.nextInt()) instanceof Integer k
                && Double.valueOf(Math.hypot(ab[2] - ab[0], ab[3] - ab[1])) instanceof Double len
                && Double.valueOf((ab[2] - ab[0]) / len) instanceof Double ux
                && Double.valueOf((ab[3] - ab[1]) / len) instanceof Double uy
                && raw.stream().map(t -> new double[]{
                        (t[0] - ab[0]) * ux + (t[1] - ab[1]) * uy,
                        (ab[1] - t[1]) * ux - (ab[0] - t[0]) * uy,
                        t[2] - Math.atan2(uy, ux),
                        t[3]}).toList() instanceof List<double[]> tk
                && ((BiPredicate<double[], Double>) (t, v) ->
                    Double.valueOf(t[3] / v) instanceof Double c
                    && Double.valueOf(Math.sqrt(Math.abs(t[1]) / c - t[1] * t[1])) instanceof Double r
                    && IntStream.rangeClosed(-2, 2).anyMatch(mm ->
                        Double.valueOf(t[2] + 2 * Math.PI * mm) instanceof Double g
                        && DoubleStream.of(0, len, Math.sin(g) * t[1] > 0 ? t[0] + t[1] * Math.cos(g) / Math.sin(g) : -1, t[0] - r, t[0] + r)
                            .filter(p -> p >= 0 && p <= len)
                            .anyMatch(p -> Math.abs(Math.atan2(t[1], p - t[0]) - g) - c * p <= 1e-12))) instanceof BiPredicate<double[], Double> hit
                && new double[]{0, 1e7} instanceof double[] b
                && IntStream.range(0, 70).allMatch(i ->
                    Double.valueOf((b[0] + b[1]) / 2) instanceof Double mid
                    && (tk.stream().filter(t -> hit.test(t, mid)).count() <= k ? (b[1] = mid) : (b[0] = mid)) >= 0)
                ? b[1]
                : 0.0));
    }
}


