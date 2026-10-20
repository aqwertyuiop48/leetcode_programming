import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> s.next()).toList() instanceof List<String> g
            && new int[2 * n - 1][26] instanceof int[][] ok
            && IntStream.range(0, 2 * n - 1).allMatch(d -> IntStream.rangeClosed(Math.max(0, d - n + 1), Math.min(d, n - 1)).allMatch(i -> (ok[d][g.get(i).charAt(d - i) - 'a'] |= 1 << i) > 0))
            && new HashMap<Integer, Integer>() instanceof HashMap<Integer, Integer> memo
            && new AtomicReference<BiFunction<Integer, Integer, Integer>>() instanceof AtomicReference<BiFunction<Integer, Integer, Integer>> f
            && ((Supplier<BiFunction<Integer, Integer, Integer>>) () -> (d, m) -> d == 2 * n - 2 ? 0 : memo.containsKey(d << 20 | m) ? memo.get(d << 20 | m)
                : IntStream.range(0, 26).filter(c -> ((m | m << 1) & ok[d + 1][c]) != 0).map(c -> (c == 0 ? 1 : c == 1 ? -1 : 0) + f.get().apply(d + 1, (m | m << 1) & ok[d + 1][c])).toArray() instanceof int[] vs
                    ? Stream.of(d % 2 == 1 ? Arrays.stream(vs).max().getAsInt() : Arrays.stream(vs).min().getAsInt()).peek(r -> memo.put(d << 20 | m, r)).findFirst().get() : 0).get() instanceof BiFunction<Integer, Integer, Integer> fn
            && (f.getAndSet(fn) == null || true)
            && Integer.valueOf((g.get(0).charAt(0) == 'a' ? 1 : g.get(0).charAt(0) == 'b' ? -1 : 0) + fn.apply(0, 1)) instanceof Integer res
            ? res > 0 ? "FIRST" : res < 0 ? "SECOND" : "DRAW" : "");
    }
}
