import java.io.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new StringTokenizer(new String(System.in.readAllBytes())) instanceof StringTokenizer st
            && Integer.valueOf(st.nextToken()) instanceof Integer n
            && IntStream.generate(() -> Integer.parseInt(st.nextToken())).limit(3L * n).toArray() instanceof int[] in
            && IntStream.range(0, n).filter(i -> in[3 * i] == 1).flatMap(i -> IntStream.of(in[3 * i + 1], in[3 * i + 2])).sorted().distinct().toArray() instanceof int[] co
            && Integer.valueOf(Integer.highestOneBit(Math.max(co.length, 1) * 2 - 1)) instanceof Integer SZ
            && new int[n + 2] instanceof int[] par && new int[n + 2] instanceof int[] sz && new int[n + 2] instanceof int[] Lc && new int[n + 2] instanceof int[] Rc
            && new int[n + 2] instanceof int[] xi && new int[n + 2] instanceof int[] yi && new int[4] instanceof int[] cx
            && (TreeSet<Integer>[]) new TreeSet[n + 2] instanceof TreeSet<Integer>[] es
            && (PriorityQueue<Long>[]) new PriorityQueue[2 * SZ + 2] instanceof PriorityQueue<Long>[] pq
            && ((IntUnaryOperator) v -> IntStream.iterate(v, u -> u >= 0, u -> par[u] == u ? -1 : par[u]).reduce(v, (a, b) -> b)) instanceof IntUnaryOperator find
            && ((LongUnaryOperator) r -> ((long) (Rc[(int) r] - Lc[(int) r]) << 18) | (262143L - es[(int) r].size())) instanceof LongUnaryOperator hk
            && ((IntBinaryOperator) (a, b) -> Integer.valueOf(sz[a] >= sz[b] ? a : b) instanceof Integer big && Integer.valueOf(a + b - big) instanceof Integer small
                && (par[small] = big) >= 0 && (sz[big] += sz[small]) >= 0 && (Lc[big] = Math.min(Lc[big], Lc[small])) >= 0 && (Rc[big] = Math.max(Rc[big], Rc[small])) >= 0
                && (es[big].size() >= es[small].size() ? (es[big].addAll(es[small]) | true) : (es[small].addAll(es[big]) | true) && (es[big] = es[small]) != null)
                ? big : -1) instanceof IntBinaryOperator union
            && ((IntBinaryOperator) (v, mode) -> IntStream.iterate(0, t -> pq[v] != null && !pq[v].isEmpty()
                && (Long.valueOf(pq[v].peek()) instanceof Long e && Integer.valueOf(find.applyAsInt((int) (e & 131071))) instanceof Integer r
                    ? (e >> 17) != hk.applyAsLong(r) || r == find.applyAsInt(cx[2]) ? pq[v].poll() != null
                    : (mode == 0 ? es[r].higher(cx[0]) instanceof Integer h && h < cx[1] : es[r].lower(cx[1]) instanceof Integer lo && lo > cx[0])
                        ? pq[v].poll() != null && (cx[2] = union.applyAsInt(find.applyAsInt(cx[2]), r)) >= 0 : false
                    : false), t -> t + 1).map(t -> 1).sum()) instanceof IntBinaryOperator drain
            && ((IntBinaryOperator) (p, mode) -> IntStream.iterate(p + SZ, v -> v >= 1, v -> v >> 1).map(v -> drain.applyAsInt(v, mode)).sum()) instanceof IntBinaryOperator walk
            && ((IntUnaryOperator) (k) -> Stream.iterate(new int[]{Lc[k] + 1 + SZ, Rc[k] + SZ}, s -> s[0] < s[1], s -> new int[]{(s[0] + 1) >> 1, s[1] >> 1})
                .mapToInt(s -> ((s[0] & 1) == 1 ? (pq[s[0]] == null ? (pq[s[0]] = new PriorityQueue<>()) : pq[s[0]]).add((hk.applyAsLong(k) << 17) | k) ? 1 : 0 : 0)
                    + ((s[1] & 1) == 1 ? (pq[s[1] - 1] == null ? (pq[s[1] - 1] = new PriorityQueue<>()) : pq[s[1] - 1]).add((hk.applyAsLong(k) << 17) | k) ? 1 : 0 : 0)).sum()) instanceof IntUnaryOperator reg
            && new int[1] instanceof int[] cn
            ? IntStream.range(0, n).mapToObj(i -> in[3 * i] == 1
                ? Integer.valueOf(++cn[0]) instanceof Integer k
                    && (xi[k] = Arrays.binarySearch(co, in[3 * i + 1])) >= 0 && (yi[k] = Arrays.binarySearch(co, in[3 * i + 2])) >= 0
                    && (par[k] = k) >= 0 && (sz[k] = 1) > 0 && (Lc[k] = xi[k]) >= 0 && (Rc[k] = yi[k]) >= 0
                    && (es[k] = new TreeSet<>(List.of(xi[k], yi[k]))) != null
                    && (cx[0] = xi[k]) >= 0 && (cx[1] = yi[k]) >= 0 && (cx[2] = k) >= 0
                    && walk.applyAsInt(xi[k], 0) >= 0 && walk.applyAsInt(yi[k], 1) >= 0
                    && Integer.valueOf(find.applyAsInt(k)) instanceof Integer root
                    && reg.applyAsInt(root) >= 0
                    ? "" : ""
                : Integer.valueOf(find.applyAsInt(in[3 * i + 1])) instanceof Integer a && Integer.valueOf(find.applyAsInt(in[3 * i + 2])) instanceof Integer b
                    ? (a.equals(b) || Lc[b] < xi[in[3 * i + 1]] && xi[in[3 * i + 1]] < Rc[b] || Lc[b] < yi[in[3 * i + 1]] && yi[in[3 * i + 1]] < Rc[b]) ? "YES" : "NO" : "")
                .filter(s -> !s.isEmpty()).collect(Collectors.joining("\n")) : "");
    }
}
