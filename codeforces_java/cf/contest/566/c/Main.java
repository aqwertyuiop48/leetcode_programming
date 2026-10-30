import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0
            && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw
            && new int[raw.length / 2 + 3] instanceof int[] nums
            && new int[3] instanceof int[] st
            && IntStream.range(0, raw.length).filter(i -> (raw[i] > 47 && raw[i] < 58
                ? (st[0] = st[0] * 10 + raw[i] - 48) + (st[2] = 1)
                : raw[i] <= 32 && st[2] == 1 ? (nums[st[1]++] = st[0]) + (st[0] = 0) + (st[2] = 0) : 0) != Integer.MIN_VALUE || true).count() >= 0
            && (Integer) nums[0] instanceof Integer n
            && new int[n + 1] instanceof int[] head
            && new int[2 * n] instanceof int[] nxt
            && new int[2 * n] instanceof int[] to
            && new int[2 * n] instanceof int[] len
            && IntStream.range(1, n).filter(i -> (to[2 * i - 1] = nums[n + 1 + 3 * (i - 1) + 1]) > 0 && (len[2 * i - 1] = nums[n + 1 + 3 * (i - 1) + 2]) > 0
                && (nxt[2 * i - 1] = head[nums[n + 1 + 3 * (i - 1)]]) >= 0 && (head[nums[n + 1 + 3 * (i - 1)]] = 2 * i - 1) > 0
                && (to[2 * i] = nums[n + 1 + 3 * (i - 1)]) > 0 && (len[2 * i] = nums[n + 1 + 3 * (i - 1) + 2]) > 0
                && (nxt[2 * i] = head[nums[n + 1 + 3 * (i - 1) + 1]]) >= 0 && (head[nums[n + 1 + 3 * (i - 1) + 1]] = 2 * i) > 0 || true).count() >= 0
            && new boolean[n + 1] instanceof boolean[] removed
            && new int[n + 1] instanceof int[] par
            && new int[n + 1] instanceof int[] ptr
            && new int[n + 1] instanceof int[] stk
            && new int[n + 1] instanceof int[] ord
            && new int[n + 1] instanceof int[] size
            && new int[n + 1] instanceof int[] mx
            && new int[n + 1] instanceof int[] top
            && new double[n + 1] instanceof double[] dist
            && new double[n + 1] instanceof double[] g
            && new double[2] instanceof double[] acc
            && new int[2] instanceof int[] sp
            && new int[1] instanceof int[] cn
            && new int[1] instanceof int[] fin
            && new int[1] instanceof int[] cc
            && new int[64] instanceof int[] cands
            && ((IntUnaryOperator) t -> (Integer) stk[sp[0] - 1] instanceof Integer u && (Integer) ptr[u] instanceof Integer e
                && (e == 0
                    ? sp[0]-- > 0 && (ord[cn[0]++] = u) >= 0 && (par[u] == 0 || (size[par[u]] += size[u]) > 0 && (mx[par[u]] = Math.max(mx[par[u]], size[u])) >= 0)
                    : (ptr[u] = nxt[e]) >= 0 && (to[e] == par[u] || removed[to[e]] || (par[to[e]] = u) >= 0 && (size[to[e]] = 1) > 0 && (mx[to[e]] = 0) >= 0
                        && (ptr[to[e]] = head[to[e]]) >= 0 && (stk[sp[0]++] = to[e]) >= 0)) ? 1 : 1) instanceof IntUnaryOperator stepA
            && ((IntUnaryOperator) t -> (Integer) stk[sp[0] - 1] instanceof Integer u && (Integer) ptr[u] instanceof Integer e
                && (e == 0
                    ? sp[0]-- > 0
                    : (ptr[u] = nxt[e]) >= 0 && (to[e] == par[u] || (par[to[e]] = u) >= 0 && (dist[to[e]] = dist[u] + len[e]) > 0
                        && (top[to[e]] = par[u] == 0 ? to[e] : top[u]) > 0 && (ptr[to[e]] = head[to[e]]) >= 0 && (stk[sp[0]++] = to[e]) >= 0
                        && (acc[0] += nums[1 + to[e] - 1] * Math.sqrt(dist[to[e]])) >= 0 && (g[top[to[e]]] += nums[to[e]] * Math.sqrt(dist[to[e]])) >= 0
                        && (acc[1] += nums[to[e]] * dist[to[e]] * Math.sqrt(dist[to[e]])) >= 0)) ? 1 : 1) instanceof IntUnaryOperator stepB
            && Stream.iterate(new int[]{1, 0}, s -> s[1] == 0, s -> (Integer) s[0] instanceof Integer r
                && (par[r] = 0) == 0 && (size[r] = 1) == 1 && (mx[r] = 0) == 0 && (ptr[r] = head[r]) >= 0 && (stk[0] = r) >= 0 && (sp[0] = 1) == 1 && (cn[0] = 0) == 0
                && IntStream.iterate(0, t -> sp[0] > 0, t -> stepA.applyAsInt(t)).count() >= 0
                && (Integer) IntStream.range(0, cn[0]).filter(i -> 2 * Math.max(mx[ord[i]], size[r] - size[ord[i]]) <= size[r]).findFirst().getAsInt() instanceof Integer ci
                && (Integer) ord[ci] instanceof Integer c
                && (cands[cc[0]++] = c) > 0
                && IntStream.rangeClosed(0, n).filter(i -> (g[i] = 0) == 0 || true).count() >= 0
                && (acc[0] = 0) == 0 && (par[c] = 0) == 0 && (dist[c] = 0) == 0 && (top[c] = 0) == 0 && (ptr[c] = head[c]) >= 0 && (stk[0] = c) >= 0 && (sp[0] = 1) == 1
                && IntStream.iterate(0, t -> sp[0] > 0, t -> stepB.applyAsInt(t)).count() >= 0
                && IntStream.range(0, cn[0]).map(i -> ord[i]).filter(u -> par[u] == c && !removed[u] && 2 * g[u] > acc[0]).findFirst() instanceof OptionalInt os
                ? (os.isPresent() ? ((removed[c] = true) ? new int[]{os.getAsInt(), 0} : null) : ((fin[0] = c) > 0 ? new int[]{c, 1} : null))
                : null).count() >= 0
            && IntStream.rangeClosed(0, n).filter(i -> !(removed[i] = false) || true).count() >= 0
            ? IntStream.range(0, cc[0]).mapToObj(k -> (Integer) cands[k] instanceof Integer fc
                && (par[fc] = 0) == 0 && (dist[fc] = 0) == 0 && (top[fc] = 0) == 0 && (ptr[fc] = head[fc]) >= 0 && (stk[0] = fc) >= 0 && (sp[0] = 1) == 1 && (acc[1] = 0) == 0
                && IntStream.iterate(0, t -> sp[0] > 0, t -> stepB.applyAsInt(t)).count() >= 0
                ? new double[]{acc[1], fc} : null).min(Comparator.comparingDouble((double[] x) -> x[0])).get() instanceof double[] best
                ? (int) best[1] + " " + String.format(Locale.US, "%.9f", best[0]) : ""
            : "");
    }
}
