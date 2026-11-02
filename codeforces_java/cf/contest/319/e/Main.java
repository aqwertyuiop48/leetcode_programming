import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        System.out.println(System.in.readAllBytes() instanceof byte[] raw
            && new int[raw.length / 2 + 4] instanceof int[] v && new int[4] instanceof int[] ps
            && IntStream.rangeClosed(0, raw.length).filter(i -> i < raw.length && (raw[i] > 47 || raw[i] == 45)
                ? raw[i] == 45 ? (ps[3] = 1) < 0 | (ps[2] = 1) < 0 : (ps[0] = ps[0] * 10 + raw[i] - 48) < 0 | (ps[2] = 1) < 0
                : ps[2] == 0 || ((v[ps[1]++] = ps[3] == 1 ? -ps[0] : ps[0]) < -2000000000 | (ps[0] = 0) < 0 | (ps[2] = 0) < 0 | (ps[3] = 0) < 0)).count() >= 0
            && Integer.valueOf(v[0]) instanceof Integer n
            && Arrays.copyOfRange(v, 1, 3 * n + 1) instanceof int[] in
            && IntStream.range(0, 3 * n).filter(t -> t % 3 != 0 && in[t - t % 3] == 1).map(t -> in[t]).sorted().distinct().toArray() instanceof int[] co
            && Integer.valueOf(Integer.highestOneBit(Math.max(co.length, 1) * 2 - 1)) instanceof Integer SZ
            && new int[n + 2] instanceof int[] par && new int[n + 2] instanceof int[] sz && new int[n + 2] instanceof int[] Lc && new int[n + 2] instanceof int[] Rc
            && new int[n + 2] instanceof int[] xi && new int[n + 2] instanceof int[] yi && new int[5] instanceof int[] cx && new long[1 << 22] instanceof long[] pb
            && (TreeSet<Integer>[]) new TreeSet[n + 2] instanceof TreeSet<Integer>[] es
            && (PriorityQueue<Long>[]) new PriorityQueue[2 * SZ + 2] instanceof PriorityQueue<Long>[] pq
            && new IntUnaryOperator[1] instanceof IntUnaryOperator[] fh && (fh[0] = u -> par[u] == u ? u : (par[u] = fh[0].applyAsInt(par[u]))) instanceof IntUnaryOperator find
            && ((LongUnaryOperator) r -> ((long) (Rc[(int) r] - Lc[(int) r]) << 1) | (sz[(int) r] >= 2 ? 0L : 1L)) instanceof LongUnaryOperator hk
            && ((IntBinaryOperator) (a, b) -> Integer.valueOf(sz[a] >= sz[b] ? a : b) instanceof Integer big && Integer.valueOf(a + b - big) instanceof Integer small
                && (par[small] = big) >= 0 && (sz[big] += sz[small]) >= 0 && (Lc[big] = Math.min(Lc[big], Lc[small])) >= 0 && (Rc[big] = Math.max(Rc[big], Rc[small])) >= 0
                && (es[big].size() >= es[small].size() ? (es[big].addAll(es[small]) | true) : (es[small].addAll(es[big]) | true) && (es[big] = es[small]) != null)
                ? big : -1) instanceof IntBinaryOperator union
            && ((IntBinaryOperator) (v0, mode) -> pq[v0] != null && !pq[v0].isEmpty()
                && (Long.valueOf(pq[v0].peek()) instanceof Long e && Integer.valueOf(find.applyAsInt((int) (e & 131071))) instanceof Integer r
                    ? (e >> 17) != hk.applyAsLong(r)
                        ? pq[v0].poll() != null
                        : (r == find.applyAsInt(cx[2])
                            ? (pb[cx[4]++] = ((long) v0 << 36) | e) >= 0 && pq[v0].poll() != null
                            : (mode == 0 ? es[r].higher(cx[0]) instanceof Integer h && h < cx[1] : es[r].lower(cx[1]) instanceof Integer lo && lo > cx[0])
                                && (pb[cx[4]++] = ((long) v0 << 36) | e) >= 0 && (cx[3] = Math.max(cx[3], Rc[r] - Lc[r])) >= -1 && pq[v0].poll() != null
                                && (cx[2] = union.applyAsInt(find.applyAsInt(cx[2]), r)) >= 0)
                    : false) ? 1 : 0) instanceof IntBinaryOperator step
            && ((IntBinaryOperator) (v0, mode) -> step.applyAsInt(v0, mode) == 1 ? (IntStream.iterate(1, t -> step.applyAsInt(v0, mode) == 1, t -> t + 1).count() >= 0 ? 1 : 0) : 0) instanceof IntBinaryOperator drain
            && ((IntBinaryOperator) (p, mode) -> IntStream.iterate(p + SZ, u -> u >= 1, u -> u >> 1).map(u -> pq[u] == null || pq[u].isEmpty() ? 0 : drain.applyAsInt(u, mode)).sum()) instanceof IntBinaryOperator walk
            && ((IntUnaryOperator) k -> Stream.iterate(new int[]{Lc[k] + 1 + SZ, Rc[k] + SZ}, s -> s[0] < s[1], s -> new int[]{(s[0] + 1) >> 1, s[1] >> 1})
                .mapToInt(s -> ((s[0] & 1) == 1 ? (pq[s[0]] == null ? (pq[s[0]] = new PriorityQueue<>()) : pq[s[0]]).add((hk.applyAsLong(k) << 17) | k) ? 1 : 0 : 0)
                    + ((s[1] & 1) == 1 ? (pq[s[1] - 1] == null ? (pq[s[1] - 1] = new PriorityQueue<>()) : pq[s[1] - 1]).add((hk.applyAsLong(k) << 17) | k) ? 1 : 0 : 0)).sum()) instanceof IntUnaryOperator reg
            && new int[1] instanceof int[] cn
            ? IntStream.range(0, n).mapToObj(i -> in[3 * i] == 1
                ? Integer.valueOf(++cn[0]) instanceof Integer k
                    && (xi[k] = Arrays.binarySearch(co, in[3 * i + 1])) >= 0 && (yi[k] = Arrays.binarySearch(co, in[3 * i + 2])) >= 0
                    && (par[k] = k) >= 0 && (sz[k] = 1) > 0 && (Lc[k] = xi[k]) >= 0 && (Rc[k] = yi[k]) >= 0
                    && (es[k] = new TreeSet<>(List.of(xi[k], yi[k]))) != null
                    && (cx[0] = xi[k]) >= 0 && (cx[1] = yi[k]) >= 0 && (cx[2] = k) >= 0 && (cx[3] = -1) < 0 && (cx[4] = 0) == 0
                    && walk.applyAsInt(xi[k], 0) >= 0 && walk.applyAsInt(yi[k], 1) >= 0
                    && Integer.valueOf(find.applyAsInt(k)) instanceof Integer root
                    && (Rc[root] - Lc[root] > cx[3]
                        ? reg.applyAsInt(root) >= 0
                        : IntStream.range(0, cx[4]).filter(t -> ((pb[t] & 68719476735L) >> 17) == hk.applyAsLong(root) && find.applyAsInt((int) (pb[t] & 131071)) == root
                            && pq[(int) (pb[t] >>> 36)].add(pb[t] & 68719476735L)).count() >= 0)
                    ? "" : ""
                : Integer.valueOf(find.applyAsInt(in[3 * i + 1])) instanceof Integer a && Integer.valueOf(find.applyAsInt(in[3 * i + 2])) instanceof Integer b
                    ? (a.equals(b) || Lc[b] < xi[in[3 * i + 1]] && xi[in[3 * i + 1]] < Rc[b] || Lc[b] < yi[in[3 * i + 1]] && yi[in[3 * i + 1]] < Rc[b]) ? "YES" : "NO" : "")
                .filter(s -> !s.isEmpty()).collect(Collectors.joining("\n")) : "");
    }
}
