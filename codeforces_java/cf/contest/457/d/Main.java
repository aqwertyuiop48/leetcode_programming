import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && Integer.valueOf(sc.nextInt()) instanceof Integer m
            && Integer.valueOf(sc.nextInt()) instanceof Integer k
            && new double[n + 1] instanceof double[] lf
            && IntStream.rangeClosed(1, n).allMatch(i -> (lf[i] = lf[i - 1] + Math.log(i)) >= 0)
            && new double[Math.min(k, n * n) + 2] instanceof double[] pl
            && IntStream.range(0, Math.min(k, n * n)).allMatch(t -> (pl[t + 1] = pl[t] + Math.log(k - t) - Math.log(m - t)) <= 0)
            && (Double) IntStream.rangeClosed(0, n).mapToDouble(i ->
                IntStream.rangeClosed(0, n).filter(j -> n * (i + j) - i * j <= k).mapToDouble(j ->
                    Math.exp(lf[n] - lf[i] - lf[n - i] + lf[n] - lf[j] - lf[n - j] + pl[n * (i + j) - i * j])).sum()).sum() instanceof Double s
            ? s > 1e99 ? "1e99" : String.format(Locale.US, "%.10f", s)
            : "");
    }
}
