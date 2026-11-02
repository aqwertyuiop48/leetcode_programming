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
            && IntStream.range(0, n).mapToObj(v -> IntStream.range(0, n).filter(q -> ok[v * n + vat[q]]).toArray()).toArray(int[][]::new) instanceof int[][] cand
            && IntStream.range(0, n).mapToObj(v -> IntStream.generate(() -> -1).limit(n).toArray() instanceof int[] ix && IntStream.range(0, cand[v].length).allMatch(z -> (ix[cand[v][z]] = z) >= 0) ? ix : null).toArray(int[][]::new) instanceof int[][] idx
            && IntStream.generate(() -> INF).limit(n + 1).toArray() instanceof int[] infv
            && new int[n] instanceof int[] pq && new int[n][][] instanceof int[][][] cur
            && IntStream.range(0, n).allMatch(v -> Integer.valueOf(cand[v].length) instanceof Integer m && (pq[v] = 1) > 0
                && (cur[v] = IntStream.range(0, Math.min(1, Bn) + 1).mapToObj(r -> IntStream.range(0, m + 1).map(z -> z < m && vat[cand[v][z]] == v ? (r == 0 ? INF : 1 - t[2 + v]) : z < m && r == 0 ? 0 : INF).toArray()).toArray(int[][]::new)) != null)
            && IntStream.iterate(n - 1, i -> i > 0, i -> i - 1).allMatch(i -> Integer.valueOf(ord[i]) instanceof Integer c && Integer.valueOf(par[c]) instanceof Integer p
                && Integer.valueOf(pq[p]) instanceof Integer sa && Integer.valueOf(pq[c]) instanceof Integer sb
                && Integer.valueOf(Math.min(sa, Bn)) instanceof Integer da && Integer.valueOf(Math.min(sb, Bn)) instanceof Integer db && Integer.valueOf(Math.min(sa + sb, Bn)) instanceof Integer nd
                && Integer.valueOf(Math.max(0, Bn - (n - sa - sb))) instanceof Integer lo
                && cur[p] instanceof int[][] cp && cur[c] instanceof int[][] fc && Integer.valueOf(cand[p].length) instanceof Integer mp && Integer.valueOf(cand[c].length) instanceof Integer mc
                && Integer.valueOf((int) Arrays.stream(cand[c]).filter(q -> q < sp[c]).count()) instanceof Integer lz && Integer.valueOf((int) Arrays.stream(cand[c]).filter(q -> q <= pp[c]).count()) instanceof Integer hz && Integer.valueOf(Math.max(0, Bn - (n - sb))) instanceof Integer lb
                && IntStream.rangeClosed(0, db).map(j -> j < lb ? INF : Arrays.stream(fc[j], lz, hz).min().orElse(INF)).toArray() instanceof int[] gc
                && IntStream.rangeClosed(0, mp).map(z -> z < mp && idx[c][cand[p][z]] >= 0 ? idx[c][cand[p][z]] : mc).toArray() instanceof int[] mapz
                && IntStream.rangeClosed(0, mp).map(z -> z == mp || z < mp && cand[p][z] >= sp[c] && cand[p][z] <= pp[c] ? INF : 0).toArray() instanceof int[] off
                && IntStream.rangeClosed(0, db).mapToObj(b -> b < lb ? null : fc[b] instanceof int[] fcb && Integer.valueOf(gc[b]) instanceof Integer gb ? IntStream.rangeClosed(0, mp).map(q -> Math.min(fcb[mapz[q]], gb + off[q])).toArray() : null).toArray(int[][]::new) instanceof int[][] frm
                && Integer.valueOf(idx[p][pp[p]]) instanceof Integer sc
                && IntStream.rangeClosed(0, nd).mapToObj(k -> sa != 1 || k > db || frm[k] == null ? Arrays.copyOf(infv, mp + 1) : frm[k].clone()).toArray(int[][]::new) instanceof int[][] NEW
                && (sa != 1 || IntStream.rangeClosed(0, nd).allMatch(k -> (NEW[k][sc] = k >= 1 && k - 1 <= db && frm[k - 1] != null ? Math.min(INF, 1 - t[2 + p] + frm[k - 1][sc]) : INF) >= 0))
                && IntStream.range(0, sa == 1 ? 0 : (da + 1) * (db + 1)).filter(id -> Integer.valueOf(id / (db + 1)) instanceof Integer a1 && Integer.valueOf(id % (db + 1)) instanceof Integer b1 && a1 + b1 <= nd && a1 + b1 >= lo && a1 >= Bn - (n - sa) && b1 >= Bn - (n - sb)
                    && NEW[a1 + b1] instanceof int[] nr && cp[a1] instanceof int[] cr && frm[b1] instanceof int[] fr
                    && IntStream.of(0).peek(z -> Arrays.setAll(nr, q -> Math.min(nr[q], cr[q] + fr[q]))).sum() == 0).count() >= 0
                && (cur[p] = NEW) != null && (pq[p] = sa + sb) > 0 && (cur[c] = null) == null)
            ? Integer.toString(Integer.valueOf(IntStream.range(0, cand[0].length).map(z -> cur[0][Bn][z]).min().orElse(INF)) instanceof Integer best && best < INF ? best : -1) : "");
    }
}
