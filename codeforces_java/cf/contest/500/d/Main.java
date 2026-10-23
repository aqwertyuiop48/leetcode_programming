import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] g
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((g[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && Integer.valueOf(g[0]) instanceof Integer n
            && new int[n + 2] instanceof int[] off
            && IntStream.range(0, n - 1).allMatch(e -> ++off[g[1 + 3 * e] + 1] > 0 && ++off[g[2 + 3 * e] + 1] > 0)
            && IntStream.rangeClosed(1, n + 1).allMatch(i -> (off[i] += off[i - 1]) >= 0)
            && off.clone() instanceof int[] pos
            && new int[2 * n] instanceof int[] adj
            && IntStream.range(0, n - 1).allMatch(e ->
                (adj[pos[g[1 + 3 * e]]++] = g[2 + 3 * e]) > 0 && (adj[pos[g[2 + 3 * e]]++] = g[1 + 3 * e]) > 0)
            && new int[n + 1] instanceof int[] order
            && new int[n + 1] instanceof int[] par
            && new int[]{1} instanceof int[] tail
            && (order[0] = 1) > 0
            && IntStream.range(0, n).allMatch(k ->
                Integer.valueOf(order[k]) instanceof Integer u
                && IntStream.range(off[u], off[u + 1]).allMatch(t ->
                    adj[t] == par[u] || ((par[adj[t]] = u) > 0 && (order[tail[0]++] = adj[t]) > 0)))
            && IntStream.range(0, n + 1).map(i -> 1).toArray() instanceof int[] size
            && IntStream.iterate(n - 1, k -> k >= 1, k -> k - 1).allMatch(k -> (size[par[order[k]]] += size[order[k]]) > 0)
            && Double.valueOf((double) n * (n - 1) * (n - 2) / 6) instanceof Double cn
            && IntStream.range(0, n - 1).mapToDouble(e ->
                Integer.valueOf(par[g[1 + 3 * e]] == g[2 + 3 * e] ? size[g[1 + 3 * e]] : size[g[2 + 3 * e]]) instanceof Integer s
                    ? cn == 0 ? 0 : 2 * (1 - ((double) s * (s - 1) * (s - 2) / 6 + (double) (n - s) * (n - s - 1) * (n - s - 2) / 6) / cn)
                    : 0).toArray() instanceof double[] c
            && IntStream.range(0, n - 1).mapToDouble(e -> g[3 + 3 * e]).toArray() instanceof double[] wt
            && new double[]{IntStream.range(0, n - 1).mapToDouble(e -> wt[e] * c[e]).sum()} instanceof double[] tot
            && Integer.valueOf(g[1 + 3 * (n - 1)]) instanceof Integer r
            && new StringBuilder() instanceof StringBuilder sb
            && IntStream.range(0, r).allMatch(j ->
                Integer.valueOf(g[2 + 3 * (n - 1) + 2 * j] - 1) instanceof Integer e
                && (tot[0] += (g[3 + 3 * (n - 1) + 2 * j] - wt[e]) * c[e]) > -1
                && (wt[e] = g[3 + 3 * (n - 1) + 2 * j]) > 0
                && Long.valueOf((long) tot[0]) instanceof Long ip
                && Long.valueOf(Math.round((tot[0] - ip) * 10000000000L)) instanceof Long fr
                && sb.append(ip + fr / 10000000000L).append('.').append(String.valueOf(10000000000L + fr % 10000000000L).substring(1)).append('\n') != null)
            ? sb
            : "");
    }
}
