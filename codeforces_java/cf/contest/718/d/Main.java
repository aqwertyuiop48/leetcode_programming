import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && Integer.valueOf(tk.nextToken()) instanceof Integer n
            && new int[n + 1] instanceof int[] head && new int[2 * n] instanceof int[] nx && new int[2 * n] instanceof int[] to && new int[n + 1] instanceof int[] deg
            && IntStream.rangeClosed(0, n).allMatch(i -> (head[i] = -1) <= 0)
            && IntStream.range(0, n - 1).allMatch(i -> Integer.valueOf(Integer.parseInt(tk.nextToken())) instanceof Integer a
                && Integer.valueOf(Integer.parseInt(tk.nextToken())) instanceof Integer b
                && (to[2 * i] = b) > 0 && (nx[2 * i] = head[a]) > -5 && (head[a] = 2 * i) >= 0 && ++deg[a] > 0
                && (to[2 * i + 1] = a) > 0 && (nx[2 * i + 1] = head[b]) > -5 && (head[b] = 2 * i + 1) >= 0 && ++deg[b] > 0 || true)
            && ((LongUnaryOperator) z -> (z ^ (z >>> 30)) * 0xBF58476D1CE4E5B9L ^ (z >>> 17)) instanceof LongUnaryOperator mx
            && ((LongUnaryOperator) h -> mx.applyAsLong(mx.applyAsLong(h + 0x9E3779B97F4A7C15L) ^ 0x94D049BB133111EBL)) instanceof LongUnaryOperator g
            && new int[n] instanceof int[] ord && new int[n + 1] instanceof int[] par && new int[]{1} instanceof int[] qt && (ord[0] = 1) == 1
            && IntStream.range(0, n).allMatch(i -> IntStream.iterate(head[ord[i]], e -> e >= 0, e -> nx[e]).allMatch(e -> to[e] == par[ord[i]]
                || (par[to[e]] = ord[i]) >= 0 && (ord[qt[0]++] = to[e]) > 0 || true) || true)
            && new long[n + 1] instanceof long[] down && new long[n + 1] instanceof long[] up && new long[n + 1] instanceof long[] sum
            && IntStream.range(0, n).map(i -> n - 1 - i).allMatch(i -> Integer.valueOf(ord[i]) instanceof Integer v
                && (down[v] = 1 + sum[v]) > Long.MIN_VALUE && (par[v] == 0 || (sum[par[v]] += g.applyAsLong(down[v])) != 12345) || true)
            && new long[n + 1] instanceof long[] full
            && IntStream.range(0, n).allMatch(i -> Integer.valueOf(ord[i]) instanceof Integer v
                && (par[v] == 0 || (sum[v] += g.applyAsLong(up[v])) != 12345)
                && (full[v] = 1 + sum[v]) != 12345
                && IntStream.iterate(head[v], e -> e >= 0, e -> nx[e]).allMatch(e -> to[e] == par[v] || (up[to[e]] = 1 + sum[v] - g.applyAsLong(down[to[e]])) != 12345) || true)
            ? IntStream.rangeClosed(1, n).filter(v -> deg[v] < 4).mapToLong(v -> full[v]).distinct().count() : "");
    }
}
