import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] r0 && Arrays.copyOf(r0, r0.length + 2) instanceof byte[] raw
            && Integer.valueOf(IntStream.range(0, raw.length).filter(i -> raw[i] <= 32).findFirst().getAsInt()) instanceof Integer sEnd
            && Integer.valueOf(Integer.parseInt(new String(raw, sEnd, Math.min(40, raw.length - sEnd)).trim().split("\\s+")[0])) instanceof Integer m
            && new int[m + 4] instanceof int[] ts && new int[m + 4] instanceof int[] te && new int[]{0} instanceof int[] tc
            && IntStream.range(0, raw.length - 1).takeWhile(i -> tc[0] <= m + 2).filter(i -> (raw[i] > 32 && (i == 0 || raw[i - 1] <= 32) ? (ts[tc[0]] = i) >= 0 : true)
                & (raw[i] > 32 && raw[i + 1] <= 32 ? (te[tc[0]++] = i + 1) > 0 : true)).count() >= 0
            && Integer.valueOf(IntStream.range(ts[m + 2], te[m + 2]).reduce(0, (acc, i) -> acc * 10 + raw[i] - 48)) instanceof Integer q
            && new int[4 * q + 4] instanceof int[] qv && new int[]{0, 0, 0} instanceof int[] ps
            && IntStream.range(te[m + 2], raw.length).filter(i -> raw[i] >= 48 ? (ps[1] = ps[1] * 10 + raw[i] - 48) >= 0 & (ps[2] = 1) > 0 : ps[2] == 0 || (qv[ps[0]++] = ps[1]) >= 0 & (ps[1] = 0) == 0 & (ps[2] = 0) == 0).count() >= 0
            && Integer.valueOf(IntStream.rangeClosed(2, m + 1).map(t -> te[t] - ts[t]).sum()) instanceof Integer tot
            && Integer.valueOf(2 * tot + 5) instanceof Integer SZ
            && IntStream.generate(() -> -1).limit(26L * SZ).toArray() instanceof int[] nxt && new int[SZ] instanceof int[] len && new int[SZ] instanceof int[] link && (link[0] = -1) == -1
            && new int[]{1} instanceof int[] st && new int[SZ] instanceof int[] root
            && Integer.valueOf(40 * tot + 100) instanceof Integer NN && new int[NN] instanceof int[] lc && new int[NN] instanceof int[] rc && new long[NN] instanceof long[] mx && new int[]{0} instanceof int[] nc
            && new AtomicReference<ToIntFunction<int[]>>() instanceof AtomicReference<ToIntFunction<int[]>> upd
            && upd.compareAndSet(null, a -> Integer.valueOf(a[0] == 0 ? ++nc[0] : a[0]) instanceof Integer nd
                && (a[1] == a[2] ? (mx[nd] = (((mx[nd] >>> 16) + 1) << 16) | (65535 - a[1])) > 0
                    : Integer.valueOf((a[1] + a[2]) / 2) instanceof Integer mid
                        && (a[3] <= mid ? (lc[nd] = upd.get().applyAsInt(new int[]{lc[nd], a[1], mid, a[3]})) >= 0 : (rc[nd] = upd.get().applyAsInt(new int[]{rc[nd], mid + 1, a[2], a[3]})) >= 0)
                        && (mx[nd] = Math.max(mx[lc[nd]], mx[rc[nd]])) >= 0) ? nd : 0)
            && new AtomicReference<ToIntFunction<int[]>>() instanceof AtomicReference<ToIntFunction<int[]>> mg
            && mg.compareAndSet(null, a -> a[0] == 0 ? a[1] : a[1] == 0 ? a[0]
                : (Integer.valueOf(++nc[0]) instanceof Integer nd
                    && (a[2] == a[3] ? (mx[nd] = (((mx[a[0]] >>> 16) + (mx[a[1]] >>> 16)) << 16) | (65535 - a[2])) > 0
                        : Integer.valueOf((a[2] + a[3]) / 2) instanceof Integer mid
                            && (lc[nd] = mg.get().applyAsInt(new int[]{lc[a[0]], lc[a[1]], a[2], mid})) >= 0
                            && (rc[nd] = mg.get().applyAsInt(new int[]{rc[a[0]], rc[a[1]], mid + 1, a[3]})) >= 0
                            && (mx[nd] = Math.max(mx[lc[nd]], mx[rc[nd]])) >= 0) ? nd : 0))
            && new AtomicReference<ToLongFunction<int[]>>() instanceof AtomicReference<ToLongFunction<int[]>> qf
            && qf.compareAndSet(null, a -> a[0] == 0 || a[4] < a[1] || a[3] > a[2] ? 0L : a[3] <= a[1] && a[2] <= a[4] ? mx[a[0]]
                : Math.max(qf.get().applyAsLong(new int[]{lc[a[0]], a[1], (a[1] + a[2]) / 2, a[3], a[4]}), qf.get().applyAsLong(new int[]{rc[a[0]], (a[1] + a[2]) / 2 + 1, a[2], a[3], a[4]})))
            && ((ToIntFunction<int[]>) a -> Integer.valueOf(st[0]++) instanceof Integer cl && (len[cl] = len[a[0]] + 1) > 0
                && IntStream.range(0, 26).filter(z -> (nxt[cl * 26 + z] = nxt[a[2] * 26 + z]) >= -1).count() >= 0 && (link[cl] = link[a[2]]) >= -1
                && IntStream.iterate(a[0], x -> link[x]).filter(x -> x < 0 || nxt[x * 26 + a[1]] != a[2] || ((nxt[x * 26 + a[1]] = cl) < 0)).findFirst().isPresent()
                && (link[a[2]] = cl) >= 0 ? cl : -1) instanceof ToIntFunction<int[]> split
            && IntStream.rangeClosed(1, m).filter(i -> new int[]{0} instanceof int[] lh
                && IntStream.range(ts[1 + i], te[1 + i]).filter(pos -> Integer.valueOf(raw[pos] - 97) instanceof Integer c && Integer.valueOf(lh[0]) instanceof Integer last
                    && Integer.valueOf(nxt[last * 26 + c] >= 0
                        ? (len[nxt[last * 26 + c]] == len[last] + 1 ? nxt[last * 26 + c] : split.applyAsInt(new int[]{last, c, nxt[last * 26 + c]}))
                        : (Integer.valueOf(st[0]++) instanceof Integer cur && (len[cur] = len[last] + 1) > 0
                            && Integer.valueOf(IntStream.iterate(last, x -> link[x]).filter(x -> x < 0 || nxt[x * 26 + c] >= 0 || ((nxt[x * 26 + c] = cur) < 0)).findFirst().getAsInt()) instanceof Integer p
                            && (link[cur] = p < 0 ? 0 : len[p] + 1 == len[nxt[p * 26 + c]] ? nxt[p * 26 + c] : split.applyAsInt(new int[]{p, c, nxt[p * 26 + c]})) >= 0 ? cur : -1)) instanceof Integer nl
                    && (lh[0] = nl) >= 0 && (root[nl] = upd.get().applyAsInt(new int[]{root[nl], 1, m, i})) > 0).count() >= 0).count() >= 0
            && Integer.valueOf(st[0]) instanceof Integer Z
            && LongStream.range(1, Z).map(v -> ((long) len[(int) v] << 20) | v).sorted().toArray() instanceof long[] ord
            && IntStream.range(0, ord.length).map(j -> ord.length - 1 - j).filter(j -> Integer.valueOf((int) (ord[j] & 1048575)) instanceof Integer v
                && Integer.valueOf(link[v]) instanceof Integer p && (root[p] = mg.get().applyAsInt(new int[]{root[p], root[v], 1, m})) >= 0).count() >= 0
            && Integer.valueOf(te[0] - ts[0]) instanceof Integer sl && new int[sl + 1] instanceof int[] vs && new int[sl + 1] instanceof int[] ls && new int[2] instanceof int[] cs
            && IntStream.range(0, sl).filter(j -> Integer.valueOf(raw[ts[0] + j] - 97) instanceof Integer c
                && Integer.valueOf(IntStream.iterate(cs[0], x -> link[x]).filter(x -> x == 0 || nxt[x * 26 + c] >= 0).findFirst().getAsInt()) instanceof Integer p
                && (nxt[p * 26 + c] >= 0 ? (cs[1] = (p == cs[0] ? cs[1] : len[p]) + 1) > 0 & (cs[0] = nxt[p * 26 + c]) >= 0 : (cs[0] = 0) == 0 & (cs[1] = 0) == 0)
                && (vs[j + 1] = cs[0]) >= 0 && (ls[j + 1] = cs[1]) >= 0).count() >= 0
            && new int[17 * Z] instanceof int[] up
            && IntStream.range(0, Z).filter(v -> (up[v] = Math.max(link[v], 0)) >= 0).count() >= 0
            && IntStream.range(1, 17).filter(k -> IntStream.range(0, Z).filter(v -> (up[k * Z + v] = up[(k - 1) * Z + up[(k - 1) * Z + v]]) >= 0).count() >= 0).count() >= 0
            ? IntStream.range(0, q).mapToObj(j -> Integer.valueOf(qv[4 * j + 3]) instanceof Integer pr && Integer.valueOf(pr - qv[4 * j + 2] + 1) instanceof Integer L
                    && ls[pr] >= L && new int[]{vs[pr]} instanceof int[] cu
                    && IntStream.range(0, 17).map(k -> 16 - k).filter(k -> len[up[k * Z + cu[0]]] >= L && (cu[0] = up[k * Z + cu[0]]) >= 0).count() >= 0
                    && Long.valueOf(qf.get().applyAsLong(new int[]{root[cu[0]], 1, m, qv[4 * j], qv[4 * j + 1]})) instanceof Long key && key > 0
                    ? (65535 - (key & 65535)) + " " + (key >>> 16) : qv[4 * j] + " 0").collect(Collectors.joining("\n")) : "");
    }
}
