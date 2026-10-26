import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n
            && new int[2 * n] instanceof int[] to && new int[2 * n] instanceof int[] nxt && new int[n + 1] instanceof int[] head && IntStream.rangeClosed(0, n).allMatch(i -> (head[i] = -1) < 0)
            && IntStream.range(0, n - 1).allMatch(i -> (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer a && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer b
                && (to[2 * i] = b) > 0 && (nxt[2 * i] = head[a]) >= -1 && (head[a] = 2 * i) >= 0 && (to[2 * i + 1] = a) > 0 && (nxt[2 * i + 1] = head[b]) >= -1 && (head[b] = 2 * i + 1) >= 0)
            && new int[n + 1] instanceof int[] par && new int[n + 1] instanceof int[] dep && new int[n] instanceof int[] ord && new int[]{0, 1} instanceof int[] qs && (ord[0] = 1) > 0
            && Stream.generate(() -> 0).takeWhile(z -> qs[0] < qs[1]).allMatch(z -> (Integer) ord[qs[0]++] instanceof Integer u
                && IntStream.iterate(head[u], e -> e >= 0, e -> nxt[e]).filter(e -> to[e] != par[u]).allMatch(e -> (par[to[e]] = u) > 0 && (dep[to[e]] = dep[u] + 1) > 0 && (ord[qs[1]++] = to[e]) > 0))
            && new long[n + 1] instanceof long[] fa && new long[n + 1] instanceof long[] fb && new boolean[n + 1] instanceof boolean[] hasChild
            && IntStream.range(0, n).allMatch(i -> (Integer) ord[n - 1 - i] instanceof Integer v
                && (hasChild[v] ? (fa[v] = fa[v]) >= 0 : (fa[v] = 1) > 0 && (fb[v] = 1) > 0)
                && (v == 1 || (hasChild[par[v]] ? (dep[par[v]] % 2 == 0 ? (fa[par[v]] = Math.min(fa[par[v]], fa[v])) > 0 && (fb[par[v]] += fb[v]) > 0 : (fa[par[v]] += fa[v]) > 0 && (fb[par[v]] = Math.min(fb[par[v]], fb[v])) > 0)
                    : (hasChild[par[v]] = true) && (fa[par[v]] = fa[v]) > 0 && (fb[par[v]] = fb[v]) > 0)))
            ? (IntStream.rangeClosed(1, n).filter(v -> !hasChild[v]).count() - fa[1] + 1) + " " + fb[1] : "");
    }
}
