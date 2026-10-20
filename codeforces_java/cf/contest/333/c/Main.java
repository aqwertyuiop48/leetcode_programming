import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer k && Integer.valueOf(sc.nextInt()) instanceof Integer m
            && new AtomicReference<Function<String, Set<Integer>>>() instanceof AtomicReference<Function<String, Set<Integer>>> ref
            && ref.compareAndSet(null, s -> Stream.concat(Stream.of(Integer.parseInt(s)), IntStream.range(1, s.length()).boxed().flatMap(c -> ref.get().apply(s.substring(0, c)).stream()
                .flatMap(a -> ref.get().apply(s.substring(c)).stream().flatMap(b -> Stream.of(a + b, a - b, a * b))))).collect(Collectors.toSet()))
            ? IntStream.range(0, 10000).boxed().flatMap(x -> ref.get().apply(String.format("%04d", x)).stream().map(v -> Math.abs(k - v)).filter(d -> d < 10000).map(d -> x * 10000 + d))
                .distinct().sorted().limit(m).map(v -> String.format("%08d", v)).collect(Collectors.joining("\n")) : "");
    }
}
