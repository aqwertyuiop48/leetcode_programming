import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            Arrays.stream(new String(System.in.readAllBytes()).trim().split("[ \r\n]+")).mapToInt(Integer::parseInt).toArray() instanceof int[] t
            && Integer.valueOf(t[0]) instanceof Integer n
            && Integer.valueOf(t[1]) instanceof Integer m
            && IntStream.generate(() -> -1).limit(n + 1).toArray() instanceof int[] head
            && new int[2 * m] instanceof int[] nxt
            && new int[2 * m] instanceof int[] to
            && new int[2 * m] instanceof int[] wt
            && IntStream.range(0, 2 * m).allMatch(e ->
                (to[e] = t[2 + 3 * (e / 2) + (e % 2)]) >= 0
                && (wt[e] = t[4 + 3 * (e / 2)]) >= 0
                && (nxt[e] = head[t[2 + 3 * (e / 2) + 1 - (e % 2)]]) >= -1
                && (head[t[2 + 3 * (e / 2) + 1 - (e % 2)]] = e) >= 0)
            && LongStream.generate(() -> Long.MAX_VALUE).limit(n + 1).toArray() instanceof long[] dist
            && IntStream.generate(() -> -1).limit(n + 1).toArray() instanceof int[] par
            && new boolean[n + 1] instanceof boolean[] vis
            && (dist[1] = 0) == 0
            && new PriorityQueue<Long>() instanceof PriorityQueue<Long> pq
            && pq.add(1L)
            && Stream.generate(pq::poll).takeWhile(Objects::nonNull)
                .filter(k -> !vis[(int) (k & 131071)])
                .allMatch(k -> (vis[(int) (k & 131071)] = true)
                    && IntStream.iterate(head[(int) (k & 131071)], e -> e >= 0, e -> nxt[e]).allMatch(e ->
                        vis[to[e]] || (k >> 17) + wt[e] >= dist[to[e]]
                        || ((dist[to[e]] = (k >> 17) + wt[e]) >= 0
                            && (par[to[e]] = (int) (k & 131071)) >= 0
                            && pq.add(dist[to[e]] << 17 | to[e]))))
            ? (dist[n] == Long.MAX_VALUE
                ? "-1"
                : Stream.iterate(n, c -> c != -1, c -> par[c]).mapToInt(c -> c).toArray() instanceof int[] p
                    ? IntStream.range(0, p.length).map(i -> p[p.length - 1 - i]).mapToObj(String::valueOf).collect(Collectors.joining(" "))
                    : "")
            : "");
    }
}




