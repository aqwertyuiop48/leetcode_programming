import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            (Integer) s.nextInt() instanceof Integer n
            && (Integer) s.nextInt() instanceof Integer w
            && IntStream.generate(s::nextInt).limit(n).toArray() instanceof int[] a
            && (Integer) IntStream.of(a).sum() instanceof Integer sum
            && ((BiFunction<Integer, Integer, IntStream>) (t, k) -> IntStream.generate(() -> t + 1).limit(2L * Math.max(k, 0))) instanceof BiFunction<Integer, Integer, IntStream> g
            && IntStream.range(0, n).boxed().min(Comparator.comparingInt(i -> a[i])).get() instanceof Integer z
            && (Integer) (z == 0 ? 1 : 0) instanceof Integer y
            && ((IntFunction<Integer>) i -> IntStream.range(0, i).filter(j -> j != z).map(j -> a[j]).sum()) instanceof IntFunction<Integer> before
            && ((IntFunction<Integer>) i -> Math.max(0, Math.min(a[i], w - a[z] - before.apply(i)))) instanceof IntFunction<Integer> take
            ? w > sum || w < 1 ? "No"
            : w == sum ? "Yes\n" + IntStream.range(0, n).flatMap(i -> g.apply(i, a[i])).mapToObj(String::valueOf).collect(Collectors.joining(" "))
            : n == 1 ? "No"
            : w >= a[z] ? "Yes\n" + Stream.of(
                    g.apply(z, a[z] - 1),
                    IntStream.range(0, n).filter(i -> i != z).flatMap(i -> g.apply(i, take.apply(i))),
                    IntStream.of(z + 1),
                    IntStream.range(0, n).filter(i -> i != z).flatMap(i -> g.apply(i, a[i] - take.apply(i))),
                    IntStream.of(z + 1)).flatMapToInt(q -> q).mapToObj(String::valueOf).collect(Collectors.joining(" "))
            : w == 1 ? "No"
            : "Yes\n" + Stream.of(
                    IntStream.of(y + 1),
                    g.apply(z, a[z] - 1),
                    IntStream.of(y + 1),
                    g.apply(y, w - 2),
                    IntStream.of(z + 1),
                    g.apply(y, a[y] - 1 - (w - 2)),
                    IntStream.range(0, n).filter(i -> i != y && i != z).flatMap(i -> g.apply(i, a[i])),
                    IntStream.of(z + 1)).flatMapToInt(q -> q).mapToObj(String::valueOf).collect(Collectors.joining(" "))
            : ""));
    }
}




