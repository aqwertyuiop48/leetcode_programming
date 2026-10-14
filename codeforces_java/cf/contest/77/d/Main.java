import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new BufferedReader(new InputStreamReader(System.in)).lines().collect(Collectors.toList()) instanceof List<String> L
            && Arrays.stream(L.get(0).trim().split(" ")).mapToInt(Integer::parseInt).toArray() instanceof int[] nm
            && Integer.valueOf(nm[0]) instanceof Integer n
            && Integer.valueOf(nm[1]) instanceof Integer m
            && Long.valueOf(1000000007L) instanceof Long M
            && new int[n][m] instanceof int[][] C
            && new int[m] instanceof int[] cv
            && new long[m] instanceof long[] bl
            && new long[m + 1] instanceof long[] dp
            && IntStream.range(0, n).allMatch(i -> IntStream.range(0, m).allMatch(j ->
                IntStream.range(0, 3).mapToObj(r -> L.get(4 * i + 2 + r).substring(4 * j + 1, 4 * j + 4)).collect(Collectors.joining()) instanceof String s
                && Integer.valueOf((int) s.chars().filter(x -> x == 'O').count()) instanceof Integer cnt
                && (C[i][j] = (cnt == 2 || cnt == 3) ? (s.charAt(2) == 'O' ? 1 : 2) : cnt == 6 ? (s.charAt(3) == 'O' ? 2 : 1) : 0) >= 0))
            && IntStream.range(0, m).allMatch(c -> (cv[c] = n % 2 == 0 && IntStream.range(0, n / 2).allMatch(k -> C[2 * k][c] != 2 && C[2 * k + 1][c] != 2) ? 1 : 0) >= 0)
            && IntStream.range(0, m - 1).allMatch(c -> new long[n + 1] instanceof long[] gg
                && (gg[0] = 1) > 0
                && IntStream.rangeClosed(1, n).allMatch(i -> (gg[i] = (gg[i - 1] * (C[i - 1][c] != 1 && C[i - 1][c + 1] != 1 ? 1 : 0)
                    + (i >= 2 && C[i - 1][c] != 2 && C[i - 2][c] != 2 && C[i - 1][c + 1] != 2 && C[i - 2][c + 1] != 2 ? gg[i - 2] : 0)) % M) >= 0)
                && (bl[c] = gg[n]) >= 0)
            && (dp[0] = 1) > 0
            && IntStream.rangeClosed(1, m).allMatch(j -> (dp[j] = (dp[j - 1] * cv[j - 1] + (j >= 2 ? dp[j - 2] * ((bl[j - 2] - (long) cv[j - 2] * cv[j - 1] + M) % M) : 0)) % M) >= 0)
            ? dp[m] : 0L);
    }
}
