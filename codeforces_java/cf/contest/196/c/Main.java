import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        new Thread(null, () -> System.out.println(new Scanner(System.in) instanceof Scanner s
            && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.rangeClosed(0, n).mapToObj(i -> new ArrayList<Integer>()).toList() instanceof List<ArrayList<Integer>> adj
            && IntStream.range(1, n).allMatch(i -> Integer.valueOf(s.nextInt()) instanceof Integer a && Integer.valueOf(s.nextInt()) instanceof Integer b && adj.get(a).add(b) && adj.get(b).add(a))
            && new int[n] instanceof int[] X && new int[n] instanceof int[] Y
            && IntStream.range(0, n).allMatch(i -> (X[i] = s.nextInt()) > Integer.MIN_VALUE && (Y[i] = s.nextInt()) > Integer.MIN_VALUE)
            && new int[n + 1] instanceof int[] par && new int[n + 1] instanceof int[] sz && new int[n + 1] instanceof int[] ans
            && new ArrayDeque<Integer>(List.of(1)) instanceof ArrayDeque<Integer> dq
            && Stream.generate(dq::poll).takeWhile(Objects::nonNull).peek(v -> adj.get(v).stream().filter(u -> u != par[v]).allMatch(u -> (par[u] = v) > 0 && dq.add(u))).toList() instanceof List<Integer> order
            && IntStream.iterate(n - 1, i -> i >= 0, i -> i - 1).allMatch(i -> (sz[order.get(i)] += 1) > 0 && (par[order.get(i)] == 0 || (sz[par[order.get(i)]] += sz[order.get(i)]) > 0))
            && new AtomicReference<BiPredicate<Integer, int[]>>() instanceof AtomicReference<BiPredicate<Integer, int[]>> solve
            && solve.compareAndSet(null, (v, pts) -> Arrays.stream(pts).boxed().min(Comparator.comparingInt((Integer i) -> Y[i]).thenComparingInt(i -> X[i])).get() instanceof Integer p
                && (ans[p + 1] = v) > 0
                && Arrays.stream(pts).filter(i -> i != p).boxed().sorted((a, b) -> (long) (X[a] - X[p]) * (Y[b] - Y[p]) - (long) (Y[a] - Y[p]) * (X[b] - X[p]) > 0 ? -1 : 1).mapToInt(Integer::intValue).toArray() instanceof int[] rest
                && new int[1] instanceof int[] off
                && adj.get(v).stream().filter(u -> u != par[v]).allMatch(c -> solve.get().test(c, Arrays.copyOfRange(rest, off[0], off[0] += sz[c]))))
            && solve.get().test(1, IntStream.range(0, n).toArray())
            ? Arrays.stream(ans, 1, n + 1).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : ""), "", 1 << 28).start();
    }


}
