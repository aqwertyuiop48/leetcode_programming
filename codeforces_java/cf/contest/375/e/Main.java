import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new long[raw.length / 2 + 4] instanceof long[] t && new int[]{0, 0, 0, 0} instanceof int[] ps && new long[1] instanceof long[] pl
            && IntStream.range(0, raw.length + 1).map(k -> k < raw.length && raw[k] >= 48 ? (int) ((pl[0] = pl[0] * 10 + raw[k] - 48) * 0) + (ps[1] = 1) * 0
                : ps[1] == 1 ? (int) ((t[ps[3]++] = pl[0]) * 0) + (int) (pl[0] = 0) + (ps[1] = 0) : 0).sum() == 0
            && Integer.valueOf((int) t[0]) instanceof Integer n && Long.valueOf(t[1]) instanceof Long X
            && Integer.valueOf(2 + n) instanceof Integer eb
            && Integer.valueOf(IntStream.range(0, n).map(i -> (int) t[2 + i]).sum()) instanceof Integer s
            && new int[n + 1] instanceof int[] st
            && IntStream.range(0, n - 1).allMatch(i -> ++st[(int) t[eb + 3 * i]] > 0 & ++st[(int) t[eb + 3 * i + 1]] > 0)
            && IntStream.rangeClosed(1, n).allMatch(i -> (st[i] += st[i - 1]) >= 0)
            && Arrays.copyOf(st, n) instanceof int[] fp && new int[2 * n] instanceof int[] adj && new int[2 * n] instanceof int[] wt
            && IntStream.range(0, n - 1).allMatch(i -> Integer.valueOf((int) t[eb + 3 * i] - 1) instanceof Integer a1 && Integer.valueOf((int) t[eb + 3 * i + 1] - 1) instanceof Integer b1
                && (wt[fp[a1]] = wt[fp[b1]] = (int) t[eb + 3 * i + 2]) >= 0 && (adj[fp[a1]++] = b1) >= 0 && (adj[fp[b1]++] = a1) >= 0)
            && new int[n] instanceof int[] ord && new int[n] instanceof int[] par && new int[n] instanceof int[] stk && new int[n] instanceof int[] tin && new int[n] instanceof int[] pw
            && new int[]{1} instanceof int[] sp && (par[0] = -1) < 0
            && IntStream.range(0, n).filter(m -> (Integer) stk[--sp[0]] instanceof Integer u && (ord[m] = u) >= 0 && (tin[u] = m) >= 0
                && IntStream.range(st[u], st[u + 1]).filter(e -> adj[e] != par[u] && (par[adj[e]] = u) >= 0 && (pw[adj[e]] = wt[e]) >= 0 && (stk[sp[0]++] = adj[e]) >= 0).count() >= 0).count() >= 0
            && IntStream.generate(() -> 1).limit(n).toArray() instanceof int[] sz
            && IntStream.iterate(n - 1, m -> m > 0, m -> m - 1).allMatch(m -> (sz[par[ord[m]]] += sz[ord[m]]) > 0)
            && new long[n * n] instanceof long[] dist
            && IntStream.range(1, n).filter(m -> IntStream.range(0, m).filter(q -> (dist[ord[m] * n + ord[q]] = dist[ord[q] * n + ord[m]] = dist[par[ord[m]] * n + ord[q]] + pw[ord[m]]) >= 0).count() >= 0).count() >= 0
            ? s == 0 ? "-1"
                : IntStream.range(0, n).allMatch(v -> IntStream.range(0, n).anyMatch(b -> t[2 + b] == 1 && dist[v * n + b] <= X)) ? "0"
                : new int[n * n] instanceof int[] nl && new int[n * n] instanceof int[] pos1 && new int[n] instanceof int[] cnt
                && IntStream.range(0, n).filter(u -> IntStream.range(0, n).filter(x -> dist[u * n + x] <= X && (nl[u * n + cnt[u]] = x) >= 0 && (pos1[u * n + x] = ++cnt[u]) > 0).count() >= 0).count() >= 0
                && new int[n][] instanceof int[][] D && IntStream.range(0, n * (s + 2) + 16).map(z -> -100000000).toArray() instanceof int[] negT
                && new int[n * (s + 1) + 1] instanceof int[] tg && new int[n * (s + 1) + 1] instanceof int[] gn && new int[n * (s + 1) + 1] instanceof int[] jm
                && new int[n * (s + 1) + 1] instanceof int[] bo && new int[n * (s + 1) + 1] instanceof int[] pp
                && IntStream.range(0, n).filter(mm -> (Integer) ord[n - 1 - mm] instanceof Integer u && (Integer) cnt[u] instanceof Integer c
                    && Arrays.copyOf(negT, c * 2 + 4) instanceof int[] init
                    && IntStream.range(0, c).filter(a -> (init[2 * a] = nl[u * n + a] != u ? 60000 : -100000000) != 0 &&(init[2 * a + 1] = 59999 + (int) t[2 + u]) > 0).count() >= 0
                    && (D[u] = init) != null && new int[]{1} instanceof int[] cur
                    && IntStream.range(st[u], st[u + 1]).filter(e -> adj[e] != par[u] && (Integer) adj[e] instanceof Integer v
                        && (Integer) (Math.min(s, cur[0]) + 1) instanceof Integer wo
                        && (Integer) (Math.min(s, cur[0] + sz[v]) + 1) instanceof Integer nw
                        && (Integer) (Math.min(s, sz[v]) + 1) instanceof Integer wv
                        && (Integer) (cnt[v] * wv) instanceof Integer dl
                        && Arrays.copyOf(negT, c * nw + 2 * nw) instanceof int[] nt && new int[c] instanceof int[] bo2 && new int[c] instanceof int[] po2
                        && D[u] instanceof int[] ob && D[v] instanceof int[] dv
                        && IntStream.range(0, c).filter(a -> (Integer) nl[u * n + a] instanceof Integer tt
                            && (bo2[a] = tin[v] <= tin[tt] && tin[tt] < tin[v] + sz[v] ? dl + wv : dl) >= 0
                            && (po2[a] = pos1[v * n + tt] > 0 ? (pos1[v * n + tt] - 1) * wv : dl + wv) >= 0).count() >= 0
                        && new int[c * wv] instanceof int[] g
                        && Stream.of(0).peek(z -> IntStream.range(0, c).forEach(a -> IntStream.range(0, wv).forEach(y -> g[a * wv + y] = Math.max(dv[bo2[a] + y], dv[po2[a] + y]) - 60000))).findFirst().isPresent()
                        && (wo >= wv ? ob : g) instanceof int[] V && (wo >= wv ? g : ob) instanceof int[] Kt
                        && Integer.valueOf(wo >= wv ? wo : wv) instanceof Integer wV && Integer.valueOf(wo >= wv ? wv : wo) instanceof Integer wK
                        && IntStream.range(0, c * wK).filter(q -> Integer.valueOf(Kt[q]) instanceof Integer K0 && K0 > -50000000
                            && Integer.valueOf(q / wK * nw + q % wK) instanceof Integer nb && Integer.valueOf(q / wK * wV) instanceof Integer vb
                            && Stream.of(0).peek(z -> Arrays.setAll(new int[Math.min(wV, nw - q % wK)], i -> nt[nb + i] = Math.max(nt[nb + i], V[vb + i] + K0))).findFirst().isPresent()).count() >= 0
                        && (D[u] = nt) != null && (cur[0] += sz[v]) > 0 && (D[v] = null) == null).count() >= 0
                    && (Integer) (Math.min(s, sz[u]) + 1) instanceof Integer wu && D[u] instanceof int[] du
                    && new int[]{0} instanceof int[] mc && new int[c] instanceof int[] rl
                    && IntStream.range(0, c).filter(q -> tin[u] <= tin[nl[u * n + q]] && tin[nl[u * n + q]] < tin[u] + sz[u] && (rl[mc[0]++] = q * wu) >= 0).count() >= 0
                    && IntStream.range(0, mc[0]).filter(r -> Stream.of(0).peek(z -> Arrays.setAll(new int[wu], j -> du[c * wu + j] = Math.max(du[c * wu + j], du[rl[r] + j]))).findFirst().isPresent()).count() >= 0).count() >= 0
                && (Integer) IntStream.of(D[ord[0]]).max().getAsInt() instanceof Integer gm
                ? gm > 0 ? Integer.toString(60000 - gm) : "-1" : "-1"
            : "-1");
    }
}

