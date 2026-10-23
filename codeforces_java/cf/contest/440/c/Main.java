import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Long) s.nextLong() instanceof Long n0
            && LongStream.rangeClosed(0, 17).map(k -> k == 0 ? 0 : LongStream.range(0, k).map(t -> 1).sum() == 0 ? 0 : Long.parseLong("1".repeat((int) k))).toArray() instanceof long[] rep
            && new AtomicReference<BiFunction<Long, Integer, Long>>() instanceof AtomicReference<BiFunction<Long, Integer, Long>> fr
            && fr.getAndSet((n, k) -> k == 0 ? (n == 0 ? 0L : 1L << 50) : Math.min(n / rep[k] * k + fr.get().apply(n % rep[k], k - 1), (n / rep[k] + 1) * k + fr.get().apply(rep[k] - n % rep[k], k - 1))) == null
            ? "" + fr.get().apply(n0, 16) : "");
    }
}
