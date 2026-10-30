import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw && new int[raw.length / 2 + 2] instanceof int[] toks && new int[3] instanceof int[] ac
            && IntStream.rangeClosed(0, raw.length).filter(i -> (i < raw.length && raw[i] >= 48 ? (ac[0] = ac[0] * 10 + raw[i] - 48) >= 0 && (ac[2] = 1) > 0 : ac[2] == 1 && (toks[ac[1]++] = ac[0]) >= 0 && (ac[0] = 0) == 0 && (ac[2] = 0) == 0) && false).count() >= 0
            && (Integer) toks[0] instanceof Integer n && (Integer) toks[1 + 3 * (n - 1)] instanceof Integer K && (Integer) (2 + 3 * (n - 1)) instanceof Integer sb
            && new int[n + 2] instanceof int[] deg && new int[n + 2] instanceof int[] st
            && IntStream.range(0, n - 1).filter(e -> ++deg[toks[1 + 3 * e]] > 0 && ++deg[toks[2 + 3 * e]] > 0 && false).count() >= 0
            && IntStream.rangeClosed(1, n).filter(v -> (st[v + 1] = st[v] + deg[v]) < 0).count() >= 0
            && IntStream.rangeClosed(0, n + 1).map(v -> st[v]).toArray() instanceof int[] pos && new int[2 * n] instanceof int[] adjTo && new int[2 * n] instanceof int[] adjFl
            && IntStream.range(0, n - 1).filter(e -> (adjTo[pos[toks[1 + 3 * e]]] = toks[2 + 3 * e]) > 0 && (adjFl[pos[toks[1 + 3 * e]]++] = toks[3 + 3 * e]) >= 0
                && (adjTo[pos[toks[2 + 3 * e]]] = toks[1 + 3 * e]) > 0 && (adjFl[pos[toks[2 + 3 * e]]++] = toks[3 + 3 * e] == 1 ? 2 : 0) >= 0 && false).count() >= 0
            && new int[n + 1] instanceof int[] par && new int[n + 1] instanceof int[] ptype && new int[n + 1] instanceof int[] dep && new int[n + 1] instanceof int[] tin && new int[n] instanceof int[] ord
            && new int[n + 1] instanceof int[] stk && new int[2] instanceof int[] sp && (stk[0] = 1) == 1 && (sp[0] = 1) == 1
            && IntStream.iterate(0, i -> sp[0] > 0, i -> i + 1).filter(i -> (Integer) stk[--sp[0]] instanceof Integer x && (tin[x] = sp[1]) >= 0 && (ord[sp[1]++] = x) > 0
                && IntStream.range(st[x], st[x + 1]).filter(k -> adjTo[k] - par[x] != 0 && (par[adjTo[k]] = x) > 0 && (ptype[adjTo[k]] = adjFl[k]) >= 0 && (dep[adjTo[k]] = dep[x] + 1) > 0 && (stk[sp[0]++] = adjTo[k]) > 0 && false).count() >= 0 && false).count() >= 0
            && new int[17][n] instanceof int[][] sp2 && IntStream.range(0, n).filter(t -> (sp2[0][t] = ord[t]) < 0).count() >= 0
            && IntStream.range(1, 17).filter(k -> IntStream.range(0, n - (1 << k) + 1).filter(t -> (Integer) sp2[k - 1][t] instanceof Integer p1 && (Integer) sp2[k - 1][t + (1 << (k - 1))] instanceof Integer p2
                && (sp2[k][t] = dep[p1] <= dep[p2] ? p1 : p2) < 0).count() >= 0 && false).count() >= 0
            && new int[n + 1] instanceof int[] up && new int[n + 1] instanceof int[] dn && new int[]{1} instanceof int[] cur
            && IntStream.range(0, K).filter(q -> (Integer) toks[sb + q] instanceof Integer v && (Integer) cur[0] instanceof Integer u && (cur[0] = v) > 0
                && (u - v == 0 || (Integer) (Math.min(tin[u], tin[v]) + 1) instanceof Integer lo && (Integer) Math.max(tin[u], tin[v]) instanceof Integer hi && (Integer) (31 - Integer.numberOfLeadingZeros(hi - lo + 1)) instanceof Integer lg
                    && (Integer) sp2[lg][lo] instanceof Integer c1 && (Integer) sp2[lg][hi - (1 << lg) + 1] instanceof Integer c2 && (Integer) par[dep[c1] <= dep[c2] ? c1 : c2] instanceof Integer l
                    && ++up[u] > -100000000 && --up[l] < 100000000 && ++dn[v] > -100000000 && --dn[l] < 100000000) && false).count() >= 0
            && IntStream.range(1, n).map(t -> n - t).filter(t -> (Integer) ord[t] instanceof Integer x && (up[par[x]] += up[x]) * 0 == 0 && (dn[par[x]] += dn[x]) * 0 == 0 && false).count() >= 0
            && new long[K + 1] instanceof long[] pw && (pw[0] = 1) == 1 && IntStream.rangeClosed(1, K).filter(i -> (pw[i] = pw[i - 1] * 2 % 1000000007L) < 0).count() >= 0
            ? IntStream.rangeClosed(2, n).mapToLong(t -> (Integer) ord[t - 1] instanceof Integer x ? pw[ptype[x] == 1 ? up[x] : ptype[x] == 2 ? dn[x] : 0] - 1 : 0L).sum() % 1000000007L : -1L);
    }
}
