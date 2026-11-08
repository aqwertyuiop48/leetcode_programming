import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && sc.next() instanceof String ra && sc.next() instanceof String rb && sc.next() instanceof String w
            && Integer.valueOf(ra.length()) instanceof Integer n && Integer.valueOf(w.length()) instanceof Integer m && Integer.valueOf(n + 2) instanceof Integer W && Integer.valueOf(1000000007) instanceof Integer M
            && new String[][]{{ra, rb}, {new StringBuilder(ra).reverse().toString(), new StringBuilder(rb).reverse().toString()}} instanceof String[][] Gs
            && ((Function<String[], short[][]>) rows -> IntStream.range(0, 6).mapToObj(t -> new short[(m + 2) * W]).toArray(short[][]::new) instanceof short[][] X
                && IntStream.range(0, 2).allMatch(r -> IntStream.range(0, m).map(z -> m - 1 - z).allMatch(p -> IntStream.range(0, n).allMatch(q ->
                    (X[r][p * W + q + 1] = (short) (rows[r].charAt(q) == w.charAt(p) ? X[r][(p + 1) * W + q + 2] + 1 : 0)) >= 0
                    && (X[2 + r][p * W + q + 1] = (short) (rows[r].charAt(q) == w.charAt(p) ? X[2 + r][(p + 1) * W + q] + 1 : 0)) >= 0)))
                && IntStream.range(0, 2).allMatch(r -> IntStream.range(0, m).allMatch(p -> IntStream.range(0, n).allMatch(q ->
                    (X[4 + r][p * W + q + 1] = (short) ((X[2 + r][p * W + q + 1] >= m - p ? 1 : 0) + (p > 0 ? X[4 + r][(p - 1) * W + q] : 0))) >= 0)))
                ? X : null) instanceof Function<String[], short[][]> build
            && new short[][][]{build.apply(Gs[0]), build.apply(Gs[1])} instanceof short[][][] T
            && new int[2][2 * n] instanceof int[][] f0 && new int[2][2 * n] instanceof int[][] f1 && new int[2][2 * n] instanceof int[][] n0 && new int[2][2 * n] instanceof int[][] n1 && new long[1] instanceof long[] tot
            && IntStream.range(0, 2).allMatch(g -> IntStream.range(0, 2 * n).allMatch(x -> (f0[g][x] = Gs[g][x / n].charAt(x % n) == w.charAt(0) ? 1 : 0) >= 0))
            && IntStream.rangeClosed(1, m).allMatch(i -> Integer.valueOf(m - i) instanceof Integer rem && Integer.valueOf(i / 2 - 1) instanceof Integer j
                && (i % 2 != 0 || i < 4 || IntStream.range(0, 2).allMatch(g -> IntStream.range(0, 2).allMatch(r -> IntStream.range(0, n - j).allMatch(c0 ->
                    T[g][r][c0 + 1] < j + 1 || T[g][3 - r][(j + 1) * W + c0 + j + 1] < j + 1
                    || (f1[1 - g][(1 - r) * n + n - 1 - c0] = (f1[1 - g][(1 - r) * n + n - 1 - c0] + 1) % M) >= 0))))
                && IntStream.range(0, 2).allMatch(g ->
                    (i != m || IntStream.range(0, 2 * n).allMatch(x -> (tot[0] = (tot[0] + f0[g][x] + f1[g][x]) % M) >= 0))
                    && (rem < 4 || IntStream.range(0, 2).allMatch(r -> IntStream.range(0, n).allMatch(c ->
                        f1[g][r * n + c] == 0 || Integer.valueOf(Math.min(rem - 2, T[g][r][i * W + c + 2])) instanceof Integer j2 && Integer.valueOf((rem + 1) / 2) instanceof Integer j1
                        && (j1 > j2 || (tot[0] = (tot[0] + (long) f1[g][r * n + c] * (T[g][5 - r][(i + j2) * W + c + j2 + 1] - T[g][5 - r][(i + j1 - 1) * W + c + j1])) % M) >= 0))))
                    && (i == m || IntStream.range(0, 2).allMatch(r -> IntStream.range(0, n).allMatch(c ->
                        Integer.valueOf(f0[g][r * n + c]) instanceof Integer a && Integer.valueOf(f1[g][r * n + c]) instanceof Integer b
                        && (c + 1 >= n || a + b == 0 || w.charAt(i) != Gs[g][r].charAt(c + 1) || (n0[g][r * n + c + 1] = (int) (((long) n0[g][r * n + c + 1] + a + b) % M)) >= 0)
                        && (a == 0 || w.charAt(i) != Gs[g][1 - r].charAt(c) || (n1[g][(1 - r) * n + c] = (int) (((long) n1[g][(1 - r) * n + c] + a) % M)) >= 0)))))
                && IntStream.range(0, 2).allMatch(g -> Stream.of(0).peek(z -> System.arraycopy(n0[g], 0, f0[g], 0, 2 * n)).peek(z -> System.arraycopy(n1[g], 0, f1[g], 0, 2 * n))
                    .peek(z -> Arrays.fill(n0[g], 0)).peek(z -> Arrays.fill(n1[g], 0)).findFirst().isPresent()))
            && IntStream.range(0, 2).allMatch(g -> IntStream.range(0, 2).allMatch(r -> IntStream.range(0, n).allMatch(c0 ->
                (tot[0] = (tot[0] + IntStream.rangeClosed(Math.max(1, m / 2), Math.min(m - 3, T[g][r][c0 + 1] - 1)).filter(j -> T[g][3 - r][(1 + j) * W + c0 + j + 1] >= m - 1 - j).count()) % M) >= 0)))
            ? ((tot[0] - (m == 1 ? IntStream.range(0, 2 * n).filter(x -> Gs[0][x / n].charAt(x % n) == w.charAt(0)).count()
                : m == 2 ? IntStream.range(0, 2 * n).filter(x -> Gs[0][x / n].charAt(x % n) == w.charAt(0) && Gs[0][1 - x / n].charAt(x % n) == w.charAt(1)).count() : 0L)) % M + M) % M : "");
    }
}
