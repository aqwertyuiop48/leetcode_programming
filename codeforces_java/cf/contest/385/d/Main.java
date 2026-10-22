import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n && Double.valueOf(s.nextInt()) instanceof Double l && Double.valueOf(s.nextInt()) instanceof Double r
            && new double[n] instanceof double[] xs && new double[n] instanceof double[] ys && new double[n] instanceof double[] ta
            && IntStream.range(0, n).allMatch(i -> (xs[i] = s.nextInt()) >= -1e9 && (ys[i] = s.nextInt()) > 0 && (ta[i] = Math.tan(Math.toRadians(s.nextInt()))) > 0)
            && DoubleStream.generate(() -> l).limit(1 << n).toArray() instanceof double[] dp
            && IntStream.range(0, 1 << n).allMatch(mask -> IntStream.range(0, n).filter(i -> (mask >> i & 1) == 0).allMatch(i -> Double.valueOf((dp[mask] - xs[i]) / ys[i]) instanceof Double tt
                && (dp[mask | 1 << i] = Math.max(dp[mask | 1 << i], tt * ta[i] >= 1 ? r : Math.min(r, xs[i] + ys[i] * (tt + ta[i]) / (1 - tt * ta[i])))) > -1e18))
            ? String.format(Locale.US, "%.9f", Arrays.stream(dp).max().getAsDouble() - l) : "");
    }
}
