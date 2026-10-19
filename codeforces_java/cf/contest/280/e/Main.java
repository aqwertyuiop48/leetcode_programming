import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n && Double.valueOf(sc.nextDouble()) instanceof Double q
            && Double.valueOf(sc.nextDouble()) instanceof Double a && Double.valueOf(sc.nextDouble()) instanceof Double b
            && IntStream.range(0, n).mapToDouble(i -> sc.nextDouble()).toArray() instanceof double[] x
            && new ArrayList<List<double[]>>(List.of(List.of(new double[]{1, q - (n - 1) * a, 2, -2 * x[0]}))) instanceof ArrayList<List<double[]>> cur
            && new double[n] instanceof double[] z
            && IntStream.range(0, n).allMatch(j -> cur.get(0) instanceof List<double[]> P
                && Double.valueOf(P.stream().filter(p -> p[2] * p[0] + p[3] >= 0 || p[2] * p[1] + p[3] >= 0).findFirst().map(p -> p[2] * p[0] + p[3] >= 0 ? p[0] : -p[3] / p[2]).orElse(P.get(P.size() - 1)[1])) instanceof Double zs
                && (z[j] = zs) == zs
                && (j == n - 1 || Double.valueOf(q - (n - 2 - j) * a) instanceof Double hi
                    && cur.set(0, Stream.of(
                        P.stream().filter(p -> p[0] < zs && p[0] + a <= hi).map(p -> new double[]{p[0] + a, Math.min(Math.min(p[1], zs) + a, hi), p[2] + 2, p[3] - p[2] * a - 2 * x[j + 1]}),
                        Stream.of(new double[]{zs + a, Math.min(zs + b, hi), 2, -2 * x[j + 1]}).filter(p -> p[0] <= hi),
                        P.stream().filter(p -> p[1] > zs && Math.max(p[0], zs) + b <= hi).map(p -> new double[]{Math.max(p[0], zs) + b, Math.min(p[1] + b, hi), p[2] + 2, p[3] - p[2] * b - 2 * x[j + 1]}))
                        .flatMap(s -> s).toList()) != null))
            && new double[n] instanceof double[] y && (y[n - 1] = z[n - 1]) == z[n - 1]
            && IntStream.iterate(n - 2, j -> j >= 0, j -> j - 1).allMatch(j -> (y[j] = Math.min(Math.max(z[j], y[j + 1] - b), y[j + 1] - a)) == y[j])
            ? Arrays.stream(y).mapToObj(v -> String.format("%.9f", v)).collect(Collectors.joining(" ")) + "\n" + String.format("%.9f", IntStream.range(0, n).mapToDouble(i -> (x[i] - y[i]) * (x[i] - y[i])).sum()) : "");
    }
}
