import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && Integer.valueOf(sc.nextInt()) instanceof Integer k
            && IntStream.range(0, n).mapToObj(i -> new int[]{sc.nextInt(), sc.nextInt(), sc.nextInt()}).toList() instanceof List<int[]> tk
            && tk.stream().flatMapToInt(x -> IntStream.of(x[0], x[0] + x[1])).sorted().distinct().toArray() instanceof int[] times
            && Integer.valueOf(times.length) instanceof Integer v
            && Integer.valueOf(2 * (v - 1 + n)) instanceof Integer ecap
            && new int[ecap] instanceof int[] to
            && new int[ecap] instanceof int[] cap
            && new int[ecap] instanceof int[] cost
            && new int[ecap] instanceof int[] nxt
            && IntStream.generate(() -> -1).limit(v).toArray() instanceof int[] head
            && new int[]{0} instanceof int[] ec
            && ((Predicate<int[]>) e -> (to[ec[0]] = e[1]) >= 0 && (cap[ec[0]] = e[2]) >= 0 && (cost[ec[0]] = e[3]) != Integer.MAX_VALUE && (nxt[ec[0]] = head[e[0]]) != Integer.MIN_VALUE && (head[e[0]] = ec[0]++) >= 0
                && (to[ec[0]] = e[0]) >= 0 && (cap[ec[0]] = 0) == 0 && (cost[ec[0]] = -e[3]) != Integer.MAX_VALUE && (nxt[ec[0]] = head[e[1]]) != Integer.MIN_VALUE && (head[e[1]] = ec[0]++) >= 0) instanceof Predicate<int[]> add
            && IntStream.range(0, v - 1).allMatch(i -> add.test(new int[]{i, i + 1, k, 0}))
            && tk.stream().mapToInt(x -> Integer.valueOf(ec[0]) instanceof Integer id && add.test(new int[]{Arrays.binarySearch(times, x[0]), Arrays.binarySearch(times, x[0] + x[1]), 1, -x[2]}) ? id : -1).toArray() instanceof int[] eid
            && new int[]{0} instanceof int[] flow
            && new long[v] instanceof long[] dist
            && new int[v] instanceof int[] prev
            && new long[v] instanceof long[] h && IntStream.range(0, v).allMatch(i -> (h[i] = i == 0 ? 0 : 1L << 60) >= 0)
            && IntStream.range(0, v).allMatch(u -> IntStream.iterate(head[u], e -> e != -1, e -> nxt[e]).allMatch(e -> cap[e] <= 0 || (h[to[e]] = Math.min(h[to[e]], h[u] + cost[e])) > Long.MIN_VALUE))
            && IntStream.range(0, k).allMatch(it -> flow[0] >= k
                || (IntStream.range(0, v).allMatch(i -> (dist[i] = 1L << 60) > 0) && (dist[0] = 0) == 0
                    && new PriorityQueue<long[]>(Comparator.comparingLong(x -> x[0])) instanceof PriorityQueue<long[]> pq && pq.add(new long[]{0, 0})
                    && Stream.generate(pq::poll).takeWhile(Objects::nonNull).allMatch(top -> top[0] > dist[(int) top[1]]
                        || IntStream.iterate(head[(int) top[1]], e -> e != -1, e -> nxt[e]).allMatch(e -> cap[e] <= 0 || top[0] + cost[e] + h[(int) top[1]] - h[to[e]] >= dist[to[e]]
                            || (dist[to[e]] = top[0] + cost[e] + h[(int) top[1]] - h[to[e]]) >= 0 && (prev[to[e]] = e) >= 0 && pq.add(new long[]{dist[to[e]], to[e]})))
                    && dist[v - 1] < (1L << 60)
                    && IntStream.range(0, v).allMatch(i -> dist[i] >= (1L << 60) || (h[i] += dist[i]) > Long.MIN_VALUE)
                    && Integer.valueOf(Math.min(k - flow[0], Stream.iterate(v - 1, x -> x != 0, x -> to[prev[x] ^ 1]).mapToInt(x -> cap[prev[x]]).min().getAsInt())) instanceof Integer f
                    && Stream.iterate(v - 1, x -> x != 0, x -> to[prev[x] ^ 1]).allMatch(x -> (cap[prev[x]] -= f) >= 0 && (cap[prev[x] ^ 1] += f) > 0)
                    && (flow[0] += f) > 0) || true)
            ? IntStream.range(0, n).mapToObj(i -> cap[eid[i]] == 0 ? "1" : "0").collect(Collectors.joining(" "))
            : "");
    }


}
