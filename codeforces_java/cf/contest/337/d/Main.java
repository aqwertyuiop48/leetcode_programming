import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToInt(t -> Integer.parseInt((String) t)).toArray() instanceof int[] t
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(t[1]) instanceof Integer m && Integer.valueOf(t[2]) instanceof Integer d
            && IntStream.generate(() -> -1).limit(n + 1).toArray() instanceof int[] head && new int[2 * n] instanceof int[] nxt && new int[2 * n] instanceof int[] to
            && IntStream.range(0, n - 1).allMatch(i -> (to[2 * i] = t[3 + m + 2 * i + 1] - 1) >= 0 & (nxt[2 * i] = head[t[3 + m + 2 * i] - 1]) >= -1 & (head[t[3 + m + 2 * i] - 1] = 2 * i) >= 0
                & (to[2 * i + 1] = t[3 + m + 2 * i] - 1) >= 0 & (nxt[2 * i + 1] = head[t[3 + m + 2 * i + 1] - 1]) >= -1 & (head[t[3 + m + 2 * i + 1] - 1] = 2 * i + 1) >= 0)
            && ((IntFunction<int[]>) src -> IntStream.generate(() -> -1).limit(n).toArray() instanceof int[] dist && new int[n] instanceof int[] q && new int[]{0, 1} instanceof int[] qp
                && (dist[src] = 0) == 0 && (q[0] = src) == src
                && IntStream.range(0, n).allMatch(i -> i >= qp[1] || IntStream.iterate(head[q[i]], e -> e >= 0, e -> nxt[e]).filter(e -> dist[to[e]] < 0)
                    .allMatch(e -> (dist[to[e]] = dist[q[i]] + 1) > 0 && (q[qp[1]++] = to[e]) >= 0)) ? dist : null) instanceof IntFunction<int[]> bfs
            && Integer.valueOf(t[3] - 1) instanceof Integer p0
            && bfs.apply(p0) instanceof int[] d0
            && Integer.valueOf(IntStream.range(0, m).map(i -> t[3 + i] - 1).boxed().max(Comparator.comparingInt(v -> d0[v])).get()) instanceof Integer a
            && bfs.apply(a) instanceof int[] da
            && Integer.valueOf(IntStream.range(0, m).map(i -> t[3 + i] - 1).boxed().max(Comparator.comparingInt(v -> da[v])).get()) instanceof Integer b
            && bfs.apply(b) instanceof int[] db
            ? IntStream.range(0, n).filter(v -> da[v] <= d && db[v] <= d).count() : "");
    }
}
