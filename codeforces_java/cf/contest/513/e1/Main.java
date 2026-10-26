import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer k
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] a
            && new long[2][4 * (k + 1)] instanceof long[][] buf && (Long) (-1000000000000000000L) instanceof Long neg
            && IntStream.range(0, 4 * (k + 1)).allMatch(i -> (buf[0][i] = neg) < 0) && new long[]{neg} instanceof long[] ans
            ? k == 1 ? 0L : IntStream.range(0, n).allMatch(i -> buf[i & 1] instanceof long[] p && buf[(i + 1) & 1] instanceof long[] q
                && IntStream.range(0, 4 * (k + 1)).allMatch(idx -> (Integer) (idx / (k + 1)) instanceof Integer ph && (Integer) (idx % (k + 1)) instanceof Integer j
                    && (Integer) (j == 1 || j == k ? 1 : 2) instanceof Integer mg
                    && (q[idx] = j == 0 ? neg : ph == 0
                        ? Math.max(Math.max(p[j], p[3 * (k + 1) + j - 1]), Math.max(p[2 * (k + 1) + j - 1], j == 1 ? 0 : neg)) + mg * a[i]
                        : ph == 1
                        ? Math.max(Math.max(p[(k + 1) + j], p[j]), j < k ? Math.max(p[(k + 1) + j - 1], p[j - 1]) : neg)
                        : ph == 2
                        ? Math.max(Math.max(p[2 * (k + 1) + j], p[(k + 1) + j - 1]), Math.max(p[j - 1], j == 1 ? 0 : neg)) - mg * a[i]
                        : Math.max(Math.max(p[2 * (k + 1) + j], p[3 * (k + 1) + j]), j < k ? Math.max(p[3 * (k + 1) + j - 1], p[2 * (k + 1) + j - 1]) : neg)) > Long.MIN_VALUE
                    && (q[idx] = Math.max(q[idx], neg)) <= Long.MAX_VALUE)
                && (ans[0] = Math.max(ans[0], Math.max(q[k], q[2 * (k + 1) + k]))) <= Long.MAX_VALUE) ? ans[0] : 0
            : "");
    }
}
