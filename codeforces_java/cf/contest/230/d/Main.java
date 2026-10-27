import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer m
            && IntStream.rangeClosed(0, n).mapToObj(i -> new ArrayList<int[]>()).toList() instanceof List<ArrayList<int[]>> adj
            && IntStream.range(0, m).allMatch(i -> Integer.valueOf(it.next()) instanceof Integer a && Integer.valueOf(it.next()) instanceof Integer b && Integer.valueOf(it.next()) instanceof Integer c
                && adj.get(a).add(new int[]{b, c}) && adj.get(b).add(new int[]{a, c}))
            && IntStream.rangeClosed(0, n).mapToObj(i -> i == 0 ? new int[0] : IntStream.range(0, it.next()).map(j -> it.next()).toArray()).toList() instanceof List<int[]> blocked
            && ((LongBinaryOperator) (u, d) -> u == n ? d : Stream.iterate(d, t -> t + 1).filter(t -> Arrays.binarySearch(blocked.get((int) u), (int) (long) t) < 0).findFirst().get()) instanceof LongBinaryOperator dep
            && new long[n + 1] instanceof long[] dist && IntStream.rangeClosed(0, n).allMatch(i -> (dist[i] = Long.MAX_VALUE) > 0) && (dist[1] = 0) == 0
            && new PriorityQueue<long[]>(Comparator.comparingLong((long[] e) -> e[0])) instanceof PriorityQueue<long[]> pq && pq.add(new long[]{0, 1})
            && new boolean[n + 1] instanceof boolean[] done
            && Stream.generate(pq::poll).takeWhile(Objects::nonNull).filter(e -> !done[(int) e[1]])
                .map(e -> (done[(int) e[1]] = true) && Long.valueOf(dep.applyAsLong(e[1], e[0])) instanceof Long dp
                    && adj.get((int) e[1]).stream().allMatch(ed -> dp + ed[1] >= dist[ed[0]] || ((dist[ed[0]] = dp + ed[1]) > 0 && pq.add(new long[]{dist[ed[0]], ed[0]})))).count() >= 0
            ? dist[n] == Long.MAX_VALUE ? -1 : dist[n] : "");
    }
}

