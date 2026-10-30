import java.util.*;
import java.util.function.*;
import java.util.stream.*;


public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && Integer.valueOf(tk.nextToken()) instanceof Integer n
            && Integer.valueOf(tk.nextToken()) instanceof Integer m
            && Integer.valueOf(tk.nextToken()) instanceof Integer p
            && IntStream.rangeClosed(0, n).map(i -> i == 0 ? 0 : Integer.parseInt(tk.nextToken()) % p).toArray() instanceof int[] x
            && IntStream.rangeClosed(0, m).map(i -> i == 0 ? 0 : Integer.parseInt(tk.nextToken()) % p).toArray() instanceof int[] y
            && IntStream.range(0, m).map(t -> y[m - t]).toArray() instanceof int[] yr
            && Integer.valueOf(n + m) instanceof Integer K
            && Integer.valueOf(192) instanceof Integer B
            && Integer.valueOf((K + B - 1) / B) instanceof Integer nb
            && Stream.of(0, 1, 2).map(q -> IntStream.range(0, n + 3).map(i -> -1).toArray()).toArray(int[][]::new) instanceof int[][] A
            && new int[n + 3] instanceof int[] ps
            && new int[n + 3] instanceof int[] yb
            && new int[n + 3] instanceof int[] sc
            && new int[Math.min(B, K)][n + 3] instanceof int[][] rows
            && new int[K / B + 2][] instanceof int[][] ck
            && new int[1][] instanceof int[][] rowRef
            && (A[1][0] = 0) == 0 && (A[1][1] = 0) == 0
            && ((IntPredicate) (k -> Integer.valueOf(Math.max(1, k - m)) instanceof Integer lo
                && Integer.valueOf(Math.min(n, k - 1)) instanceof Integer hi
                && A[k % 3] instanceof int[] cur && A[(k + 2) % 3] instanceof int[] prev && rowRef[0] instanceof int[] di
                && Stream.of(0)
                    .peek(u -> System.arraycopy(prev, lo - 1, ps, lo, hi - lo + 1))
                    .peek(u -> System.arraycopy(yr, lo + m - k, yb, lo, hi - lo + 1))
                    .peek(u -> IntStream.range(lo, hi + 1).forEach(i -> cur[i] = Math.max(ps[i], prev[i]) + (x[i] + yb[i] - p) + (((x[i] + yb[i] - p) >> 31) & p) + 0 * (di[i] = (prev[i] - ps[i]) >>> 31)))
                    .findFirst().isPresent())) instanceof IntPredicate step
            && new int[]{0} instanceof int[] res
            && IntStream.rangeClosed(2, K).allMatch(k -> (rowRef[0] = sc) != null && step.test(k) && (k % B != 0 || (ck[k / B] = Arrays.copyOf(A[k % 3], Math.min(n, k - 1) + 1)) != null))
            && (res[0] = A[K % 3][n]) >= -1
            && new byte[K - 2] instanceof byte[] out
            && new int[]{n} instanceof int[] cr
            && IntStream.range(0, nb).allMatch(q -> Integer.valueOf(nb - 1 - q) instanceof Integer b
                && Integer.valueOf(Math.max(2, b * B + 1)) instanceof Integer s
                && Integer.valueOf(Math.min(K, (b + 1) * B)) instanceof Integer e
                && Stream.of(0).peek(u -> Arrays.fill(A[0], -1)).peek(u -> Arrays.fill(A[1], -1)).peek(u -> Arrays.fill(A[2], -1)).findFirst().isPresent()
                && (b == 0 ? (A[1][0] = 0) == 0 && (A[1][1] = 0) == 0
                    : ck[b].length > 0 && Stream.of(0).peek(u -> System.arraycopy(ck[b], 0, A[(b * B) % 3], 0, ck[b].length)).findFirst().isPresent())
                && IntStream.rangeClosed(s, e).allMatch(k -> (rowRef[0] = rows[k - s]) != null && step.test(k))
                && IntStream.range(0, e - s + 1).allMatch(t -> Integer.valueOf(e - t) instanceof Integer k
                    && (k < 3 || ((Integer) rows[k - s][cr[0]] instanceof Integer c && (out[k - 3] = (byte) (c > 0 ? 'C' : 'S')) > 0 && (cr[0] -= c) > 0))))
            ? res[0] + "\n" + new String(out) : "");
    }


}
