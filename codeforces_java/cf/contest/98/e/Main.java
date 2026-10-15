import java.math.BigDecimal;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc -> System.out.println(
            (Integer) sc.nextInt() instanceof Integer m
            && (Integer) sc.nextInt() instanceof Integer n
            && (Integer) Math.max(m, n) instanceof Integer mx
            && new double[mx + 1][mx + 1] instanceof double[][] f
            && IntStream.rangeClosed(0, 2 * mx).allMatch(s -> IntStream.rangeClosed(Math.max(0, s - mx), Math.min(s, mx)).allMatch(a ->
                (Integer) (s - a) instanceof Integer b
                && (b == 0
                    ? (f[a][b] = 1.0) > 0
                    : a == 0
                        ? (f[a][b] = 1.0 / (b + 1)) > 0
                        : (Double) (b / (b + 1.0) * (1 - f[b - 1][a])) instanceof Double h
                            && (Double) (h + 1.0 / (b + 1)) instanceof Double a12
                            && (Double) (1 - f[b][a - 1]) instanceof Double a22
                            && (Double) ((a22 - 1) / ((h - 1) - (a12 - a22))) instanceof Double ps
                            && (f[a][b] = DoubleStream.of(0, 1, ps).filter(p -> p >= 0 && p <= 1)
                                .map(p -> Math.min(p * h + 1 - p, p * a12 + (1 - p) * a22)).max().getAsDouble()) > 0)))
            ? Stream.of(f[m][n], 1 - f[m][n]).map(x -> new BigDecimal(Double.toString(x)).stripTrailingZeros().toPlainString()).collect(Collectors.joining(" "))
            : ""));
    }
}

