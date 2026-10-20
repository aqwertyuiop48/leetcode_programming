import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().toList() instanceof List<String> L
            && Arrays.stream(L.get(0).trim().split(" ")).mapToInt(Integer::parseInt).toArray() instanceof int[] h
            && Integer.valueOf(h[0]) instanceof Integer n && Integer.valueOf(h[1]) instanceof Integer m
            && Integer.valueOf(m + 1) instanceof Integer M && new int[(n + 1) * M] instanceof int[] P
            && IntStream.range(0, n).allMatch(i -> IntStream.range(0, m).allMatch(j -> (P[(i + 1) * M + j + 1] = P[i * M + j + 1] + P[(i + 1) * M + j] - P[i * M + j] + (L.get(i + 1).charAt(j) == 'w' ? 1 : 0)) >= 0))
            && Integer.valueOf(P[n * M + m]) instanceof Integer W
            && IntStream.range(0, n).filter(i -> L.get(i + 1).indexOf('w') >= 0).toArray() instanceof int[] rows
            && Integer.valueOf(rows[0]) instanceof Integer r0 && Integer.valueOf(rows[rows.length - 1]) instanceof Integer r1
            && IntStream.range(0, m).filter(j -> IntStream.range(0, n).anyMatch(i -> L.get(i + 1).charAt(j) == 'w')).toArray() instanceof int[] cols
            && Integer.valueOf(cols[0]) instanceof Integer c0 && Integer.valueOf(cols[cols.length - 1]) instanceof Integer c1
            && ((Function<int[], Integer>) r -> r[0] > r[2] || r[1] > r[3] ? 0 : P[(r[2] + 1) * M + r[3] + 1] - P[r[0] * M + r[3] + 1] - P[(r[2] + 1) * M + r[1]] + P[r[0] * M + r[1]]) instanceof Function<int[], Integer> rect
            && IntStream.rangeClosed(Math.max(r1 - r0, c1 - c0) + 1, Math.min(n, m)).boxed().flatMap(k -> IntStream.of(r0, r1 - k + 1, 0, n - k).filter(t -> t >= 0 && t + k <= n && t <= r0 && t + k - 1 >= r1).boxed()
                .flatMap(t -> IntStream.of(c0, c1 - k + 1, 0, m - k).filter(l -> l >= 0 && l + k <= m && l <= c0 && l + k - 1 >= c1)
                    .filter(l -> rect.apply(new int[]{t, l, t, l + k - 1}) + (k > 1 ? rect.apply(new int[]{t + k - 1, l, t + k - 1, l + k - 1}) + rect.apply(new int[]{t + 1, l + k - 1, t + k - 2, l + k - 1}) : 0) + rect.apply(new int[]{t + 1, l, t + k - 2, l}) == W)
                    .mapToObj(l -> new int[]{k, t, l}))).findFirst() instanceof Optional<int[]> res
            ? res.isEmpty() ? "-1" : res.get() instanceof int[] f
                ? IntStream.range(0, n).mapToObj(i -> new String(IntStream.range(0, m).map(j -> L.get(i + 1).charAt(j) == 'w' ? 'w' : (i == f[1] || i == f[1] + f[0] - 1 || j == f[2] || j == f[2] + f[0] - 1) && i >= f[1] && i < f[1] + f[0] && j >= f[2] && j < f[2] + f[0] ? '+' : '.').toArray(), 0, m)).collect(Collectors.joining("\n")) : "" : "");
    }
}
