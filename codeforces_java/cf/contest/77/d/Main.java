import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && Integer.valueOf(IntStream.range(0, raw.length).filter(i -> raw[i] == 10).findFirst().getAsInt()) instanceof Integer nl
            && Arrays.stream(new String(raw, 0, nl).trim().split("\\s+")).mapToInt(Integer::parseInt).toArray() instanceof int[] nm
            && Integer.valueOf(nm[0]) instanceof Integer n
            && Integer.valueOf(nm[1]) instanceof Integer m
            && Integer.valueOf(4 * m + 1) instanceof Integer W
            && IntStream.range(nl, raw.length).filter(i -> raw[i] == '#' || raw[i] == 'O' || raw[i] == '.').map(i -> raw[i]).toArray() instanceof int[] g
            && Long.valueOf(1000000007L) instanceof Long M
            && new int[n][m] instanceof int[][] C
            && IntStream.range(0, n * m).filter(p -> Integer.valueOf((4 * (p / m) + 1) * W + 4 * (p % m) + 1) instanceof Integer base
                && Integer.valueOf((int) IntStream.range(0, 9).filter(q -> g[base + q / 3 * W + q % 3] == 'O').count()) instanceof Integer cnt
                && (C[p / m][p % m] = cnt == 2 || cnt == 3 ? (g[base + 2] == 'O' ? 1 : 2) : cnt == 6 ? (g[base + W] == 'O' ? 1 : 2) : 0) < 0).count() >= 0
            && new long[m] instanceof long[] two
            && new long[m] instanceof long[] one
            && IntStream.range(0, m).filter(c -> (one[c] = n % 2 == 0 && IntStream.range(0, n).noneMatch(r -> C[r][c] == 2) ? 1 : 0) < 0).count() >= 0
            && IntStream.range(0, m - 1).filter(c -> new long[n + 1] instanceof long[] f
                && (f[0] = 1) > 0
                && IntStream.rangeClosed(1, n).filter(r ->
                    (f[r] = ((C[r - 1][c] != 1 && C[r - 1][c + 1] != 1 ? f[r - 1] : 0)
                        + (r >= 2 && C[r - 1][c] != 2 && C[r - 2][c] != 2 && C[r - 1][c + 1] != 2 && C[r - 2][c + 1] != 2 ? f[r - 2] : 0)) % M) < 0).count() >= 0
                && (two[c] = f[n] % M) < 0).count() >= 0
            && new long[m + 1] instanceof long[] ways
            && (ways[0] = 1) > 0
            && IntStream.rangeClosed(1, m).filter(j -> (ways[j] = (ways[j - 1] * one[j - 1]
                + (j >= 2 ? ways[j - 2] * ((two[j - 2] - one[j - 2] * one[j - 1] + M) % M) : 0)) % M) < 0).count() >= 0
            ? ways[m] : 0L);
    }
}

