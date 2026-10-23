import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] g
            && new int[4] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((g[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && Integer.valueOf(g[0]) instanceof Integer n
            && new int[n + 1] instanceof int[] par
            && new int[n + 1] instanceof int[] tm
            && new int[g[1] + 2] instanceof int[] ds
            && new int[g[1] + 2] instanceof int[] dt
            && new int[2] instanceof int[] ctr
            && IntStream.iterate(2, p -> p < ps[1], p -> p + (g[p] == 2 ? 2 : 3)).allMatch(p ->
                g[p] == 1
                    ? (par[g[p + 1]] = g[p + 2]) > 0 && (tm[g[p + 1]] = ++ctr[1]) >= 0
                    : g[p] == 2
                        ? (ds[++ctr[0]] = g[p + 1]) > 0 && (dt[ctr[0]] = ++ctr[1]) >= 0
                        : ++ctr[1] >= 0)
            && new int[n + 1] instanceof int[] head
            && new int[n + 1] instanceof int[] nxt
            && IntStream.rangeClosed(1, n).filter(v -> par[v] > 0).allMatch(v ->
                (nxt[v] = head[par[v]]) >= 0 && (head[par[v]] = v) > 0)
            && new int[n + 1] instanceof int[] q
            && new int[n + 1] instanceof int[] depth
            && new int[17 * (n + 1)] instanceof int[] up
            && new int[17 * (n + 1)] instanceof int[] mx
            && new int[1] instanceof int[] tail
            && IntStream.rangeClosed(1, n).filter(v -> par[v] == 0).allMatch(v -> (q[tail[0]++] = v) > 0)
            && IntStream.iterate(0, h -> h < tail[0], h -> h + 1).allMatch(h ->
                IntStream.iterate(head[q[h]], c -> c != 0, c -> nxt[c]).allMatch(c ->
                    (q[tail[0]++] = c) > 0
                    && (depth[c] = depth[q[h]] + 1) > 0
                    && (up[c] = q[h]) > 0
                    && (mx[c] = tm[c]) >= 0
                    && IntStream.range(1, 17).allMatch(j ->
                        (up[j * (n + 1) + c] = up[(j - 1) * (n + 1) + up[(j - 1) * (n + 1) + c]]) >= 0
                        && (mx[j * (n + 1) + c] = Math.max(mx[(j - 1) * (n + 1) + c], mx[(j - 1) * (n + 1) + up[(j - 1) * (n + 1) + c]])) >= 0)))
            && new StringBuilder() instanceof StringBuilder sb
            && new int[2] instanceof int[] st
            && IntStream.iterate(2, p -> p < ps[1], p -> p + (g[p] == 2 ? 2 : 3)).allMatch(p ->
                g[p] != 3
                || ((st[0] = ds[g[p + 2]]) > 0
                    && (st[1] = 0) == 0
                    && (Integer) (depth[ds[g[p + 2]]] - depth[g[p + 1]]) instanceof Integer d
                    && sb.append(d >= 0
                        && IntStream.range(0, 17).allMatch(j ->
                            (d >> j & 1) == 0
                            || ((st[1] = Math.max(st[1], mx[j * (n + 1) + st[0]])) >= 0
                                && (st[0] = up[j * (n + 1) + st[0]]) >= 0))
                        && st[0] == g[p + 1] && st[1] < dt[g[p + 2]] ? "YES\n" : "NO\n") != null))
            ? sb.toString()
            : "");
    }
}
