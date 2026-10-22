import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n
            && new int[n + 1] instanceof int[] head && new int[2 * n] instanceof int[] nxt && new int[2 * n] instanceof int[] to && new int[2 * n] instanceof int[] w
            && Arrays.stream(head).map(x -> -1).toArray() instanceof int[] h0 && IntStream.range(0, n + 1).allMatch(i -> (head[i] = h0[i]) < 0)
            && IntStream.range(0, n - 1).allMatch(i -> Integer.valueOf(it.next()) instanceof Integer u && Integer.valueOf(it.next()) instanceof Integer v && Integer.valueOf(it.next()) instanceof Integer t
                && (to[2 * i] = v) > 0 && (w[2 * i] = t) > 0 && (nxt[2 * i] = head[u]) >= -1 && (head[u] = 2 * i) >= 0
                && (to[2 * i + 1] = u) > 0 && (w[2 * i + 1] = t) > 0 && (nxt[2 * i + 1] = head[v]) >= -1 && (head[v] = 2 * i + 1) >= 0)
            && new int[n] instanceof int[] q && new int[n + 1] instanceof int[] par && new int[n + 1] instanceof int[] typ && new int[]{1} instanceof int[] tail && (q[0] = 1) == 1
            && IntStream.range(0, n).allMatch(qi -> Integer.valueOf(q[qi]) instanceof Integer v
                && IntStream.iterate(head[v], e -> e >= 0, e -> nxt[e]).filter(e -> to[e] != par[v]).allMatch(e -> (par[to[e]] = v) > 0 && (typ[to[e]] = w[e]) > 0 && (q[tail[0]++] = to[e]) > 0))
            && new boolean[n + 1] instanceof boolean[] cov && new ArrayList<Integer>() instanceof ArrayList<Integer> res
            && IntStream.iterate(n - 1, i -> i > 0, i -> i - 1).allMatch(i -> Integer.valueOf(q[i]) instanceof Integer v
                && (typ[v] != 2 || cov[v] || (cov[v] = true) && res.add(v)) && (!cov[v] || (cov[par[v]] = true)))
            ? res.size() + "\n" + IntStream.range(0, res.size()).mapToObj(i -> String.valueOf(res.get(res.size() - 1 - i))).collect(Collectors.joining(" ")) : "");
    }
}
