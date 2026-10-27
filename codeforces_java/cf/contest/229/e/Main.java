import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer m
            && IntStream.range(0, m).mapToObj(i -> IntStream.range(0, it.next()).map(j -> it.next()).toArray()).toList() instanceof List<int[]> ps
            && ps.stream().flatMapToInt(Arrays::stream).boxed().sorted(Comparator.reverseOrder()).toList() instanceof List<Integer> all
            && Integer.valueOf(all.get(n - 1)) instanceof Integer T
            && new double[1001][1001] instanceof double[][] C
            && IntStream.rangeClosed(0, 1000).allMatch(i -> (C[i][0] = 1) == 1 && IntStream.rangeClosed(1, i).allMatch(j -> (C[i][j] = C[i - 1][j - 1] + C[i - 1][j]) >= 0))
            && ps.stream().mapToInt(a -> a.length).toArray() instanceof int[] k
            && ps.stream().mapToLong(a -> Arrays.stream(a).asLongStream().sum()).toArray() instanceof long[] sm
            && IntStream.range(0, m).map(i -> (int) Arrays.stream(ps.get(i)).filter(x -> x > T).count()).toArray() instanceof int[] g
            && IntStream.range(0, m).map(i -> (int) Arrays.stream(ps.get(i)).filter(x -> x == T).count()).toArray() instanceof int[] e
            && ((java.util.function.BiFunction<Integer, Integer, Double>) (i, s) -> s >= g[i] && s - g[i] <= e[i] ? C[e[i]][s - g[i]] / C[k[i]][s] : 0.0) instanceof java.util.function.BiFunction<Integer, Integer, Double> w
            && IntStream.range(0, m).map(i -> IntStream.range(0, m).filter(j -> sm[j] * k[i] > sm[i] * k[j]).map(j -> k[j]).sum()).toArray() instanceof int[] F
            && IntStream.range(0, m).map(i -> IntStream.range(0, m).filter(j -> sm[j] * k[i] >= sm[i] * k[j]).map(j -> k[j]).sum()).toArray() instanceof int[] G
            && IntStream.range(0, m).filter(i -> F[i] < n && G[i] > n).boxed().toList() instanceof List<Integer> grp
            && (Integer) (grp.isEmpty() ? 0 : n - F[grp.get(0)]) instanceof Integer R
            && grp.stream().reduce(new double[][]{IntStream.rangeClosed(0, R).mapToDouble(j -> j == 0 ? 1.0 : 0.0).toArray(), IntStream.rangeClosed(0, R).mapToDouble(j -> j == 0 ? 1.0 : 0.0).toArray()},
                (st, i) -> new double[][]{IntStream.rangeClosed(0, R).mapToDouble(j -> IntStream.rangeClosed(0, Math.min(j, k[i])).mapToDouble(s -> st[0][j - s] * w.apply(i, s)).sum()).toArray(),
                    IntStream.rangeClosed(0, R).mapToDouble(j -> IntStream.rangeClosed(0, Math.min(j, k[i])).mapToDouble(s -> st[1][j - s]).sum()).toArray()},
                (x, y) -> x) instanceof double[][] dp
            ? String.format("%.9f", IntStream.range(0, m).filter(i -> !(F[i] < n && G[i] > n)).mapToDouble(i -> w.apply(i, G[i] <= n ? k[i] : 0)).reduce(1.0, (x, y) -> x * y) * dp[0][R] / dp[1][R]) : "");
    }
}

