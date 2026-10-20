import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).mapToLong(t -> Long.parseLong((String) t)).iterator() instanceof PrimitiveIterator.OfLong it
            && Integer.valueOf((int) it.nextLong()) instanceof Integer n && Integer.valueOf((int) it.nextLong()) instanceof Integer m && Integer.valueOf((int) it.nextLong()) instanceof Integer k
            && Integer.valueOf((int) it.nextLong()) instanceof Integer s1 && Integer.valueOf((int) it.nextLong()) instanceof Integer s2 && Integer.valueOf((int) it.nextLong()) instanceof Integer f
            && new int[n + 1] instanceof int[] head && new int[m + k] instanceof int[] nxt && new int[m + k] instanceof int[] to && new int[m + k] instanceof int[] from && new long[m + k] instanceof long[] w && new long[k] instanceof long[] lo && new long[k] instanceof long[] hi
            && IntStream.range(0, n + 1).allMatch(i -> (head[i] = -1) < 0)
            && IntStream.range(0, m + k).allMatch(e -> (from[e] = (int) it.nextLong()) > 0 & (to[e] = (int) it.nextLong()) > 0
                & (e < m ? (w[e] = it.nextLong()) >= 0 : (lo[e - m] = it.nextLong()) >= 0 & (hi[e - m] = it.nextLong()) >= 0) & (nxt[e] = head[from[e]]) > -2 & (head[from[e]] = e) >= 0)
            && Long.valueOf(Long.MAX_VALUE / 4) instanceof Long INF
            && ((IntFunction<long[]>) src -> LongStream.generate(() -> INF).limit(n + 1).toArray() instanceof long[] dist && (dist[src] = 0) == 0
                && new PriorityQueue<long[]>(Comparator.comparingLong(x -> x[0])) instanceof PriorityQueue<long[]> pq && pq.add(new long[]{0, src})
                && IntStream.iterate(0, z -> !pq.isEmpty(), z -> z + 1).allMatch(z -> pq.poll() instanceof long[] cur
                    && (cur[0] > dist[(int) cur[1]] || IntStream.iterate(head[(int) cur[1]], e -> e >= 0, e -> nxt[e]).allMatch(e -> cur[0] + w[e] >= dist[to[e]] || ((dist[to[e]] = cur[0] + w[e]) >= 0 && pq.add(new long[]{dist[to[e]], to[e]})))))
                ? dist : null) instanceof IntFunction<long[]> dij
            && ((Predicate<Boolean>) strict -> IntStream.range(0, k).allMatch(j -> (w[m + j] = hi[j]) >= 0) && new boolean[]{true} instanceof boolean[] ch
                && IntStream.iterate(0, z -> ch[0], z -> z + 1).allMatch(z -> dij.apply(s1) instanceof long[] d1 && dij.apply(s2) instanceof long[] d2 && !(ch[0] = false)
                    && (IntStream.range(0, k).filter(j -> w[m + j] != lo[j] && (strict ? d1[from[m + j]] < d2[from[m + j]] : d1[from[m + j]] <= d2[from[m + j]])).allMatch(j -> (w[m + j] = lo[j]) >= 0 && (ch[0] = true)) | true))
                && dij.apply(s1)[f] <= dij.apply(s2)[f] - (strict ? 1 : 0)) instanceof Predicate<Boolean> run
            ? run.test(true) ? "WIN\n" + Arrays.stream(w, m, m + k).mapToObj(String::valueOf).collect(Collectors.joining(" "))
                : run.test(false) ? "DRAW\n" + Arrays.stream(w, m, m + k).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "LOSE" : "");
    }
}
