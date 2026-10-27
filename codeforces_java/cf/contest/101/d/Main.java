import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] tk
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((tk[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && (Integer) tk[0] instanceof Integer n
            && IntStream.range(0, n + 1).map(i -> -1).toArray() instanceof int[] head
            && new int[2 * n] instanceof int[] nxt
            && new int[2 * n] instanceof int[] to
            && new int[2 * n] instanceof int[] wt
            && IntStream.range(0, n - 1).allMatch(i ->
                (to[2 * i] = tk[2 + 3 * i]) > 0 && (wt[2 * i] = tk[3 + 3 * i]) > 0
                && (nxt[2 * i] = head[tk[1 + 3 * i]]) >= -1 && (head[tk[1 + 3 * i]] = 2 * i) >= 0
                && (to[2 * i + 1] = tk[1 + 3 * i]) > 0 && (wt[2 * i + 1] = tk[3 + 3 * i]) > 0
                && (nxt[2 * i + 1] = head[tk[2 + 3 * i]]) >= -1 && (head[tk[2 + 3 * i]] = 2 * i + 1) >= 0)
            && new int[n] instanceof int[] order
            && new int[n + 1] instanceof int[] par
            && new int[] {1} instanceof int[] tail
            && (order[0] = 1) > 0
            && IntStream.range(0, n).allMatch(idx ->
                IntStream.iterate(head[order[idx]], e -> e >= 0, e -> nxt[e])
                    .filter(e -> to[e] != par[order[idx]])
                    .allMatch(e -> (par[to[e]] = order[idx]) > 0 && (order[tail[0]++] = to[e]) > 0))
            && new long[n + 1] instanceof long[] cnt
            && new long[n + 1] instanceof long[] tot
            && new long[n + 1] instanceof long[] sum
            && new long[1] instanceof long[] off
            && IntStream.range(0, n).allMatch(i ->
                (Integer) order[n - 1 - i] instanceof Integer v
                && (cnt[v] = 1) > 0
                && (off[0] = 0) == 0
                && IntStream.iterate(head[v], e -> e >= 0, e -> nxt[e])
                    .filter(e -> to[e] != par[v])
                    .boxed()
                    .sorted((x, y) -> Long.compare((tot[to[x]] + 2L * wt[x]) * cnt[to[y]], (tot[to[y]] + 2L * wt[y]) * cnt[to[x]]))
                    .mapToLong(e ->
                        (sum[v] += off[0] * cnt[to[e]] + cnt[to[e]] * wt[e] + sum[to[e]])
                        + (cnt[v] += cnt[to[e]])
                        + (off[0] += tot[to[e]] + 2L * wt[e]))
                    .sum() >= 0
                && (tot[v] = off[0]) >= 0)
            ? String.format("%.9f", (double) sum[1] / (n - 1)) : "");
    }


}

