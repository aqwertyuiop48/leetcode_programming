import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk
            && Integer.valueOf(tk.nextToken()) instanceof Integer n && tk.nextToken() instanceof String s
            && Integer.valueOf(tk.nextToken()) instanceof Integer m
            && new String[m] instanceof String[] w && new int[m] instanceof int[] pv
            && IntStream.range(0, m).allMatch(i -> (w[i] = tk.nextToken()) != null && (pv[i] = Integer.parseInt(tk.nextToken())) >= 0 || true)
            && Integer.valueOf(tk.nextToken()) instanceof Integer x
            && new int[n + 1] instanceof int[] head && new int[2 * (n + m * n + 5)] instanceof int[] to && new int[2 * (n + m * n + 5)] instanceof int[] cap
            && new int[2 * (n + m * n + 5)] instanceof int[] cost && new int[2 * (n + m * n + 5)] instanceof int[] nx
            && new int[]{0} instanceof int[] ec
            && IntStream.range(0, n + 1).allMatch(i -> (head[i] = -1) <= 0)
            && ((Predicate<int[]>) a -> (to[ec[0]] = a[1]) >= 0 && (cap[ec[0]] = a[2]) >= 0 && (cost[ec[0]] = a[3]) > -1000
                && (nx[ec[0]] = head[a[0]]) > -5 && (head[a[0]] = ec[0]) >= 0
                && (to[ec[0] + 1] = a[0]) >= 0 && (cap[ec[0] + 1] = 0) == 0 && (cost[ec[0] + 1] = -a[3]) > -1000
                && (nx[ec[0] + 1] = head[a[1]]) > -5 && (head[a[1]] = ec[0] + 1) >= 0 && (ec[0] += 2) > 0) instanceof Predicate<int[]> add
            && IntStream.range(0, n).allMatch(i -> add.test(new int[]{i, i + 1, x, 0}))
            && IntStream.range(0, m).allMatch(j -> IntStream.rangeClosed(0, n - w[j].length()).filter(i -> s.startsWith(w[j], i))
                .allMatch(i -> add.test(new int[]{i, i + w[j].length(), 1, -pv[j]})) || true)
            && new int[n + 1] instanceof int[] dist && new int[n + 1] instanceof int[] pe && new boolean[n + 1] instanceof boolean[] inq
            && new int[n + 2] instanceof int[] q && new int[]{0, 0, 0} instanceof int[] qs && new long[]{0, 0} instanceof long[] acc
            && IntStream.range(0, x).allMatch(round -> acc[1] < x
                && IntStream.range(0, n + 1).allMatch(i -> (dist[i] = i == 0 ? 0 : 1 << 29) >= 0 && (pe[i] = -1) <= 0 && !(inq[i] = false) || true)
                && (q[0] = 0) == 0 && (qs[0] = 0) == 0 && (qs[1] = 1) == 1 && (inq[0] = true)
                && IntStream.iterate(0, i -> qs[0] != qs[1], i -> i + 1).allMatch(i -> Integer.valueOf(q[qs[0]]) instanceof Integer u
                    && (qs[0] = (qs[0] + 1) % (n + 2)) >= 0 && !(inq[u] = false)
                    && IntStream.iterate(head[u], e -> e >= 0, e -> nx[e]).allMatch(e -> cap[e] > 0 && dist[u] + cost[e] < dist[to[e]]
                        && (dist[to[e]] = dist[u] + cost[e]) > -(1 << 29) && (pe[to[e]] = e) >= 0
                        && (inq[to[e]] || ((q[qs[1]] = to[e]) >= 0 && (qs[1] = (qs[1] + 1) % (n + 2)) >= 0 && (inq[to[e]] = true)) || true) || true) || true)
                && dist[n] < (1 << 28)
                && Integer.valueOf((int) Math.min(x - acc[1], IntStream.iterate(n, v -> v != 0, v -> to[pe[v] ^ 1]).map(v -> cap[pe[v]]).min().getAsInt())) instanceof Integer f
                && IntStream.iterate(n, v -> v != 0, v -> to[pe[v] ^ 1]).allMatch(v -> (cap[pe[v]] -= f) >= -1000000 && (cap[pe[v] ^ 1] += f) >= 0)
                && (acc[0] += (long) f * dist[n]) > Long.MIN_VALUE && (acc[1] += f) > 0 || true)
            ? -acc[0] : "");
    }
}
