import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Long.valueOf(s.nextLong()) instanceof Long n && Long.valueOf(s.nextLong()) instanceof Long r
            && new AtomicReference<BiFunction<Long, Long, List<long[]>>>() instanceof AtomicReference<BiFunction<Long, Long, List<long[]>>> bl
            && bl.compareAndSet(null, (a, b) -> a == 0 && b == 1 ? List.<long[]>of()
                : a == 0 || b == 0 ? null
                : a < b ? a == 1 ? Stream.concat(Stream.<long[]>of(new long[]{'B', b - 1}), bl.get().apply(1L, 1L).stream()).toList()
                        : b % a == 0 ? null : bl.get().apply(a, b % a) instanceof List<long[]> rest ? Stream.concat(Stream.<long[]>of(new long[]{'B', b / a}), rest.stream()).toList() : null
                : b == 1 ? Stream.concat(Stream.<long[]>of(new long[]{'T', a}), bl.get().apply(0L, 1L).stream()).toList()
                    : a % b == 0 ? null : bl.get().apply(a % b, b) instanceof List<long[]> rest2 ? Stream.concat(Stream.<long[]>of(new long[]{'T', a / b}), rest2.stream()).toList() : null)
            ? LongStream.rangeClosed(1, r).boxed().flatMap(i -> Stream.of(bl.get().apply(i, r), bl.get().apply(r, i))).filter(l -> l != null && l.stream().mapToLong(b -> b[1]).sum() == n)
                .min(Comparator.comparingLong(l -> n - l.size())) instanceof Optional<List<long[]>> best && best.isPresent()
                ? (n - best.get().size()) + "\n" + IntStream.iterate(best.get().size() - 1, i -> i >= 0, i -> i - 1).mapToObj(i -> String.valueOf((char) best.get().get(i)[0]).repeat((int) best.get().get(i)[1])).collect(Collectors.joining())
                : "IMPOSSIBLE"
            : "");
    }
}
