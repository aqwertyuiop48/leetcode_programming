import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && IntStream.range(0, 3).map(i -> sc.nextInt() - 1).toArray() instanceof int[] st
            && IntStream.range(0, n).mapToObj(i -> sc.next().toCharArray()).toArray(char[][]::new) instanceof char[][] col
            && Integer.valueOf(n * n * n) instanceof Integer N
            && new int[N] instanceof int[] dist && new int[N] instanceof int[] par && new int[N] instanceof int[] mv && new int[N] instanceof int[] q
            && IntStream.range(0, N).allMatch(i -> (dist[i] = -1) < 0)
            && new int[]{n * n, n, 1} instanceof int[] mul
            && new long[n * 26] instanceof long[] adj
            && IntStream.range(0, n).allMatch(x -> IntStream.range(0, n).allMatch(y -> x == y || (adj[x * 26 + col[x][y] - 'a'] |= 1L << y) > 0))
            && new long[][]{new long[n * n], new long[n * n], new long[n * n]} instanceof long[][] vis
            && Integer.valueOf(st[0] * mul[0] + st[1] * mul[1] + st[2]) instanceof Integer s0
            && IntStream.range(0, 3).allMatch(j -> (vis[j][st[(j + 1) % 3] * n + st[(j + 2) % 3]] |= 1L << st[j]) != 0)
            && (dist[s0] = 0) == 0 && (q[0] = s0) >= 0 && new int[]{0, 1} instanceof int[] ptr
            && (IntStream.iterate(0, z -> ptr[0] < ptr[1], z -> z + 1).allMatch(z -> Integer.valueOf(q[ptr[0]++]) instanceof Integer s
                && new int[]{s / mul[0], s / n % n, s % n} instanceof int[] p
                && IntStream.range(0, 3).allMatch(i -> Integer.valueOf(p[(i + 1) % 3]) instanceof Integer a && Integer.valueOf(p[(i + 2) % 3]) instanceof Integer b
                    && Long.valueOf(adj[p[i] * 26 + col[a][b] - 'a'] & ~vis[i][a * n + b] & ~((1L << a) | (1L << b))) instanceof Long cand
                    && LongStream.iterate(cand, x -> x != 0, x -> x & (x - 1)).map(x -> Long.numberOfTrailingZeros(x)).allMatch(yl -> Integer.valueOf((int) yl) instanceof Integer y
                        && Integer.valueOf(s + (y - p[i]) * mul[i]) instanceof Integer ns
                        && Arrays.copyOf(p, 3) instanceof int[] np && (np[i] = y) >= 0
                        && IntStream.range(0, 3).allMatch(j -> (vis[j][np[(j + 1) % 3] * n + np[(j + 2) % 3]] |= 1L << np[j]) != 0)
                        && (dist[ns] = dist[s] + 1) > 0 && (par[ns] = s) >= 0 && (mv[ns] = p[i] * n + y) >= 0 && (q[ptr[1]++] = ns) >= 0))) || true)
            && Stream.of(new int[]{0, 1, 2}, new int[]{0, 2, 1}, new int[]{1, 0, 2}, new int[]{1, 2, 0}, new int[]{2, 0, 1}, new int[]{2, 1, 0})
                .map(p -> p[0] * mul[0] + p[1] * mul[1] + p[2]).filter(t -> dist[t] >= 0).min(Comparator.comparingInt(t -> dist[t])) instanceof Optional<Integer> best
            ? best.isEmpty() ? "-1" : Integer.valueOf(dist[best.get()]) instanceof Integer d
                && IntStream.iterate(best.get(), s -> par[s]).limit(d).toArray() instanceof int[] chain
                ? d + IntStream.range(0, d).mapToObj(j -> "\n" + (mv[chain[d - 1 - j]] / n + 1) + " " + (mv[chain[d - 1 - j]] % n + 1)).collect(Collectors.joining()) : "" : "");
    }
}

