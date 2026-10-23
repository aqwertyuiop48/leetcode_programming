import java.util.function.*;
import java.util.stream.*;

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
            && (Integer) tk[1] instanceof Integer m
            && new int[n + 1] instanceof int[] head
            && new int[2 * m + 2] instanceof int[] nxt
            && new int[2 * m + 2] instanceof int[] to
            && IntStream.rangeClosed(0, n).allMatch(i -> (head[i] = -1) < 0)
            && IntStream.range(0, m).allMatch(i ->
                (to[2 * i] = tk[3 + 2 * i]) > 0 && (nxt[2 * i] = head[tk[2 + 2 * i]]) >= -1 && (head[tk[2 + 2 * i]] = 2 * i) >= 0
                && (to[2 * i + 1] = tk[2 + 2 * i]) > 0 && (nxt[2 * i + 1] = head[tk[3 + 2 * i]]) >= -1 && (head[tk[3 + 2 * i]] = 2 * i + 1) >= 0)
            && IntStream.rangeClosed(1, n).map(i -> tk[2 + 2 * m + i - 1]).toArray() instanceof int[] xs
            && new int[n + 1] instanceof int[] par
            && new int[n + 1] instanceof int[] vis
            && new int[4 * n + 8] instanceof int[] path
            && new int[1] instanceof int[] cnt
            && (Integer) (int) IntStream.rangeClosed(1, n).filter(i -> xs[i - 1] == 1).findFirst().orElse(0) instanceof Integer r
            && new IntUnaryOperator[1] instanceof IntUnaryOperator[] dfs
            && (dfs[0] = v ->
                (vis[v] = 1) > 0 && (path[cnt[0]++] = v) > 0 && (par[v] ^= 1) >= 0
                && IntStream.iterate(head[v], e -> e >= 0, e -> nxt[e]).allMatch(e ->
                    vis[to[e]] == 1
                    || (dfs[0].applyAsInt(to[e]) >= 0 && (path[cnt[0]++] = v) > 0 && (par[v] ^= 1) >= 0
                        && (par[to[e]] == xs[to[e] - 1]
                            || ((path[cnt[0]++] = to[e]) > 0 && (par[to[e]] ^= 1) >= 0 && (path[cnt[0]++] = v) > 0 && (par[v] ^= 1) >= 0))))
                ? 0 : 1) != null
            ? r == 0 ? "0"
                : dfs[0].applyAsInt(r) < 0 || IntStream.rangeClosed(1, n).anyMatch(i -> vis[i] == 0 && xs[i - 1] == 1) ? "-1"
                : (par[r] != xs[r - 1] ? cnt[0] - 1 : cnt[0]) + "\n" + IntStream.range(0, par[r] != xs[r - 1] ? cnt[0] - 1 : cnt[0]).mapToObj(i -> String.valueOf(path[i])).collect(Collectors.joining(" "))
            : "");
    }
}
