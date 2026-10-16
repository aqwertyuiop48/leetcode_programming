import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc ->
            System.out.println(
                IntStream.range(0, 12).mapToDouble(i -> sc.nextDouble()).toArray() instanceof double[] z
                && ((ToDoubleFunction<double[]>) q -> (q[2] - q[0]) * (q[5] - q[1]) - (q[3] - q[1]) * (q[4] - q[0])) instanceof ToDoubleFunction<double[]> cr
                && ((Predicate<double[]>) q -> q[4] >= Math.min(q[0], q[2]) - 1e-9 && q[4] <= Math.max(q[0], q[2]) + 1e-9
                    && q[5] >= Math.min(q[1], q[3]) - 1e-9 && q[5] <= Math.max(q[1], q[3]) + 1e-9) instanceof Predicate<double[]> bx
                && ((Predicate<double[]>) q -> new double[]{
                        cr.applyAsDouble(new double[]{q[4], q[5], q[6], q[7], q[0], q[1]}),
                        cr.applyAsDouble(new double[]{q[4], q[5], q[6], q[7], q[2], q[3]}),
                        cr.applyAsDouble(new double[]{q[0], q[1], q[2], q[3], q[4], q[5]}),
                        cr.applyAsDouble(new double[]{q[0], q[1], q[2], q[3], q[6], q[7]})} instanceof double[] d
                    && (((d[0] > 1e-9 && d[1] < -1e-9) || (d[0] < -1e-9 && d[1] > 1e-9)) && ((d[2] > 1e-9 && d[3] < -1e-9) || (d[2] < -1e-9 && d[3] > 1e-9))
                        || (Math.abs(d[0]) <= 1e-9 && bx.test(new double[]{q[4], q[5], q[6], q[7], q[0], q[1]}))
                        || (Math.abs(d[1]) <= 1e-9 && bx.test(new double[]{q[4], q[5], q[6], q[7], q[2], q[3]}))
                        || (Math.abs(d[2]) <= 1e-9 && bx.test(new double[]{q[0], q[1], q[2], q[3], q[4], q[5]}))
                        || (Math.abs(d[3]) <= 1e-9 && bx.test(new double[]{q[0], q[1], q[2], q[3], q[6], q[7]})))) instanceof Predicate<double[]> it
                && ((Predicate<double[]>) q -> it.test(new double[]{q[0], q[1], q[2], q[3], z[4], z[5], z[6], z[7]})) instanceof Predicate<double[]> hitW
                && (Double) cr.applyAsDouble(new double[]{z[8], z[9], z[10], z[11], z[0], z[1]}) instanceof Double cv
                && (Double) cr.applyAsDouble(new double[]{z[8], z[9], z[10], z[11], z[2], z[3]}) instanceof Double cp
                ? (!hitW.test(new double[]{z[0], z[1], z[2], z[3]})
                    && !(it.test(new double[]{z[0], z[1], z[2], z[3], z[8], z[9], z[10], z[11]}) && Math.abs((z[2] - z[0]) * (z[11] - z[9]) - (z[3] - z[1]) * (z[10] - z[8])) > 1e-9)
                    || (cv > 0 && cp > 0 || cv < 0 && cp < 0)
                        && (new double[]{(z[10] - z[8]) * (z[10] - z[8]) + (z[11] - z[9]) * (z[11] - z[9]), cv / (cv + cp)} instanceof double[] w
                            && new double[]{z[0] + w[1] * (z[2] + 2 * cp / w[0] * (z[11] - z[9]) - z[0]), z[1] + w[1] * (z[3] - 2 * cp / w[0] * (z[10] - z[8]) - z[1])} instanceof double[] hh
                            && bx.test(new double[]{z[8], z[9], z[10], z[11], hh[0], hh[1]})
                            && !hitW.test(new double[]{z[0], z[1], hh[0], hh[1]})
                            && !hitW.test(new double[]{hh[0], hh[1], z[2], z[3]})))
                    ? "YES" : "NO"
                : ""));
    }
}




