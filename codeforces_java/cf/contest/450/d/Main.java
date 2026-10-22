import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(t -> Integer.parseInt((String) t)).iterator() instanceof Iterator<Integer> it
            && Integer.valueOf(it.next()) instanceof Integer n && Integer.valueOf(it.next()) instanceof Integer m && Integer.valueOf(it.next()) instanceof Integer k
            && new int[n + 1] instanceof int[] head && new int[2 * (m + k) + 2] instanceof int[] to && new int[2 * (m + k) + 2] instanceof int[] wt && new int[2 * (m + k) + 2] instanceof int[] nxt && new int[1] instanceof int[] cnt
            && IntStream.range(0, n + 1).allMatch(i -> (head[i] = -1) < 0)
            && (Predicate<int[]>) (e -> (to[cnt[0]] = e[1]) >= 0 && (wt[cnt[0]] = e[2]) >= 0 && (nxt[cnt[0]] = head[e[0]]) >= -1 && (head[e[0]] = cnt[0]++) >= 0) instanceof Predicate<int[]> add
            && new int[m][] instanceof int[][] roads
            && IntStream.range(0, m).allMatch(i -> (roads[i] = new int[]{it.next(), it.next(), it.next()}) != null && add.test(roads[i]) && add.test(new int[]{roads[i][1], roads[i][0], roads[i][2]}))
            && new int[k][] instanceof int[][] trains
            && IntStream.range(0, k).allMatch(i -> (trains[i] = new int[]{1, it.next(), it.next()}) != null && add.test(trains[i]) && add.test(new int[]{trains[i][1], 1, trains[i][2]}))
            && new long[n + 1] instanceof long[] d && IntStream.range(0, n + 1).allMatch(i -> (d[i] = Long.MAX_VALUE) > 0) && (d[1] = 0) == 0
            && new PriorityQueue<long[]>(Comparator.comparingLong(e -> e[0])) instanceof PriorityQueue<long[]> pq && pq.add(new long[]{0, 1})
            && Stream.generate(pq::poll).takeWhile(Objects::nonNull).filter(e -> e[0] == d[(int) e[1]]).allMatch(e -> IntStream.iterate(head[(int) e[1]], x -> x >= 0, x -> nxt[x])
                .allMatch(x -> e[0] + wt[x] >= d[to[x]] || ((d[to[x]] = e[0] + wt[x]) > 0 && pq.add(new long[]{d[to[x]], to[x]}))))
            && new boolean[n + 1] instanceof boolean[] hasRoad && Arrays.stream(roads).allMatch(r -> (d[r[0]] + r[2] != d[r[1]] || (hasRoad[r[1]] = true)) && (d[r[1]] + r[2] != d[r[0]] || (hasRoad[r[0]] = true)))
            && new boolean[n + 1] instanceof boolean[] seen
            ? Arrays.stream(trains).filter(t -> t[2] > d[t[1]] || t[2] == d[t[1]] && (hasRoad[t[1]] || seen[t[1]] || !(seen[t[1]] = true))).count() : "");
    }
}
