import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n
            && IntStream.range(0, n).map(i -> it.next()).toArray() instanceof int[] cnt
            && IntStream.range(0, n).mapToObj(i -> new double[cnt[i] + 1]).toArray(double[][]::new) instanceof double[][] p
            && IntStream.range(0, n).allMatch(i -> (p[i][cnt[i]] = 1) == 1)
            && new double[]{IntStream.range(0, n).filter(i -> cnt[i] == 0).count()} instanceof double[] zero
            && ((java.util.function.DoubleBinaryOperator) (nn, r) -> r == 0 ? 1.0 : r == 1 ? nn : r == 2 ? nn * (nn - 1) / 2 : r == 3 ? nn * (nn - 1) * (nn - 2) / 6 : r == 4 ? nn * (nn - 1) * (nn - 2) * (nn - 3) / 24 : nn * (nn - 1) * (nn - 2) * (nn - 3) * (nn - 4) / 120) instanceof java.util.function.DoubleBinaryOperator comb
            && Integer.valueOf(it.next()) instanceof Integer q
            ? IntStream.range(0, q).mapToObj(i -> Integer.valueOf(it.next() - 1) instanceof Integer u && Integer.valueOf(it.next() - 1) instanceof Integer v && Integer.valueOf(it.next()) instanceof Integer k
                && (zero[0] -= p[u][0]) > -1e18
                && new double[p[u].length] instanceof double[] np
                && IntStream.range(0, p[u].length).allMatch(j -> IntStream.rangeClosed(0, Math.min(k, j)).allMatch(x -> k - x > cnt[u] - j || (np[j - x] += p[u][j] * comb.applyAsDouble(j, x) * comb.applyAsDouble(cnt[u] - j, k - x) / comb.applyAsDouble(cnt[u], k)) > -1))
                && (p[u] = np) != null && (zero[0] += np[0]) > -1e18 && (cnt[u] -= k) > -1e9 && (cnt[v] += k) > -1
                ? String.format("%.12f", zero[0]) : "").collect(Collectors.joining("\n")) : "");
    }
}
