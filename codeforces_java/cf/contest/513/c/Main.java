import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n
            && new double[n] instanceof double[] lo && new double[n] instanceof double[] hi
            && IntStream.range(0, n).allMatch(i -> (lo[i] = s.nextInt()) >= 0 && (hi[i] = s.nextInt()) >= 0)
            ? String.format(Locale.ROOT, "%.10f", IntStream.range(0, (int) DoubleStream.of(hi).max().getAsDouble()).mapToDouble(x ->
                IntStream.range(0, n).mapToDouble(i -> Math.max(0, hi[i] - Math.max(x, lo[i] - 1)) / (hi[i] - lo[i] + 1)).toArray() instanceof double[] p
                    ? 1 - DoubleStream.of(p).map(v -> 1 - v).reduce(1, (u, v) -> u * v)
                        - IntStream.range(0, n).mapToDouble(i -> p[i] * IntStream.range(0, n).filter(j -> j != i).mapToDouble(j -> 1 - p[j]).reduce(1, (u, v) -> u * v)).sum() : 0).sum())
            : "");
    }
}
