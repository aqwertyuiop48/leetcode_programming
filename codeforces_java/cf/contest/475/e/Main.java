
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(System.in.readAllBytes() instanceof byte[] raw ? CompletableFuture.supplyAsync(() -> new int[raw.length / 2 + 2] instanceof int[] v && new int[1] instanceof int[] st && IntStream.rangeClosed(0, raw.length).filter(i -> (i != raw.length && raw[i] >= 48) || i == 0 || raw[i - 1] < 48 || (v[st[0]++] = raw[i - 1] - 48 + (i > 1 && raw[i - 2] >= 48 ? 10 * (raw[i - 2] - 48) + (i > 2 && raw[i - 3] >= 48 ? 100 * (raw[i - 3] - 48) + (i > 3 && raw[i - 4] >= 48 ? 1000 * (raw[i - 4] - 48) + (i > 4 && raw[i - 5] >= 48 ? 10000 * (raw[i - 5] - 48) + (i > 5 && raw[i - 6] >= 48 ? 100000 * (raw[i - 6] - 48) + (i > 6 && raw[i - 7] >= 48 ? 1000000 * (raw[i - 7] - 48) : 0) : 0) : 0) : 0) : 0) : 0)) >= 0).count() >= 0
                && (Integer) v[0] instanceof Integer n && (Integer) v[1] instanceof Integer m
                && new int[n] instanceof int[] p && IntStream.range(0, n).allMatch(i -> (p[i] = i) >= 0)
                && new AtomicReference<IntUnaryOperator>() instanceof AtomicReference<IntUnaryOperator> fr
                && fr.getAndSet(x -> p[x] == x ? x : (p[x] = fr.get().applyAsInt(p[x]))) == null
                && new boolean[m] instanceof boolean[] nt && new int[n] instanceof int[] te && new int[1] instanceof int[] tc
                && IntStream.range(0, m).filter(e -> (Integer) (v[2 + 2 * e] - 1) instanceof Integer a && (Integer) (v[3 + 2 * e] - 1) instanceof Integer b
                        && (Integer) (p[a] == a ? a : p[p[a]] == p[a] ? p[a] : fr.get().applyAsInt(a)) instanceof Integer ra && (Integer) (p[b] == b ? b : p[p[b]] == p[b] ? p[b] : fr.get().applyAsInt(b)) instanceof Integer rb
                        && (ra.equals(rb) ? (nt[e] = true) : (p[ra] = rb) >= 0 && (te[tc[0]++] = e) >= 0)).count() >= 0
                && new int[n] instanceof int[] td && new int[n + 1] instanceof int[] tof && new int[n] instanceof int[] tp && new int[2 * n] instanceof int[] ta
                && IntStream.range(0, n - 1).allMatch(i -> td[v[2 + 2 * te[i]] - 1]++ >= 0 && td[v[3 + 2 * te[i]] - 1]++ >= 0)
                && IntStream.range(0, n).allMatch(i -> (tof[i + 1] = tof[i] + td[i]) >= 0 && (tp[i] = tof[i]) >= 0)
                && IntStream.range(0, n - 1).allMatch(i -> (ta[tp[v[2 + 2 * te[i]] - 1]++] = v[3 + 2 * te[i]] - 1) >= 0 && (ta[tp[v[3 + 2 * te[i]] - 1]++] = v[2 + 2 * te[i]] - 1) >= 0)
                && new int[n] instanceof int[] par && new int[n] instanceof int[] q0 && new int[2] instanceof int[] tl && (par[0] = -1) < 0 && (tl[0] = 1) > 0
                && IntStream.range(0, n).allMatch(i -> (Integer) q0[i] instanceof Integer x && IntStream.range(tof[x], tof[x + 1]).filter(j -> ta[j] != par[x]).allMatch(j -> (par[ta[j]] = x) >= 0 && (q0[tl[0]++] = ta[j]) >= 0))
                && new int[n] instanceof int[] ss && IntStream.range(0, n).allMatch(i -> (ss[i] = 1) > 0)
                && IntStream.range(1, n).allMatch(i -> (Integer) q0[n - i] instanceof Integer x && (ss[par[x]] += ss[x]) > 0)
                && new int[n] instanceof int[] tn
                && IntStream.range(0, n).allMatch(i -> (Integer) q0[i] instanceof Integer x && (tl[1] = tn[x] + 1) > 0 && IntStream.range(tof[x], tof[x + 1]).filter(j -> ta[j] != par[x]).allMatch(j -> (tn[ta[j]] = tl[1]) >= 0 && (tl[1] += ss[ta[j]]) > 0))
                && new int[n] instanceof int[] mn && new int[n] instanceof int[] mxv && IntStream.range(0, n).allMatch(i -> (mn[i] = mxv[i] = tn[i]) >= 0)
                && IntStream.range(0, m).filter(e -> !nt[e] || (Integer) (v[2 + 2 * e] - 1) instanceof Integer a && (Integer) (v[3 + 2 * e] - 1) instanceof Integer b
                        && (mn[a] = Math.min(mn[a], tn[b])) >= 0 && (mxv[a] = Math.max(mxv[a], tn[b])) >= 0 && (mn[b] = Math.min(mn[b], tn[a])) >= 0 && (mxv[b] = Math.max(mxv[b], tn[a])) >= 0).count() >= 0
                && new boolean[n] instanceof boolean[] bc
                && IntStream.range(1, n).allMatch(i -> (Integer) q0[n - i] instanceof Integer x && ((bc[x] = mn[x] >= tn[x] && mxv[x] < tn[x] + ss[x]) || true) && (mn[par[x]] = Math.min(mn[par[x]], mn[x])) >= 0 && (mxv[par[x]] = Math.max(mxv[par[x]], mxv[x])) >= 0)
                && new int[n] instanceof int[] comp && new int[n] instanceof int[] cp && new int[n] instanceof int[] sz && new int[1] instanceof int[] cc
                && IntStream.range(0, n).allMatch(i -> (Integer) q0[i] instanceof Integer x && ((i == 0 || bc[x]) ? (comp[x] = cc[0]++) >= 0 && (cp[comp[x]] = i == 0 ? -1 : comp[par[x]]) > -2 : (comp[x] = comp[par[x]]) >= 0) && sz[comp[x]]++ >= 0)
                && (Integer) cc[0] instanceof Integer k
                && (Integer) IntStream.range(0, k).map(i -> sz[i] * sz[i]).sum() instanceof Integer s2
                && new int[n] instanceof int[] wt && new int[n] instanceof int[] cmx && IntStream.range(0, k).allMatch(i -> (wt[i] = sz[i]) > 0)
                && IntStream.range(1, k).allMatch(i -> (Integer) (k - i) instanceof Integer c && (wt[cp[c]] += wt[c]) > 0 && (cmx[cp[c]] = Math.max(cmx[cp[c]], wt[c])) > 0)
                && (Integer) IntStream.range(0, k).map(c -> Math.max(cmx[c], n - wt[c])).min().getAsInt() instanceof Integer mb
                && new int[n] instanceof int[] cd && new int[n + 1] instanceof int[] cof && new int[n] instanceof int[] cps && new int[2 * n] instanceof int[] cad
                && IntStream.range(1, k).allMatch(c -> cd[c]++ >= 0 && cd[cp[c]]++ >= 0)
                && IntStream.range(0, k).allMatch(c -> (cof[c + 1] = cof[c] + cd[c]) >= 0 && (cps[c] = cof[c]) >= 0)
                && IntStream.range(1, k).allMatch(c -> (cad[cps[c]++] = cp[c]) >= 0 && (cad[cps[cp[c]]++] = c) >= 0)
                && new int[n] instanceof int[] anc && new int[n] instanceof int[] pr && new int[n] instanceof int[] q && new int[n] instanceof int[] sub && new int[2] instanceof int[] acc && new long[(n >> 6) + 1] instanceof long[] dp
                && (Long) IntStream.range(0, k).filter(r -> Math.max(cmx[r], n - wt[r]) == mb).mapToLong(r -> (pr[r] = -1) < 0 && (q[0] = r) == r && (acc[1] = 1) > 0 && (acc[0] = anc[r] = 0) == 0
                        && IntStream.range(0, k).allMatch(i -> (Integer) q[i] instanceof Integer y && (acc[0] += sz[y] * anc[y]) >= 0 && (sub[y] = sz[y]) > 0
                                && IntStream.range(cof[y], cof[y + 1]).filter(j -> cad[j] != pr[y]).allMatch(j -> (Integer) cad[j] instanceof Integer z && (pr[z] = y) >= 0 && (anc[z] = anc[y] + sz[y]) >= 0 && (q[acc[1]++] = z) >= 0))
                        && IntStream.range(1, k).allMatch(i -> (Integer) q[k - i] instanceof Integer y && (sub[pr[y]] += sub[y]) > 0)
                        && IntStream.range(0, dp.length).allMatch(i -> (dp[i] = i == 0 ? 1L : 0L) >= 0)
                        && IntStream.range(cof[r], cof[r + 1]).allMatch(j -> (Integer) sub[cad[j]] instanceof Integer sb && (Integer) (sb >> 6) instanceof Integer qs && (Integer) (sb & 63) instanceof Integer rs
                                && IntStream.iterate(dp.length - 1, w -> w >= qs, w -> w - 1).allMatch(w -> (dp[w] |= (dp[w - qs] << rs) | (rs == 0 || w - qs - 1 < 0 ? 0L : dp[w - qs - 1] >>> (64 - rs))) == 0 || true))
                        && (Integer) IntStream.rangeClosed(0, n - sz[r]).filter(s -> ((dp[s >> 6] >>> (s & 63)) & 1L) != 0).map(s -> s * (n - sz[r] - s)).max().orElse(0) instanceof Integer bst ? (long) s2 + acc[0] + bst : 0L).max().getAsLong() instanceof Long ans ? (Object) ans : "", r -> new Thread(null, r, "t", 1L << 29).start()).join() : "");
    }
}



