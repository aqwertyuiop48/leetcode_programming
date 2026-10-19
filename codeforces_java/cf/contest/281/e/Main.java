import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n
            && new int[n] instanceof int[] head && new int[2 * n] instanceof int[] nxt && new int[2 * n] instanceof int[] to && new int[n] instanceof int[] dep && new int[n] instanceof int[] q
            && IntStream.range(0, n).allMatch(i -> (head[i] = -1) < 0)
            && IntStream.range(0, n - 1).allMatch(i -> Integer.valueOf(it.next() - 1) instanceof Integer u && Integer.valueOf(it.next() - 1) instanceof Integer v
                && (to[2 * i] = v) >= 0 && (nxt[2 * i] = head[u]) > -2 && (head[u] = 2 * i) >= 0
                && (to[2 * i + 1] = u) >= 0 && (nxt[2 * i + 1] = head[v]) > -2 && (head[v] = 2 * i + 1) >= 0)
            && (dep[0] = 1) == 1 && new int[]{0} instanceof int[] tail
            && IntStream.range(0, n).allMatch(qi -> IntStream.iterate(head[q[qi]], e -> e >= 0, e -> nxt[e]).filter(e -> dep[to[e]] == 0)
                .allMatch(e -> (dep[to[e]] = dep[q[qi]] + 1) > 0 && (q[++tail[0]] = to[e]) >= 0))
            ? String.format("%.12f", IntStream.range(0, n).mapToDouble(i -> 1.0 / dep[i]).sum()) : "");
    }
}
