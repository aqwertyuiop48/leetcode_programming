import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] t && new int[4] instanceof int[] st
            && IntStream.range(0, raw.length + 1).filter(i -> (i < raw.length && raw[i] > 47) ? (st[0] = st[0] * 10 + raw[i] - 48) * 0 + (st[1] = 1) > 0
                : (i < raw.length && raw[i] == 45) ? (st[3] = 1) > 0
                : st[1] == 1 && (t[st[2]++] = st[3] == 1 ? -st[0] : st[0]) * 0 + (st[0] = 0) + (st[1] = 0) + (st[3] = 0) == 0).count() >= 0
            && Integer.valueOf(t[0]) instanceof Integer n
            && new int[n + 1] instanceof int[] head && new int[2 * n + 2] instanceof int[] nxt && new int[2 * n + 2] instanceof int[] to && new int[2 * n + 2] instanceof int[] wt
            && new int[n + 2] instanceof int[] q && new boolean[n + 1] instanceof boolean[] vis && new long[n + 1] instanceof long[] f && new int[]{1} instanceof int[] tl
            && IntStream.range(0, n - 1).filter(k -> (to[2 * k + 1] = t[n + 1 + 2 * k]) >= 0 && (wt[2 * k + 1] = t[n + 2 + 2 * k]) * 0 == 0 && (nxt[2 * k + 1] = head[k + 2]) >= 0 && (head[k + 2] = 2 * k + 1) > 0
                && (to[2 * k + 2] = k + 2) > 0 && (wt[2 * k + 2] = t[n + 2 + 2 * k]) * 0 == 0 && (nxt[2 * k + 2] = head[t[n + 1 + 2 * k]]) >= 0 && (head[t[n + 1 + 2 * k]] = 2 * k + 2) > 0).count() >= 0
            && (q[0] = 1) > 0 && (vis[1] = true)
            && IntStream.iterate(0, i -> i < tl[0], i -> i + 1).filter(i -> IntStream.iterate(head[q[i]], e -> e != 0, e -> nxt[e]).filter(e -> !vis[to[e]] && (vis[to[e]] = true)
                && (f[to[e]] = Math.max(0L, f[q[i]] + wt[e])) >= 0 && f[to[e]] <= t[to[e]] && (q[tl[0]++] = to[e]) > 0).count() >= 0).count() >= 0
            ? n - tl[0] : "");
    }
}
