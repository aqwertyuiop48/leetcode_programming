
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && Integer.valueOf(Integer.parseInt(tk.nextToken())) instanceof Integer tc
            && IntStream.range(0, 3 * tc).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] in
            && ((Function<int[], String>) c -> Integer.valueOf(Math.max(c[0], c[1])) instanceof Integer n && Integer.valueOf(Math.min(c[0], c[1])) instanceof Integer m && Integer.valueOf(c[2]) instanceof Integer k
                && Integer.valueOf(c[0] < c[1] ? 1 : 0) instanceof Integer ty && Integer.valueOf(m + 2) instanceof Integer w && Integer.valueOf(8 * n * m) instanceof Integer M
                && new int[(n + 2) * w] instanceof int[] a && new int[1][] instanceof int[][] as && new int[2] instanceof int[] st && new LongUnaryOperator[1] instanceof LongUnaryOperator[] dfs
                && ((IntBinaryOperator) (x, y) -> (a[(x - 1) * w + y] == 1 ? a[x * w + y + 1] + a[(x - 1) * w + y - 1] + a[(x - 1) * w + y + 1] : 0)
                    + (a[(x + 1) * w + y] == 1 ? a[x * w + y - 1] + a[(x + 1) * w + y - 1] + a[(x + 1) * w + y + 1] : 0)
                    + (a[x * w + y - 1] == 1 ? a[(x - 1) * w + y] + a[(x - 1) * w + y - 1] + a[(x + 1) * w + y - 1] : 0)
                    + (a[x * w + y + 1] == 1 ? a[(x - 1) * w + y + 1] + a[(x + 1) * w + y] + a[(x + 1) * w + y + 1] : 0)) instanceof IntBinaryOperator tcalc
                && (dfs[0] = key -> Integer.valueOf((int) (key >>> 40)) instanceof Integer x && Integer.valueOf((int) (key >>> 31 & 511)) instanceof Integer y && Integer.valueOf((int) (key & 2147483647L)) instanceof Integer s
                    ? (st[0] != 0 ? 0L
                        : (x != 1 || y != 1) && s.intValue() == k ? (st[0] = 1) * 0L + (as[0] = a.clone()).length * 0L
                        : x > n ? 0L
                        : y > m ? dfs[0].applyAsLong(((long) (x + 1) << 40) | (1L << 31) | s)
                        : ++st[1] > M ? 0L
                        : Integer.valueOf(tcalc.applyAsInt(x, y)) instanceof Integer t
                            ? ((s + t <= k && (x < 2 || y < 2 || a[(x - 1) * w + y] == 1 || a[x * w + y - 1] == 1)
                                ? (a[x * w + y] = 1) * 0L + dfs[0].applyAsLong(((long) x << 40) | ((long) (y + 1) << 31) | (s + t)) + (a[x * w + y] = 0) * 0L : 0L)
                                + dfs[0].applyAsLong(((long) x << 40) | ((long) (y + 1) << 31) | s)) : 0L) : 0L) != null
                && dfs[0].applyAsLong((1L << 40) | (1L << 31)) >= 0
                ? (st[0] == 0 ? "-1" : (ty == 1 ? IntStream.rangeClosed(1, m).mapToObj(j -> IntStream.rangeClosed(1, n).mapToObj(i -> as[0][i * w + j] == 1 ? "*" : ".").collect(Collectors.joining())) : IntStream.rangeClosed(1, n).mapToObj(i -> IntStream.rangeClosed(1, m).mapToObj(j -> as[0][i * w + j] == 1 ? "*" : ".").collect(Collectors.joining()))).collect(Collectors.joining("\n")))
                : "") instanceof Function<int[], String> solve
            ? Executors.newSingleThreadExecutor(r -> Stream.of(new Thread(null, r, "w", 1L << 29)).peek(th -> th.setDaemon(true)).findFirst().get())
                .submit(() -> IntStream.range(0, tc).mapToObj(i -> solve.apply(new int[]{in[3 * i], in[3 * i + 1], in[3 * i + 2]})).collect(Collectors.joining("\n\n"))).get() : "");
    }
}
