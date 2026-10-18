import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new AtomicReference<Function<Long, String>>()).filter(f -> f.compareAndSet(null, m -> LongStream.rangeClosed(2, (long) Math.sqrt(m)).filter(d -> m % d == 0).boxed().findFirst().map(d -> d + " " + f.get().apply(m / d)).orElse(String.valueOf(m)))).ifPresent(f -> System.out.print(f.get().apply(new Scanner(System.in).nextLong())));
    }
}
