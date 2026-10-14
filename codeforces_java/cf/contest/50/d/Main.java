import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n -> Optional.of(new int[]{s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt()}).ifPresent(h ->
            Optional.of(IntStream.range(0, n).mapToDouble(i -> Math.pow(s.nextInt() - h[2], 2) + Math.pow(s.nextInt() - h[3], 2)).toArray()).ifPresent(d2 ->
                Optional.of(new double[]{0, 3000}).ifPresent(st ->
                    System.out.println(IntStream.range(0, 100).allMatch(it ->
                        ((st[0] + st[1]) / 2 > 0 && Arrays.stream(d2).boxed().map(q -> q <= Math.pow((st[0] + st[1]) / 2, 2) ? 1.0 : Math.exp(1 - q / Math.pow((st[0] + st[1]) / 2, 2)))
                            .reduce(DoubleStream.concat(DoubleStream.of(1.0), DoubleStream.generate(() -> 0.0).limit(n)).toArray(),
                                (dp, p) -> IntStream.range(0, n + 1).mapToDouble(j -> dp[j] * (1 - p) + (j > 0 ? dp[j - 1] * p : 0)).toArray(),
                                (x, y) -> x) instanceof double[] f
                            && IntStream.range(0, h[0]).mapToDouble(j -> f[j]).sum() <= h[1] / 1000.0
                            ? (st[1] = (st[0] + st[1]) / 2) : (st[0] = (st[0] + st[1]) / 2)) >= 0)
                        ? String.format(Locale.ROOT, "%.17f", st[1]) : ""))))));
    }
}
