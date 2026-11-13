import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && new int[raw.length / 2 + 3] instanceof int[] tok && new long[]{0, 0, 0} instanceof long[] z
            && IntStream.range(0, raw.length + 1).filter(p -> p < raw.length && raw[p] >= 48 ? (z[0] = z[0] * 10 + raw[p] - 48) >= 0 && (z[1] = 1) > 0
                : z[1] == 1 && (tok[(int) z[2]++] = (int) z[0]) >= 0 && (z[0] = 0) == 0 && (z[1] = 0) == 0).count() >= 0
            && (Integer) tok[0] instanceof Integer n && (Integer) tok[1] instanceof Integer k
            && new int[n + 1] instanceof int[] head && new int[2 * n] instanceof int[] nxt && new int[2 * n] instanceof int[] to
            && new int[n + 1] instanceof int[] par && new int[n + 1] instanceof int[] q && new int[]{1} instanceof int[] c1
            && new int[n + 1] instanceof int[] cnt && new int[n + 1] instanceof int[] mx && new int[n + 1] instanceof int[] grp
            && IntStream.range(0, n + 1).filter(i -> (head[i] = -1) < 0).count() >= 0
            && IntStream.range(0, n - 1).filter(i -> (to[2 * i] = tok[3 + 2 * i]) >= 0 && (nxt[2 * i] = head[tok[2 + 2 * i]]) >= -1 && (head[tok[2 + 2 * i]] = 2 * i) >= 0
                && (to[2 * i + 1] = tok[2 + 2 * i]) >= 0 && (nxt[2 * i + 1] = head[tok[3 + 2 * i]]) >= -1 && (head[tok[3 + 2 * i]] = 2 * i + 1) >= 0).count() >= 0
            && ((IntPredicate) r -> (q[0] = r) >= 0 && (par[r] = 0) == 0 && (c1[0] = 1) > 0
                && IntStream.range(0, n).filter(i -> IntStream.iterate(head[q[i]], e -> e >= 0, e -> nxt[e])
                    .filter(e -> to[e] != par[q[i]] && (par[to[e]] = q[i]) >= 0 && (q[c1[0]++] = to[e]) >= 0).count() >= 0).count() >= 0) instanceof IntPredicate bfs
            && bfs.test(1)
            && IntStream.range(0, 2 * k).filter(j -> ++cnt[tok[2 + 2 * (n - 1) + j]] > 0).count() >= 0
            && IntStream.range(0, n - 1).filter(i -> (cnt[par[q[n - 1 - i]]] += cnt[q[n - 1 - i]]) >= 0 && (mx[par[q[n - 1 - i]]] = Math.max(mx[par[q[n - 1 - i]]], cnt[q[n - 1 - i]])) >= 0).count() >= 0
            && (Integer) IntStream.rangeClosed(1, n).filter(v -> mx[v] <= k && 2 * k - cnt[v] <= k).findFirst().getAsInt() instanceof Integer c
            && bfs.test(c) && (grp[c] = c) > 0
            && IntStream.range(1, n).filter(i -> (grp[q[i]] = par[q[i]] == c ? q[i] : grp[par[q[i]]]) >= 0).count() >= 0
            && IntStream.range(0, 2 * k).mapToLong(j -> (long) grp[tok[2 + 2 * (n - 1) + j]] * (n + 1) + tok[2 + 2 * (n - 1) + j]).sorted().toArray() instanceof long[] t
            ? "1\n" + c + IntStream.range(0, k).mapToObj(i -> "\n" + t[i] % (n + 1) + " " + t[i + k] % (n + 1) + " " + c).collect(Collectors.joining()) : "");
    }
}
