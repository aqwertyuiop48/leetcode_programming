import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0
            && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw
            && new int[raw.length / 2 + 3] instanceof int[] a
            && new int[]{0, 0, 0, 0} instanceof int[] ps
            && IntStream.range(0, raw.length).filter(i -> (raw[i] > 47 ? (ps[0] = ps[0] * 10 + raw[i] - 48) * 0 + (ps[1] = 1) : raw[i] == 45 ? (ps[3] = 1) : ps[1] == 1 ? (a[ps[2]++] = ps[3] == 1 ? -ps[0] : ps[0]) * 0 + (ps[0] = 0) + (ps[1] = 0) + (ps[3] = 0) : 0) >= 0).count() >= 0
            && (Integer) a[0] instanceof Integer n && (Integer) a[1] instanceof Integer Q
            && (Integer) Integer.highestOneBit(Math.max(1, 2 * n - 1)) instanceof Integer N
            && new int[n + 2] instanceof int[] f
            && IntStream.range(1, n).filter(i -> (f[i] = a[1 + i]) * 0 == 0).count() >= 0
            && new int[n + 1] instanceof int[] adj && new int[2 * n + 2] instanceof int[] to && new int[2 * n + 2] instanceof int[] nxt && new int[2 * n + 2] instanceof int[] wg && new int[]{0} instanceof int[] c
            && IntStream.range(0, n - 1).filter(e -> (Integer) a[n + 1 + 3 * e] instanceof Integer x && (Integer) a[n + 2 + 3 * e] instanceof Integer y && (Integer) a[n + 3 + 3 * e] instanceof Integer wv
                && (to[++c[0]] = y) * 0 + (wg[c[0]] = wv) * 0 + (nxt[c[0]] = adj[x]) * 0 + (adj[x] = c[0]) >= 0
                && (to[++c[0]] = x) * 0 + (wg[c[0]] = wv) * 0 + (nxt[c[0]] = adj[y]) * 0 + (adj[y] = c[0]) >= 0).count() >= 0
            && new int[n] instanceof int[] qq && new int[n + 1] instanceof int[] par && new int[n + 1] instanceof int[] dp && new int[n + 1] instanceof int[] wt && new int[]{1} instanceof int[] qn
            && (qq[0] = 1) > 0
            && IntStream.range(0, n).filter(qi -> (Integer) qq[qi] instanceof Integer v
                && IntStream.iterate(adj[v], e -> e > 0, e -> nxt[e]).filter(e -> (Integer) to[e] instanceof Integer w
                    && w != par[v] && (par[w] = v) > 0 && (dp[w] = dp[v] + 1) > 0 && (wt[w] = wg[e]) >= 0 && (qq[qn[0]++] = w) > 0).count() >= 0).count() >= 0
            && new int[n + 1] instanceof int[] sz && new int[n + 1] instanceof int[] heavy
            && IntStream.rangeClosed(1, n).filter(v -> (sz[v] = 1) > 0).count() >= 0
            && IntStream.range(1, n).map(i -> qq[n - i]).filter(v -> (sz[v] > sz[heavy[par[v]]] ? (heavy[par[v]] = v) > 0 : true) && (sz[par[v]] += sz[v]) > 0).count() >= 0
            && new int[n + 1] instanceof int[] hd && new int[n + 1] instanceof int[] pos && new int[]{0} instanceof int[] cnt
            && IntStream.range(0, n).map(i -> qq[i]).filter(v -> (v == 1 || heavy[par[v]] != v)
                && IntStream.iterate(v, u -> u != 0, u -> heavy[u]).filter(u -> (hd[u] = v) * 0 + (pos[u] = cnt[0]++) >= 0).count() >= 0).count() >= 0
            && new int[2 * N + 6] instanceof int[] Lc && new int[2 * N + 6] instanceof int[] Pc && new int[2 * N + 6] instanceof int[] Sc && new int[2 * N + 6] instanceof int[] Vc
            && (Integer) (2 * N) instanceof Integer LA && (Integer) (2 * N + 1) instanceof Integer RA && (Integer) (2 * N + 2) instanceof Integer T && (Integer) (2 * N + 3) instanceof Integer X && (Integer) (2 * N + 4) instanceof Integer A && (Integer) (2 * N + 5) instanceof Integer B
            && ((IntBinaryOperator) (x, y) -> (Lc[T] = Lc[x] + Lc[y]) + (Pc[T] = Pc[x] == Lc[x] ? Lc[x] + Pc[y] : Pc[x]) + (Sc[T] = Sc[y] == Lc[y] ? Lc[y] + Sc[x] : Sc[y]) + (Vc[T] = Vc[x] + Vc[y] - f[Sc[x]] - f[Pc[y]] + f[Sc[x] + Pc[y]])) instanceof IntBinaryOperator mg
            && ((IntUnaryOperator) dst -> (Lc[dst] = Lc[T]) + (Pc[dst] = Pc[T]) + (Sc[dst] = Sc[T]) + (Vc[dst] = Vc[T])) instanceof IntUnaryOperator cp
            && ((IntUnaryOperator) s -> (Lc[s] = 0) + (Pc[s] = 0) + (Sc[s] = 0) + (Vc[s] = 0)) instanceof IntUnaryOperator clr
            && IntStream.range(0, N).filter(i -> (Lc[N + i] = 1) > 0).count() >= 0
            && IntStream.iterate(N - 1, p -> p >= 1, p -> p - 1).filter(p -> (mg.applyAsInt(2 * p, 2 * p + 1) + cp.applyAsInt(p)) * 0 == 0).count() >= 0
            && new int[4] instanceof int[] W
            && ((IntBinaryOperator) (l, r) -> ((W[0] = l + N) + (W[1] = r + N) + clr.applyAsInt(LA) + clr.applyAsInt(RA)
                + (int) IntStream.iterate(0, z -> W[0] < W[1], z -> z + 1).filter(z -> ((W[0] & 1) == 1 ? mg.applyAsInt(LA, W[0]) + cp.applyAsInt(LA) + (W[0]++) : 0) * 0 == 0
                    && ((W[1] & 1) == 1 ? mg.applyAsInt(--W[1], RA) + cp.applyAsInt(RA) : 0) * 0 == 0 && (W[0] >>= 1) + (W[1] >>= 1) >= 0).count()
                + mg.applyAsInt(LA, RA) + cp.applyAsInt(X)) * 0) instanceof IntBinaryOperator rq
            && ((IntUnaryOperator) s -> (Sc[s] = Pc[s] + Sc[s] - (Pc[s] = Sc[s]))) instanceof IntUnaryOperator rv
            && new int[2] instanceof int[] S
            && ((IntBinaryOperator) (v, u) -> ((S[0] = v) + (S[1] = u) + clr.applyAsInt(A) + clr.applyAsInt(B)
                + (int) IntStream.iterate(0, z -> hd[S[0]] != hd[S[1]], z -> z + 1).filter(z -> (dp[hd[S[0]]] >= dp[hd[S[1]]]
                    ? rq.applyAsInt(pos[hd[S[0]]], pos[S[0]] + 1) + rv.applyAsInt(X) + mg.applyAsInt(A, X) + cp.applyAsInt(A) + (S[0] = par[hd[S[0]]])
                    : rq.applyAsInt(pos[hd[S[1]]], pos[S[1]] + 1) + mg.applyAsInt(X, B) + cp.applyAsInt(B) + (S[1] = par[hd[S[1]]])) * 0 == 0).count()
                + (dp[S[0]] >= dp[S[1]]
                    ? rq.applyAsInt(pos[S[1]] + 1, pos[S[0]] + 1) + rv.applyAsInt(X) + mg.applyAsInt(A, X) + cp.applyAsInt(A)
                    : rq.applyAsInt(pos[S[0]] + 1, pos[S[1]] + 1) + mg.applyAsInt(X, B) + cp.applyAsInt(B))
                + mg.applyAsInt(A, B)) * 0 + Vc[T]) instanceof IntBinaryOperator path
            && IntStream.rangeClosed(2, n).mapToLong(v -> ((long) wt[v] << 17) | v).sorted().toArray() instanceof long[] ek
            && IntStream.range(0, Q).mapToLong(j -> ((long) a[4 * n - 2 + 3 * j + 2] << 17) | j).sorted().toArray() instanceof long[] qk
            && new int[]{n - 2} instanceof int[] ep && new int[Q] instanceof int[] ans
            && IntStream.range(0, Q).filter(i -> (Integer) (int) (qk[Q - 1 - i] >> 17) instanceof Integer l && (Integer) (int) (qk[Q - 1 - i] & 131071) instanceof Integer j
                && IntStream.iterate(0, z -> ep[0] >= 0 && (ek[ep[0]] >> 17) >= l, z -> z + 1).filter(z -> (Integer) (int) (ek[ep[0]--] & 131071) instanceof Integer cv
                    && (Pc[N + pos[cv]] = 1) + (Sc[N + pos[cv]] = 1) + (Vc[N + pos[cv]] = f[1]) * 0 >= 0
                    && IntStream.iterate((N + pos[cv]) >> 1, p -> p >= 1, p -> p >> 1).filter(p -> (mg.applyAsInt(2 * p, 2 * p + 1) + cp.applyAsInt(p)) * 0 == 0).count() >= 0).count() >= 0
                && (ans[j] = path.applyAsInt(a[4 * n - 2 + 3 * j], a[4 * n - 2 + 3 * j + 1])) * 0 == 0).count() >= 0
            ? IntStream.range(0, Q).mapToObj(i -> String.valueOf(ans[i])).collect(Collectors.joining("\n")) : "");
    }
}
