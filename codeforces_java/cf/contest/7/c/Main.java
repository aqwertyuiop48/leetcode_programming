import java.util.*;
import java.util.stream.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new long[]{s.nextLong(), s.nextLong(), s.nextLong()}).ifPresent(abc ->
            System.out.println(
                new AtomicReference<BiFunction<Long, Long, long[]>>() instanceof AtomicReference<BiFunction<Long, Long, long[]>> ref
                && ref.getAndSet((a, b) -> b == 0 ? new long[]{a, 1L, 0L}
                    : ref.get().apply(b, a % b) instanceof long[] r
                        ? new long[]{r[0], r[2], r[1] - (a / b) * r[2]}
                        : null) == null
                && ref.get().apply(abc[0], abc[1]) instanceof long[] g
                ? (-abc[2] % g[0] != 0
                    ? "-1"
                    : (-abc[2] / g[0]) * g[1] + " " + (-abc[2] / g[0]) * g[2])
                : "")));
    }
}


