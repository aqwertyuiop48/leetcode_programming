import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(
            new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && Integer.valueOf(sc.nextInt()) instanceof Integer m
            && IntStream.range(0, n).map(i -> sc.nextInt()).toArray() instanceof int[] a
            && IntStream.range(0, m).map(i -> sc.nextInt() * 1000 + sc.nextInt() - 1001).toArray() instanceof int[] pr
            && IntStream.range(0, n).flatMap(i ->
                new int[]{a[i]} instanceof int[] rem
                    ? IntStream.concat(
                        IntStream.rangeClosed(2, 31623).filter(d ->
                            rem[0] % d == 0
                            && (rem[0] = IntStream.iterate(rem[0], x -> x % d == 0, x -> x / d).reduce(0, (x, y) -> y) / d) > 0),
                        IntStream.of(0).map(z -> rem[0]).filter(r -> r > 1))
                    : IntStream.empty()).distinct().toArray() instanceof int[] primes
            && Integer.valueOf(n + 2) instanceof Integer V
            && new int[V * V] instanceof int[] cap
            && new int[V] instanceof int[] vis
            && new AtomicReference<IntBinaryOperator>() instanceof AtomicReference<IntBinaryOperator> ref
            && ref.compareAndSet(null, (u, f) ->
                u == n + 1
                    ? f
                    : (vis[u] = 1) > 0
                        ? IntStream.range(0, V).filter(v -> cap[u * V + v] > 0 && vis[v] == 0)
                            .map(v -> Integer.valueOf(ref.get().applyAsInt(v, Math.min(f, cap[u * V + v]))) instanceof Integer r
                                && r > 0 && (cap[u * V + v] -= r) >= 0 && (cap[v * V + u] += r) > 0 ? r : 0)
                            .filter(r -> r > 0).findFirst().orElse(0)
                        : 0)
            ? Arrays.stream(primes).mapToLong(p ->
                IntStream.range(0, n).map(i -> (int) IntStream.iterate(a[i], x -> x % p == 0, x -> x / p).count()).toArray() instanceof int[] e
                && IntStream.range(0, V * V).allMatch(i -> (cap[i] = 0) == 0)
                && IntStream.range(0, n).allMatch(i -> i % 2 == 0 ? (cap[n * V + i] = e[i]) >= 0 : (cap[i * V + n + 1] = e[i]) >= 0)
                && Arrays.stream(pr).allMatch(x -> x / 1000 % 2 == 0
                    ? (cap[(x / 1000) * V + x % 1000] = 1000000000) > 0
                    : (cap[(x % 1000) * V + x / 1000] = 1000000000) > 0)
                    ? IntStream.generate(() ->
                        IntStream.range(0, V).allMatch(i -> (vis[i] = 0) == 0) ? ref.get().applyAsInt(n, 1000000000) : 0)
                        .takeWhile(r -> r > 0).asLongStream().sum()
                    : 0L).sum()
            : -1);
    }
}
