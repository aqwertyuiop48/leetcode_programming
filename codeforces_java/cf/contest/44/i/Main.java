import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n -> System.out.println(
            new AtomicReference<IntFunction<List<String>>>() instanceof AtomicReference<IntFunction<List<String>>> r
            && r.compareAndSet(null, k -> k == 1 ? List.of("0") : Optional.of(r.get().apply(k - 1)).map(prev -> IntStream.range(0, prev.size()).boxed().flatMap(i ->
                IntStream.concat(IntStream.of(i % 2), IntStream.concat(IntStream.rangeClosed(0, prev.get(i).chars().max().getAsInt() - 47).filter(v -> v != i % 2 && v != 1 - i % 2), IntStream.of(1 - i % 2))).mapToObj(v -> prev.get(i) + v)).toList()).get())
            ? (r.get().apply(n) instanceof List<String> all
                ? all.size() + "\n" + all.stream().map(p -> IntStream.rangeClosed(0, p.chars().max().getAsInt() - 48).mapToObj(g -> "{" + IntStream.range(0, n).filter(i -> p.charAt(i) - 48 == g).mapToObj(i -> "" + (i + 1)).collect(Collectors.joining(",")) + "}").collect(Collectors.joining(","))).collect(Collectors.joining("\n"))
                : "")
            : "")));
    }
}





