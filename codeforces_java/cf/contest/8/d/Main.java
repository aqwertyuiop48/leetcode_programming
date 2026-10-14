import java.util.*;
import java.util.stream.*;

public class Main {
    static double dist(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
    }

    static double[] pointAt(double d, double ax, double ay, double cx, double cy, double bx, double by, double dAC, double dCB) {
        return d <= dAC
            ? new double[]{ax + (cx - ax) * (dAC == 0 ? 0 : d / dAC), ay + (cy - ay) * (dAC == 0 ? 0 : d / dAC)}
            : new double[]{cx + (bx - cx) * (dCB == 0 ? 0 : (d - dAC) / dCB), cy + (by - cy) * (dCB == 0 ? 0 : (d - dAC) / dCB)};
    }

    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new double[]{
                s.nextDouble(), s.nextDouble(), s.nextDouble(), s.nextDouble(),
                s.nextDouble(), s.nextDouble(), s.nextDouble(), s.nextDouble()
            }).ifPresent(p ->
            System.out.printf("%.10f%n",
                new double[]{dist(p[2], p[3], p[6], p[7])} instanceof double[] dAC
                && new double[]{dist(p[6], p[7], p[4], p[5])} instanceof double[] dCB
                && new double[]{dist(p[2], p[3], p[4], p[5]) + p[1]} instanceof double[] limit
                && new double[]{dAC[0] + dCB[0]} instanceof double[] total
                && Stream.iterate(new double[]{0, total[0]}, it -> it[1] - it[0] > 1e-11,
                        it -> (pointAt((it[0] + it[1]) / 2, p[2], p[3], p[6], p[7], p[4], p[5], dAC[0], dCB[0]) instanceof double[] pt
                                && (it[0] + it[1]) / 2 + dist(pt[0], pt[1], p[4], p[5]) <= limit[0])
                            ? new double[]{(it[0] + it[1]) / 2, it[1]}
                            : new double[]{it[0], (it[0] + it[1]) / 2})
                    .reduce((a, b) -> b).get() instanceof double[] result
                ? result[0]
                : 0.0)));
    }
}

