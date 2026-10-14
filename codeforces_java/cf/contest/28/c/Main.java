import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.util.concurrent.atomic.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            Integer.valueOf(s.nextInt()) instanceof Integer n
            && Integer.valueOf(s.nextInt()) instanceof Integer m
            && IntStream.generate(s::nextInt).limit(m).toArray() instanceof int[] a
            && new double[n + 1][n + 1] instanceof double[][] C
            && IntStream.rangeClosed(0, n).allMatch(i -> (C[i][0] = 1) > 0
                && IntStream.rangeClosed(1, i).allMatch(j -> (C[i][j] = C[i - 1][j - 1] + C[i - 1][j]) > 0))
            && IntStream.rangeClosed(0, n).mapToDouble(M -> M == 0 ? 0.0 : Arrays.stream(a).boxed().reduce(
                    IntStream.rangeClosed(0, n).mapToDouble(j -> j == 0 ? 1 : 0).toArray(),
                    (dp, ai) -> IntStream.rangeClosed(0, n).mapToDouble(t -> IntStream.rangeClosed(Math.max(0, t - M * ai), t)
                        .mapToDouble(j -> dp[j] * C[n - j][t - j] * Math.pow(1.0 / m, t - j)).reduce(0.0, Double::sum)).toArray(),
                    (x, y) -> x)[n]).toArray() instanceof double[] F
            ? String.format("%.20f", IntStream.rangeClosed(1, n).mapToDouble(M -> M * (F[M] - F[M - 1])).reduce(0.0, Double::sum))
            : ""));

    }
}

