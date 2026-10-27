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
            && new AtomicReference<LongBinaryOperator>() instanceof AtomicReference<LongBinaryOperator> st
            && st.compareAndSet(null, (a, b) -> a == 0 && b == 1 ? 0L
                : a == 0 || b == 0 ? -1L
                : a < b ? a == 1 ? (1L << 40) + (b - 1) + (1L << 40) + 1
                        : b % a == 0 ? -1L : (Long) st.get().applyAsLong(a, b % a) instanceof Long x && x >= 0 ? x + (1L << 40) + b / a : -1L
                : b == 1 ? (1L << 40) + a
                    : a % b == 0 ? -1L : (Long) st.get().applyAsLong(a % b, b) instanceof Long y && y >= 0 ? y + (1L << 40) + a / b : -1L)
            && ((LongBinaryOperator) (a, b) -> (Long) st.get().applyAsLong(a, b) instanceof Long x && x >= 0 && (x & ((1L << 40) - 1)) == n ? (x >> 40) * 4000000 : -1L) instanceof LongBinaryOperator ev
            ? (Long) LongStream.rangeClosed(1, r).parallel().map(i -> (Long) ev.applyAsLong(i, r) instanceof Long u && (Long) ev.applyAsLong(r, i) instanceof Long v ? Math.max(u >= 0 ? u + i * 2 : -1L, v >= 0 ? v + i * 2 + 1 : -1L) : -1L).max().getAsLong() instanceof Long bestKey && bestKey >= 0
                && bl.get().apply((bestKey % 2 == 0) ? (bestKey % 4000000) / 2 : r, (bestKey % 2 == 0) ? r : (bestKey % 4000000) / 2) instanceof List<long[]> bestList
                ? (n - bestList.size()) + "\n" + IntStream.iterate(bestList.size() - 1, i -> i >= 0, i -> i - 1).mapToObj(i -> String.valueOf((char) bestList.get(i)[0]).repeat((int) bestList.get(i)[1])).collect(Collectors.joining())
                : "IMPOSSIBLE"
            : "");
    }


}
