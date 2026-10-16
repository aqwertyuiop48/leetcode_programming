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
                    : p[0] == 0 || p[1] == 0
                        ? (p[0] == 0 ? new double[]{p[6], p[7], dAC} : new double[]{p[4], p[5], Math.hypot(p[2] - p[4], p[3] - p[5])}) instanceof double[] ray
                            ? Stream.iterate(new double[]{0, ray[2]}, r ->
                                    (r[0] + r[1]) / 2 + Math.hypot(p[2] + (ray[0] - p[2]) * (r[0] + r[1]) / 2 / ray[2] - p[4], p[3] + (ray[1] - p[3]) * (r[0] + r[1]) / 2 / ray[2] - p[5]) <= tB + 1e-9
                                    && (r[0] + r[1]) / 2 + Math.hypot(p[2] + (ray[0] - p[2]) * (r[0] + r[1]) / 2 / ray[2] - p[6], p[3] + (ray[1] - p[3]) * (r[0] + r[1]) / 2 / ray[2] - p[7]) <= dAC + p[0] + 1e-9
                                        ? new double[]{(r[0] + r[1]) / 2, r[1]} : new double[]{r[0], (r[0] + r[1]) / 2})
                                .limit(100).reduce((a, b) -> b).get()[0]
                            : 0.0
                        : ((Function<double[], Double>) q ->
                                Math.max(Math.hypot(q[1] - p[2], q[2] - p[3]) - q[0],
                                    Math.max(Math.hypot(q[1] - p[4], q[2] - p[5]) - (tB - q[0]), Math.hypot(q[1] - p[6], q[2] - p[7]) - (dAC + p[0] - q[0])))) instanceof Function<double[], Double> phi
                            && ((Function<double[], Double>) q -> Stream.iterate(new double[]{-400, 400}, r ->
                                    phi.apply(new double[]{q[0], q[1], r[0] + (r[1] - r[0]) / 3}) < phi.apply(new double[]{q[0], q[1], r[1] - (r[1] - r[0]) / 3})
                                        ? new double[]{r[0], r[1] - (r[1] - r[0]) / 3}
                                        : new double[]{r[0] + (r[1] - r[0]) / 3, r[1]})
                                .limit(100).reduce((a, b) -> b).map(r -> phi.apply(new double[]{q[0], q[1], (r[0] + r[1]) / 2})).get()) instanceof Function<double[], Double> inner
                            && ((DoubleUnaryOperator) x -> Stream.iterate(new double[]{-400, 400}, r ->
                                    inner.apply(new double[]{x, r[0] + (r[1] - r[0]) / 3}) < inner.apply(new double[]{x, r[1] - (r[1] - r[0]) / 3})
                                        ? new double[]{r[0], r[1] - (r[1] - r[0]) / 3}
                                        : new double[]{r[0] + (r[1] - r[0]) / 3, r[1]})
                                .limit(100).reduce((a, b) -> b).map(r -> inner.apply(new double[]{x, (r[0] + r[1]) / 2})).get()) instanceof DoubleUnaryOperator minPhi
                            ? Stream.iterate(new double[]{0, Math.min(tB, dAC + p[0])}, r ->
                                    minPhi.applyAsDouble((r[0] + r[1]) / 2) <= 1e-12 ? new double[]{(r[0] + r[1]) / 2, r[1]} : new double[]{r[0], (r[0] + r[1]) / 2})
                                .limit(45).reduce((a, b) -> b).get()[0]
                            : 0.0
                : 0.0)));
    }
}




