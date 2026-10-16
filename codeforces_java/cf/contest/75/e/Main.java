import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            System.out.printf("%.9f%n",
                DoubleStream.generate(s::nextDouble).limit(4).toArray() instanceof double[] ab
                && Integer.valueOf(s.nextInt()) instanceof Integer n
                && DoubleStream.generate(s::nextDouble).limit(2L * n).toArray() instanceof double[] v
                && Double.valueOf(ab[2] - ab[0]) instanceof Double dx
                && Double.valueOf(ab[3] - ab[1]) instanceof Double dy
                && Double.valueOf(Math.hypot(dx, dy)) instanceof Double len
                && IntStream.range(0, n).mapToObj(i -> new double[]{v[2 * i], v[2 * i + 1], v[2 * ((i + 1) % n)] - v[2 * i], v[2 * ((i + 1) % n) + 1] - v[2 * i + 1]}).toArray(double[][]::new) instanceof double[][] e
                && Arrays.stream(e).map(q -> new double[]{q[2] * (ab[1] - q[1]) - q[3] * (ab[0] - q[0]), q[2] * dy - q[3] * dx}).toArray(double[][]::new) instanceof double[][] ed
                && Boolean.valueOf(Arrays.stream(ed).anyMatch(q -> q[1] == 0 && q[0] < 0)) instanceof Boolean bad
                && Boolean.valueOf(Arrays.stream(ed).anyMatch(q -> q[1] == 0 && q[0] == 0)) instanceof Boolean col
                && Double.valueOf(Math.max(0, Arrays.stream(ed).filter(q -> q[1] > 0).mapToDouble(q -> -q[0] / q[1]).max().orElse(0))) instanceof Double lo
                && Double.valueOf(Math.min(1, Arrays.stream(ed).filter(q -> q[1] < 0).mapToDouble(q -> -q[0] / q[1]).min().orElse(1))) instanceof Double hi
                && ((ToDoubleBiFunction<double[], double[]>) (pt, q) -> Math.max(0, Math.min(1, ((pt[0] - q[0]) * q[2] + (pt[1] - q[1]) * q[3]) / (q[2] * q[2] + q[3] * q[3])))) instanceof ToDoubleBiFunction<double[], double[]> u
                && ((ToDoubleBiFunction<double[], double[]>) (pt, q) -> Math.hypot(pt[0] - q[0] - u.applyAsDouble(pt, q) * q[2], pt[1] - q[1] - u.applyAsDouble(pt, q) * q[3])) instanceof ToDoubleBiFunction<double[], double[]> ds
                && ((ToDoubleFunction<double[]>) pt -> IntStream.range(0, n).boxed().min(Comparator.comparingDouble(i -> ds.applyAsDouble(pt, e[i]))).get() instanceof Integer idx
                    ? IntStream.range(0, idx).mapToDouble(i -> Math.hypot(e[i][2], e[i][3])).sum() + Math.hypot(pt[0] - e[idx][0], pt[1] - e[idx][1])
                    : 0.0) instanceof ToDoubleFunction<double[]> pos
                && Double.valueOf(Math.abs(pos.applyAsDouble(new double[]{ab[0] + lo * dx, ab[1] + lo * dy}) - pos.applyAsDouble(new double[]{ab[0] + hi * dx, ab[1] + hi * dy}))) instanceof Double d
                && Double.valueOf(Arrays.stream(e).mapToDouble(q -> Math.hypot(q[2], q[3])).sum()) instanceof Double per
                ? (bad || col || hi - lo <= 1e-12
                    ? len
                    : len * (lo + 1 - hi) + Math.min(2 * (hi - lo) * len, Math.min(d, per - d)))
                : 0.0));
    }
}



