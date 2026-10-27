import java.util.Arrays;
import java.util.HashMap;
import java.util.Optional;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.function.LongToIntFunction;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).map(sc -> (Long) sc.nextLong() instanceof Long a && (Long) sc.nextLong() instanceof Long l && new HashMap<String, Long>() instanceof HashMap<String, Long> memo && (LongToIntFunction) (x -> (int) String.valueOf(x).chars().filter(ch -> ch == '4' || ch == '7').count()) instanceof LongToIntFunction fl && (IntUnaryOperator) (dg -> dg == 4 || dg == 7 ? 1 : 0) instanceof IntUnaryOperator lk && new AtomicReference<Function<Object[], Long>>() instanceof AtomicReference<Function<Object[], Long>> sv && new AtomicReference<BiFunction<Long, Long, Long>>() instanceof AtomicReference<BiFunction<Long, Long, Long>> rv && sv.getAndSet(ar -> Optional.of(ar[2] + "," + ar[0] + "," + Arrays.toString((int[]) ar[1])).map(k -> memo.containsKey(k) ? memo.get(k) : Optional.of((Integer) ar[2] == 0 ? ((Long) ar[0] <= 0 && IntStream.range(0, ((int[]) ar[1]).length).allMatch(i -> fl.applyAsInt(i) == ((int[]) ar[1])[i]) ? 0L : 1L << 55) : IntStream.range(0, 10).mapToLong(d -> IntStream.range(0, (d + ((int[]) ar[1]).length - 1) / 10 + 1).map(j -> ((int[]) ar[1])[Math.max(0, 10 * j - d)] - lk.applyAsInt((d + Math.max(0, 10 * j - d)) % 10)).toArray() instanceof int[] pt && IntStream.of(pt).allMatch(v -> v >= 0) && IntStream.range(0, ((int[]) ar[1]).length).allMatch(i -> ((int[]) ar[1])[i] - lk.applyAsInt((d + i) % 10) == pt[(d + i) / 10]) ? (sv.get().apply(new Object[] {Math.max(0L, Math.floorDiv((Long) ar[0] - d + 9, 10L)), pt, (Integer) ar[2] - 1}) instanceof Long r ? (r >= 1L << 55 ? 1L << 55 : r * 10 + d) : 1L << 55) : 1L << 55).min().getAsLong()).map(r -> memo.put(k, r) == null ? r : r).get()).get()) == null && rv.getAndSet((aa, ll) -> ll >= 10 ? rv.get().apply(aa / 10, (aa + ll - 1) / 10 - aa / 10 + 1) * 10 + aa % 10 : sv.get().apply(new Object[] {aa + 1, IntStream.range(0, ll.intValue()).map(i -> fl.applyAsInt(aa + i)).toArray(), 15})) == null ? rv.get().apply(a, l) : -1L).ifPresent(System.out::println);
    }
}

