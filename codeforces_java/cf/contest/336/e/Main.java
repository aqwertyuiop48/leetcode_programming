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
                && IntStream.range(0, 16 * 13).filter(z -> T[z / 13][z % 13] != 0).toArray() instanceof int[] tr
                && IntStream.range(0, 16 * (k + 1) * tr.length).allMatch(z -> Integer.valueOf(tr[z % tr.length]) instanceof Integer e && Integer.valueOf(z / tr.length % (k + 1)) instanceof Integer t
                    && Integer.valueOf(z / tr.length / (k + 1)) instanceof Integer mask
                    && (f[mask][t] == 0 || t + e % 13 > k || big && ((e / 13) & mask) != 0 || (g[mask | e / 13][t + e % 13] = (g[mask | e / 13][t + e % 13] + f[mask][t] * (T[e / 13][e % 13] % M)) % M) >= 0))
                ? g : null) instanceof BiFunction<long[][], Boolean, long[][]> step
            && new long[16][k + 1] instanceof long[][] init && (init[0][0] = 1) == 1
            && new long[][][]{init} instanceof long[][][] cur
            && IntStream.rangeClosed(0, n).allMatch(j -> (cur[0] = step.apply(cur[0], true)) != null && (j == n || (cur[0] = step.apply(cur[0], false)) != null))
            ? IntStream.range(0, 16).mapToLong(mask -> cur[0][mask][k]).sum() % M * LongStream.rangeClosed(1, k).reduce(1, (x, y) -> x * y % M) % M : "");
    }
}
