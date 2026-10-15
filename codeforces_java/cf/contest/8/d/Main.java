import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new double[]{
                s.nextDouble(), s.nextDouble(), s.nextDouble(), s.nextDouble(),
                s.nextDouble(), s.nextDouble(), s.nextDouble(), s.nextDouble()
            }).ifPresent(p ->
            System.out.printf("%.10f%n",
                (Double) Math.hypot(p[2] - p[6], p[3] - p[7]) instanceof Double dAC
                && (Double) Math.hypot(p[6] - p[4], p[7] - p[5]) instanceof Double dCB
                && (Double) (dAC + dCB + p[0]) instanceof Double tA
                && (Double) (Math.hypot(p[2] - p[4], p[3] - p[5]) + p[1]) instanceof Double tB
                ? dAC + dCB <= tB
                    ? Math.min(tA, tB)
                    : ((BiFunction<double[], double[], Stream<double[]>>) (u, v) ->
                            (Double) Math.hypot(v[0] - u[0], v[1] - u[1]) instanceof Double d
                            && d > 1e-12 && d <= u[2] + v[2] + 1e-9 && d >= Math.abs(u[2] - v[2]) - 1e-9
                            && (Double) ((d * d + u[2] * u[2] - v[2] * v[2]) / (2 * d)) instanceof Double a
                            && (Double) Math.sqrt(Math.max(0, u[2] * u[2] - a * a)) instanceof Double h
                            ? Stream.of(
                                new double[]{u[0] + a * (v[0] - u[0]) / d - h * (v[1] - u[1]) / d, u[1] + a * (v[1] - u[1]) / d + h * (v[0] - u[0]) / d},
                                new double[]{u[0] + a * (v[0] - u[0]) / d + h * (v[1] - u[1]) / d, u[1] + a * (v[1] - u[1]) / d - h * (v[0] - u[0]) / d})
                            : Stream.<double[]>empty()) instanceof BiFunction<double[], double[], Stream<double[]>> cross
                        && ((DoublePredicate) x -> new double[][]{{p[2], p[3], x}, {p[4], p[5], tB - x}, {p[6], p[7], dAC + p[0] - x}} instanceof double[][] c
                            && c[0][2] >= 0 && c[1][2] >= 0 && c[2][2] >= 0
                            && Stream.concat(Arrays.stream(c).map(q -> new double[]{q[0], q[1]}),
                                Stream.of(cross.apply(c[0], c[1]), cross.apply(c[0], c[2]), cross.apply(c[1], c[2])).flatMap(z -> z))
                                .anyMatch(pt -> Arrays.stream(c).allMatch(q -> Math.hypot(pt[0] - q[0], pt[1] - q[1]) <= q[2] + 1e-9))) instanceof DoublePredicate ok
                        ? Stream.iterate(new double[]{0, Math.min(tB, dAC + p[0])}, r ->
                                ok.test((r[0] + r[1]) / 2) ? new double[]{(r[0] + r[1]) / 2, r[1]} : new double[]{r[0], (r[0] + r[1]) / 2})
                            .limit(100).reduce((a, b) -> b).get()[0]
                        : 0.0
                : 0.0)));
    }
}
