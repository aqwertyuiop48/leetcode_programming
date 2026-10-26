import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer m
            && new int[m * 2] instanceof int[] to && new int[m * 2] instanceof int[] nxt && new int[m] instanceof int[] z && new int[m] instanceof int[] ea
            && new int[n + 1] instanceof int[] head && IntStream.rangeClosed(0, n).allMatch(i -> (head[i] = -1) < 0)
            && IntStream.range(0, m).allMatch(i -> (ea[i] = s.nextInt()) > 0 && (Integer) s.nextInt() instanceof Integer b && (z[i] = s.nextInt()) >= 0
                && (to[2 * i] = b) > 0 && (nxt[2 * i] = head[ea[i]]) >= -1 && (head[ea[i]] = 2 * i) >= 0
                && (to[2 * i + 1] = ea[i]) > 0 && (nxt[2 * i + 1] = head[b]) >= -1 && (head[b] = 2 * i + 1) >= 0)
            && new int[n + 1] instanceof int[] dist && IntStream.rangeClosed(0, n).allMatch(i -> (dist[i] = -1) < 0) && (dist[1] = 0) == 0
            && new int[n + 1] instanceof int[] best && new int[n + 1] instanceof int[] pe
            && new ArrayDeque<Integer>(List.of(1)) instanceof ArrayDeque<Integer> q
            && Stream.generate(q::poll).takeWhile(Objects::nonNull).allMatch(u -> IntStream.iterate(head[u], e -> e >= 0, e -> nxt[e]).allMatch(e ->
                (dist[to[e]] >= 0 || (dist[to[e]] = dist[u] + 1) > 0 && (best[to[e]] = -1) < 0 && q.add(to[e]))
                && (dist[to[e]] != dist[u] + 1 || best[to[e]] >= best[u] + z[e / 2] || (best[to[e]] = best[u] + z[e / 2]) >= 0 && (pe[to[e]] = e) >= 0)))
            && new boolean[m] instanceof boolean[] on
            && Stream.iterate(n, v -> v != 1, v -> to[pe[v] ^ 1]).allMatch(v -> (on[pe[v] / 2] = true))
            && IntStream.range(0, m).filter(i -> on[i] ? z[i] == 0 : z[i] == 1).boxed().toList() instanceof List<Integer> r
            ? r.size() + "\n" + r.stream().map(i -> ea[i] + " " + to[2 * i] + " " + (1 - z[i])).collect(Collectors.joining("\n")) : "");
    }
}
