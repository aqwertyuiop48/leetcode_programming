import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            System.out.println(
                new int[]{s.nextInt(), s.nextInt()} instanceof int[] nm
                && IntStream.range(0, 2 * nm[1]).map(i -> s.nextInt()).toArray() instanceof int[] ab
                && IntStream.generate(() -> -1).limit(nm[0] + 1).toArray() instanceof int[] head
                && new int[2 * nm[1]] instanceof int[] nxt
                && IntStream.range(0, 2 * nm[1]).allMatch(e -> (nxt[e] = head[ab[e]]) >= -1 && (head[ab[e]] = e) >= 0)
                && new boolean[nm[0] + 1] instanceof boolean[] vis
                && IntStream.generate(() -> -1).limit(nm[0] + 1).toArray() instanceof int[] pe
                && new int[nm[0] + 1] instanceof int[] par
                && new int[nm[0] + 1] instanceof int[] dep
                && new int[nm[0] + 1] instanceof int[] so
                && new int[nm[0] + 1] instanceof int[] se
                && new int[nm[0] + 1] instanceof int[] order
                && new int[3] instanceof int[] st
                && new AtomicReference<IntPredicate>() instanceof AtomicReference<IntPredicate> dfs
                && dfs.getAndSet(u -> (vis[u] = true)
                    && (order[st[0]++] = u) >= 0
                    && IntStream.iterate(head[u], e -> e >= 0, e -> nxt[e]).allMatch(e ->
                        e / 2 == pe[u] || (!vis[ab[e ^ 1]]
                            ? (pe[ab[e ^ 1]] = e / 2) >= 0 && (par[ab[e ^ 1]] = u) >= 0 && (dep[ab[e ^ 1]] = dep[u] + 1) >= 0 && dfs.get().test(ab[e ^ 1])
                            : dep[ab[e ^ 1]] > dep[u]
                                || ((dep[u] - dep[ab[e ^ 1]]) % 2 == 0
                                    ? ++st[1] > 0 && (st[2] = e / 2) >= 0 && ++so[u] > -1000000 && --so[ab[e ^ 1]] > -1000000
                                    : ++se[u] > -1000000 && --se[ab[e ^ 1]] > -1000000)))) == null
                && IntStream.rangeClosed(1, nm[0]).allMatch(v -> vis[v] || dfs.get().test(v))
                && IntStream.iterate(st[0] - 1, i -> i >= 0, i -> i - 1).allMatch(i ->
                    pe[order[i]] < 0 || ((so[par[order[i]]] += so[order[i]]) > -1000000 && (se[par[order[i]]] += se[order[i]]) > -1000000))
                ? (st[1] == 0 ? IntStream.rangeClosed(1, nm[1]) : IntStream.concat(IntStream.rangeClosed(1, nm[0]).filter(v -> pe[v] >= 0 && so[v] == st[1] && se[v] == 0).map(v -> pe[v] + 1), st[1] == 1 ? IntStream.of(st[2] + 1) : IntStream.empty()).distinct().sorted())
                    .mapToObj(String::valueOf).toList() instanceof List<String> res
                    ? res.size() + "\n" + String.join(" ", res)
                    : ""
                : ""));
    }
}



