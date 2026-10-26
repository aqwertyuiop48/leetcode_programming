import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n
            && IntStream.range(0, n).map(i -> s.nextInt()).toArray() instanceof int[] a
            && ((IntPredicate) x -> x > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(x)).noneMatch(d -> x % d == 0)) instanceof IntPredicate prime
            && Stream.concat(Stream.concat(
                IntStream.range(0, n).filter(i -> a[i] % 2 == 0).mapToObj(i -> new int[]{n, i, 2}),
                IntStream.range(0, n).filter(i -> a[i] % 2 == 1).mapToObj(i -> new int[]{i, n + 1, 2})),
                IntStream.range(0, n * n).filter(t -> a[t / n] % 2 == 0 && a[t % n] % 2 == 1 && prime.test(a[t / n] + a[t % n])).mapToObj(t -> new int[]{t / n, t % n, 1})).toList() instanceof List<int[]> es
            && new int[es.size() * 2] instanceof int[] to && new int[es.size() * 2] instanceof int[] cap && new int[es.size() * 2] instanceof int[] nxt
            && new int[n + 2] instanceof int[] head && IntStream.range(0, n + 2).allMatch(i -> (head[i] = -1) < 0)
            && IntStream.range(0, es.size()).allMatch(i -> (to[2 * i] = es.get(i)[1]) >= 0 && (cap[2 * i] = es.get(i)[2]) > 0 && (nxt[2 * i] = head[es.get(i)[0]]) >= -1 && (head[es.get(i)[0]] = 2 * i) >= 0
                && (to[2 * i + 1] = es.get(i)[0]) >= 0 && (cap[2 * i + 1] = 0) == 0 && (nxt[2 * i + 1] = head[es.get(i)[1]]) >= -1 && (head[es.get(i)[1]] = 2 * i + 1) >= 0)
            && new int[n + 2] instanceof int[] pe
            && ((BooleanSupplier) () -> IntStream.range(0, n + 2).allMatch(i -> (pe[i] = -1) < 0) && (pe[n] = -2) < 0
                && new ArrayDeque<Integer>(List.of(n)) instanceof ArrayDeque<Integer> q
                && Stream.generate(q::poll).takeWhile(Objects::nonNull).allMatch(u -> pe[n + 1] != -1 || IntStream.iterate(head[u], e -> e >= 0, e -> nxt[e]).allMatch(e ->
                    cap[e] <= 0 || pe[to[e]] != -1 || (pe[to[e]] = e) >= 0 && q.add(to[e])))
                && pe[n + 1] != -1) instanceof BooleanSupplier bfs
            && (Long) Stream.generate(() -> 0).takeWhile(z -> bfs.getAsBoolean()).peek(z ->
                Stream.iterate(n + 1, v -> v != n, v -> to[pe[v] ^ 1]).forEach(v -> cap[pe[v]]--)).peek(z ->
                Stream.iterate(n + 1, v -> v != n, v -> to[pe[v] ^ 1]).forEach(v -> cap[pe[v] ^ 1]++)).count() instanceof Long flow
            && IntStream.range(0, n + 2).mapToObj(i -> new ArrayList<Integer>()).toList() instanceof List<ArrayList<Integer>> nb
            && IntStream.range(0, es.size()).filter(i -> es.get(i)[0] < n && es.get(i)[1] < n && cap[2 * i] == 0)
                .allMatch(i -> nb.get(es.get(i)[0]).add(es.get(i)[1]) && nb.get(es.get(i)[1]).add(es.get(i)[0]))
            && new boolean[n] instanceof boolean[] seen
            ? flow != a.length || IntStream.range(0, n).filter(i -> a[i] % 2 == 0).count() * 2 != n ? "Impossible"
                : IntStream.range(0, n).filter(i -> !seen[i]).mapToObj(i -> seen[i] ? null : Stream.iterate(new int[]{-1, i}, p -> p[0] < 0 || p[1] != i,
                        p -> new int[]{p[1], nb.get(p[1]).get(0) == p[0] ? nb.get(p[1]).get(1) : nb.get(p[1]).get(0)}).map(p -> p[1]).peek(v -> seen[v] = true).toList())
                    .filter(Objects::nonNull).toList() instanceof List<List<Integer>> cyc
                    ? cyc.size() + "\n" + cyc.stream().map(c -> c.size() + " " + c.stream().map(v -> String.valueOf(v + 1)).collect(Collectors.joining(" "))).collect(Collectors.joining("\n")) : ""
            : "");
    }
}
