import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 4] instanceof int[] t && new int[]{0, 0, 0, 0} instanceof int[] ps
            && IntStream.range(0, raw.length + 1).map(k -> k < raw.length && raw[k] >= 48 ? (ps[0] = ps[0] * 10 + raw[k] - 48) * 0 + (ps[1] = 1) * 0
                : ps[1] == 1 ? (t[ps[3]++] = ps[0]) * 0 + (ps[0] = 0) + (ps[1] = 0) : 0).sum() == 0
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(t[1]) instanceof Integer X
            && Integer.valueOf(2 + n) instanceof Integer eb
            && Integer.valueOf(IntStream.range(0, n).map(i -> t[2 + i]).sum()) instanceof Integer Bn
            && Integer.valueOf(Math.max(Bn, 1)) instanceof Integer cap && Integer.valueOf(1 << 28) instanceof Integer INF
            && new int[n + 1] instanceof int[] st
            && IntStream.range(0, n - 1).allMatch(i -> ++st[t[eb + 3 * i]] > 0 & ++st[t[eb + 3 * i + 1]] > 0)
            && IntStream.rangeClosed(1, n).allMatch(i -> (st[i] += st[i - 1]) >= 0)
            && Arrays.copyOf(st, n) instanceof int[] fp && new int[2 * n] instanceof int[] adj && new int[2 * n] instanceof int[] wt
            && IntStream.range(0, n - 1).allMatch(i -> Integer.valueOf(t[eb + 3 * i] - 1) instanceof Integer a1 && Integer.valueOf(t[eb + 3 * i + 1] - 1) instanceof Integer b1
                && (wt[fp[a1]] = wt[fp[b1]] = t[eb + 3 * i + 2]) > 0 && (adj[fp[a1]++] = b1) >= 0 && (adj[fp[b1]++] = a1) >= 0)
            && new int[n + 1] instanceof int[] ord && new int[n] instanceof int[] par && new int[]{0, 0, 1} instanceof int[] bf && (par[0] = -1) < 0
            && IntStream.range(0, 3 * n - 2).map(k -> bf[1] < st[ord[bf[0]] + 1]
                ? (adj[bf[1]] != par[ord[bf[0]]] ? (par[adj[bf[1]]] = ord[bf[0]]) * 0 + (ord[bf[2]++] = adj[bf[1]++]) * 0 : (bf[1]++) * 0)
                : (bf[1] = st[ord[++bf[0]]]) * 0).sum() == 0
            && IntStream.generate(() -> 1).limit(n).toArray() instanceof int[] sz
            && IntStream.iterate(n - 1, i -> i > 0, i -> i - 1).allMatch(i -> (sz[par[ord[i]]] += sz[ord[i]]) > 0)
            && new int[n] instanceof int[] sp && new int[n] instanceof int[] pp && new int[n] instanceof int[] vat && new int[]{0, 0, 0} instanceof int[] sq
            && IntStream.range(0, 3 * n - 2).map(k -> sq[1] < st[ord[sq[0]] + 1]
                ? (adj[sq[1]] != par[ord[sq[0]]] ? (sp[adj[sq[1]]] = sq[2]) * 0 + (sq[2] += sz[adj[sq[1]++]]) * 0 : (sq[1]++) * 0)
                : (pp[ord[sq[0]]] = sp[ord[sq[0]]] + sz[ord[sq[0]]] - 1) * 0 + (vat[pp[ord[sq[0]]]] = ord[sq[0]]) * 0 + (sq[1] = st[ord[++sq[0]]]) * 0 + (sq[2] = sp[ord[sq[0]]]) * 0).sum() == 0
            && new long[n * n] instanceof long[] dist
            && IntStream.range(0, n).allMatch(s -> new int[n + 1] instanceof int[] os && new int[n] instanceof int[] qp && new int[]{0, st[s], 1} instanceof int[] b && (os[0] = s) == s && (qp[s] = -1) < 0
                && IntStream.range(0, 3 * n - 2).map(k -> b[1] < st[os[b[0]] + 1]
                    ? (adj[b[1]] != qp[os[b[0]]] ? (qp[adj[b[1]]] = os[b[0]]) * 0 + (int) (dist[s * n + adj[b[1]]] = dist[s * n + os[b[0]]] + wt[b[1]]) * 0 + (os[b[2]++] = adj[b[1]++]) * 0 : (b[1]++) * 0)
                    : (b[1] = st[os[++b[0]]]) * 0).sum() == 0)
            && new boolean[n * n] instanceof boolean[] ok
            && IntStream.range(0, n * n).allMatch(k -> (ok[k] = dist[k] <= X) || true)
            && IntStream.range(0, n).map(i -> 1 - t[2 + i]).toArray() instanceof int[] rd
            && IntStream.iterate(n - 1, i -> i > 0, i -> i - 1).allMatch(i -> (rd[par[ord[i]]] += rd[ord[i]]) >= 0)
            && IntStream.range(0, n).mapToObj(v -> IntStream.range(0, n).filter(q -> ok[v * n + vat[q]]).toArray()).toArray(int[][]::new) instanceof int[][] cand
            && IntStream.range(0, n).mapToObj(v -> IntStream.generate(() -> -1).limit(n).toArray() instanceof int[] ix && IntStream.range(0, cand[v].length).allMatch(z -> (ix[cand[v][z]] = z) >= 0) ? ix : null).toArray(int[][]::new) instanceof int[][] idx
            && IntStream.generate(() -> INF).limit(n + 1).toArray() instanceof int[] infv
            && ((IntUnaryOperator) U -> new int[n][][] instanceof int[][][] cur && new int[n] instanceof int[] dm
                && IntStream.range(0, n).allMatch(v -> Integer.valueOf(cand[v].length) instanceof Integer m && Integer.valueOf(t[2 + v] == 0 && U >= 1 ? 2 : 1) instanceof Integer nrw
                    && (dm[v] = nrw - 1) >= 0
                    && (cur[v] = IntStream.range(0, nrw).mapToObj(r -> IntStream.range(0, m + 1).map(z -> z < m && vat[cand[v][z]] != v ? (r == 0 ? 0 : INF) : z < m && (t[2 + v] == 1 ? r == 0 : r == 1) ? 1 : INF).toArray()).toArray(int[][]::new)) != null)
                && IntStream.iterate(n - 1, i -> i > 0, i -> i - 1).allMatch(i -> Integer.valueOf(ord[i]) instanceof Integer c && Integer.valueOf(par[c]) instanceof Integer p
                    && Integer.valueOf(dm[p]) instanceof Integer A && Integer.valueOf(dm[c]) instanceof Integer S && Integer.valueOf(Math.min(A + S, U)) instanceof Integer nd
                    && cur[p] instanceof int[][] cp && cur[c] instanceof int[][] fc && Integer.valueOf(cand[p].length) instanceof Integer mp && Integer.valueOf(cand[c].length) instanceof Integer mc
                    && IntStream.rangeClosed(0, S).map(j -> IntStream.range(0, mc).filter(z -> cand[c][z] >= sp[c] && cand[c][z] <= pp[c]).map(z -> fc[j][z]).min().orElse(INF)).toArray() instanceof int[] gc
                    && IntStream.rangeClosed(0, mp).map(z -> z < mp && idx[c][cand[p][z]] >= 0 ? idx[c][cand[p][z]] : mc).toArray() instanceof int[] mapz
                    && IntStream.rangeClosed(0, mp).map(z -> z < mp && cand[p][z] >= sp[c] && cand[p][z] <= pp[c] ? INF : 0).toArray() instanceof int[] off
                    && IntStream.rangeClosed(0, nd).mapToObj(k -> Arrays.copyOf(infv, mp + 1)).toArray(int[][]::new) instanceof int[][] NEW
                    && IntStream.range(0, (A + 1) * (S + 1)).filter(id -> Integer.valueOf(id / (S + 1)) instanceof Integer a1 && Integer.valueOf(id % (S + 1)) instanceof Integer b1 && a1 + b1 <= nd
                        && NEW[a1 + b1] instanceof int[] nr && cp[a1] instanceof int[] cr && fc[b1] instanceof int[] fr && Integer.valueOf(gc[b1]) instanceof Integer gj
                        && IntStream.of(0).peek(z -> Arrays.setAll(nr, q -> Math.min(nr[q], cr[q] + Math.min(fr[mapz[q]], gj + off[q])))).sum() == 0).count() >= 0
                    && IntStream.rangeClosed(0, nd).allMatch(r -> IntStream.of(0).peek(z -> Arrays.setAll(NEW[r], q -> NEW[r][q] > Bn ? INF : NEW[r][q])).sum() == 0)
                    && (cur[p] = NEW) != null && (dm[p] = nd) >= 0 && (cur[c] = null) == null)
                ? IntStream.rangeClosed(0, dm[0]).filter(r -> Arrays.stream(cur[0][r]).min().getAsInt() <= Bn).findFirst().orElse(-1) : -1) instanceof IntUnaryOperator solve
            ? String.valueOf(IntStream.rangeClosed(0, 11).map(kk -> kk == 0 ? 0 : Math.min(1 << (kk - 1), n - Bn)).distinct().map(solve).filter(x -> x >= 0).findFirst().orElse(-1)) : "");
    }
}
