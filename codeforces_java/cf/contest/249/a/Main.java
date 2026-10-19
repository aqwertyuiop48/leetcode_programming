import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(DoubleStream.generate(new Scanner(System.in)::nextDouble).limit(6).toArray() instanceof double[] v
            && Double.valueOf(v[2] - v[5]) instanceof Double h
            && Double.valueOf(h - v[4]) instanceof Double a
            && Double.valueOf(h + a - v[0] - v[5]) instanceof Double den
            && a > 0 && den > 0 && h - v[0] - v[5] > 0 && v[1] - v[0] >= 2 * v[5] - 1e-9
            && Double.valueOf(v[3] * (h - v[0] - v[5]) / den) instanceof Double xw
            && ((Function<double[], Double>) w -> Double.valueOf(Math.max(0, Math.min(1, ((w[0] - w[2]) * (w[4] - w[2]) + (w[1] - w[3]) * (w[5] - w[3])) / Math.max(1e-300, (w[4] - w[2]) * (w[4] - w[2]) + (w[5] - w[3]) * (w[5] - w[3]))))) instanceof Double t
                ? Math.hypot(w[0] - w[2] - t * (w[4] - w[2]), w[1] - w[3] - t * (w[5] - w[3])) : 0.0) instanceof Function<double[], Double> sd
            && Stream.of(v[0], v[1]).allMatch(py -> sd.apply(new double[]{0, py, v[3], v[4], xw, h}) >= v[5] - 1e-9 && sd.apply(new double[]{0, py, xw, h, 0, v[0] + v[5]}) >= v[5] - 1e-9)
            ? String.format("%.10f", xw) : "-1");
    }
}
