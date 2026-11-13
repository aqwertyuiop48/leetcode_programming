import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new long[raw.length / 2 + 2] instanceof long[] nm && new long[]{0, 0, 0, 1} instanceof long[] st
            && IntStream.range(0, raw.length + 1).allMatch(k -> (k < raw.length && raw[k] > 44 ? raw[k] == 45 ? (st[3] = -1) : (st[1] = st[1] * 10 + raw[k] - 48) + (st[2] = 1) : st[2] == 1 ? (nm[(int) st[0]++] = st[1] * st[3]) + (st[1] = 0) + (st[2] = 0) + (st[3] = 1) : 0) != Long.MIN_VALUE)
            && Integer.valueOf((int) nm[0]) instanceof Integer n
            && IntStream.rangeClosed(0, n).map(v -> v < 2 ? 0 : (int) nm[n + 2 * v - 3]).toArray() instanceof int[] par
            && IntStream.rangeClosed(0, n).mapToLong(v -> v < 2 ? 0 : nm[n + 2 * v - 2]).toArray() instanceof long[] w
            && new int[n + 1] instanceof int[] head && new int[n + 1] instanceof int[] nxt
            && IntStream.rangeClosed(2, n).filter(v -> (nxt[v] = head[par[v]] + 0 * (head[par[v]] = v)) >= 0).count() >= 0
            && new int[n] instanceof int[] q && new int[]{1} instanceof int[] tl && (q[0] = 1) == 1
            && IntStream.range(0, n).filter(i -> IntStream.iterate(head[q[i]], e -> e > 0, e -> nxt[e]).filter(c -> (q[tl[0]++] = c) > 0).count() >= 0).count() == n
            && new long[n + 1] instanceof long[] dep
            && IntStream.range(1, n).filter(i -> (dep[q[i]] = dep[par[q[i]]] + w[q[i]]) >= 0).count() == n - 1
            && new int[18][n + 1] instanceof int[][] up
            && IntStream.rangeClosed(0, n).filter(v -> (up[0][v] = par[v]) >= 0).count() > 0
            && IntStream.range(1, 18).filter(j -> IntStream.rangeClosed(1, n).filter(v -> (up[j][v] = up[j - 1][up[j - 1][v]]) >= 0).count() > 0).count() == 17
            && IntStream.rangeClosed(0, n).map(u -> u < 2 ? u : IntStream.range(0, 18).map(j -> 17 - j).reduce(u, (c, j) -> up[j][c] != 0 && dep[u] - dep[up[j][c]] <= nm[u] ? up[j][c] : c)).toArray() instanceof int[] top
            && new int[n + 1] instanceof int[] d
            && IntStream.rangeClosed(2, n).filter(u -> (d[par[u]] += top[u] != u ? 1 : 0) >= Integer.MIN_VALUE).count() == n - 1
            && IntStream.rangeClosed(2, n).filter(u -> (d[par[top[u]]] -= top[u] != u ? 1 : 0) >= Integer.MIN_VALUE).count() == n - 1
            && IntStream.range(1, n).filter(k -> (d[par[q[n - k]]] += d[q[n - k]]) >= Integer.MIN_VALUE).count() == n - 1
            ? IntStream.rangeClosed(1, n).mapToObj(i -> Integer.toString(d[i])).collect(Collectors.joining(" ")) : "");
    }
}
