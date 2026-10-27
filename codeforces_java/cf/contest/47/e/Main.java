import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.stream(new java.io.BufferedReader(new java.io.InputStreamReader(System.in), 1 << 16).lines().collect(Collectors.joining(" ")).trim().split(" +")).mapToDouble(Double::parseDouble).toArray() instanceof double[] d
            && Integer.valueOf((int) d[0]) instanceof Integer n
            && Double.valueOf(d[1]) instanceof Double v
            && Integer.valueOf((int) d[2 + n]) instanceof Integer m
            && Double.valueOf(9.8 / (2 * v * v)) instanceof Double k
            && IntStream.range(0, n).boxed().sorted(Comparator.comparingDouble(i -> Math.tan(d[2 + i]))).mapToInt(i -> i).toArray() instanceof int[] ord
            && Arrays.stream(ord).mapToDouble(i -> Math.tan(d[2 + i])).toArray() instanceof double[] ts
            && IntStream.range(0, m).boxed().sorted(Comparator.comparingDouble(j -> d[3 + n + 2 * j])).mapToInt(j -> j).toArray() instanceof int[] wo
            && IntStream.rangeClosed(0, n).toArray() instanceof int[] nxt
            && IntStream.rangeClosed(0, n).map(x -> -1).toArray() instanceof int[] hitw
            && new int[]{n} instanceof int[] left
            && ((IntUnaryOperator) x -> nxt[x] == x ? x : nxt[nxt[x]] == nxt[x] ? nxt[x] :
                IntStream.iterate(x, y -> nxt[y] != y, y -> nxt[y]).toArray() instanceof int[] path
                && (Integer) (path.length == 0 ? x : nxt[path[path.length - 1]]) instanceof Integer root
                && IntStream.of(path).filter(y -> (nxt[y] = root) < 0).count() >= 0
                ? root : -1) instanceof IntUnaryOperator find
            && ((BiFunction<Double, Double, Integer>) (lo, hi) -> (Integer) Arrays.binarySearch(ts, Math.nextDown(lo)) instanceof Integer bs && bs >= 0 ? bs : -(Arrays.binarySearch(ts, Math.nextDown(lo))) - 1) instanceof BiFunction<Double, Double, Integer> lower
            && ((BiPredicate<Double, Double>) (lo, hi) ->
                (Integer) find.applyAsInt(lower.apply(lo, hi)) instanceof Integer j0
                && j0 < n && ts[j0] <= hi
                && IntStream.iterate(j0, j -> j < n && ts[j] <= hi, j -> find.applyAsInt(j + 1))
                    .filter(j -> (hitw[ord[j]] = hitw[n]) < 0 || (nxt[j] = j + 1) < 0 || --left[0] < -1).count() >= 0) instanceof BiPredicate<Double, Double> noop
            && IntStream.range(0, m).allMatch(wi ->
                left[0] == 0 || (Integer) wo[wi] instanceof Integer w
                && Double.valueOf(d[3 + n + 2 * w]) instanceof Double x
                && Double.valueOf(d[4 + n + 2 * w]) instanceof Double hh
                && Double.valueOf(1 - 4 * k * k * x * x) instanceof Double q
                && (q < 0
                    || Double.valueOf(Math.sqrt(q)) instanceof Double sq
                    && Double.valueOf((1 - sq) / (2 * k * x)) instanceof Double s1
                    && Double.valueOf((1 + sq) / (2 * k * x)) instanceof Double s2
                    && Double.valueOf(1 - 4 * k * hh - 4 * k * k * x * x) instanceof Double p
                    && (p <= 0
                        ? (hitw[n] = w) >= 0 && (noop.test(s1, s2) || true)
                        : (hitw[n] = w) >= 0 && (noop.test(s1, (1 - Math.sqrt(p)) / (2 * k * x)) || true) && (noop.test((1 + Math.sqrt(p)) / (2 * k * x), s2) || true))))
            ? IntStream.range(0, n).mapToObj(i ->
                hitw[i] >= 0
                    ? String.format(Locale.ROOT, "%.9f %.9f", d[3 + n + 2 * hitw[i]],
                        d[3 + n + 2 * hitw[i]] * Math.tan(d[2 + i]) - 9.8 * d[3 + n + 2 * hitw[i]] * d[3 + n + 2 * hitw[i]] / (2.0 * v * v * Math.cos(d[2 + i]) * Math.cos(d[2 + i])))
                    : String.format(Locale.ROOT, "%.9f %.9f", v * v * Math.sin(2 * d[2 + i]) / 9.8, 0.0)).collect(Collectors.joining("\n"))
            : "");
    }
}


