import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.stream(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().collect(Collectors.joining(" ")).trim().split(" +")).mapToInt(Integer::parseInt).toArray() instanceof int[] v
            && Integer.valueOf(v[0]) instanceof Integer n
            && Integer.valueOf(v[1]) instanceof Integer m
            && Integer.valueOf(v[2 + 3 * m]) instanceof Integer g1
            && Integer.valueOf(v[3 + 3 * m]) instanceof Integer g2
            && Integer.valueOf(v[4 + 3 * m]) instanceof Integer s1
            && Integer.valueOf(v[5 + 3 * m] + 1) instanceof Integer w
            && new int[n][n] instanceof int[][] D
            && IntStream.range(0, n).allMatch(i -> IntStream.range(0, n).allMatch(j -> (D[i][j] = i == j ? 0 : 1000000) >= 0))
            && IntStream.range(0, m).allMatch(e -> (D[v[2 + 3 * e] - 1][v[3 + 3 * e] - 1] = D[v[3 + 3 * e] - 1][v[2 + 3 * e] - 1] = v[4 + 3 * e]) > 0)
            && IntStream.range(0, n).allMatch(k -> IntStream.range(0, n).allMatch(i -> IntStream.range(0, n).allMatch(j ->
                (D[i][j] = Math.min(D[i][j], D[i][k] + D[k][j])) >= 0)))
            && IntStream.range(0, n).map(i -> IntStream.range(0, n).filter(j -> j != i).map(j -> D[i][j]).min().getAsInt()).toArray() instanceof int[] lo
            && IntStream.range(0, n).map(i -> IntStream.range(0, n).filter(j -> j != i).map(j -> D[i][j]).max().getAsInt()).toArray() instanceof int[] hi
            ? IntStream.range(0, n * n).mapToLong(p ->
                (Integer) (p / n) instanceof Integer a
                && (Integer) (p % n) instanceof Integer b
                && a != b
                && IntStream.range(0, n).map(i -> i == a || i == b ? 7
                    : (lo[i] < lo[a] || lo[i] == lo[a] && i < a ? 1 : 0)
                        | (IntStream.range(0, n).anyMatch(j -> j != i && (lo[a] < D[i][j] || lo[a] == D[i][j] && a < i) && (D[i][j] < hi[b] || D[i][j] == hi[b] && i < b)) ? 2 : 0)
                        | (hi[b] < hi[i] || hi[b] == hi[i] && b < i ? 4 : 0)).toArray() instanceof int[] fl
                && IntStream.of(fl).allMatch(f -> f != 0)
                && IntStream.range(0, n).filter(i -> i != a && i != b && fl[i] != 4).toArray() instanceof int[] act
                && new long[][]{new long[(g2 + 1) * w], new long[(g2 + 1) * w]} instanceof long[][] buf
                && (buf[0][w] = 1L) > 0
                && IntStream.range(0, act.length).allMatch(k ->
                    buf[k & 1] instanceof long[] src
                    && buf[k + 1 & 1] instanceof long[] dst
                    && (Integer) (fl[act[k]] & 4) instanceof Integer mb
                    && (Integer) (fl[act[k]] & 1) instanceof Integer mg
                    && (Integer) (fl[act[k]] >> 1 & 1) instanceof Integer ms
                    && IntStream.rangeClosed(0, Math.min(g2, k + 2)).filter(g -> IntStream.rangeClosed(0, Math.min(w - 1, k + 1)).filter(s ->
                        (dst[g * w + s]
                            = (mb != 0 ? src[g * w + s] : 0)
                            + (g > 0 && mg != 0 ? src[(g - 1) * w + s] : 0)
                            + (s > 0 && ms != 0 ? src[g * w + s - 1] : 0)) < 0).count() < 0).count() >= 0)
                ? IntStream.rangeClosed(g1, g2).mapToLong(g -> IntStream.rangeClosed(s1, w - 1).mapToLong(s -> buf[act.length & 1][g * w + s]).sum()).sum()
                : 0L).sum()
            : 0L);
    }
}
