import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        new Thread(null, () -> System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Arrays.stream(l.trim().split("\\s+"))).filter(w -> !w.isEmpty()).mapToInt(Integer::parseInt).toArray() instanceof int[] t
            && Integer.valueOf(t[0] * 2) instanceof Integer N
            && IntStream.range(0, N - 1).flatMap(i -> IntStream.of(t[2 * i + 1] - 1, t[2 * i + 2] - 1)).toArray() instanceof int[] ed
            && new int[N] instanceof int[] deg
            && Arrays.stream(ed).allMatch(v -> ++deg[v] > 0)
            && Arrays.stream(deg).max().getAsInt() <= 3
            && IntStream.generate(() -> -1).limit(3 * N).toArray() instanceof int[] adjv
            && new int[N] instanceof int[] fill
            && IntStream.range(0, N - 1).allMatch(i -> (adjv[ed[2 * i] * 3 + fill[ed[2 * i]]++] = ed[2 * i + 1]) >= 0 && (adjv[ed[2 * i + 1] * 3 + fill[ed[2 * i + 1]]++] = ed[2 * i]) >= 0)
            && new int[N] instanceof int[] par && new int[N] instanceof int[] ord && new int[]{1} instanceof int[] cnt
            && (par[0] = -1) < 0
            && IntStream.range(0, N).allMatch(i -> IntStream.range(0, deg[ord[i]]).map(j -> adjv[ord[i] * 3 + j]).filter(w -> w != par[ord[i]]).allMatch(w -> (par[w] = ord[i]) >= 0 && (ord[cnt[0]++] = w) >= 0))
            && IntStream.generate(() -> 1).limit(N).toArray() instanceof int[] sz
            && IntStream.range(1, N).allMatch(i -> (sz[par[ord[N - i]]] += sz[ord[N - i]]) > 0)
            && ((IntBinaryOperator) (r, p) -> p < 0 ? N : par[r] == p ? sz[r] : N - sz[p]) instanceof IntBinaryOperator size
            && ((IntBinaryOperator) (p, r) -> p * 3 + (adjv[p * 3] == r ? 0 : adjv[p * 3 + 1] == r ? 1 : 2)) instanceof IntBinaryOperator eid
            && IntStream.range(0, 18).mapToObj(l -> new int[3 * N]).toArray(int[][]::new) instanceof int[][] up
            && IntStream.range(0, 3 * N).allMatch(e -> (up[0][e] = adjv[e] < 0 || deg[adjv[e]] != 2 ? -1 : adjv[adjv[e] * 3] == e / 3 ? adjv[e] * 3 + 1 : adjv[e] * 3) >= -1)
            && IntStream.range(1, 18).allMatch(l -> IntStream.range(0, 3 * N).allMatch(e -> (up[l][e] = up[l - 1][e] < 0 ? -1 : up[l - 1][up[l - 1][e]]) >= -1))
            && ((IntFunction<int[]>) e0 -> new int[]{e0, 0} instanceof int[] st && IntStream.iterate(17, l -> l >= 0, l -> l - 1).allMatch(l -> up[l][st[0]] < 0 || ((st[0] = up[l][st[0]]) >= 0 && (st[1] += 1 << l) >= 0)) ? st : null) instanceof IntFunction<int[]> walk
            && ((IntBinaryOperator) (e0, tt) -> new int[]{e0} instanceof int[] cur && IntStream.range(0, 18).allMatch(l -> (tt >> l & 1) == 0 || (cur[0] = cur[0] < 0 ? -1 : up[l][cur[0]]) >= -1) ? cur[0] : -1) instanceof IntBinaryOperator lift
            && ((IntBinaryOperator) (r, p) -> deg[r] == 1 || deg[r] == 2 && deg[adjv[walk.apply(up[0][eid.applyAsInt(p, r)])[0]]] == 1 ? 1 : 0) instanceof IntBinaryOperator pe
            && ((BiFunction<Integer, Integer, int[]>) (r, p) -> IntStream.range(0, deg[r]).map(j -> adjv[r * 3 + j]).filter(w -> w != p).toArray()) instanceof BiFunction<Integer, Integer, int[]> nb
            && new AtomicReference<LongBinaryOperator>() instanceof AtomicReference<LongBinaryOperator> PR
            && new AtomicReference<ToLongFunction<int[]>>() instanceof AtomicReference<ToLongFunction<int[]>> RR
            && IntStream.generate(() -> -1).limit(3 * N).asLongStream().toArray() instanceof long[] memoP
            && new HashMap<Long, Long>() instanceof HashMap<Long, Long> memoR
            && Long.valueOf(1000000007L) instanceof Long M
            && ((ToLongFunction<int[]>) q -> pe.applyAsInt(q[0], q[1]) == 0 ? 0L : q[4] == q[5] ? (long) pe.applyAsInt(q[2], q[3]) : q[4] > q[5] ? 0L
                : Integer.valueOf(lift.applyAsInt(eid.applyAsInt(q[3], q[2]), q[4])) instanceof Integer e ? (e < 0 ? 0L : PR.get().applyAsLong(adjv[e], e / 3)) : 0L) instanceof ToLongFunction<int[]> alpha
            && RR.compareAndSet(null, a -> Long.valueOf((long) eid.applyAsInt(a[1], a[0]) * 3 * N + eid.applyAsInt(a[3], a[2])) instanceof Long key
                ? (memoR.get(key) instanceof Long hit ? hit
                    : Integer.valueOf(size.applyAsInt(a[0], a[1])) instanceof Integer s1 && Integer.valueOf(size.applyAsInt(a[2], a[3])) instanceof Integer s2
                        && Long.valueOf((s1 + s2) % 2 == 1 ? 0L : s1.intValue() == s2.intValue() && pe.applyAsInt(a[0], a[1]) == 1 && pe.applyAsInt(a[2], a[3]) == 1 ? 1L
                            : (alpha.applyAsLong(new int[]{a[0], a[1], a[2], a[3], s1, s2}) + alpha.applyAsLong(new int[]{a[2], a[3], a[0], a[1], s2, s1})) % M) instanceof Long rv
                        && memoR.put(key, rv) == null ? rv : 0L)
                : 0L)
            && ((ToLongFunction<int[]>) q -> Integer.valueOf(eid.applyAsInt(q[0], q[1])) instanceof Integer e0 && walk.apply(e0) instanceof int[] w && Integer.valueOf(adjv[w[0]]) instanceof Integer z
                && Integer.valueOf(w[0] / 3) instanceof Integer pz && Integer.valueOf(2 + w[1]) instanceof Integer k
                ? (deg[z] == 1 ? 1L : nb.apply(z, pz) instanceof int[] oth
                    ? IntStream.range(0, 2).mapToLong(i -> deg[oth[i]] == 2 ? (pe.applyAsInt(oth[i], z) == 1 && size.applyAsInt(oth[i], z) == k ? PR.get().applyAsLong(oth[1 - i], z) : 0L)
                            : deg[oth[i]] == 3 && nb.apply(oth[i], z) instanceof int[] cs
                                ? IntStream.range(0, 2).mapToLong(j -> pe.applyAsInt(cs[j], oth[i]) == 1 && size.applyAsInt(cs[j], oth[i]) == k - 1 ? RR.get().applyAsLong(new int[]{oth[1 - i], z, cs[1 - j], oth[i]}) : 0L).sum() : 0L).sum()
                        + (k >= 3 ? IntStream.range(0, 2).mapToLong(j -> pe.applyAsInt(oth[j], z) == 1 && size.applyAsInt(oth[j], z) == k - 2 ? PR.get().applyAsLong(oth[1 - j], z) : 0L).sum() : 0L)
                    : 0L) : 0L) instanceof ToLongFunction<int[]> tb
            && ((LongBinaryOperator) (r0, p0) -> Integer.valueOf((int) r0) instanceof Integer r && Integer.valueOf((int) p0) instanceof Integer p
                    && Integer.valueOf(size.applyAsInt(r, p)) instanceof Integer s && s % 2 == 0 && nb.apply(r, p) instanceof int[] ch && ch.length <= 2
                ? (s == 2 ? 1L : (Arrays.stream(ch).mapToLong(y -> nb.apply(y, r) instanceof int[] bc && Arrays.stream(ch).filter(x -> x != y).toArray() instanceof int[] ao
                        ? (bc.length > 1 ? 0L : ao.length == 1 && bc.length == 0 ? PR.get().applyAsLong(ao[0], r) : ao.length == 0 && bc.length == 1 ? PR.get().applyAsLong(bc[0], y)
                            : ao.length == 1 && bc.length == 1 ? RR.get().applyAsLong(new int[]{ao[0], r, bc[0], y}) : 0L) : 0L).sum()
                        + (ch.length == 1 ? tb.applyAsLong(new int[]{r, ch[0]}) : 0L)) % M)
                : 0L) instanceof LongBinaryOperator pcore
            && PR.compareAndSet(null, (r0, p0) -> Integer.valueOf((int) r0) instanceof Integer r && Integer.valueOf((int) p0) instanceof Integer p
                ? (p >= 0 && memoP[eid.applyAsInt(p, r)] >= 0 ? memoP[eid.applyAsInt(p, r)]
                    : Long.valueOf(pcore.applyAsLong(r, p)) instanceof Long v && (p < 0 || (memoP[eid.applyAsInt(p, r)] = v) >= 0) ? v : 0L)
                : 0L)
            && Long.valueOf(IntStream.range(0, N).mapToLong(x -> PR.get().applyAsLong(x, -1)).sum() % M) instanceof Long ans
            ? String.valueOf(ans) : "0"), "m", 1L << 29).start();
    }
}
