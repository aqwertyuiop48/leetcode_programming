import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            new String(System.in.readAllBytes()).trim().split("[ \r\n]+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer n
            && Integer.valueOf(t[1]) instanceof Integer q
            && IntStream.range(0, n).map(i -> Integer.parseInt(t[2 + i])).toArray() instanceof int[] a
            && new int[18][] instanceof int[][] sp
            && (sp[0] = a) == a
            && IntStream.range(1, 18).allMatch(k ->
                (1 << k) > n
                || (sp[k] = IntStream.range(0, n - (1 << k) + 1).map(i -> Math.max(sp[k - 1][i], sp[k - 1][i + (1 << (k - 1))])).toArray()) != null)
            && IntStream.rangeClosed(0, q).mapToLong(j -> j == q
                ? (1L << 40) | q
                : ((long) Integer.parseInt(t[n + 2 + 3 * j]) << 40) | ((long) (n - Integer.parseInt(t[n + 3 + 3 * j])) << 20) | j).sorted().toArray() instanceof long[] keys
            && Arrays.stream(keys).mapToInt(k -> (int) (k & 1048575)).toArray() instanceof int[] ord
            && Arrays.stream(ord).map(o -> o == q ? 0 : Integer.parseInt(t[n + 2 + 3 * o]) - 1).toArray() instanceof int[] ls
            && Arrays.stream(ord).map(o -> o == q ? n - 1 : Integer.parseInt(t[n + 3 + 3 * o]) - 1).toArray() instanceof int[] rs
            && Arrays.stream(ord).mapToDouble(o -> o == q ? 0.0 : Double.parseDouble(t[n + 4 + 3 * o])).toArray() instanceof double[] pp
            && IntStream.rangeClosed(0, q).map(i ->
                Math.max(sp[31 - Integer.numberOfLeadingZeros(rs[i] - ls[i] + 1)][ls[i]],
                         sp[31 - Integer.numberOfLeadingZeros(rs[i] - ls[i] + 1)][rs[i] - (1 << (31 - Integer.numberOfLeadingZeros(rs[i] - ls[i] + 1))) + 1])).toArray() instanceof int[] mx
            && new int[q + 1] instanceof int[] par
            && IntStream.rangeClosed(1, q).allMatch(i ->
                (par[i] = IntStream.iterate(i - 1, j -> j >= 0, j -> j - 1).filter(j -> rs[j] >= ls[i]).findFirst().getAsInt()) >= 0)
            && IntStream.rangeClosed(0, q).map(i -> 1).toArray() instanceof int[] sz
            && IntStream.iterate(q, i -> i >= 1, i -> i - 1).allMatch(i -> (sz[par[i]] += sz[i]) > 0)
            && new double[q + 1][] instanceof double[][] prod
            && new double[1] instanceof double[] res
            && IntStream.iterate(q, i -> i >= 0, i -> i - 1).allMatch(i ->
                (prod[i] != null ? prod[i] : DoubleStream.generate(() -> 1.0).limit(sz[i] + 1).toArray()) instanceof double[] pv
                && IntStream.rangeClosed(0, sz[i]).mapToDouble(k -> (k > 0 ? pp[i] * pv[k - 1] : 0.0) + (1 - pp[i]) * pv[k]).toArray() instanceof double[] dp
                && (i == 0
                    ? (res[0] = IntStream.rangeClosed(0, sz[0]).mapToDouble(k -> (dp[k] - (k > 0 ? dp[k - 1] : 0.0)) * (mx[0] + k)).sum()) >= 0
                    : (prod[par[i]] != null || (prod[par[i]] = DoubleStream.generate(() -> 1.0).limit(sz[par[i]] + 1).toArray()) != null)
                        && IntStream.rangeClosed(0, Math.min(sz[par[i]], sz[i] + mx[i] - mx[par[i]])).allMatch(k -> (prod[par[i]][k] *= dp[k + mx[par[i]] - mx[i]]) >= 0)
                        && (prod[i] = null) == null))
            ? String.format(Locale.US, "%.9f", res[0])
            : "");
    }
}
