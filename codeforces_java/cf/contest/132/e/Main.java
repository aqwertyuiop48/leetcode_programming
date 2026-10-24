import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print(
            new String(System.in.readAllBytes()).trim().split("[ \r\n]+") instanceof String[] t
            && (Integer) Integer.parseInt(t[0]) instanceof Integer n
            && (Integer) Integer.parseInt(t[1]) instanceof Integer m
            && IntStream.range(0, n).map(i -> Integer.parseInt(t[2 + i])).toArray() instanceof int[] a
            && (Integer) (4 * n + 2) instanceof Integer V
            && new int[20 * n + 10] instanceof int[] to
            && new int[20 * n + 10] instanceof int[] cap
            && new int[20 * n + 10] instanceof int[] cost
            && new int[20 * n + 10] instanceof int[] nxt
            && IntStream.generate(() -> -1).limit(V).toArray() instanceof int[] head
            && new int[1] instanceof int[] ec
            && ((java.util.function.Predicate<int[]>) e ->
                (to[ec[0]] = e[1]) >= 0 && (cap[ec[0]] = e[2]) >= 0 && (cost[ec[0]] = e[3]) > -2000000000
                && (nxt[ec[0]] = head[e[0]]) > -2 && (head[e[0]] = ec[0]++) >= 0
                && (to[ec[0]] = e[0]) >= 0 && (cap[ec[0]] = 0) == 0 && (cost[ec[0]] = -e[3]) > -2000000000
                && (nxt[ec[0]] = head[e[1]]) > -2 && (head[e[1]] = ec[0]++) >= 0) instanceof java.util.function.Predicate<int[]> add
            && IntStream.range(0, n).allMatch(i ->
                (Integer) Integer.bitCount(a[i]) instanceof Integer pc
                && (Integer) IntStream.range(i + 1, n).filter(j -> a[j] == a[i]).findFirst().orElse(-1) instanceof Integer nx
                && add.test(new int[]{0, 3 + 4 * i, 1, pc})
                && add.test(new int[]{3 + 4 * i, 4 + 4 * i, 1, -100000})
                && add.test(new int[]{4 + 4 * i, V - 1, 1, 0})
                && add.test(new int[]{1 + 4 * i, 3 + 4 * i, 1000, pc})
                && add.test(new int[]{2 + 4 * i, 3 + 4 * i, 1000, 0})
                && (i + 1 >= n || (add.test(new int[]{4 + 4 * i, 5 + 4 * i, 1, 0}) && add.test(new int[]{1 + 4 * i, 5 + 4 * i, 1000, 0})))
                && (nx < 0 || (add.test(new int[]{4 + 4 * i, 2 + 4 * nx, 1, 0}) && add.test(new int[]{2 + 4 * i, 2 + 4 * nx, 1000, 0}))))
            && IntStream.generate(() -> 1000000000).limit(V).toArray() instanceof int[] pot
            && (pot[0] = 0) == 0
            && IntStream.range(0, V).allMatch(u ->
                pot[u] >= 1000000000
                || IntStream.iterate(head[u], e -> e >= 0, e -> nxt[e])
                    .filter(e -> (e & 1) == 0 && pot[u] + cost[e] < pot[to[e]])
                    .allMatch(e -> (pot[to[e]] = pot[u] + cost[e]) < 1000000000))
            && new int[V] instanceof int[] dist
            && new int[V] instanceof int[] pe
            && (IntStream.range(0, m).allMatch(it ->
                IntStream.range(0, V).allMatch(v -> (dist[v] = 1000000000) > 0)
                && (dist[0] = 0) == 0
                && new PriorityQueue<Long>(List.of(0L)) instanceof PriorityQueue<Long> pq
                && Stream.generate(pq::poll).takeWhile(Objects::nonNull).allMatch(x ->
                    (Integer) (int) (x & 2047) instanceof Integer u
                    && ((x >> 11) > dist[u]
                        || IntStream.iterate(head[u], e -> e >= 0, e -> nxt[e])
                            .filter(e -> cap[e] > 0 && dist[u] + cost[e] + pot[u] - pot[to[e]] < dist[to[e]])
                            .allMatch(e -> (dist[to[e]] = dist[u] + cost[e] + pot[u] - pot[to[e]]) >= 0
                                && (pe[to[e]] = e) >= 0
                                && pq.add(((long) dist[to[e]] << 11) | to[e]))))
                && dist[V - 1] < 1000000000
                && IntStream.range(0, V).allMatch(v -> (pot[v] += dist[v] < 1000000000 ? dist[v] : 0) > -2000000000)
                && pot[V - 1] < 0
                && Stream.iterate(V - 1, v -> to[pe[v] ^ 1]).takeWhile(v -> v != 0).allMatch(v -> cap[pe[v]]-- > 0 && cap[pe[v] ^ 1]++ >= 0)) || true)
            && IntStream.generate(() -> -1).limit(n).toArray() instanceof int[] vr
            && new int[1] instanceof int[] cnt
            && IntStream.range(0, n).allMatch(i ->
                (vr[i] >= 0 || (vr[i] = cnt[0]++) >= 0)
                && Stream.iterate(4 + 4 * i, u -> u < 0 ? -1
                        : IntStream.iterate(head[u], e -> e >= 0, e -> nxt[e]).filter(e -> (e & 1) == 0 && cap[e ^ 1] > 0 && to[e] != V - 1).findFirst() instanceof OptionalInt oe
                            && oe.isPresent() && cap[oe.getAsInt() ^ 1]-- > 0 ? to[oe.getAsInt()] : -1)
                    .takeWhile(u -> u >= 0).filter(u -> u % 4 == 3).findFirst() instanceof Optional<Integer> fj
                && (fj.isEmpty() || (vr[(fj.get() - 3) / 4] = vr[i]) >= 0))
            && new int[cnt[0]] instanceof int[] cur
            && IntStream.range(0, cnt[0]).allMatch(i -> (cur[i] = -1) < 0)
            && new StringBuilder() instanceof StringBuilder out
            && new int[2] instanceof int[] ap
            && IntStream.range(0, n).allMatch(i ->
                (cur[vr[i]] == a[i]
                    || ((cur[vr[i]] = a[i]) >= -1
                        && out.append((char) ('a' + vr[i])).append('=').append(a[i]).append('\n') != null
                        && ++ap[0] > 0
                        && (ap[1] += Integer.bitCount(a[i])) >= 0))
                && out.append("print(").append((char) ('a' + vr[i])).append(")\n") != null)
            ? (n + ap[0]) + " " + ap[1] + "\n" + out
            : "");
    }


}
