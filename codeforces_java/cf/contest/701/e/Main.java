import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0
            && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw
            && new long[raw.length / 2 + 2] instanceof long[] t
            && new long[4] instanceof long[] st
            && IntStream.range(0, raw.length).filter(i -> (raw[i] > 47 ? (st[0] = st[0] * 10 + raw[i] - 48) + (st[1] = 1) : raw[i] == 45 ? (st[2] = 1) : st[1] == 1 ? (t[(int) st[3]++] = st[2] == 1 ? -st[0] : st[0]) + (st[0] = 0) + (st[1] = 0) + (st[2] = 0) : 0) < 0).count() >= 0
            && Integer.valueOf((int) t[0]) instanceof Integer n && Integer.valueOf((int) t[1]) instanceof Integer k
            && Integer.valueOf(2 + 2 * k) instanceof Integer base
            && new int[n + 1] instanceof int[] cnt && new int[n + 1] instanceof int[] head && new int[2 * n] instanceof int[] nxt && new int[2 * n] instanceof int[] to
            && new int[n + 1] instanceof int[] par && new int[n + 1] instanceof int[] order && new int[]{1} instanceof int[] tail
            && IntStream.rangeClosed(0, n).filter(i -> (head[i] = -1) > 0).count() == 0
            && IntStream.range(0, 2 * k).filter(i -> ++cnt[(int) t[2 + i]] < 0).count() == 0
            && IntStream.range(0, n - 1).filter(i -> (nxt[2 * i] = head[(int) t[base + 2 * i]]) + (head[(int) t[base + 2 * i]] = 2 * i) + (to[2 * i] = (int) t[base + 2 * i + 1])
                + (nxt[2 * i + 1] = head[(int) t[base + 2 * i + 1]]) + (head[(int) t[base + 2 * i + 1]] = 2 * i + 1) + (to[2 * i + 1] = (int) t[base + 2 * i]) < -5).count() == 0
            && (order[0] = 1) == 1 && (par[1] = 0) == 0
            && IntStream.range(0, n).filter(i -> IntStream.iterate(head[order[i]], e -> e >= 0, e -> nxt[e]).filter(e -> to[e] != par[order[i]]).filter(e -> (par[to[e]] = order[i]) + (order[tail[0]++] = to[e]) < 0).count() < 0).count() == 0
            ? IntStream.range(0, n - 1).mapToLong(j -> order[n - 1 - j] + 0 > 0 && (cnt[par[order[n - 1 - j]]] += cnt[order[n - 1 - j]]) >= 0 ? Math.min(cnt[order[n - 1 - j]], 2 * k - cnt[order[n - 1 - j]]) : 0).sum() : "");
    }
}
