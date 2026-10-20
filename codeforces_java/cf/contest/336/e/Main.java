import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer k
            && Long.valueOf(1000000007L) instanceof Long M
            && IntStream.range(0, 8).map(i -> i < 4 ? 1 << i : (1 << (i - 4)) | (1 << ((i - 3) % 4))).toArray() instanceof int[] pm
            && new long[16][13] instanceof long[][] B
            && IntStream.range(0, 256).filter(s -> IntStream.range(0, 8).allMatch(i -> (s >> i & 1) == 0 || IntStream.range(i + 1, 8).allMatch(j -> (s >> j & 1) == 0 || (pm[i] & pm[j]) == 0)))
                .allMatch(s -> ++B[IntStream.range(0, 8).filter(i -> (s >> i & 1) == 1).map(i -> pm[i]).reduce(0, (x, y) -> x | y)][Integer.bitCount(s)] > 0)
            && new long[16][13] instanceof long[][] A
            && IntStream.range(0, 16 * 625).allMatch(z -> Integer.valueOf(z % 16) instanceof Integer cs && Integer.valueOf(z / 16) instanceof Integer vo
                && IntStream.range(0, 4).map(v -> vo / (int) Math.pow(5, v) % 5).toArray() instanceof int[] o
                && ++A[cs | IntStream.range(0, 4).map(v -> (o[v] == 1 || o[v] >= 3 ? 1 << v : 0) | (o[v] >= 2 ? 1 << ((v + 1) % 4) : 0)).reduce(0, (x, y) -> x | y)]
                    [Integer.bitCount(cs) + IntStream.range(0, 4).map(v -> o[v] == 0 ? 0 : o[v] == 3 ? 2 : 1).sum()] > 0)
            && ((BiFunction<long[][], Boolean, long[][]>) (f, big) -> new long[16][k + 1] instanceof long[][] g
                && ((big ? B : A)) instanceof long[][] T
                && IntStream.range(0, 16).allMatch(mask -> IntStream.rangeClosed(0, k).filter(t -> f[mask][t] != 0).allMatch(t -> IntStream.range(0, 16).filter(u -> !big || (u & mask) == 0).allMatch(u -> IntStream.rangeClosed(0, 12).filter(m -> t + m <= k && T[u][m] != 0)
                    .allMatch(m -> (g[mask | u][t + m] = (g[mask | u][t + m] + f[mask][t] * (T[u][m] % M)) % M) >= 0))))
                ? g : null) instanceof BiFunction<long[][], Boolean, long[][]> step
            && new long[16][k + 1] instanceof long[][] init && (init[0][0] = 1) == 1
            && new long[][][]{init} instanceof long[][][] cur
            && IntStream.rangeClosed(0, n).allMatch(j -> (cur[0] = step.apply(cur[0], true)) != null && (j == n || (cur[0] = step.apply(cur[0], false)) != null))
            ? IntStream.range(0, 16).mapToLong(mask -> cur[0][mask][k]).sum() % M * LongStream.rangeClosed(1, k).reduce(1, (x, y) -> x * y % M) % M : "");
    }
}
