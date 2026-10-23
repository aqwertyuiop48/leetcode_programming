import java.util.Arrays;
import java.util.function.IntFunction;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 8] instanceof int[] g
            && new int[4] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).allMatch(i ->
                i < raw.length && raw[i] >= '0' && raw[i] <= '9'
                    ? (ps[0] = ps[0] * 10 + raw[i] - '0') >= 0 && (ps[2] = 1) > 0
                    : (ps[2] != 1 || ((g[ps[1]++] = ps[0]) >= 0 && (ps[0] = 0) == 0)) && (ps[2] = 0) == 0)
            && Integer.valueOf(g[0]) instanceof Integer n
            && Integer.valueOf(g[1]) instanceof Integer k
            && IntStream.range(0, k).map(i -> g[2 + 3 * i]).toArray() instanceof int[] ex
            && IntStream.range(0, k).map(i -> g[3 + 3 * i]).toArray() instanceof int[] ey
            && IntStream.range(0, k).mapToLong(i -> (g[4 + 3 * i] - 1L + 1000000007L) % 1000000007L).toArray() instanceof long[] ew
            && Arrays.stream(ex).sorted().distinct().toArray() instanceof int[] rv
            && Arrays.stream(ey).sorted().distinct().toArray() instanceof int[] cv
            && IntStream.range(0, k).map(i -> Arrays.binarySearch(rv, ex[i])).toArray() instanceof int[] ea
            && IntStream.range(0, k).map(i -> rv.length + Arrays.binarySearch(cv, ey[i])).toArray() instanceof int[] eb
            && Integer.valueOf(rv.length + cv.length) instanceof Integer vn
            && IntStream.range(0, vn).toArray() instanceof int[] comp
            && IntStream.range(0, vn).allMatch(pass -> IntStream.range(0, k).allMatch(i ->
                (comp[ea[i]] = comp[eb[i]] = Math.min(comp[ea[i]], comp[eb[i]])) >= 0))
            && ((IntFunction<long[]>) lab ->
                IntStream.range(0, k).filter(i -> comp[ea[i]] == lab).toArray() instanceof int[] ei
                && IntStream.concat(Arrays.stream(ei).map(i -> ea[i]), Arrays.stream(ei).map(i -> eb[i])).sorted().distinct().toArray() instanceof int[] vs
                && Integer.valueOf((int) Arrays.stream(vs).filter(v -> v < rv.length).count()) instanceof Integer nr
                && Integer.valueOf(vs.length - nr) instanceof Integer nc
                && Integer.valueOf(Math.min(nr, nc)) instanceof Integer s
                && new long[128] instanceof long[] res
                && (s <= 18
                    ? (Boolean) (nr <= nc) instanceof Boolean rs
                        && Arrays.stream(vs).filter(v -> (v < rv.length) == rs).toArray() instanceof int[] sa
                        && Arrays.stream(vs).filter(v -> (v < rv.length) != rs).toArray() instanceof int[] ot
                        && new long[][] {new long[1 << s]} instanceof long[][] st
                        && (st[0][0] = 1) == 1
                        && Arrays.stream(ot).allMatch(u ->
                            Arrays.copyOf(st[0], 1 << s) instanceof long[] nw
                            && st[0] instanceof long[] base
                            && Arrays.stream(ei).filter(e -> (rs ? eb[e] : ea[e]) == u).allMatch(e ->
                                Integer.valueOf(Arrays.binarySearch(sa, rs ? ea[e] : eb[e])) instanceof Integer a
                                && IntStream.range(0, 1 << s).filter(mask -> (mask >> a & 1) == 1).allMatch(mask ->
                                    (nw[mask] = (nw[mask] + base[mask ^ (1 << a)] * ew[e]) % 1000000007L) >= 0))
                            && (st[0] = nw) != null)
                        && IntStream.range(0, 1 << s).allMatch(mask ->
                            (res[Integer.bitCount(mask)] = (res[Integer.bitCount(mask)] + st[0][mask]) % 1000000007L) >= 0)
                    : IntStream.range(0, ei.length).map(j -> Arrays.binarySearch(vs, ea[ei[j]])).toArray() instanceof int[] la
                        && IntStream.range(0, ei.length).map(j -> Arrays.binarySearch(vs, eb[ei[j]])).toArray() instanceof int[] lb
                        && new int[vs.length] instanceof int[] ord
                        && new int[vs.length] instanceof int[] pa
                        && new int[vs.length] instanceof int[] pe
                        && new boolean[vs.length] instanceof boolean[] seen
                        && new boolean[ei.length] instanceof boolean[] tree
                        && new int[] {1} instanceof int[] tl
                        && (seen[0] = true)
                        && IntStream.iterate(0, h -> h < tl[0], h -> h + 1).allMatch(h ->
                            IntStream.range(0, ei.length).allMatch(j ->
                                la[j] == ord[h] && !seen[lb[j]]
                                    ? (seen[lb[j]] = true) && (pa[lb[j]] = ord[h]) >= 0 && (pe[lb[j]] = j) >= 0 && (tree[j] = true) && (ord[tl[0]++] = lb[j]) >= 0
                                    : lb[j] != ord[h] || seen[la[j]]
                                        || ((seen[la[j]] = true) && (pa[la[j]] = ord[h]) >= 0 && (pe[la[j]] = j) >= 0 && (tree[j] = true) && (ord[tl[0]++] = la[j]) >= 0)))
                        && IntStream.range(0, ei.length).filter(j -> !tree[j]).toArray() instanceof int[] nt
                        && IntStream.range(0, 1 << nt.length).allMatch(sub ->
                            new long[] {0, 1} instanceof long[] us
                            && (!IntStream.range(0, nt.length).allMatch(q ->
                                (sub >> q & 1) == 0
                                || ((us[0] & (1L << la[nt[q]] | 1L << lb[nt[q]])) == 0
                                    && (us[0] |= 1L << la[nt[q]] | 1L << lb[nt[q]]) != 0
                                    && (us[1] = us[1] * ew[ei[nt[q]]] % 1000000007L) >= 0))
                                || (new long[vs.length][64] instanceof long[][] gg
                                    && new long[vs.length][64] instanceof long[][] hh
                                    && new int[vs.length] instanceof int[] psz
                                    && IntStream.range(0, vs.length).allMatch(v -> (gg[v][0] = 1) == 1 && (psz[v] = 1) == 1)
                                    && IntStream.iterate(vs.length - 1, i -> i > 0, i -> i - 1).allMatch(i ->
                                        Integer.valueOf(ord[i]) instanceof Integer v
                                        && Integer.valueOf(pa[v]) instanceof Integer p
                                        && (Boolean) ((us[0] >> v & 1) == 0 && (us[0] >> p & 1) == 0) instanceof Boolean usable
                                        && Integer.valueOf(psz[v] / 2) instanceof Integer dv
                                        && Integer.valueOf(psz[p] / 2) instanceof Integer dp
                                        && new long[64] instanceof long[] tot
                                        && IntStream.rangeClosed(0, dv).allMatch(x -> (tot[x] = (gg[v][x] + hh[v][x]) % 1000000007L) >= 0)
                                        && new long[64] instanceof long[] ng
                                        && new long[64] instanceof long[] nh
                                        && IntStream.range(0, (dp + 1) * (dv + 1)).allMatch(q ->
                                            (ng[q / (dv + 1) + q % (dv + 1)] = (ng[q / (dv + 1) + q % (dv + 1)] + gg[p][q / (dv + 1)] * tot[q % (dv + 1)]) % 1000000007L) >= 0
                                            && (nh[q / (dv + 1) + q % (dv + 1)] = (nh[q / (dv + 1) + q % (dv + 1)] + hh[p][q / (dv + 1)] * tot[q % (dv + 1)]) % 1000000007L) >= 0
                                            && (!usable || (nh[q / (dv + 1) + q % (dv + 1) + 1] = (nh[q / (dv + 1) + q % (dv + 1) + 1]
                                                + gg[p][q / (dv + 1)] * gg[v][q % (dv + 1)] % 1000000007L * ew[ei[pe[v]]]) % 1000000007L) >= 0))
                                        && (gg[p] = ng) != null
                                        && (hh[p] = nh) != null
                                        && (psz[p] += psz[v]) > 0)
                                    && IntStream.rangeClosed(0, vs.length / 2).allMatch(j ->
                                        (res[Integer.bitCount(sub) + j] = (res[Integer.bitCount(sub) + j]
                                            + us[1] * ((gg[0][j] + hh[0][j]) % 1000000007L)) % 1000000007L) >= 0)))
                )) ? res : null) instanceof IntFunction<long[]> cp
            && new long[128] instanceof long[] acc
            && (acc[0] = 1) == 1
            && IntStream.range(0, vn).filter(v -> comp[v] == v).allMatch(v ->
                cp.apply(v) instanceof long[] q
                && new long[128] instanceof long[] nw
                && IntStream.range(0, 52 * 52).allMatch(z ->
                    z / 52 + z % 52 >= 128 || (nw[z / 52 + z % 52] = (nw[z / 52 + z % 52] + acc[z / 52] * q[z % 52]) % 1000000007L) >= 0)
                && IntStream.range(0, 128).allMatch(z -> (acc[z] = nw[z]) >= 0))
            && new long[n + 1] instanceof long[] fact
            && (fact[0] = 1) == 1
            && IntStream.rangeClosed(1, n).allMatch(i -> (fact[i] = fact[i - 1] * i % 1000000007L) > 0)
            ? IntStream.rangeClosed(0, Math.min(n, 51)).mapToLong(t -> acc[t] * fact[n - t] % 1000000007L).sum() % 1000000007L
            : -1);
    }
}
