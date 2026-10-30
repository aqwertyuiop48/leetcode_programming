import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && LongStream.generate(sc::nextLong).limit(2 * n).toArray() instanceof long[] seg
            && IntStream.range(0, n).mapToLong(i -> seg[2 * i]).toArray() instanceof long[] l
            && IntStream.range(0, n).mapToLong(i -> seg[2 * i + 1]).toArray() instanceof long[] r
            && LongStream.concat(Arrays.stream(l), Arrays.stream(r)).distinct().sorted().toArray() instanceof long[] xs
            && Integer.valueOf(41) instanceof Integer N
            && ((Function<Double, double[]>) z -> IntStream.rangeClosed(2, N).boxed().reduce(new double[]{1, z}, (pr, k) -> new double[]{pr[1], ((2 * k - 1) * z * pr[1] - (k - 1) * pr[0]) / k}, (u, v) -> u)) instanceof Function<Double, double[]> lg
            && IntStream.range(0, N).mapToDouble(i -> Stream.iterate(Math.cos(Math.PI * (i + 0.75) / (N + 0.5)), z -> lg.apply(z) instanceof double[] pr ? z - pr[1] * (z * z - 1) / (N * (z * pr[1] - pr[0])) : z).limit(12).reduce((a, b) -> b).get()).toArray() instanceof double[] zn
            && Arrays.stream(zn).map(z -> lg.apply(z) instanceof double[] pr ? 1.0 / ((1 - z * z) * Math.pow(N * (z * pr[1] - pr[0]) / (z * z - 1), 2)) : 0).toArray() instanceof double[] wn
            && Arrays.stream(zn).map(z -> (1 + z) / 2).toArray() instanceof double[] tn
            && new double[n][n + 2] instanceof double[][] res
            && IntStream.range(0, xs.length - 1).filter(e -> Long.valueOf(xs[e]) instanceof Long x && Long.valueOf(xs[e + 1]) instanceof Long y
                && IntStream.range(0, n).filter(i -> l[i] <= x && y <= r[i]).toArray() instanceof int[] cov
                && Integer.valueOf(cov.length) instanceof Integer m
                && (m == 0 || Long.valueOf(IntStream.range(0, n).filter(i -> r[i] <= x).count()) instanceof Long off
                    && Arrays.stream(cov).mapToDouble(i -> (double) (x - l[i]) / (r[i] - l[i])).toArray() instanceof double[] p
                    && Arrays.stream(cov).mapToDouble(i -> (double) (y - x) / (r[i] - l[i])).toArray() instanceof double[] q
                    && Arrays.stream(cov).mapToDouble(i -> (double) (r[i] - y) / (r[i] - l[i])).toArray() instanceof double[] s
                    && new double[m * 41] instanceof double[] AL && new double[m * 41] instanceof double[] BE && new double[m * 41] instanceof double[] IV && new double[m * 41] instanceof double[] gp && new double[m * m] instanceof double[] acc
                    && IntStream.range(0, m * 41).filter(i -> (AL[i] = p[i / 41] + q[i / 41] * tn[i % 41]) > -1e300 && (BE[i] = s[i / 41] + q[i / 41] * (1 - tn[i % 41])) > -1e300).count() >= 0
                    && new double[2][41 * (m + 1)] instanceof double[][] fb && IntStream.range(0, 41).filter(u -> (fb[0][u] = 1) > 0).count() >= 0
                    && IntStream.range(0, m).filter(c -> fb[c & 1] instanceof double[] src && fb[(c + 1) & 1] instanceof double[] dst
                        && IntStream.range(0, 41 * (c + 2)).filter(idx -> (dst[idx] = BE[c * 41 + idx % 41] * src[idx] + (idx >= 41 ? AL[c * 41 + idx % 41] * src[idx - 41] : 0)) > -1e300).count() >= 0).count() >= 0
                    && fb[m & 1] instanceof double[] F
                    && IntStream.range(0, m * 41).filter(pi -> (IV[pi] = 1 / (BE[pi] >= AL[pi] ? BE[pi] : AL[pi])) > 0
                        && (gp[pi] = (BE[pi] >= AL[pi] ? F[pi % 41] : F[m * 41 + pi % 41]) * IV[pi]) > -1e300
                        && (acc[pi / 41 * m + (BE[pi] >= AL[pi] ? 0 : m - 1)] += wn[pi % 41] * gp[pi]) > -1e300).count() >= 0
                    && IntStream.range(1, m).filter(s2 -> IntStream.range(0, m * 41).filter(pi -> Boolean.valueOf(BE[pi] >= AL[pi]) instanceof Boolean low && Integer.valueOf(low ? s2 : m - 1 - s2) instanceof Integer k
                        && (gp[pi] = (low ? F[k * 41 + pi % 41] - AL[pi] * gp[pi] : F[(k + 1) * 41 + pi % 41] - BE[pi] * gp[pi]) * IV[pi]) > -1e300
                        && (acc[pi / 41 * m + k] += wn[pi % 41] * gp[pi]) > -1e300).count() >= 0).count() >= 0
                    && IntStream.range(0, m * m).filter(i -> (res[cov[i / m]][(int) (off + 1 + i % m)] += q[i / m] * acc[i]) > -1e300).count() >= 0)).count() >= 0
            ? Arrays.stream(res).map(row -> Arrays.stream(row, 1, n + 1).mapToObj(v -> String.format(Locale.US, "%.10f", Math.max(0, v))).collect(Collectors.joining(" "))).collect(Collectors.joining("\n")) : "");
    }
}
