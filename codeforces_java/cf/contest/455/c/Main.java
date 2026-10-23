import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] tk
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((tk[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && (Integer) tk[0] instanceof Integer n
            && (Integer) tk[1] instanceof Integer m
            && (Integer) tk[2] instanceof Integer q
            && new int[n + 1] instanceof int[] head
            && new int[2 * m + 2] instanceof int[] nxt
            && new int[2 * m + 2] instanceof int[] to
            && new int[n + 1] instanceof int[] pr
            && new int[n + 1] instanceof int[] sz
            && new int[n + 1] instanceof int[] dia
            && IntStream.rangeClosed(0, n).allMatch(i -> (head[i] = -1) < 0 && (pr[i] = i) >= 0 && (sz[i] = 1) > 0)
            && new IntUnaryOperator[1] instanceof IntUnaryOperator[] find
            && (find[0] = x -> pr[x] == x ? x : find[0].applyAsInt(pr[x])) != null
            && IntStream.range(0, m).allMatch(i ->
                (to[2 * i] = tk[4 + 2 * i]) > 0 && (nxt[2 * i] = head[tk[3 + 2 * i]]) >= -1 && (head[tk[3 + 2 * i]] = 2 * i) >= 0
                && (to[2 * i + 1] = tk[3 + 2 * i]) > 0 && (nxt[2 * i + 1] = head[tk[4 + 2 * i]]) >= -1 && (head[tk[4 + 2 * i]] = 2 * i + 1) >= 0
                && (Integer) find[0].applyAsInt(tk[3 + 2 * i]) instanceof Integer a
                && (Integer) find[0].applyAsInt(tk[4 + 2 * i]) instanceof Integer b
                && (a - b == 0 || ((sz[a] < sz[b] ? (pr[a] = b) : (pr[b] = a)) > 0 && (sz[a] < sz[b] ? (sz[b] += sz[a]) : (sz[a] += sz[b])) > 0)))
            && new int[2 * n + 4] instanceof int[] qu
            && new int[3] instanceof int[] bq
            && new int[2] instanceof int[] cur
            && new int[n + 1] instanceof int[] d1
            && new int[n + 1] instanceof int[] d2
            && IntStream.rangeClosed(0, n).allMatch(i -> (d1[i] = -1) < 0 && (d2[i] = -1) < 0)
            && ((Function<int[], IntUnaryOperator>) d -> src ->
                (d[src] = 0) == 0 && (bq[0] = bq[1]) >= 0 && (qu[bq[1]++] = src) >= 0
                && (cur[0] = bq[0]) >= 0 && (cur[1] = head[src]) >= -1
                && IntStream.iterate(0, x -> cur[0] < bq[1], x -> x + 1).allMatch(x ->
                    cur[1] >= 0
                        ? (d[to[cur[1]]] >= 0 || ((d[to[cur[1]]] = d[qu[cur[0]]] + 1) > 0 && (qu[bq[1]++] = to[cur[1]]) >= 0)) && (cur[1] = nxt[cur[1]]) >= -1
                        : ++cur[0] > 0 && (cur[1] = cur[0] < bq[1] ? head[qu[cur[0]]] : -1) >= -1)
                ? qu[bq[1] - 1] : -1) instanceof Function<int[], IntUnaryOperator> mk
            && mk.apply(d1) instanceof IntUnaryOperator bfs1
            && mk.apply(d2) instanceof IntUnaryOperator bfs2
            && IntStream.rangeClosed(1, n).allMatch(s ->
                d1[s] >= 0 || ((Integer) bfs1.applyAsInt(s) instanceof Integer u
                    && (Integer) bfs2.applyAsInt(u) instanceof Integer w
                    && (dia[find[0].applyAsInt(s)] = d2[w]) >= 0))
            && new StringBuilder() instanceof StringBuilder sb
            && (ps[0] = 3 + 2 * m) > 0
            && IntStream.range(0, q).allMatch(i ->
                tk[ps[0]] == 1
                    ? sb.append(dia[find[0].applyAsInt(tk[ps[0] + 1])]).append('\n') != null && (ps[0] += 2) > 0
                    : (Integer) find[0].applyAsInt(tk[ps[0] + 1]) instanceof Integer a
                    && (Integer) find[0].applyAsInt(tk[ps[0] + 2]) instanceof Integer b
                    && (ps[0] += 3) > 0
                    && (a - b == 0 || (
                        (Integer) Math.max(Math.max(dia[a], dia[b]), (dia[a] + 1) / 2 + (dia[b] + 1) / 2 + 1) instanceof Integer nd
                        && ((sz[a] < sz[b] ? (pr[a] = b) : (pr[b] = a)) > 0)
                        && (sz[a] < sz[b] ? (sz[b] += sz[a]) : (sz[a] += sz[b])) > 0
                        && (dia[sz[a] < sz[b] ? b : a] = nd) >= 0)))
            ? sb.toString() : "");
    }
}
