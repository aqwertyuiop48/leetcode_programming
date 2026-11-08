import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 2] instanceof int[] v
            && new int[]{0, 0, 0} instanceof int[] st
            && IntStream.rangeClosed(0, raw.length).filter(i -> i < raw.length && raw[i] > 47
                ? (st[2] = 1) + (st[1] = st[1] * 10 + raw[i] - 48) < 0
                : st[2] == 1 && (v[st[0]++] = st[1]) + (st[1] = 0) + (st[2] = 0) < 0).count() == 0
            && Integer.valueOf(v[0]) instanceof Integer n && Integer.valueOf(v[1]) instanceof Integer k
            && IntStream.rangeClosed(0, n).map(i -> i == 0 ? 0 : v[1 + i]).toArray() instanceof int[] aa
            && Arrays.stream(aa, 1, n + 1).sorted().toArray() instanceof int[] vals
            && new int[n + 1] instanceof int[] head && new int[2 * n] instanceof int[] nxt && new int[2 * n] instanceof int[] to
            && new int[n + 1] instanceof int[] par && new int[n + 1] instanceof int[] ord && new int[]{1} instanceof int[] cnt
            && IntStream.range(0, n + 1).filter(i -> (head[i] = -1) > 0).count() == 0
            && IntStream.range(0, 2 * (n - 1)).filter(e -> (to[e] = v[n + 2 + 2 * (e >> 1) + ((e & 1) ^ 1)]) + (nxt[e] = head[v[n + 2 + 2 * (e >> 1) + (e & 1)]])
                + (head[v[n + 2 + 2 * (e >> 1) + (e & 1)]] = e) < 0).count() == 0
            && (ord[0] = 1) + (par[1] = 0) == 1
            && IntStream.range(0, n).filter(i -> Integer.valueOf(ord[i]) instanceof Integer u
                && IntStream.iterate(head[u], e -> e >= 0, e -> nxt[e]).filter(e -> to[e] != par[u] && (par[to[e]] = u) + (ord[cnt[0]++] = to[e]) < 0).count() < 0).count() == 0
            && new int[n + 1] instanceof int[] sz && new int[n + 1] instanceof int[] sf && new int[n + 1] instanceof int[] pc
            && new int[n + 1] instanceof int[] b1 && new int[n + 1] instanceof int[] b2 && new int[n + 1] instanceof int[] dpD && new int[n + 1] instanceof int[] fD
            && new int[n + 1] instanceof int[] sA && new int[n + 1] instanceof int[] pA && new int[n + 1] instanceof int[] t1 && new int[n + 1] instanceof int[] t2
            && new int[]{0, n - 1, 0} instanceof int[] lh
            && IntStream.range(0, 20).filter(it -> lh[0] < lh[1] && Integer.valueOf((lh[0] + lh[1] + 1) / 2) instanceof Integer mid && Integer.valueOf(vals[mid]) instanceof Integer x
                && IntStream.rangeClosed(0, n).filter(u -> (sz[u] = 1) + (sf[u] = 0) + (pc[u] = 0) + (b1[u] = 0) + (b2[u] = 0) < 0).count() == 0
                && IntStream.range(0, n).map(r -> n - 1 - r).filter(i -> Integer.valueOf(ord[i]) instanceof Integer u && Integer.valueOf(par[u]) instanceof Integer p
                    && Integer.valueOf(aa[u] >= x ? 1 + sf[u] + b1[u] : 0) instanceof Integer d
                    && (dpD[u] = d) + (fD[u] = aa[u] >= x && pc[u] == 0 ? 1 : 0) < 0
                    || i > 0 && (sz[par[ord[i]]] += sz[ord[i]]) + (fD[ord[i]] == 1 ? (sf[par[ord[i]]] += sz[ord[i]])
                        : (pc[par[ord[i]]] += 1) + (dpD[ord[i]] > b1[par[ord[i]]] ? (b2[par[ord[i]]] = b1[par[ord[i]]]) + (b1[par[ord[i]]] = dpD[ord[i]])
                            : dpD[ord[i]] > b2[par[ord[i]]] ? (b2[par[ord[i]]] = dpD[ord[i]]) : 0)) < 0).count() == 0
                && (lh[2] = 0) == 0
                && IntStream.range(0, n).filter(i -> Integer.valueOf(ord[i]) instanceof Integer u && Integer.valueOf(par[u]) instanceof Integer p
                    && Integer.valueOf(i == 0 ? 0 : sA[p] - (fD[u] == 1 ? sz[u] : 0)) instanceof Integer sfp
                    && Integer.valueOf(i == 0 ? 0 : pA[p] - (fD[u] == 1 ? 0 : 1)) instanceof Integer pcp
                    && Integer.valueOf(i == 0 ? 0 : fD[u] == 1 ? t1[p] : dpD[u] == t1[p] ? t2[p] : t1[p]) instanceof Integer bst
                    && Integer.valueOf(i > 0 && aa[p] >= x ? 1 + sfp + bst : 0) instanceof Integer upDp
                    && Integer.valueOf(i == 0 || aa[p] >= x && pcp == 0 ? 1 : 0) instanceof Integer upF
                    && (sA[u] = sf[u] + (upF == 1 ? n - sz[u] : 0)) + (pA[u] = pc[u] + 1 - upF)
                        + (t1[u] = upF == 0 && upDp > b1[u] ? upDp : b1[u])
                        + (t2[u] = upF == 0 && upDp > b1[u] ? b1[u] : upF == 0 && upDp > b2[u] ? upDp : b2[u])
                        + (lh[2] |= aa[u] >= x && 1 + sA[u] + t1[u] >= k ? 1 : 0) < 0).count() == 0
                && (lh[2] > 0 ? (lh[0] = mid) : (lh[1] = mid - 1)) < 0).count() == 0
            ? vals[lh[0]] : "");
    }
}
