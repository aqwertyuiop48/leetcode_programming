import java.util.Arrays;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] g
            && new int[4] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((g[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && Integer.valueOf(g[0]) instanceof Integer n
            && new int[n + 1] instanceof int[] head
            && new int[2 * n + 2] instanceof int[] nx
            && new int[2 * n + 2] instanceof int[] to
            && new int[2 * n + 2] instanceof int[] wt
            && IntStream.range(0, n - 1).allMatch(e ->
                (to[2 * e + 1] = g[2 + 3 * e]) > 0
                && (wt[2 * e + 1] = g[3 + 3 * e]) > 0
                && (nx[2 * e + 1] = head[g[1 + 3 * e]]) >= 0
                && (head[g[1 + 3 * e]] = 2 * e + 1) > 0
                && (to[2 * e + 2] = g[1 + 3 * e]) > 0
                && (wt[2 * e + 2] = g[3 + 3 * e]) > 0
                && (nx[2 * e + 2] = head[g[2 + 3 * e]]) >= 0
                && (head[g[2 + 3 * e]] = 2 * e + 2) > 0)
            && head.clone() instanceof int[] hd
            && new int[n + 1] instanceof int[] stk
            && new int[n + 1] instanceof int[] pre
            && new int[n + 1] instanceof int[] par
            && new int[n + 1] instanceof int[] sz
            && new int[n + 1] instanceof int[] mc
            && new int[] {1, 1} instanceof int[] sp
            && (stk[0] = 1) == 1
            && (pre[0] = 1) == 1
            && IntStream.generate(() -> 0).takeWhile(z -> sp[0] > 0).allMatch(z ->
                (Integer) stk[sp[0] - 1] instanceof Integer v
                && (hd[v] == 0
                    ? --sp[0] >= 0
                    : (Integer) hd[v] instanceof Integer e
                        && (hd[v] = nx[e]) >= 0
                        && (to[e] == par[v]
                            || ((par[to[e]] = v) > 0 && (stk[sp[0]++] = to[e]) > 0 && (pre[sp[1]++] = to[e]) > 0))))
            && IntStream.rangeClosed(1, n).allMatch(v -> (sz[v] = 1) > 0)
            && IntStream.iterate(n - 1, h -> h > 0, h -> h - 1).allMatch(h ->
                (sz[par[pre[h]]] += sz[pre[h]]) > 0 && (mc[par[pre[h]]] = Math.max(mc[par[pre[h]]], sz[pre[h]])) > 0)
            && Integer.valueOf(IntStream.rangeClosed(1, n).filter(v -> 2 * Math.max(mc[v], n - sz[v]) <= n).findFirst().getAsInt()) instanceof Integer c
            && head.clone() instanceof int[] hd2
            && new int[n + 1] instanceof int[] p2
            && new int[n + 1] instanceof int[] label
            && new long[n + 1] instanceof long[] dist
            && (stk[0] = c) == c
            && (sp[0] = 1) == 1
            && IntStream.generate(() -> 0).takeWhile(z -> sp[0] > 0).allMatch(z ->
                (Integer) stk[sp[0] - 1] instanceof Integer v
                && (hd2[v] == 0
                    ? --sp[0] >= 0
                    : (Integer) hd2[v] instanceof Integer e
                        && (hd2[v] = nx[e]) >= 0
                        && (to[e] == p2[v]
                            || ((p2[to[e]] = v) > 0
                                && (dist[to[e]] = dist[v] + wt[e]) > 0
                                && (label[to[e]] = v.equals(c) ? to[e] : label[v]) > 0
                                && (stk[sp[0]++] = to[e]) > 0))))
            && new int[n + 2] instanceof int[] gs
            && new int[n + 1] instanceof int[] gp
            && new int[n + 1] instanceof int[] cur
            && new int[n + 1] instanceof int[] ord
            && IntStream.rangeClosed(1, n).allMatch(v -> ++gp[label[v]] > 0)
            && IntStream.rangeClosed(1, n + 1).allMatch(j -> (gs[j] = gs[j - 1] + gp[j - 1]) >= 0)
            && IntStream.rangeClosed(1, n).allMatch(v -> (ord[gs[label[v]] + cur[label[v]]++] = v) > 0)
            && new TreeSet<Long>() instanceof TreeSet<Long> tight
            && new TreeSet<Integer>() instanceof TreeSet<Integer> avail
            && new int[n + 1] instanceof int[] sm
            && IntStream.rangeClosed(0, n).filter(j -> gp[j] > 0).allMatch(j ->
                avail.add(j) && (j == 0 || ((sm[j] = 2 * gp[j]) > 0 && tight.add((long) sm[j] << 20 | j))))
            && new int[n + 1] instanceof int[] res
            && IntStream.rangeClosed(1, n).allMatch(i ->
                (Integer) label[i] instanceof Integer s
                && (Integer) (tight.isEmpty() ? -1
                    : tight.last() instanceof Long k1 && (k1 >> 20) == n - i + 1 && (int) (k1 & 1048575) != s ? (int) (k1 & 1048575)
                    : tight.lower(tight.last()) instanceof Long k2 && (k2 >> 20) == n - i + 1 && (int) (k2 & 1048575) != s ? (int) (k2 & 1048575)
                    : -1) instanceof Integer t0
                && (Integer) (t0 >= 0 ? t0 : s == 0 || avail.first() != s.intValue() ? avail.first() : avail.higher(s)) instanceof Integer t
                && (res[i] = ord[gs[t] + gp[t] - 1]) > 0
                && --gp[t] >= 0
                && (gp[t] > 0 || avail.remove(t))
                && (s == 0 || (tight.remove((long) sm[s] << 20 | s) && tight.add((long) --sm[s] << 20 | s)))
                && (t == 0 || (tight.remove((long) sm[t] << 20 | t) && tight.add((long) --sm[t] << 20 | t))))
            ? 2 * Arrays.stream(dist).sum() + "\n" + IntStream.rangeClosed(1, n).mapToObj(i -> String.valueOf(res[i])).collect(Collectors.joining(" "))
            : "");
    }
}
