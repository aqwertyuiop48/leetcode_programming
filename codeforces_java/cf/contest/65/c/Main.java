import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n -> Optional.of(IntStream.range(0, n + 1).mapToObj(i -> DoubleStream.generate(s::nextDouble).limit(3).toArray()).toArray(double[][]::new)).ifPresent(pt -> Optional.of(DoubleStream.generate(s::nextDouble).limit(5).toArray()).ifPresent(q -> Optional.<ToDoubleBiFunction<double[], double[]>>of((a, b) -> Math.sqrt(IntStream.range(0, 3).mapToDouble(i -> (a[i] - b[i]) * (a[i] - b[i])).sum())).ifPresent(d -> Optional.of(IntStream.range(0, n + 1).mapToDouble(i -> IntStream.range(0, i).mapToDouble(j -> d.applyAsDouble(pt[j], pt[j + 1]) / q[1]).sum()).toArray()).ifPresent(cum -> Optional.<DoubleFunction<double[]>>of(t -> Optional.of(IntStream.range(0, n).filter(i -> cum[i + 1] >= t).findFirst().orElse(n - 1)).map(i -> Optional.of(cum[i + 1] - cum[i] > 0 ? (t - cum[i]) / (cum[i + 1] - cum[i]) : 0.0).map(f -> IntStream.range(0, 3).mapToDouble(c -> pt[i][c] + f * (pt[i + 1][c] - pt[i][c])).toArray()).get()).get()).ifPresent(pos -> Optional.of(new double[]{0, cum[n]}).ifPresent(lh -> Optional.of(new double[]{q[2], q[3], q[4]}).ifPresent(p -> System.out.print(d.applyAsDouble(p, pos.apply(cum[n])) > q[0] * cum[n] + 1e-9 ? "NO" : IntStream.range(0, 100).boxed().allMatch(it -> Optional.of((lh[0] + lh[1]) / 2).map(m -> d.applyAsDouble(p, pos.apply(m)) <= q[0] * m ? (lh[1] = m) : (lh[0] = m)).isPresent()) ? String.format(Locale.US, "YES\n%.10f\n%.10f %.10f %.10f", lh[1], pos.apply(lh[1])[0], pos.apply(lh[1])[1], pos.apply(lh[1])[2]) : ""))))))))));
    }
}
