import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && new int[2 * n] instanceof int[] to && new int[2 * n] instanceof int[] nxt && new int[n + 1] instanceof int[] head && IntStream.rangeClosed(0, n).allMatch(i -> (head[i] = -1) < 0)
            && IntStream.range(0, n - 1).allMatch(i -> (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer a && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer b
                && (to[2 * i] = b) > 0 && (nxt[2 * i] = head[a]) >= -1 && (head[a] = 2 * i) >= 0 && (to[2 * i + 1] = a) > 0 && (nxt[2 * i + 1] = head[b]) >= -1 && (head[b] = 2 * i + 1) >= 0)
            && new int[17 * (n + 1)] instanceof int[] up && new int[n + 1] instanceof int[] dep && new int[n] instanceof int[] ord && new int[]{0, 1} instanceof int[] qs
            && (ord[0] = 1) > 0
            && Stream.generate(() -> 0).takeWhile(z -> qs[0] < qs[1]).allMatch(z -> (Integer) ord[qs[0]++] instanceof Integer u
                && IntStream.iterate(head[u], e -> e >= 0, e -> nxt[e]).filter(e -> to[e] != up[u]).allMatch(e -> (up[to[e]] = u) > 0 && (dep[to[e]] = dep[u] + 1) > 0 && (ord[qs[1]++] = to[e]) > 0))
            && IntStream.range(1, 17).allMatch(k -> IntStream.rangeClosed(0, n).allMatch(v -> (up[k * (n + 1) + v] = up[(k - 1) * (n + 1) + up[(k - 1) * (n + 1) + v]]) >= 0))
            && new int[n + 1] instanceof int[] size && IntStream.rangeClosed(1, n).allMatch(v -> (size[v] = 1) > 0)
            && IntStream.iterate(n - 1, i -> i >= 1, i -> i - 1).allMatch(i -> (size[up[ord[i]]] += size[ord[i]]) > 0)
            && ((IntBinaryOperator) (v, k) -> IntStream.range(0, 17).reduce(v, (x, b) -> (k >> b & 1) == 1 ? up[b * (n + 1) + x] : x)) instanceof IntBinaryOperator kth
            && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer m
            ? IntStream.range(0, m).mapToObj(i -> (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer p && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer q
                && (Integer) (dep[p] >= dep[q] ? p : q) instanceof Integer a && (Integer) (dep[p] >= dep[q] ? q : p) instanceof Integer b
                ? a.equals(b) ? String.valueOf(n)
                    : new int[]{kth.applyAsInt(a, dep[a] - dep[b]), b} instanceof int[] st
                    && (st[0] == st[1] || IntStream.iterate(16, k -> k >= 0, k -> k - 1).allMatch(k -> up[k * (n + 1) + st[0]] == up[k * (n + 1) + st[1]]
                        || (st[0] = up[k * (n + 1) + st[0]]) * 0 == 0 && (st[1] = up[k * (n + 1) + st[1]]) * 0 == 0) || true)
                    && (Integer) (st[0] == st[1] ? st[0] : up[st[0]]) instanceof Integer l
                    && (Integer) (dep[a] + dep[b] - 2 * dep[l]) instanceof Integer d
                    ? d % 2 == 1 ? "0"
                        : dep[a] == dep[b] ? String.valueOf(n - size[kth.applyAsInt(a, dep[a] - dep[l] - 1)] - size[kth.applyAsInt(b, dep[b] - dep[l] - 1)])
                        : String.valueOf(size[kth.applyAsInt(a, d / 2)] - size[kth.applyAsInt(a, d / 2 - 1)]) : "" : "").collect(Collectors.joining("\n")) : "");
    }
}
