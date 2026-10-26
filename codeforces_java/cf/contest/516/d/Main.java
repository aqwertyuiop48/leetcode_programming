import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && new int[2 * n] instanceof int[] to && new int[2 * n] instanceof int[] nxt && new long[2 * n] instanceof long[] w && new int[n + 1] instanceof int[] head
            && IntStream.rangeClosed(0, n).allMatch(i -> (head[i] = -1) < 0)
            && IntStream.range(0, n - 1).allMatch(i -> (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer a && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer b
                && (w[2 * i] = w[2 * i + 1] = Long.parseLong(tk.nextToken())) > 0
                && (to[2 * i] = b) > 0 && (nxt[2 * i] = head[a]) >= -1 && (head[a] = 2 * i) >= 0
                && (to[2 * i + 1] = a) > 0 && (nxt[2 * i + 1] = head[b]) >= -1 && (head[b] = 2 * i + 1) >= 0)
            && ((IntFunction<long[]>) src -> new long[n + 1] instanceof long[] dist && IntStream.rangeClosed(0, n).allMatch(i -> (dist[i] = -1) < 0) && (dist[src] = 0) == 0
                && new ArrayDeque<Integer>(List.of(src)) instanceof ArrayDeque<Integer> q
                && Stream.generate(q::poll).takeWhile(Objects::nonNull).allMatch(u -> IntStream.iterate(head[u], e -> e >= 0, e -> nxt[e]).allMatch(e ->
                    dist[to[e]] >= 0 || (dist[to[e]] = dist[u] + w[e]) >= 0 && q.add(to[e]))) ? dist : null) instanceof IntFunction<long[]> bfs
            && bfs.apply(1) instanceof long[] d1 && (Integer) IntStream.rangeClosed(1, n).boxed().max(Comparator.comparingLong(v -> d1[v])).get() instanceof Integer ea
            && bfs.apply(ea) instanceof long[] d2 && (Integer) IntStream.rangeClosed(1, n).boxed().max(Comparator.comparingLong(v -> d2[v])).get() instanceof Integer eb
            && bfs.apply(eb) instanceof long[] d3
            && IntStream.rangeClosed(1, n).mapToLong(v -> Math.max(d2[v], d3[v])).toArray() instanceof long[] dd0
            && IntStream.rangeClosed(0, n).mapToLong(v -> v == 0 ? 0 : Math.max(d2[v], d3[v])).toArray() instanceof long[] d
            && (Integer) IntStream.rangeClosed(1, n).boxed().min(Comparator.comparingLong((Integer v) -> d[v])).get() instanceof Integer root
            && new int[n + 1] instanceof int[] par && new int[n + 1] instanceof int[] dep && new int[n] instanceof int[] pre && new int[n + 1] instanceof int[] stack && new int[]{1, 0} instanceof int[] sp
            && (par[root] = root) > 0 && (stack[0] = root) > 0
            && Stream.generate(() -> 0).takeWhile(z -> sp[0] > 0).allMatch(z -> (Integer) stack[--sp[0]] instanceof Integer u && (pre[sp[1]++] = u) > 0
                && IntStream.iterate(head[u], e -> e >= 0, e -> nxt[e]).filter(e -> to[e] != par[u]).allMatch(e -> (par[to[e]] = u) > 0 && (dep[to[e]] = dep[u] + 1) > 0 && (stack[sp[0]++] = to[e]) > 0))
            && new int[]{65536, 32768, 16384, 8192, 4096, 2048, 1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1} instanceof int[] steps
            && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer q
            ? IntStream.range(0, q).mapToObj(qi -> (Long) Long.parseLong(tk.nextToken()) instanceof Long l
                && new int[n + 1] instanceof int[] add && new long[n + 1] instanceof long[] stD && new int[n + 1] instanceof int[] stV
                && IntStream.range(0, n).allMatch(i -> (Integer) pre[i] instanceof Integer u && (stD[dep[u]] = d[u]) >= 0 && (stV[dep[u]] = u) > 0
                    && (Integer) Arrays.stream(steps).reduce(0, (p, st) -> p + st <= dep[u] + 1 && stD[p + st - 1] < d[u] - l ? p + st : p) instanceof Integer pos
                    && ++add[u] > -1000000000 && (pos == 0 || --add[stV[pos - 1]] > -1000000000))
                && IntStream.iterate(n - 1, i -> i >= 1, i -> i - 1).allMatch(i -> (add[par[pre[i]]] += add[pre[i]]) > -1000000000)
                ? String.valueOf(IntStream.rangeClosed(1, n).map(v -> add[v]).max().getAsInt()) : "").collect(Collectors.joining("\n")) : "");
    }
}
