import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            System.out.println(
                Integer.valueOf(s.nextInt()) instanceof Integer n
                && ((IntPredicate) c -> c == 1 || c >= 2 && IntStream.rangeClosed(2, (int) Math.sqrt(c)).noneMatch(d -> c % d == 0)) instanceof IntPredicate ok
                && new AtomicReference<BiFunction<Integer, Integer, List<Integer>>>() instanceof AtomicReference<BiFunction<Integer, Integer, List<Integer>>> ref
                && ref.getAndSet((rem, mx) -> rem == 0
                    ? List.<Integer>of()
                    : IntStream.iterate(Math.min(rem, mx), c -> c >= 1, c -> c - 1)
                        .filter(ok)
                        .mapToObj(c -> ref.get().apply(rem - c, c - 1) instanceof List<Integer> rest ? Stream.concat(Stream.of(c), rest.stream()).toList() : null)
                        .filter(Objects::nonNull)
                        .findFirst()
                        .orElse(null)) == null
                ? Optional.ofNullable(ref.get().apply(n, n))
                    .map(l -> l.stream().map(String::valueOf).collect(Collectors.joining("+")) + "=" + n)
                    .orElse("0")
                : ""));
    }
}



