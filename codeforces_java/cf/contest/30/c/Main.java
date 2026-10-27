import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n ->
            System.out.println(
                IntStream.range(0, n).mapToObj(i -> new double[]{s.nextDouble(), s.nextDouble(), s.nextDouble(), s.nextDouble()})
                    .sorted(Comparator.comparingDouble(a -> a[2])).toArray(double[][]::new) instanceof double[][] t
                && new double[n] instanceof double[] dp
                && IntStream.range(0, n).allMatch(i ->
                    (dp[i] = t[i][3] + IntStream.range(0, i)
                        .filter(j -> Math.hypot(t[i][0] - t[j][0], t[i][1] - t[j][1]) <= t[i][2] - t[j][2] + 1e-12)
                        .mapToDouble(j -> dp[j]).max().orElse(0)) >= 0)
                ? String.format(Locale.ROOT, "%.10f", Arrays.stream(dp).max().getAsDouble())
                : "")));
    }
}




