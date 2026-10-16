import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc -> Optional.of(new long[]{sc.nextLong(), sc.nextLong()}).ifPresent(start ->
            Optional.of(sc.nextInt()).ifPresent(n ->
                System.out.println(
                    IntStream.range(0, n).mapToObj(i -> new long[]{sc.nextLong(), sc.nextLong()}).toArray(long[][]::new) instanceof long[][] pts
                    && IntStream.range(0, n).mapToLong(i -> (pts[i][0] - start[0]) * (pts[i][0] - start[0]) + (pts[i][1] - start[1]) * (pts[i][1] - start[1])).toArray() instanceof long[] d0
                    && new HashMap<Integer, long[]>() instanceof HashMap<Integer, long[]> memo
                    && new AtomicReference<IntFunction<long[]>>() instanceof AtomicReference<IntFunction<long[]>> f
                    && f.getAndSet(mask ->
                        mask == 0 ? new long[]{0, -1}
                        : memo.get(mask) instanceof long[] cached ? cached
                        : (Integer) Integer.numberOfTrailingZeros(mask) instanceof Integer i
                            && (Integer) (mask ^ (1 << i)) instanceof Integer rest
                            && new long[]{f.get().apply(rest)[0] + 2 * d0[i], -1} instanceof long[] best
                            && IntStream.iterate(rest, x -> x != 0, x -> x & (x - 1)).allMatch(x ->
                                (Integer) Integer.numberOfTrailingZeros(x) instanceof Integer j
                                && (Long) (f.get().apply(rest ^ (1 << j))[0] + d0[i] + d0[j]
                                    + (pts[i][0] - pts[j][0]) * (pts[i][0] - pts[j][0]) + (pts[i][1] - pts[j][1]) * (pts[i][1] - pts[j][1])) instanceof Long cand
                                && (cand >= best[0] || ((best[0] = cand) >= 0 && (best[1] = j) >= 0)))
                            && memo.put(mask, best) == null
                            ? best : new long[]{0, -1}) == null
                    ? f.get().apply((1 << n) - 1)[0] + "\n0 " + Stream.iterate((1 << n) - 1, m -> m != 0, m ->
                            memo.get(m)[1] >= 0 ? m ^ (1 << Integer.numberOfTrailingZeros(m)) ^ (1 << (int) memo.get(m)[1]) : m ^ (1 << Integer.numberOfTrailingZeros(m)))
                        .map(m -> (Integer.numberOfTrailingZeros(m) + 1) + (memo.get(m)[1] >= 0 ? " " + (memo.get(m)[1] + 1) : "") + " 0")
                        .collect(Collectors.joining(" "))
                    : ""))));
    }
}




