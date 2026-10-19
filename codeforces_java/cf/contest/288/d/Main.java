import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n
            && new int[n] instanceof int[] head && new int[2 * n] instanceof int[] nxt && new int[2 * n] instanceof int[] to && new int[n] instanceof int[] par && new int[n] instanceof int[] q && new int[n] instanceof int[] sz
            && IntStream.range(0, n).allMatch(i -> (head[i] = -1) < 0 && (par[i] = -1) < 0 && (sz[i] = 1) > 0)
            && IntStream.range(0, n - 1).allMatch(i -> Integer.valueOf(it.next() - 1) instanceof Integer u && Integer.valueOf(it.next() - 1) instanceof Integer v
                && (to[2 * i] = v) >= 0 && (nxt[2 * i] = head[u]) > -2 && (head[u] = 2 * i) >= 0
                && (to[2 * i + 1] = u) >= 0 && (nxt[2 * i + 1] = head[v]) > -2 && (head[v] = 2 * i + 1) >= 0)
            && (par[0] = n) == n && new int[]{0} instanceof int[] tail
            && IntStream.range(0, n).allMatch(qi -> IntStream.iterate(head[q[qi]], e -> e >= 0, e -> nxt[e]).filter(e -> par[to[e]] < 0)
                .allMatch(e -> (par[to[e]] = q[qi]) >= 0 && (q[++tail[0]] = to[e]) >= 0))
            && IntStream.iterate(n - 1, i -> i > 0, i -> i - 1).allMatch(i -> (sz[par[q[i]]] += sz[q[i]]) > 0)
            && new long[n] instanceof long[] sq && IntStream.range(0, n).allMatch(v -> (sq[v] = 0) == 0)
            && IntStream.range(1, n).allMatch(v -> (sq[par[v]] += (long) sz[v] * sz[v]) > 0)
            && IntStream.range(0, n).allMatch(v -> (sq[v] += (long) (n - sz[v]) * (n - sz[v])) >= 0)
            && Long.valueOf((long) n * (n - 1) / 2) instanceof Long P
            ? Long.toUnsignedString(P * P
                - IntStream.range(0, n).mapToLong(v -> Long.valueOf(n - 1 + ((long) (n - 1) * (n - 1) - sq[v]) / 2) instanceof Long c ? c * c : 0).sum()
                + IntStream.range(1, n).mapToLong(v -> Long.valueOf((long) sz[v] * (n - sz[v])) instanceof Long c ? c * c : 0).sum()) : "");
    }
}
