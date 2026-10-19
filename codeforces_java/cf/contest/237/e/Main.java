import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && sc.next() instanceof String t && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> new Object[]{sc.next(), sc.nextInt()}).toList() instanceof List<Object[]> ss
            && Integer.valueOf(n + 27) instanceof Integer T && new ArrayList<int[]>() instanceof ArrayList<int[]> E
            && IntStream.rangeClosed(0, T).mapToObj(i -> new ArrayList<Integer>()).toList() instanceof List<ArrayList<Integer>> adj
            && ((ToIntFunction<int[]>) a -> adj.get(a[0]).add(E.size()) && E.add(new int[]{a[1], a[2], a[3]}) && adj.get(a[1]).add(E.size()) && E.add(new int[]{a[0], 0, -a[3]}) ? 0 : 1) instanceof ToIntFunction<int[]> add
            && IntStream.rangeClosed(1, n).allMatch(i -> add.applyAsInt(new int[]{0, i, (Integer) ss.get(i - 1)[1], 0}) == 0
                && IntStream.range(0, 26).allMatch(c -> Long.valueOf(((String) ss.get(i - 1)[0]).chars().filter(ch -> ch - 'a' == c).count()) instanceof Long k && (k == 0 || add.applyAsInt(new int[]{i, n + 1 + c, k.intValue(), i}) == 0)))
            && IntStream.range(0, 26).allMatch(c -> Long.valueOf(t.chars().filter(ch -> ch - 'a' == c).count()) instanceof Long k && (k == 0 || add.applyAsInt(new int[]{n + 1 + c, T, k.intValue(), 0}) == 0))
            && new int[T + 1] instanceof int[] dist && new int[T + 1] instanceof int[] pe && new boolean[T + 1] instanceof boolean[] inq && new long[]{0, 0} instanceof long[] tot
            && (IntStream.iterate(0, x -> x >= 0, x -> x + 1).allMatch(x -> IntStream.rangeClosed(0, T).allMatch(i -> (dist[i] = 1 << 29) > 0 && !(inq[i] = false)) && (dist[0] = 0) == 0 && new ArrayDeque<Integer>(List.of(0)) instanceof ArrayDeque<Integer> dq
                && Stream.generate(dq::poll).takeWhile(Objects::nonNull).map(u -> !(inq[u] = false) && adj.get(u).stream().allMatch(e -> E.get(e)[1] <= 0 || dist[u] + E.get(e)[2] >= dist[E.get(e)[0]]
                    || (dist[E.get(e)[0]] = dist[u] + E.get(e)[2]) > -1000 && (pe[E.get(e)[0]] = e) >= 0 && (inq[E.get(e)[0]] || (inq[E.get(e)[0]] = true) && dq.add(E.get(e)[0]) || true))).count() >= 0
                && (dist[T] >= (1 << 29) ? false : Integer.valueOf(IntStream.iterate(T, v -> v != 0, v -> E.get(pe[v] ^ 1)[0]).map(v -> E.get(pe[v])[1]).min().getAsInt()) instanceof Integer f
                    && IntStream.iterate(T, v -> v != 0, v -> E.get(pe[v] ^ 1)[0]).allMatch(v -> (E.get(pe[v])[1] -= f) >= 0 && (E.get(pe[v] ^ 1)[1] += f) > 0)
                    && (tot[0] += f) > 0 && (tot[1] += (long) f * dist[T]) > Long.MIN_VALUE)) || true)
            ? tot[0] == t.length() ? tot[1] : -1 : "");
    }
}
