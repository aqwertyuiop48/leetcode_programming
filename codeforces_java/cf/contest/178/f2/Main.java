import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        new Thread(null, () -> System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && Integer.valueOf(sc.nextInt()) instanceof Integer k
            && Stream.generate(sc::next).limit(n).sorted().toList() instanceof List<String> s
            && IntStream.range(0, n - 1).map(i -> (int) IntStream.range(0, Math.min(s.get(i).length(), s.get(i + 1).length())).takeWhile(j -> s.get(i).charAt(j) == s.get(i + 1).charAt(j)).count()).toArray() instanceof int[] lcp
            && ((BiFunction<long[][], Long, long[]>) (fg, m) -> Integer.valueOf(Math.min(fg[0].length + fg[1].length - 1, k + 1)) instanceof Integer sz
                && LongStream.generate(() -> Long.MIN_VALUE / 4).limit(sz).toArray() instanceof long[] res
                && IntStream.range(0, fg[0].length).allMatch(a -> IntStream.range(0, fg[1].length).filter(b -> a + b < sz).allMatch(b -> (res[a + b] = Math.max(res[a + b], fg[0][a] + fg[1][b] + m * a * b)) > Long.MIN_VALUE))
                ? res : null) instanceof BiFunction<long[][], Long, long[]> merge
            && new AtomicReference<BiFunction<Integer, Integer, long[]>>() instanceof AtomicReference<BiFunction<Integer, Integer, long[]>> solve
            && solve.compareAndSet(null, (l, r) -> l.equals(r) ? new long[]{0, 0}
                : Long.valueOf(IntStream.range(l, r).map(i -> lcp[i]).min().getAsInt()) instanceof Long m
                    && IntStream.rangeClosed(l, r).filter(i -> i == r || lcp[i] == m).boxed().toList() instanceof List<Integer> cuts
                    ? IntStream.range(0, cuts.size()).mapToObj(c -> solve.get().apply(c == 0 ? l : cuts.get(c - 1) + 1, cuts.get(c))).reduce(new long[]{0}, (acc, g) -> merge.apply(new long[][]{acc, g}, m), (x, y) -> x)
                    : null)
            ? solve.get().apply(0, n - 1)[k]
            : 0), "", 1L << 28).start();
    }
}
