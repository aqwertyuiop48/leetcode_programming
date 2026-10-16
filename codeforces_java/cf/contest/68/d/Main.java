import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            Optional.of(s.nextInt()).ifPresent(h ->
            Optional.of(s.nextInt()).ifPresent(q ->
            Optional.of(new HashMap<Long, Long>()).ifPresent(sum ->
            Optional.of(new AtomicReference<BiFunction<Long, Long, Long>>()).filter(r -> r.updateAndGet(o -> (x, mx) ->
                x >= 1L << h ? Math.max(mx, sum.getOrDefault(x, 0L))
                : Optional.of(sum.getOrDefault(2 * x, 0L)).map(sl -> Optional.of(sum.getOrDefault(2 * x + 1, 0L)).map(sr ->
                    (1L << (h - (63 - Long.numberOfLeadingZeros(x)) - 1)) * Math.max(mx, sum.getOrDefault(x, 0L) - Math.min(sl, sr))
                    + r.get().apply(sl > sr ? 2 * x : 2 * x + 1, Math.max(mx, sum.getOrDefault(x, 0L) - Math.max(sl, sr))))
                    .get()).get()) != null).ifPresent(r ->
                System.out.print(IntStream.range(0, q).mapToObj(i -> s.next().equals("add")
                    ? Optional.of(s.nextLong()).map(v -> Optional.of(s.nextLong()).map(e -> LongStream.iterate(v, w -> w > 0, w -> w / 2).mapToObj(w -> sum.merge(w, e, Long::sum)).count()).get()).map(c -> (String) null).orElse(null)
                    : String.format(Locale.US, "%.8f", r.get().apply(1L, 0L) / (double) (1L << h))).filter(Objects::nonNull).collect(Collectors.joining("\n"))))))));
    }
}



