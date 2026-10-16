import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.stream(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().collect(Collectors.joining(" ")).trim().split(" +")).mapToInt(Integer::parseInt).toArray() instanceof int[] v
            && Integer.valueOf(v[0]) instanceof Integer M
            && Integer.valueOf(IntStream.rangeClosed(1, M).map(i -> v[i]).sum()) instanceof Integer N
            && new long[N + 1][N + 1] instanceof long[][] C
            && IntStream.rangeClosed(0, N).allMatch(i -> (C[i][0] = 1) > 0
                && IntStream.rangeClosed(1, i).allMatch(j -> (C[i][j] = (C[i - 1][j - 1] + C[i - 1][j]) % 1000000007L) >= 0))
            && IntStream.rangeClosed(1, M).boxed().reduce(IntStream.rangeClosed(0, N).mapToLong(a -> a == 0 ? 1L : 0L).toArray(), (dp, i) ->
                new long[N + 1] instanceof long[] nd
                && Integer.valueOf(IntStream.rangeClosed(1, i).map(j -> v[j]).sum()) instanceof Integer P
                && IntStream.rangeClosed(0, Math.min(N, P)).allMatch(a -> IntStream.rangeClosed(0, Math.min(v[M + i], P - a)).allMatch(S ->
                    (nd[a + S] = (nd[a + S] + dp[a] * C[P - a][S]) % 1000000007L) >= 0))
                ? nd : dp, (p, q) -> p) instanceof long[] fin
            ? "" + IntStream.rangeClosed(1, M).boxed().reduce(fin[N], (acc, i) -> acc * C[IntStream.rangeClosed(1, i).map(j -> v[j]).sum()][v[i]] % 1000000007L, (p, q) -> p)
            : "");
    }
}




