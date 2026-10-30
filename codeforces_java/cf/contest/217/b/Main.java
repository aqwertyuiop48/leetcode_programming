import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && (Integer) sc.nextInt() instanceof Integer n && (Integer) sc.nextInt() instanceof Integer r
            && new LongBinaryOperator[1] instanceof LongBinaryOperator[] g
            && (g[0] = (a, b) -> b == 0 ? (a == 1 ? 0L : 1L << 50) : g[0].applyAsLong(b, a % b) + (a / b) * 64 + 1) != null
            ? r == 1 ? n == 1 ? "0\nT" : "IMPOSSIBLE"
                : (Long) IntStream.range(1, r).mapToLong(k -> g[0].applyAsLong(r, k) >> 6 == n ? (g[0].applyAsLong(r, k) & 63) * (1L << 21) + k : -1L).max().orElse(-1L) instanceof Long key && key >= 0
                    && (Integer) (int) (key >> 21) instanceof Integer m && (Integer) (int) (key & ((1 << 21) - 1)) instanceof Integer k0
                    && Stream.iterate(new long[]{r, k0}, p -> p[1] > 0, p -> new long[]{p[1], p[0] % p[1]}).mapToLong(p -> p[0] / p[1]).toArray() instanceof long[] q
                    ? (n - m - 1) + "\n" + new StringBuilder(IntStream.range(0, m).mapToObj(j -> ((m - 1 - j) % 2 == 0 ? "B" : "T").repeat((int) (j == m - 1 ? q[j] - 1 : q[j]))).collect(Collectors.joining()) + "T").reverse()
                    : "IMPOSSIBLE"
            : "");
    }
}
