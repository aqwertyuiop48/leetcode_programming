import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] g
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((g[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && Integer.valueOf(g[0]) instanceof Integer n
            && Integer.valueOf(g[1]) instanceof Integer m
            && new int[n][n] instanceof int[][] A
            && IntStream.range(0, m).allMatch(e -> (A[g[2 + 2 * e] - 1][g[3 + 2 * e] - 1] = A[g[3 + 2 * e] - 1][g[2 + 2 * e] - 1] = 1) == 1)
            && new long[n][(n + 63) / 64] instanceof long[][] R
            && IntStream.range(0, n).allMatch(i -> IntStream.range(0, n).filter(j -> A[i][j] == 1).filter(j -> (R[i][j >> 6] |= 1L << j) != 0).count() >= 0)
            && new int[n][n] instanceof int[][] B
            && IntStream.range(0, n).allMatch(i -> IntStream.range(0, n).filter(j -> (B[i][j] = IntStream.range(0, R[i].length).map(w -> Long.bitCount(R[i][w] & R[j][w])).sum()) >= 0).count() >= 0)
            && Long.valueOf(IntStream.range(0, n).mapToLong(i -> IntStream.range(0, n).filter(k -> k > i && A[i][k] == 1).mapToLong(k -> 2L * IntStream.range(0, n).map(j -> B[i][j] * B[k][j]).sum()).sum()).sum()) instanceof Long t5
            ? (t5
                - 5 * IntStream.range(0, n).mapToLong(i -> IntStream.range(0, n).filter(k -> A[i][k] == 1).mapToLong(k -> B[i][k]).sum()).sum()
                - 5 * IntStream.range(0, n).mapToLong(i -> (IntStream.of(A[i]).sum() - 2L) * IntStream.range(0, n).filter(k -> A[i][k] == 1).mapToLong(k -> B[i][k]).sum()).sum()) / 10
            : 0L);
    }
}

