import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 4] instanceof int[] t && new int[]{0, 0, 0, 0} instanceof int[] ps
            && IntStream.range(0, raw.length + 1).map(k -> k < raw.length && raw[k] >= 48 ? (ps[0] = ps[0] * 10 + raw[k] - 48) * 0 + (ps[1] = 1) * 0
                : ps[1] == 1 ? (t[ps[3]++] = ps[0]) * 0 + (ps[0] = 0) + (ps[1] = 0) : 0).sum() == 0
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(t[1]) instanceof Integer m
            && Integer.valueOf(2 + n) instanceof Integer eb && Integer.valueOf(eb + 2 * (n - 1)) instanceof Integer qb
            && new int[n + 1] instanceof int[] st
            && IntStream.range(0, 2 * (n - 1)).allMatch(i -> ++st[t[eb + i]] > 0)
            && IntStream.rangeClosed(1, n).allMatch(i -> (st[i] += st[i - 1]) >= 0)
            && Arrays.copyOf(st, n) instanceof int[] pos && new int[2 * n] instanceof int[] adj
            && IntStream.range(0, n - 1).allMatch(i -> Integer.valueOf(t[eb + 2 * i] - 1) instanceof Integer u && Integer.valueOf(t[eb + 2 * i + 1] - 1) instanceof Integer w
                && (adj[pos[u]++] = w) >= 0 && (adj[pos[w]++] = u) >= 0)
            && new int[n + 1] instanceof int[] ord && new int[n] instanceof int[] par && new int[]{0, 0, 1} instanceof int[] bf && (par[0] = -1) < 0
            && IntStream.range(0, 3 * n - 2).map(k -> bf[1] < st[ord[bf[0]] + 1]
                ? (adj[bf[1]] != par[ord[bf[0]]] ? (par[adj[bf[1]]] = ord[bf[0]]) * 0 + (ord[bf[2]++] = adj[bf[1]++]) * 0 : (bf[1]++) * 0)
                : (bf[1] = st[ord[++bf[0]]]) * 0).sum() == 0
            && IntStream.generate(() -> 1).limit(n).toArray() instanceof int[] sz && IntStream.generate(() -> -1).limit(n).toArray() instanceof int[] hv
            && IntStream.iterate(n - 1, i -> i > 0, i -> i - 1).allMatch(i -> Integer.valueOf(ord[i]) instanceof Integer v && (sz[par[v]] += sz[v]) > 0
                && (hv[par[v]] < 0 || sz[v] > sz[hv[par[v]]] ? (hv[par[v]] = v) >= 0 : true))
            && new int[n] instanceof int[] sp && new int[n + 1] instanceof int[] post && new int[]{0, 0, 0} instanceof int[] sq
            && IntStream.range(0, 3 * n - 2).map(k -> sq[1] < st[ord[sq[0]] + 1]
                ? (adj[sq[1]] != par[ord[sq[0]]] && adj[sq[1]] != hv[ord[sq[0]]] ? (sp[adj[sq[1]]] = sq[2]) * 0 + (sq[2] += sz[adj[sq[1]++]]) * 0 : (sq[1]++) * 0)
                : (hv[ord[sq[0]]] < 0 ? 0 : (sp[hv[ord[sq[0]]]] = sq[2]) * 0) + (post[sp[ord[sq[0]]] + sz[ord[sq[0]]] - 1] = ord[sq[0]]) * 0 + (sq[1] = st[ord[++sq[0]]]) * 0 + (sq[2] = sp[ord[sq[0]]]) * 0).sum() == 0
            && new int[100003] instanceof int[] ce
            && IntStream.range(0, n).allMatch(p -> (ce[p] = t[2 + post[p]]) > 0)
            && new int[n + 2] instanceof int[] qs
            && IntStream.range(0, m).allMatch(j -> ++qs[t[qb + 2 * j]] > 0)
            && IntStream.rangeClosed(1, n).allMatch(i -> (qs[i] += qs[i - 1]) >= 0)
            && Arrays.copyOf(qs, n + 1) instanceof int[] qp && new int[m] instanceof int[] ql
            && IntStream.range(0, m).allMatch(j -> (ql[qp[t[qb + 2 * j] - 1]++] = j) >= 0)
            && new int[100003] instanceof int[] cnt && new int[100005] instanceof int[] ge && new int[m] instanceof int[] ans
            && new int[]{0, sp[post[0]], 0, qs[post[0]], sp[post[0]]} instanceof int[] ms
            && IntStream.range(0, IntStream.range(0, n).map(p -> Integer.valueOf(post[p]) instanceof Integer v
                    ? (hv[v] >= 0 ? sp[hv[v]] : p) - sp[v] + 2 + qs[v + 1] - qs[v] + (v != 0 && hv[par[v]] != v ? p - sp[v] + 1 : 0) : 0).sum()).map(k -> Integer.valueOf(ms[0]) instanceof Integer p && Integer.valueOf(post[p]) instanceof Integer v && Integer.valueOf(hv[v] >= 0 ? sp[hv[v]] : p) instanceof Integer ev
                ? (ms[1] < ev ? ge[++cnt[ce[ms[1]++]]]++ * 0
                    : ms[2] == 0 ? (ms[2] = 1) * 0 + ge[++cnt[ce[p]]]++ * 0
                    : ms[3] < qs[v + 1] ? (ans[ql[ms[3]]] = ge[Math.min(t[qb + 2 * ql[ms[3]] + 1], n + 1)]) * 0 + (ms[3]++) * 0
                    : v != 0 && hv[par[v]] != v && ms[4] <= p ? ge[cnt[ce[ms[4]++]]--]-- * 0
                    : (ms[1] = sp[post[++ms[0]]]) * 0 + (ms[2] = 0) + (ms[3] = qs[post[ms[0]]]) * 0 + (ms[4] = sp[post[ms[0]]]) * 0)
                : 0).sum() == 0
            ? Arrays.stream(ans).mapToObj(String::valueOf).collect(Collectors.joining("\n")) : "");
    }
}

