import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer tk && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer n && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer L && (Integer) Integer.parseInt(tk.nextToken()) instanceof Integer R
            && IntStream.range(0, 3 * (n - 1)).map(i -> Integer.parseInt(tk.nextToken())).toArray() instanceof int[] e3
            && IntStream.range(0, n - 1).mapToLong(i -> (long) e3[3 * i + 2] << 20 | i).sorted().toArray() instanceof long[] srt
            && new int[n] instanceof int[] rk && new int[2] instanceof int[] rs
            && IntStream.range(0, n - 1).allMatch(k -> (rs[1] = (k == 0 || srt[k] >> 20 != srt[k - 1] >> 20) ? rs[1] + 1 : rs[1]) > 0 && (rk[(int) (srt[k] & 1048575)] = rs[1]) > 0)
            && (Integer) rs[1] instanceof Integer cntw
            && IntStream.range(0, 2 * (n - 1)).map(j -> e3[3 * (j / 2) + (j & 1)]).toArray() instanceof int[] ed
            && new int[2 * n] instanceof int[] nxt && IntStream.generate(() -> -1).limit(n + 1).toArray() instanceof int[] head
            && IntStream.range(0, 2 * (n - 1)).allMatch(j -> (nxt[j] = head[ed[j]]) >= -1 && (head[ed[j]] = j) >= 0)
            && new boolean[n + 1] instanceof boolean[] vis && new int[n + 2] instanceof int[] siz && new int[n + 2] instanceof int[] par && new int[n + 2] instanceof int[] ord && new int[1] instanceof int[] cn
            && new int[n + 2] instanceof int[] preV && new int[n + 2] instanceof int[] preN && new int[n + 2] instanceof int[] curV && new int[n + 2] instanceof int[] curN && new int[n + 2] instanceof int[] que
            && new int[n + 2] instanceof int[] qv && new int[n + 2] instanceof int[] qp && new int[n + 2] instanceof int[] qd && new int[n + 2] instanceof int[] qs
            && new int[3] instanceof int[] ans && new int[4] instanceof int[] xs && new int[2] instanceof int[] pl && new int[8] instanceof int[] w && new int[][]{null} instanceof int[][] esh
            && ((IntUnaryOperator) root -> (ord[0] = root) > 0 && (par[root] = 0) == 0 && (cn[0] = 1) == 1
                && (xs[2] = 0) == 0 && (xs[3] = -1) < 0 && (xs[1] = 0) == 0
                && IntStream.range(0, 3 * n + 5).anyMatch(h -> !(xs[2] < cn[0] || xs[3] >= 0) || !(xs[3] < 0
                    ? (Integer) ord[xs[2]++] instanceof Integer x && (xs[1] = x) > 0 && (siz[x] = 1) == 1 && (xs[3] = head[x]) >= -1
                    : (Integer) ed[xs[3] ^ 1] instanceof Integer y && (y == par[xs[1]] || vis[y] || ((par[y] = xs[1]) >= 0 && (ord[cn[0]++] = y) >= 0)) && (xs[3] = nxt[xs[3]]) >= -1))
                && IntStream.range(1, cn[0]).allMatch(j -> (siz[par[ord[cn[0] - j]]] += siz[ord[cn[0] - j]]) > 0) ? cn[0] : 0) instanceof IntUnaryOperator comp
            && ((IntUnaryOperator) root -> comp.applyAsInt(root) > 0 && (Integer) (siz[root] >> 1) instanceof Integer half
                ? IntStream.iterate(root, x -> x != 0, x -> IntStream.iterate(head[x], e -> e >= 0, e -> nxt[e]).filter(e -> par[ed[e ^ 1]] == x && !vis[ed[e ^ 1]] && siz[ed[e ^ 1]] > half).map(e -> ed[e ^ 1]).findFirst().orElse(0)).reduce((a, b) -> b).getAsInt() : 0) instanceof IntUnaryOperator cen
            && ((IntBinaryOperator) (u, limit) -> (preV[0] = 0) == 0 && (preN[0] = u) > 0 && (pl[0] = 0) == 0
                && IntStream.range(0, esh[0].length).anyMatch(k -> (Integer) esh[0][k] instanceof Integer e && (Integer) ed[e ^ 1] instanceof Integer v && (Integer) rk[e >> 1] instanceof Integer w0
                    && IntStream.rangeClosed(1, siz[v]).allMatch(d -> (curV[d] = -1000000001) < 0) && (pl[1] = 0) == 0
                    && (qv[0] = v) > 0 && (qp[0] = u) >= 0 && (qd[0] = 1) > 0 && (qs[0] = w0 >= limit ? 1 : -1) != 0 && (w[6] = 0) == 0 && (w[7] = 1) == 1
                    && (xs[0] = -1) < 0
                    && IntStream.range(0, 3 * siz[v] + 5).anyMatch(z -> !(w[6] < w[7] || xs[0] >= 0) || !(xs[0] < 0
                        ? (Integer) w[6]++ instanceof Integer h && (xs[1] = h) >= 0 && (pl[1] = Math.max(pl[1], qd[h])) > 0 && (qs[h] <= curV[qd[h]] || ((curV[qd[h]] = qs[h]) < Integer.MAX_VALUE && (curN[qd[h]] = qv[h]) > 0)) && (xs[0] = qd[h] >= R ? -1 : head[qv[h]]) >= -1
                        : (Integer) ed[xs[0] ^ 1] instanceof Integer y && (Integer) xs[1] instanceof Integer h2
                            && (y == qp[h2] || vis[y] || ((qv[w[7]] = y) > 0 && (qp[w[7]] = qv[h2]) >= 0 && (qd[w[7]] = qd[h2] + 1) > 0 && (qs[w[7]++] = qs[h2] + (rk[xs[0] >> 1] >= limit ? 1 : -1)) != Integer.MAX_VALUE)) && (xs[0] = nxt[xs[0]]) >= -1))
                    && (w[0] = 1) == 1 && (w[1] = 1) == 1 && (w[2] = 0) == 0 && (w[3] = pl[0]) >= 0 && (w[4] = pl[0]) >= 0 && (w[5] = 0) == 0
                    && IntStream.range(0, 3 * siz[v] + 3 * pl[0] + 12).anyMatch(z -> !(w[0] <= pl[1] && w[5] == 0) || !(
                        w[3] >= 0 && w[0] + w[3] >= L ? (w[1] <= w[2] && preV[que[w[2]]] <= preV[w[3]] ? --w[2] >= -9 : (que[++w[2]] = w[3]--) >= 0)
                        : w[4] >= -1 && w[0] + w[4] >= R ? (w[1] <= w[2] && que[w[1]] > w[4] ? ++w[1] > 0 : --w[4] >= -9)
                        : w[1] <= w[2] && preV[que[w[1]]] + curV[w[0]] >= 0 ? (w[5] = 1) == 1 : ++w[0] > 0))
                    && (w[5] == 1 ? (limit <= ans[0] || ((ans[0] = limit) > 0 && (ans[1] = curN[w[0]]) > 0 && (ans[2] = preN[que[w[1]]]) > 0))
                        : IntStream.rangeClosed(1, pl[1]).allMatch(d -> d <= pl[0] && curV[d] <= preV[d] || ((preV[d] = curV[d]) > Integer.MIN_VALUE && (preN[d] = curN[d]) > 0)) && (pl[0] = Math.max(pl[0], pl[1])) >= 0 && false)) ? 1 : 0) instanceof IntBinaryOperator check
            && ((IntPredicate) u -> comp.applyAsInt(u) > 0
                && (esh[0] = IntStream.iterate(head[u], e -> e >= 0, e -> nxt[e]).filter(e -> !vis[ed[e ^ 1]]).mapToLong(e -> ((long) siz[ed[e ^ 1]] << 20) | e).sorted().mapToInt(x -> (int) (x & 1048575)).toArray()) != null
                && (check.applyAsInt(u, ans[0] + 1) == 0 || new int[]{ans[0] + 1, cntw} instanceof int[] bs
                && IntStream.range(0, 40).takeWhile(z -> bs[0] <= bs[1]).allMatch(z -> (Integer) ((bs[0] + bs[1]) >> 1) instanceof Integer mid && (check.applyAsInt(u, mid) == 1 ? (bs[0] = mid + 1) > 0 : (bs[1] = mid - 1) > -5)))) instanceof IntPredicate calc
            && new int[n + 2] instanceof int[] stk && new int[]{1} instanceof int[] sp && (stk[0] = 1) == 1
            && IntStream.range(0, n).allMatch(it -> (Integer) stk[--sp[0]] instanceof Integer s0 && (Integer) cen.applyAsInt(s0) instanceof Integer u && (vis[u] = true) && calc.test(u)
                && IntStream.iterate(head[u], e -> e >= 0, e -> nxt[e]).filter(e -> !vis[ed[e ^ 1]]).allMatch(e -> (stk[sp[0]++] = ed[e ^ 1]) > 0))
            ? ans[1] + " " + ans[2] : "");
    }
}



