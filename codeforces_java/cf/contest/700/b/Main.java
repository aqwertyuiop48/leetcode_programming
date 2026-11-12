import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] tok && new int[]{0, 0, 0} instanceof int[] st
            && IntStream.range(0, raw.length).filter(i -> raw[i] >= 48 ? (st[1] = st[1] * 10 + raw[i] - 48) >= 0 & (st[2] = 1) > 0 : st[2] == 0 || (tok[st[0]++] = st[1]) >= 0 & (st[1] = 0) == 0 & (st[2] = 0) == 0).count() >= 0
            && Integer.valueOf(tok[0]) instanceof Integer n && Integer.valueOf(tok[1]) instanceof Integer k && Integer.valueOf(2 + 2 * k) instanceof Integer eb
            && new int[n + 1] instanceof int[] head && new int[2 * n + 2] instanceof int[] nxt && new int[2 * n + 2] instanceof int[] to && new int[n + 1] instanceof int[] par && new int[n + 1] instanceof int[] order && new int[n + 1] instanceof int[] cnt && new int[]{1} instanceof int[] tail && new long[]{0} instanceof long[] ans
            && IntStream.range(0, n - 1).filter(e -> (to[2 * e + 1] = tok[eb + 2 * e + 1]) > 0 & (nxt[2 * e + 1] = head[tok[eb + 2 * e]]) >= 0 & (head[tok[eb + 2 * e]] = 2 * e + 1) > 0
                & (to[2 * e + 2] = tok[eb + 2 * e]) > 0 & (nxt[2 * e + 2] = head[tok[eb + 2 * e + 1]]) >= 0 & (head[tok[eb + 2 * e + 1]] = 2 * e + 2) > 0).count() >= 0
            && (order[0] = 1) == 1
            && IntStream.range(0, n).filter(i -> IntStream.iterate(head[order[i]], e -> e != 0, e -> nxt[e]).filter(e -> to[e] != par[order[i]] && (par[to[e]] = order[i]) > 0 && (order[tail[0]++] = to[e]) > 0).count() >= 0).count() >= 0
            && IntStream.range(0, 2 * k).filter(j -> (cnt[tok[2 + j]] = 1) > 0).count() >= 0
            && IntStream.range(0, n - 1).filter(t -> Integer.valueOf(order[n - 1 - t]) instanceof Integer v && (ans[0] += Math.min(cnt[v], 2 * k - cnt[v])) >= 0 && (cnt[par[v]] += cnt[v]) >= 0).count() >= 0
            ? ans[0] : "");
    }
}
