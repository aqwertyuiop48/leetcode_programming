import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        new Thread(null, () -> System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).iterator() instanceof Iterator<Object> it
            && ((LongSupplier) () -> Long.parseLong((String) it.next())) instanceof LongSupplier rd
            && Integer.valueOf((int) rd.getAsLong()) instanceof Integer n
            && Integer.valueOf((int) rd.getAsLong()) instanceof Integer k
            && IntStream.range(0, k).mapToObj(i -> new long[]{rd.getAsLong(), rd.getAsLong()}).collect(Collectors.toCollection(ArrayList::new)) instanceof ArrayList<long[]> pts
            && new long[]{rd.getAsLong(), rd.getAsLong(), rd.getAsLong(), rd.getAsLong()} instanceof long[] g
            && IntStream.range(k, n).allMatch(i -> pts.add(new long[]{(g[0] * pts.get(i - 1)[0] + g[1]) % 1_000_000_009L, (g[2] * pts.get(i - 1)[1] + g[3]) % 1_000_000_009L}))
            && pts.stream().sorted(Comparator.comparingLong((long[] p) -> p[0])).toList() instanceof List<long[]> city
            && city.stream().mapToLong(p -> p[0]).toArray() instanceof long[] xs
            && city.stream().mapToLong(p -> p[1]).toArray() instanceof long[] ys
            && IntStream.generate(() -> -1).limit(n).toArray() instanceof int[] lc
            && IntStream.generate(() -> -1).limit(n).toArray() instanceof int[] rc
            && new ArrayDeque<Integer>() instanceof ArrayDeque<Integer> st
            && IntStream.range(0, n).allMatch(i -> (lc[i] = Stream.generate(() -> !st.isEmpty() && ys[st.peek()] < ys[i] ? st.pop() : -1).takeWhile(v -> v >= 0).mapToInt(v -> v).reduce((p, q) -> q).orElse(-1)) >= -1
                && (st.isEmpty() || (rc[st.peek()] = i) >= 0) && st.offerFirst(i))
            && new long[n][] instanceof long[][] dpv
            && new long[n] instanceof long[] mn
            && new long[n] instanceof long[] mx
            && ((BinaryOperator<long[]>) (l, r) -> new long[]{Math.max(l[0] + r[0], Math.max(l[2] == 1 ? 1 + l[1] + r[0] : 0, r[2] == 1 ? 1 + l[0] + r[1] : 0)), l[0] + r[0], 1}) instanceof BinaryOperator<long[]> comb
            && IntStream.range(0, n).boxed().sorted(Comparator.comparingLong((Integer i) -> ys[i])).allMatch(v -> (dpv[v] = comb.apply(lc[v] < 0 ? new long[3] : dpv[lc[v]], rc[v] < 0 ? new long[3] : dpv[rc[v]])) != null
                && (mn[v] = lc[v] < 0 ? xs[v] : mn[lc[v]]) >= 0 && (mx[v] = rc[v] < 0 ? xs[v] : mx[rc[v]]) >= 0)
            && new AtomicReference<Function<long[], long[]>>() instanceof AtomicReference<Function<long[], long[]>> q
            && q.compareAndSet(null, a -> a[0] < 0 ? new long[3]
                : a[1] <= mn[(int) a[0]] && mx[(int) a[0]] <= a[2] ? dpv[(int) a[0]]
                : xs[(int) a[0]] < a[1] ? q.get().apply(new long[]{rc[(int) a[0]], a[1], a[2]})
                : xs[(int) a[0]] > a[2] ? q.get().apply(new long[]{lc[(int) a[0]], a[1], a[2]})
                : comb.apply(q.get().apply(new long[]{lc[(int) a[0]], a[1], a[2]}), q.get().apply(new long[]{rc[(int) a[0]], a[1], a[2]})))
            && st.peekLast() instanceof Integer root
            && Integer.valueOf((int) rd.getAsLong()) instanceof Integer m
            ? Stream.generate(() -> Long.valueOf(rd.getAsLong()) instanceof Long l && Long.valueOf(rd.getAsLong()) instanceof Long r
                    ? String.valueOf(q.get().apply(new long[]{root, l, r})[0]) : "").limit(m).collect(Collectors.joining("\n"))
            : ""), "", 1L << 28).start();
    }
}

