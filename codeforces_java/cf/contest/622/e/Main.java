import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 2] instanceof int[] v && new int[]{-1, 0} instanceof int[] st
            && IntStream.rangeClosed(0, raw.length).filter(i -> i < raw.length && raw[i] >= 48
                ? (st[0] = Math.max(st[0], 0) * 10 + raw[i] - 48) < 0
                : st[0] >= 0 && (v[st[1]++] = st[0]) >= 0 && (st[0] = -1) < 0).count() >= 0
            && Integer.valueOf(v[0]) instanceof Integer n
            && new int[n + 1] instanceof int[] head && new int[2 * n] instanceof int[] nxt && new int[2 * n] instanceof int[] to
            && new int[n + 1] instanceof int[] deg && new int[n + 1] instanceof int[] par && new int[n + 1] instanceof int[] dep
            && new int[n + 1] instanceof int[] top && new int[n + 1] instanceof int[] q && new int[]{1} instanceof int[] tl
            && IntStream.range(0, n - 1).filter(e -> Integer.valueOf(v[1 + 2 * e]) instanceof Integer u
                && Integer.valueOf(v[2 + 2 * e]) instanceof Integer w
                && (to[2 * e] = w) > 0 && (nxt[2 * e] = head[u]) >= 0 && (head[u] = 2 * e + 1) > 0
                && (to[2 * e + 1] = u) > 0 && (nxt[2 * e + 1] = head[w]) >= 0 && (head[w] = 2 * e + 2) > 0
                && ++deg[u] + ++deg[w] < 0).count() >= 0
            && (q[0] = 1) == 1
            && IntStream.range(0, n).filter(i -> Integer.valueOf(q[i]) instanceof Integer u
                && IntStream.iterate(head[u], e -> e != 0, e -> nxt[e - 1])
                    .filter(e -> to[e - 1] != par[u] && (par[to[e - 1]] = u) > 0 && (dep[to[e - 1]] = dep[u] + 1) > 0
                        && (top[to[e - 1]] = u == 1 ? to[e - 1] : top[u]) > 0 && (q[tl[0]++] = to[e - 1]) > 0).count() < 0).count() >= 0
            && IntStream.rangeClosed(2, n).filter(w -> deg[w] == 1).mapToLong(w -> ((long) top[w] << 20) | dep[w]).sorted().toArray() instanceof long[] ks
            && new long[]{-1, 0, 0} instanceof long[] s
            && Arrays.stream(ks).filter(k -> (s[1] = (k >> 20) == s[0] ? Math.max(s[1] + 1, k & 1048575) : (k & 1048575)) < 0
                || (s[0] = k >> 20) < 0 || (s[2] = Math.max(s[2], s[1])) < 0).count() >= 0
            ? s[2] : "");
    }
}
