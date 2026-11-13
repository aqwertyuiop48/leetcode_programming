import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0
            && Arrays.copyOf(r0, r0.length + 1) instanceof byte[] raw
            && new long[raw.length / 2 + 2] instanceof long[] t
            && new long[4] instanceof long[] st0
            && IntStream.range(0, raw.length).filter(i -> (raw[i] > 47 ? (st0[0] = st0[0] * 10 + raw[i] - 48) + (st0[1] = 1) : raw[i] == 45 ? (st0[2] = 1) : st0[1] == 1 ? (t[(int) st0[3]++] = st0[2] == 1 ? -st0[0] : st0[0]) + (st0[0] = 0) + (st0[1] = 0) + (st0[2] = 0) : 0) < 0).count() >= 0
            && Integer.valueOf((int) t[0]) instanceof Integer n && Integer.valueOf((int) t[1]) instanceof Integer m && Integer.valueOf(2 + 2 * (n - 1)) instanceof Integer pb
            && new int[n + 1] instanceof int[] ah && new int[2 * n] instanceof int[] an && new int[2 * n] instanceof int[] at
            && IntStream.rangeClosed(0, n).filter(i -> (ah[i] = -1) > 0).count() == 0
            && IntStream.range(0, n - 1).filter(i -> (an[2 * i] = ah[(int) t[2 + 2 * i]]) + (ah[(int) t[2 + 2 * i]] = 2 * i) + (at[2 * i] = (int) t[3 + 2 * i])
                + (an[2 * i + 1] = ah[(int) t[3 + 2 * i]]) + (ah[(int) t[3 + 2 * i]] = 2 * i + 1) + (at[2 * i + 1] = (int) t[2 + 2 * i]) < -9).count() == 0
            && new int[n + 1] instanceof int[] par && new int[n + 1] instanceof int[] dep && new int[n + 1] instanceof int[] ord && new int[]{1} instanceof int[] tl
            && (ord[0] = 1) == 1
            && IntStream.range(0, n).filter(i -> IntStream.iterate(ah[ord[i]], e -> e >= 0, e -> an[e]).filter(e -> at[e] != par[ord[i]] && (par[at[e]] = ord[i]) + (dep[at[e]] = dep[ord[i]] + 1) + (ord[tl[0]++] = at[e]) < -9).count() < 0).count() == 0
            && new int[n + 1] instanceof int[] sz && new int[n + 1] instanceof int[] hv && new int[n + 1] instanceof int[] hd
            && IntStream.rangeClosed(0, n).filter(i -> (sz[i] = 1) < 0).count() == 0
            && IntStream.range(1, n).filter(j -> (sz[par[ord[n - j]]] += sz[ord[n - j]]) + (hv[par[ord[n - j]]] = hv[par[ord[n - j]]] == 0 || sz[ord[n - j]] > sz[hv[par[ord[n - j]]]] ? ord[n - j] : hv[par[ord[n - j]]]) < -9).count() == 0
            && IntStream.range(0, n).filter(j -> (hd[ord[j]] = ord[j] == 1 ? 1 : hv[par[ord[j]]] == ord[j] ? hd[par[ord[j]]] : ord[j]) < 0).count() == 0
            && new int[n + 2] instanceof int[] cnt && new int[n + 2] instanceof int[] fp && new int[]{0} instanceof int[] md && new int[5][] instanceof int[][] dd
            && ((Predicate<int[]>) a -> md[0] == 0 ? cnt[a[0]]++ >= 0
                : Integer.valueOf(fp[a[0]]++) instanceof Integer ix
                    && 0L + (dd[0][ix] = a[6] * a[3] + a[4]) + (dd[1][ix] = a[6] * a[3] + a[5]) + (dd[2][ix] = a[3]) + (dd[3][ix] = a[2] * a[3]) + (dd[4][ix] = a[1] - a[2] * (a[6] * a[3] + a[4])) != Long.MIN_VALUE) instanceof Predicate<int[]> emit
            && ((IntPredicate) i -> Integer.valueOf((int) t[pb + 4 * i]) instanceof Integer tt && Integer.valueOf((int) t[pb + 4 * i + 1]) instanceof Integer c
                && Integer.valueOf((int) t[pb + 4 * i + 2]) instanceof Integer v && Integer.valueOf((int) t[pb + 4 * i + 3]) instanceof Integer u
                && new int[]{v, u} instanceof int[] xy
                && Stream.generate(() -> hd[xy[0]] != hd[xy[1]] && (dep[hd[xy[0]]] > dep[hd[xy[1]]] ? (xy[0] = par[hd[xy[0]]]) >= 0 : (xy[1] = par[hd[xy[1]]]) >= 0)).takeWhile(b -> b).count() >= 0
                && Integer.valueOf(dep[xy[0]] < dep[xy[1]] ? xy[0] : xy[1]) instanceof Integer l
                && Integer.valueOf(dep[v] + dep[u] - 2 * dep[l]) instanceof Integer dist
                && new int[]{v} instanceof int[] cx && new int[]{u} instanceof int[] cy
                && Stream.generate(() -> hd[cx[0]] != hd[l] && emit.test(new int[]{hd[cx[0]], dep[cx[0]], -1, c, dep[v] - dep[cx[0]], dep[v] - dep[hd[cx[0]]] + 1, tt}) && (cx[0] = par[hd[cx[0]]]) >= 0).takeWhile(b -> b).count() >= 0
                && Stream.generate(() -> hd[cy[0]] != hd[l] && emit.test(new int[]{hd[cy[0]], dep[hd[cy[0]]] - 1, 1, c, dist - (dep[u] - dep[hd[cy[0]]] + 1), dist - (dep[u] - dep[cy[0]]), tt}) && (cy[0] = par[hd[cy[0]]]) >= 0).takeWhile(b -> b).count() >= 0
                && emit.test(new int[]{hd[l], dep[cx[0]], Integer.compare(dep[cy[0]], dep[cx[0]]), c, dep[v] - dep[cx[0]], dist - (dep[u] - dep[cy[0]]), tt})) instanceof IntPredicate proc
            && (md[0] = 0) == 0 && IntStream.range(0, m).filter(i -> proc.test(i) && false).count() == 0
            && new int[n + 2] instanceof int[] start
            && IntStream.rangeClosed(1, n).filter(h -> (start[h + 1] = start[h] + cnt[h]) < 0).count() == 0
            && IntStream.rangeClosed(1, n).filter(h -> (fp[h] = start[h]) < 0).count() == 0
            && (dd[0] = new int[start[n + 1]]) != null && (dd[1] = new int[start[n + 1]]) != null && (dd[2] = new int[start[n + 1]]) != null && (dd[3] = new int[start[n + 1]]) != null && (dd[4] = new int[start[n + 1]]) != null
            && (md[0] = 1) == 1 && IntStream.range(0, m).filter(i -> proc.test(i) && false).count() == 0
            && dd[0] instanceof int[] tsn && dd[1] instanceof int[] ten && dd[2] instanceof int[] sc && dd[3] instanceof int[] sb && dd[4] instanceof int[] sa
            && new long[]{1000000000000L, 1} instanceof long[] ans && new long[]{0, 1} instanceof long[] cur && new Integer[2] instanceof Integer[] nb
            && ((Comparator<Integer>) (a, b) -> a.equals(b) ? 0
                : Long.valueOf((long) sa[a] * cur[1] + (long) sb[a] * cur[0]) instanceof Long ka && Long.valueOf((long) sa[b] * cur[1] + (long) sb[b] * cur[0]) instanceof Long kb
                    && ka.longValue() != kb.longValue() ? Long.compare(ka, kb) : sb[a] != sb[b] ? Integer.compare(sb[a], sb[b]) : Integer.compare(a, b)) instanceof Comparator<Integer> cmp
            && ((BiPredicate<Integer, Integer>) (i, j) -> i != null && j != null
                && Long.valueOf((long) tsn[i] * sc[j] >= (long) tsn[j] * sc[i] ? tsn[i] : tsn[j]) instanceof Long ln && Long.valueOf((long) tsn[i] * sc[j] >= (long) tsn[j] * sc[i] ? sc[i] : sc[j]) instanceof Long ld
                && Long.valueOf((long) ten[i] * sc[j] <= (long) ten[j] * sc[i] ? ten[i] : ten[j]) instanceof Long hn && Long.valueOf((long) ten[i] * sc[j] <= (long) ten[j] * sc[i] ? sc[i] : sc[j]) instanceof Long hdn
                && ln * hdn <= hn * ld
                && Long.valueOf(sb[i] == sb[j] ? (sa[i] == sa[j] ? ln : -1) : (sb[i] > sb[j] ? 1 : -1) * (sa[j] - sa[i])) instanceof Long cn
                && Long.valueOf(sb[i] == sb[j] ? ld : Math.abs(sb[i] - sb[j])) instanceof Long cd
                && (sb[i] == sb[j] ? sa[i] == sa[j] : ln * cd <= cn * ld && cn * hdn <= hn * cd)
                && cn * ans[1] < ans[0] * cd && (ans[0] = cn) * 0 + (ans[1] = cd) * 0 + 1 > 0) instanceof BiPredicate<Integer, Integer> check
            && IntStream.rangeClosed(1, n).filter(h -> cnt[h] > 0 && Integer.valueOf(start[h]) instanceof Integer base
                && new TreeSet<Integer>(cmp) instanceof TreeSet<Integer> set
                && LongStream.range(0, 2L * cnt[h]).map(e -> ((((e & 1) == 0 ? (long) tsn[base + (int) (e >> 1)] : (long) ten[base + (int) (e >> 1)]) * 100000000L / sc[base + (int) (e >> 1)]) << 18) | ((e & 1) << 17) | (e >> 1)).sorted().toArray() instanceof long[] keys
                && LongStream.of(keys).takeWhile(key -> Integer.valueOf(base + (int) (key & 131071)) instanceof Integer sg && Integer.valueOf((int) (key >> 17 & 1)) instanceof Integer ty
                    && Long.valueOf(ty == 0 ? tsn[sg] : ten[sg]) instanceof Long nn && !(nn * ans[1] >= ans[0] * sc[sg])
                    && (cur[0] = nn) == nn && (cur[1] = sc[sg]) == sc[sg]
                    && (ty == 0
                        ? set.add(sg) && (nb[0] = set.lower(sg)) == nb[0] && (nb[1] = set.higher(sg)) == nb[1] && (check.test(nb[0], sg) || true) && (check.test(sg, nb[1]) || true)
                        : (nb[0] = set.lower(sg)) == nb[0] && (nb[1] = set.higher(sg)) == nb[1] && (set.remove(sg) || true) && (check.test(nb[0], nb[1]) || true))
                    ).count() < 0).count() == 0
            ? (ans[0] >= 1000000000000L ? "-1" : String.format(Locale.US, "%.10f", (double) ans[0] / ans[1])) : "");
    }
}
