import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(t[1]) instanceof Integer m && Integer.valueOf(t[2]) instanceof Integer pp
            && Integer.valueOf(n * m) instanceof Integer N && Integer.valueOf(m + 2) instanceof Integer W && Integer.valueOf(1 << 29) instanceof Integer INF
            && IntStream.range(0, N).map(c -> Integer.parseInt(t[3 + c])).toArray() instanceof int[] val
            && new int[pp + 3] instanceof int[] st
            && IntStream.range(0, N).filter(c -> st[val[c] + 1]++ < 0).count() == 0
            && IntStream.rangeClosed(1, pp + 1).filter(v -> (st[v + 1] += st[v]) < 0).count() == 0
            && Arrays.copyOf(st, pp + 3) instanceof int[] pos
            && new int[N] instanceof int[] oc && new int[N] instanceof int[] ox && new int[N] instanceof int[] oy
            && IntStream.range(0, N).filter(c -> Integer.valueOf(pos[val[c]]++) instanceof Integer i && (ox[i] = c / m) >= 0 && (oy[i] = c % m) >= 0 && (oc[i] = (c / m + 1) * W + c % m + 1) < 0).count() == 0
            && new int[N] instanceof int[] D && new int[(n + 2) * W] instanceof int[] g
            && IntStream.range(st[1], st[2]).filter(i -> (D[i] = ox[i] + oy[i]) < 0).count() == 0
            && IntStream.rangeClosed(1, pp - 1).allMatch(k -> (long) (st[k + 1] - st[k]) * (st[k + 2] - st[k + 1]) <= 2L * N
                ? IntStream.range(st[k + 1], st[k + 2]).filter(bi -> (D[bi] = IntStream.range(st[k], st[k + 1]).map(ai -> D[ai] + Math.abs(ox[ai] - ox[bi]) + Math.abs(oy[ai] - oy[bi])).min().getAsInt()) < 0).count() == 0
                : Stream.of(0).peek(z -> Arrays.fill(g, INF)).findFirst().isPresent()
                && IntStream.range(st[k], st[k + 1]).filter(ai -> (g[oc[ai]] = D[ai]) < 0).count() == 0
                && IntStream.range(0, n).filter(r -> IntStream.range((r + 1) * W + 1, (r + 1) * W + 1 + m).filter(i -> (g[i] = Math.min(g[i], Math.min(g[i - W], g[i - 1]) + 1)) < 0).count() > 0).count() == 0
                && IntStream.range(0, n).filter(r0 -> IntStream.range(0, m).filter(c0 -> (g[(n - r0) * W + m - c0] = Math.min(g[(n - r0) * W + m - c0], Math.min(g[(n - r0) * W + m - c0 + W], g[(n - r0) * W + m - c0 + 1]) + 1)) < 0).count() > 0).count() == 0
                && IntStream.range(st[k + 1], st[k + 2]).filter(bi -> (D[bi] = g[oc[bi]]) < 0).count() == 0)
            ? IntStream.range(st[pp], st[pp + 1]).map(i -> D[i]).min().getAsInt() : "");
    }
}
