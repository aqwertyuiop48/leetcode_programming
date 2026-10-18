import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            Arrays.stream(new String(System.in.readAllBytes()).trim().split("[ \r\n]+")).mapToLong(Long::parseLong).toArray() instanceof long[] in
            && Integer.valueOf((int) in[0]) instanceof Integer n
            && Integer.valueOf((int) in[1]) instanceof Integer m
            && Long.valueOf(in[2]) instanceof Long p
            && Integer.valueOf((int) Arrays.stream(in, 3, 3 + n).max().getAsLong()) instanceof Integer maxL
            && Integer.valueOf(Math.min(maxL, m)) instanceof Integer cap
            && new long[cap + 1] instanceof long[] A
            && new long[cap + 1] instanceof long[] F
            && (A[0] = 1 % p) >= 0 && (F[0] = 1 % p) >= 0
            && IntStream.rangeClosed(1, cap).allMatch(j -> (A[j] = A[j - 1] * (m - j + 1) % p) >= 0 && (F[j] = F[j - 1] * j % p) >= 0)
            && new int[maxL + 1][] instanceof int[][] f
            && (f[0] = new int[]{(int) (1 % p)}) != null
            && IntStream.rangeClosed(1, maxL).allMatch(l -> (f[l] = new int[Math.min(l, m) + 1]) != null
                && IntStream.rangeClosed(1, Math.min(l, m)).allMatch(j ->
                    (f[l][j] = (int) (((j == 1 && l == 1 ? 1L : l == 1 ? 0L : f[l - 1][j - 1])
                        + (j < f[l - 1].length ? (long) f[l - 1][j] * (j - 1) : 0L)) % p)) >= 0))
            && new long[][]{new long[1]} instanceof long[][] prev
            && new long[]{1 % p} instanceof long[] S
            && IntStream.range(0, n).allMatch(i -> Integer.valueOf((int) in[3 + i]) instanceof Integer l
                && new long[Math.min(l, m) + 1] instanceof long[] cur
                && IntStream.rangeClosed(1, Math.min(l, m)).allMatch(j ->
                    (cur[j] = (long) f[l][j] * Math.floorMod(A[j] * S[0] % p - (j < prev[0].length ? prev[0][j] * F[j] % p : 0L), p) % p) >= 0)
                && (S[0] = LongStream.of(cur).sum() % p) >= 0
                && (prev[0] = cur) != null)
            ? S[0] % p
            : -1);
    }
}
