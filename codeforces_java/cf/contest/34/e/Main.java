import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.stream(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().collect(Collectors.joining(" ")).trim().split(" +")).mapToDouble(Double::parseDouble).toArray() instanceof double[] in
            && Integer.valueOf((int) in[0]) instanceof Integer n
            && IntStream.range(0, n).boxed().sorted(Comparator.comparingDouble(i -> in[2 + 3 * i])).toList() instanceof List<Integer> ord
            && ord.stream().mapToDouble(i -> in[2 + 3 * i]).toArray() instanceof double[] x
            && ord.stream().mapToDouble(i -> in[3 + 3 * i]).toArray() instanceof double[] v
            && ord.stream().mapToDouble(i -> in[4 + 3 * i]).toArray() instanceof double[] m
            && Stream.iterate(in[1], r -> r > 1e-12, r ->
                IntStream.range(0, n - 1).filter(i -> v[i] > v[i + 1]).boxed().map(i -> (x[i + 1] - x[i]) / (v[i] - v[i + 1])).min(Comparator.naturalOrder()).orElse(1e18) instanceof Double dt
                && Double.valueOf(Math.min(dt, r)) instanceof Double d
                && IntStream.range(0, n).allMatch(i -> Math.abs(x[i] += v[i] * d) >= 0)
                && (dt > r || IntStream.range(0, n - 1).allMatch(i -> !(Math.abs(x[i + 1] - x[i]) < 1e-9 && v[i] > v[i + 1])
                    || new double[]{v[i], v[i + 1]} instanceof double[] o
                        && Math.abs(v[i] = ((m[i] - m[i + 1]) * o[0] + 2 * m[i + 1] * o[1]) / (m[i] + m[i + 1])) >= 0
                        && Math.abs(v[i + 1] = ((m[i + 1] - m[i]) * o[1] + 2 * m[i] * o[0]) / (m[i] + m[i + 1])) >= 0))
                ? (dt > r ? 0.0 : r - dt)
                : 0.0).mapToDouble(r -> r).sum() >= 0
            ? IntStream.range(0, n).mapToObj(j -> String.format(Locale.US, "%.9f", x[ord.indexOf(j)])).collect(Collectors.joining("\n"))
            : "");
    }
}
