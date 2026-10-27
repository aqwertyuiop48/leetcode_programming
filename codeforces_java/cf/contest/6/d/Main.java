import java.util.*;
import java.util.stream.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new int[]{s.nextInt(), s.nextInt(), s.nextInt()}).ifPresent(nab ->
            System.out.println(
            IntStream.range(0, nab[0]).map(i -> s.nextInt()).toArray() instanceof int[] h
            && new HashMap<Long, Long>() instanceof HashMap<Long, Long> memo
            && new AtomicReference<Function<Long, Long>>() instanceof AtomicReference<Function<Long, Long>> ref
            && ref.getAndSet(state ->
                (memo.containsKey(state)
                    ? memo.get(state)
                    : Long.valueOf((state / 10000 > nab[0] - 1)
                        ? (((long) nab[1] * (state % 100) + (long) nab[2] * ((state / 100) % 100) > h[nab[0] - 2]
                            && (long) nab[2] * (state % 100) > h[nab[0] - 1])
                            ? 0L
                            : 100000L * 100)
                        : (IntStream.rangeClosed(0, 20).mapToObj(x ->
                                new long[]{
                                    ((state / 10000 == 2)
                                        ? ((long) nab[2] * x > h[0])
                                        : ((long) nab[1] * (state % 100) + (long) nab[2] * ((state / 100) % 100) + (long) nab[2] * x > h[(int) (state / 10000) - 2]))
                                        ? (x + ref.get().apply((state / 10000 + 1) * 10000 + (state % 100) * 100 + x) / 100)
                                        : 100000L,
                                    x
                                })
                            .min(Comparator.comparingLong(arr -> arr[0])).get() instanceof long[] best
                            ? (best[0] * 100 + best[1])
                            : (100000L * 100))))
                    instanceof Long computed
                    ? (memo.put(state, computed) == null ? computed : computed)
                    : 0L
            ) == null
            && ref.get() instanceof Function<Long, Long> solve
            && new long[]{solve.apply(20000L) / 100} instanceof long[] totalCost
            ? totalCost[0] + "\n" + Stream.iterate(20000L, st -> st / 10000 <= nab[0] - 1, st -> (st / 10000 + 1) * 10000 + (st % 100) * 100 + (memo.get(st) % 100))
                .flatMap(st -> Stream.generate(() -> String.valueOf(st / 10000)).limit(memo.get(st) % 100))
                .collect(Collectors.joining(" "))
            : "")));
    }
}





