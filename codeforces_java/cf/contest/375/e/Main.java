
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
            && new int[n] instanceof int[] pr && new int[n] instanceof int[] pn && new int[n] instanceof int[] cl
            && IntStream.range(0, n).allMatch(m -> (pr[m] = m == 0 ? -1 : tin[par[ord[m]]]) < n && (pn[m] = pw[ord[m]]) >= 0 && (cl[m] = (int) t[2 + ord[m]]) >= 0)
            && IntStream.generate(() -> 1).limit(n).toArray() instanceof int[] sz
            && IntStream.iterate(n - 1, m -> m > 0, m -> m - 1).allMatch(m -> (sz[pr[m]] += sz[m]) > 0)
            && new int[n + 1] instanceof int[] pre
            && IntStream.range(0, n).allMatch(i -> (pre[i + 1] = pre[i] + 1 - cl[i]) >= 0)
            && new long[n * n] instanceof long[] dist
            && IntStream.range(1, n).filter(m -> IntStream.range(0, m).filter(q -> (dist[m * n + q] = dist[q * n + m] = dist[pr[m] * n + q] + pn[m]) >= 0).count() >= 0).count() >= 0
            ? s == 0 ? "-1"
                : IntStream.range(0, n).allMatch(v -> IntStream.range(0, n).anyMatch(b -> cl[b] == 1 && dist[v * n + b] <= X)) ? "0"
                : new int[n] instanceof int[] cnt && new int[n * n] instanceof int[] nl && new int[n * n] instanceof int[] pos1
                && IntStream.range(0, n).filter(u -> IntStream.range(0, n).filter(x -> dist[u * n + x] <= X && (nl[u * n + cnt[u]] = x) >= 0 && (pos1[u * n + x] = ++cnt[u]) > 0).count() >= 0).count() >= 0
                && new int[n] instanceof int[] lo && new int[n] instanceof int[] hi && new int[n] instanceof int[] P
                && IntStream.range(0, n).allMatch(u -> (lo[u] = pos1[u * n + u] - 1) >= 0
                    && (hi[u] = lo[u] + (int) IntStream.range(u, u + sz[u]).filter(k -> pos1[u * n + k] > 0).count()) >= 0 && (P[u] = (cnt[u] + 9) / 8 * 8) > 0)
                && Integer.valueOf(Math.min(s, pre[n])) instanceof Integer maxT
                && IntStream.generate(() -> 100000000).limit((long) (n + 1) * (n + 16) + 16).toArray() instanceof int[] INFT
                && ((IntUnaryOperator) cap -> new int[n][] instanceof int[][] D
                    && IntStream.iterate(n - 1, u -> u >= 0, u -> u - 1).allMatch(u -> (u > 0 && sz[u] == 1) || (Integer.valueOf(cnt[u]) instanceof Integer c && Integer.valueOf(P[u]) instanceof Integer Pu
                        && Integer.valueOf(cap == 0 ? 0 : 1 - cl[u]) instanceof Integer bu && new int[]{bu} instanceof int[] cb && new int[Pu] instanceof int[] S && new int[1] instanceof int[] sf
                        && new int[Pu] instanceof int[] pt && new int[Pu] instanceof int[] pv
                        && IntStream.range(0, c).filter(q -> (pt[q] = nl[u * n + q] == u ? bu : 0) >= 0 && (pv[q] = nl[u * n + q] == u ? 1 : 0) >= 0).count() >= 0
                        && IntStream.iterate(u + 1, v -> v < u + sz[u], v -> v + sz[v]).filter(v -> sz[v] == 1 && (cb[0] += cap == 0 ? 0 : 1 - cl[v]) >= 0
                            && IntStream.range(0, c).filter(q -> (nl[u * n + q] != v && pos1[v * n + nl[u * n + q]] > 0 ? 0 : 1) > 0 && (pt[q] += cap == 0 ? 0 : 1 - cl[v]) >= 0 && ++pv[q] > 0).count() >= 0).count() >= 0
                        && Arrays.copyOf(INFT, (Math.min(cap, cb[0]) + 1) * Pu) instanceof int[] A0
                        && IntStream.range(0, c).filter(q -> pt[q] > cap || (A0[pt[q] * Pu + q] = pv[q]) >= 0).count() >= 0
                        && new int[][]{A0} instanceof int[][] AH
                        && IntStream.iterate(u + 1, v -> v < u + sz[u], v -> v + sz[v]).filter(v -> sz[v] == 1 || (Integer.valueOf(cap == 0 ? 0 : pre[v + sz[v]] - pre[v]) instanceof Integer bv
                            && Integer.valueOf(Math.min(cap, bv) + 1) instanceof Integer wv && Integer.valueOf(Math.min(cap, cb[0]) + 1) instanceof Integer wo
                            && Integer.valueOf(Math.min(cap, cb[0] + bv) + 1) instanceof Integer nw && Integer.valueOf(P[v]) instanceof Integer Pv
                            && D[v] instanceof int[] dv && AH[0] instanceof int[] A && new int[Pu] instanceof int[] bo && new int[Pu] instanceof int[] po
                            && IntStream.range(0, Pu).filter(q -> (bo[q] = q < c && !(nl[u * n + q] >= v && nl[u * n + q] < v + sz[v]) ? cnt[v] : cnt[v] + 1) >= 0
                                && (po[q] = q < c && pos1[v * n + nl[u * n + q]] > 0 ? pos1[v * n + nl[u * n + q]] - 1 : cnt[v] + 1) >= 0).count() >= 0
                            && new int[wv * Pu] instanceof int[] G
                            && (wv * Pu > 60000 ? IntStream.range(0, wv).parallel() : IntStream.range(0, wv)).filter(js -> IntStream.range(0, Pu >> 3).filter(g -> Integer.valueOf(js * Pu + (g << 3)) instanceof Integer xg
                                && Integer.valueOf(js * Pv) instanceof Integer xd && Integer.valueOf(g << 3) instanceof Integer xq
                                && (G[xg] = Math.min(dv[xd + bo[xq]], dv[xd + po[xq]])) * 0 + (G[xg + 1] = Math.min(dv[xd + bo[xq + 1]], dv[xd + po[xq + 1]])) * 0
                                + (G[xg + 2] = Math.min(dv[xd + bo[xq + 2]], dv[xd + po[xq + 2]])) * 0 + (G[xg + 3] = Math.min(dv[xd + bo[xq + 3]], dv[xd + po[xq + 3]])) * 0
                                + (G[xg + 4] = Math.min(dv[xd + bo[xq + 4]], dv[xd + po[xq + 4]])) * 0 + (G[xg + 5] = Math.min(dv[xd + bo[xq + 5]], dv[xd + po[xq + 5]])) * 0
                                + (G[xg + 6] = Math.min(dv[xd + bo[xq + 6]], dv[xd + po[xq + 6]])) * 0 + (G[xg + 7] = Math.min(dv[xd + bo[xq + 7]], dv[xd + po[xq + 7]])) * 0 == 0).count() >= 0).count() >= 0
                            && (wv == 1 ? IntStream.range(0, Pu).filter(q -> (S[q] = Math.min(S[q] + G[q], 100000000)) >= 0).count() >= 0 && (sf[0] = 1) > 0 : Arrays.copyOf(INFT, nw * Pu) instanceof int[] R
                            && (wo * wv * Pu > 60000 ? IntStream.range(0, nw).parallel() : IntStream.range(0, nw)).filter(jr -> IntStream.rangeClosed(Math.max(0, jr - wo + 1), Math.min(jr, wv - 1)).filter(js ->
                                Integer.valueOf(jr * Pu) instanceof Integer r && Integer.valueOf((jr - js) * Pu) instanceof Integer a && Integer.valueOf(js * Pu) instanceof Integer gg
                                && IntStream.range(0, Pu >> 3).filter(g -> Integer.valueOf(r + (g << 3)) instanceof Integer xr && Integer.valueOf(a + (g << 3)) instanceof Integer xa && Integer.valueOf(gg + (g << 3)) instanceof Integer xg
                                    && (R[xr] = Math.min(R[xr], A[xa] + G[xg])) * 0 + (R[xr + 1] = Math.min(R[xr + 1], A[xa + 1] + G[xg + 1])) * 0
                                    + (R[xr + 2] = Math.min(R[xr + 2], A[xa + 2] + G[xg + 2])) * 0 + (R[xr + 3] = Math.min(R[xr + 3], A[xa + 3] + G[xg + 3])) * 0
                                    + (R[xr + 4] = Math.min(R[xr + 4], A[xa + 4] + G[xg + 4])) * 0 + (R[xr + 5] = Math.min(R[xr + 5], A[xa + 5] + G[xg + 5])) * 0
                                    + (R[xr + 6] = Math.min(R[xr + 6], A[xa + 6] + G[xg + 6])) * 0 + (R[xr + 7] = Math.min(R[xr + 7], A[xa + 7] + G[xg + 7])) * 0 == 0).count() >= 0).count() >= 0).count() >= 0
                            && (AH[0] = R) != null) && (cb[0] += bv) > 0 && (D[v] = null) == null)).count() >= 0
                        && AH[0] instanceof int[] Af && Integer.valueOf(Math.min(cap, cb[0]) + 1) instanceof Integer wu
                        && (sf[0] == 0 || (wu * Pu > 60000 ? IntStream.range(0, wu).parallel() : IntStream.range(0, wu)).filter(jr -> IntStream.range(0, Pu >> 3).filter(g -> Integer.valueOf(jr * Pu + (g << 3)) instanceof Integer xf && Integer.valueOf(g << 3) instanceof Integer ys
                            && (Af[xf] = Math.min(Af[xf] + S[ys], 100000000)) * 0 + (Af[xf + 1] = Math.min(Af[xf + 1] + S[ys + 1], 100000000)) * 0 + (Af[xf + 2] = Math.min(Af[xf + 2] + S[ys + 2], 100000000)) * 0 + (Af[xf + 3] = Math.min(Af[xf + 3] + S[ys + 3], 100000000)) * 0
                            + (Af[xf + 4] = Math.min(Af[xf + 4] + S[ys + 4], 100000000)) * 0 + (Af[xf + 5] = Math.min(Af[xf + 5] + S[ys + 5], 100000000)) * 0 + (Af[xf + 6] = Math.min(Af[xf + 6] + S[ys + 6], 100000000)) * 0 + (Af[xf + 7] = Math.min(Af[xf + 7] + S[ys + 7], 100000000)) * 0 == 0).count() >= 0).count() >= 0)
                        && (wu * (hi[u] - lo[u]) > 60000 ? IntStream.range(0, wu).parallel() : IntStream.range(0, wu)).filter(jr ->
                            (Af[jr * Pu + c] = IntStream.range(lo[u], hi[u]).map(q -> Af[jr * Pu + q]).min().orElse(100000000)) >= 0).count() >= 0
                        && (D[u] = Af) != null))
                    ? (D[0] instanceof int[] Df ? IntStream.rangeClosed(0, Math.min(cap, pre[n])).filter(j -> Df[j * P[0] + cnt[0]] <= s).findFirst().orElse(-2) : -2) : -2) instanceof IntUnaryOperator solve
                && Integer.valueOf(IntStream.iterate(2, cc -> cc * 2).map(cc -> Integer.valueOf(solve.applyAsInt(Math.min(cc, maxT))) instanceof Integer rr ? (rr == -2 && cc < maxT ? (cc == 2 && solve.applyAsInt(0) == -2 ? -2 : -3) : rr) : 0).filter(rr -> rr != -3).findFirst().getAsInt()) instanceof Integer fin
                ? fin == -2 ? "-1" : Integer.toString(fin) : "-1"
            : "-1");
    }
}



