import java.util.*;
import java.util.function.*;
import java.util.stream.*;
import java.util.concurrent.atomic.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new int[]{s.nextInt(), s.nextInt()}).ifPresent(nm ->
            Optional.of(IntStream.range(0, nm[1]).mapToObj(i -> new long[]{Long.parseLong(s.next(), 2), s.nextInt()}).toList()).ifPresent(a ->
                System.out.println("" + (
                    new AtomicReference<Function<long[], Long>>() instanceof AtomicReference<Function<long[], Long>> rec
                    && rec.getAndSet(st -> st[1] == 0
                        ? (a.stream().allMatch(x -> nm[0] - Long.bitCount(st[2] ^ x[0]) == x[1]) ? 1L : 0L)
                        : IntStream.range((int) st[0], nm[0]).mapToLong(p -> rec.get().apply(new long[]{p + 1, st[1] - 1, st[2] ^ (1L << p)})).sum()) == null
                    ? rec.get().apply(new long[]{0, (long) a.get(0)[1], a.get(0)[0] ^ ((1L << nm[0]) - 1)})
                    : 0L)))));
    }
}





