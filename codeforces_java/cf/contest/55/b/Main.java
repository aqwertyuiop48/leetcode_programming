import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            System.out.println(
                LongStream.generate(s::nextLong).limit(4).boxed().toList() instanceof List<Long> l0
                && Stream.generate(s::next).limit(3).toList() instanceof List<String> ops
                && new AtomicReference<BiFunction<List<Long>, Integer, Long>>() instanceof AtomicReference<BiFunction<List<Long>, Integer, Long>> R
                && R.getAndSet((l, i) -> l.size() == 1 ? l.get(0)
                    : IntStream.range(0, l.size()).boxed().flatMap(x -> IntStream.range(x + 1, l.size()).mapToObj(y ->
                        Stream.concat(IntStream.range(0, l.size()).filter(z -> z != x && z != y).mapToObj(l::get), Stream.of(ops.get(i).equals("+") ? l.get(x) + l.get(y) : l.get(x) * l.get(y))).toList()))
                        .mapToLong(nl -> R.get().apply(nl, i + 1)).min().getAsLong()) == null
                ? (long) R.get().apply(l0, 0)
                : 0L));
    }
}



