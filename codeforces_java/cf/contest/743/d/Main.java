import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] bs
            && new int[bs.length / 2 + 3] instanceof int[] tk
            && new int[4] instanceof int[] st
            && IntStream.rangeClosed(0, bs.length).filter(i -> (i < bs.length ? bs[i] : 32) >= 48
                ? (st[0] = st[0] * 10 + (i < bs.length ? bs[i] : 32) - 48) >= 0 && (st[2] = 1) >= 0
                : (i < bs.length ? bs[i] : 32) == 45 ? (st[1] = 1) >= 0
                : st[2] == 0 || ((tk[st[3]++] = st[1] == 1 ? -st[0] : st[0]) > Integer.MIN_VALUE
                    && (st[0] = 0) == 0 && (st[1] = 0) == 0 && (st[2] = 0) == 0)).count() >= 0
            && (Integer) tk[0] instanceof Integer n
            && IntStream.range(0, n).map(i -> -1).toArray() instanceof int[] head
            && new int[2 * n] instanceof int[] nxt
            && new int[2 * n] instanceof int[] to
            && IntStream.range(0, n - 1).filter(j -> (to[2 * j] = tk[n + 2 + 2 * j] - 1) >= -1
                && (nxt[2 * j] = head[tk[n + 1 + 2 * j] - 1]) >= -1
                && (head[tk[n + 1 + 2 * j] - 1] = 2 * j) >= 0
                && (to[2 * j + 1] = tk[n + 1 + 2 * j] - 1) >= -1
                && (nxt[2 * j + 1] = head[tk[n + 2 + 2 * j] - 1]) >= -1
                && (head[tk[n + 2 + 2 * j] - 1] = 2 * j + 1) >= 0).count() >= 0
            && new int[n] instanceof int[] q
            && new int[n] instanceof int[] par
            && new int[1] instanceof int[] cnt
            && (par[0] = -1) == -1 && (cnt[0] = 1) == 1
            && IntStream.range(0, n).filter(i -> IntStream.iterate(head[q[i]], e -> e >= 0, e -> nxt[e])
                .filter(e -> to[e] != par[q[i]])
                .filter(e -> (par[to[e]] = q[i]) >= 0 && (q[cnt[0]++] = to[e]) >= 0).count() >= 0).count() >= 0
            && IntStream.range(0, n).mapToLong(i -> tk[1 + i]).toArray() instanceof long[] sum
            && IntStream.range(0, n).mapToLong(i -> Long.MIN_VALUE / 4).toArray() instanceof long[] b1
            && IntStream.range(0, n).mapToLong(i -> Long.MIN_VALUE / 4).toArray() instanceof long[] b2
            && new long[n] instanceof long[] bst
            && new long[]{Long.MIN_VALUE / 4} instanceof long[] ans
            && IntStream.range(0, n).map(i -> q[n - 1 - i]).filter(v ->
                (ans[0] = Math.max(ans[0], b1[v] + b2[v])) > Long.MIN_VALUE
                && (bst[v] = Math.max(sum[v], b1[v])) > Long.MIN_VALUE
                && (par[v] < 0 || ((sum[par[v]] += sum[v]) > Long.MIN_VALUE
                    && (b2[par[v]] = Math.max(b2[par[v]], Math.min(b1[par[v]], bst[v]))) > Long.MIN_VALUE
                    && (b1[par[v]] = Math.max(b1[par[v]], bst[v])) > Long.MIN_VALUE))).count() >= 0
            ? (ans[0] < Long.MIN_VALUE / 8 ? "Impossible" : "" + ans[0]) : "");
    }
}
