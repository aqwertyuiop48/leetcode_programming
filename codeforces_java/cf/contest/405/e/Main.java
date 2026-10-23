import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(CompletableFuture.supplyAsync(() -> new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n && (Integer) s.nextInt() instanceof Integer m
            && m % 2 == 0
            && IntStream.range(0, n + 1).map(i -> -1).toArray() instanceof int[] head && new int[2 * m] instanceof int[] nxt && new int[2 * m] instanceof int[] to
            && IntStream.range(0, m).allMatch(i -> (Integer) s.nextInt() instanceof Integer a && (Integer) s.nextInt() instanceof Integer b
                && (to[2 * i] = b) > 0 && (nxt[2 * i] = head[a]) >= -1 && (head[a] = 2 * i) >= 0
                && (to[2 * i + 1] = a) > 0 && (nxt[2 * i + 1] = head[b]) >= -1 && (head[b] = 2 * i + 1) >= 0)
            && new boolean[m] instanceof boolean[] used && new boolean[n + 1] instanceof boolean[] vis && new StringBuilder() instanceof StringBuilder sb
            && new Object[1] instanceof Object[] ref
            && (ref[0] = (BiPredicate<Integer, Integer>) (v, p) -> (vis[v] = true) && new ArrayList<Integer>() instanceof ArrayList<Integer> pend
                && Stream.iterate(head[v], e -> e >= 0, e -> nxt[e]).allMatch(e -> used[e >> 1] || (((used[e >> 1] = true) && (vis[to[e]] || ((BiPredicate<Integer, Integer>) ref[0]).test(to[e], v)) && pend.add(to[e])) || true))
                && IntStream.range(0, pend.size() / 2).allMatch(i -> sb.append(pend.get(2 * i)).append(' ').append(v).append(' ').append(pend.get(2 * i + 1)).append('\n') != null)
                && (pend.size() % 2 == 0 || p < 0 || sb.append(pend.get(pend.size() - 1)).append(' ').append(v).append(' ').append(p).append('\n') != null)
                && (pend.size() % 2 == 0 || p < 0)) != null
            && (((BiPredicate<Integer, Integer>) ref[0]).test(1, -1) || true)
            ? sb.toString().trim() : "No solution", r -> new Thread(null, r, "t", 1L << 29).start()).join());
    }
}
