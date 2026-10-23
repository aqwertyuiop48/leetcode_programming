import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] g0
            && new int[3] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((g0[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && Integer.valueOf(g0[0]) instanceof Integer n
            && new int[n + 3] instanceof int[] dg
            && IntStream.range(0, n - 1).allMatch(e -> ++dg[g0[n + 1 + 2 * e]] > 0 && ++dg[g0[n + 2 + 2 * e]] > 0)
            && new int[n + 3] instanceof int[] nb
            && new int[n + 3] instanceof int[] lm1
            && new int[n + 3] instanceof int[] lm2
            && new int[n + 3] instanceof int[] lid
            && new int[n + 3] instanceof int[] st
            && IntStream.range(0, n - 1).allMatch(e ->
                (dg[g0[n + 1 + 2 * e]] == 1 ? (nb[g0[n + 1 + 2 * e]] = g0[n + 2 + 2 * e]) > 0 : true)
                && (dg[g0[n + 2 + 2 * e]] == 1 ? (nb[g0[n + 2 + 2 * e]] = g0[n + 1 + 2 * e]) > 0 : true)
                && (dg[g0[n + 1 + 2 * e]] > 1 && dg[g0[n + 2 + 2 * e]] > 1
                    ? ++st[g0[n + 1 + 2 * e] + 1] > 0 && ++st[g0[n + 2 + 2 * e] + 1] > 0 : true))
            && IntStream.rangeClosed(1, n + 1).allMatch(v -> (st[v] += st[v - 1]) >= 0)
            && Arrays.copyOf(st, n + 3) instanceof int[] fp
            && new int[2 * n + 2] instanceof int[] adj
            && IntStream.range(0, n - 1).allMatch(e ->
                dg[g0[n + 1 + 2 * e]] > 1 && dg[g0[n + 2 + 2 * e]] > 1
                    ? (adj[fp[g0[n + 1 + 2 * e]]++] = g0[n + 2 + 2 * e]) > 0 && (adj[fp[g0[n + 2 + 2 * e]]++] = g0[n + 1 + 2 * e]) > 0
                    : true)
            && IntStream.rangeClosed(1, n).filter(u -> dg[u] == 1).allMatch(u ->
                g0[u] > lm1[nb[u]]
                    ? (lm2[nb[u]] = lm1[nb[u]]) >= 0 && (lm1[nb[u]] = g0[u]) > 0 && (lid[nb[u]] = u) > 0
                    : g0[u] > lm2[nb[u]] ? (lm2[nb[u]] = g0[u]) > 0 : true)
            && new int[n + 3] instanceof int[] ptr
            && new int[n + 3] instanceof int[] par
            && new int[n + 3] instanceof int[] oldv
            && new int[n + 3] instanceof int[] oldl
            && new int[n + 3] instanceof int[] posn
            && new int[n + 3] instanceof int[] stk
            && new int[n + 3] instanceof int[] tl
            && new int[]{-1, 0, 1, 0, 0, 0, 0, 0} instanceof int[] s
            && ((IntPredicate) c ->
                (s[6] = Arrays.binarySearch(tl, 0, s[1], g0[c])) == s[6]
                && (s[5] = s[6] >= 0 ? s[6] : -s[6] - 1) >= 0
                && (posn[c] = s[5]) >= 0
                && (oldv[c] = tl[s[5]]) >= 0
                && (oldl[c] = s[1]) >= 0
                && (tl[s[5]] = g0[c]) >= 0
                && (s[1] = Math.max(s[1], s[5] + 1)) > 0
                && (ptr[c] = st[c]) >= 0
                && (stk[++s[0]] = c) > 0
                && (s[2] = Math.max(s[2], (lid[c] == s[7] ? lm2[c] : lm1[c]) > tl[s[1] - 1] ? s[1] + 1 : s[1])) > 0) instanceof IntPredicate enter
            && IntStream.rangeClosed(1, n).filter(r -> dg[r] == 1).allMatch(r ->
                (s[0] = -1) < 0 && (s[7] = r) > 0 && (tl[0] = g0[r]) >= 0 && (s[1] = 1) > 0 && (par[nb[r]] = 0) == 0 && enter.test(nb[r])
                && (IntStream.range(0, 4 * n + 8).allMatch(step ->
                    s[0] >= 0
                    && (s[3] = stk[s[0]]) > 0
                    && (ptr[s[3]] < st[s[3] + 1]
                        ? (s[4] = adj[ptr[s[3]]++]) > 0
                            && (s[4] == par[s[3]] || ((par[s[4]] = s[3]) > 0 && enter.test(s[4])))
                        : (tl[posn[s[3]]] = oldv[s[3]]) >= 0 && (s[1] = oldl[s[3]]) >= 0 && --s[0] >= -1)) || true))
            ? "" + (n <= 2 ? (n == 1 || g0[1] == g0[2] ? 1 : 2) : s[2])
            : "");
    }
}
