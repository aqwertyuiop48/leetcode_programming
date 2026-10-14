import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.util.concurrent.atomic.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            Integer.valueOf(s.nextInt()) instanceof Integer n
            && Integer.valueOf(s.nextInt()) instanceof Integer w
            && IntStream.generate(s::nextInt).limit(n).toArray() instanceof int[] a
            && Integer.valueOf(Arrays.stream(a).sum()) instanceof Integer sum
            && ((BiFunction<Integer, Integer, IntStream>) (v, c) -> IntStream.generate(() -> v).limit(c)) instanceof BiFunction<Integer, Integer, IntStream> g
            && IntStream.range(0, n).map(i -> a[i] - (i == 0 || i == n - 1 ? 1 : 0)).toArray() instanceof int[] cap
            && IntStream.range(0, n).map(i -> Math.max(0, Math.min(cap[i], w - 2 - IntStream.range(0, i).map(j -> cap[j]).sum()))).toArray() instanceof int[] used
            ? w > sum ? "No"
            : w == sum ? "Yes\n" + IntStream.range(0, n).flatMap(i -> g.apply(i + 1, 2 * a[i])).mapToObj(String::valueOf).collect(Collectors.joining(" "))
            : n == 1 ? "No"
            : w == 1 ? (Integer.valueOf(IntStream.range(0, n).filter(i -> a[i] == 1).findFirst().orElse(-1)) instanceof Integer x && x >= 0
                ? "Yes\n" + Stream.of(IntStream.of(x + 1), IntStream.range(0, n).filter(i -> i != x).flatMap(i -> g.apply(i + 1, 2 * a[i])), IntStream.of(x + 1))
                    .flatMapToInt(y -> y).mapToObj(String::valueOf).collect(Collectors.joining(" "))
                : "No")
            : "Yes\n" + Stream.of(
                IntStream.range(0, n).flatMap(i -> g.apply(i + 1, 2 * used[i])),
                a[n - 1] - 1 - used[n - 1] > 0 ? IntStream.of(n) : IntStream.empty(),
                IntStream.of(1),
                g.apply(n, a[n - 1] - 1 - used[n - 1] > 0 ? 2 * (a[n - 1] - 1 - used[n - 1]) - 1 : 0),
                IntStream.of(1),
                IntStream.of(n),
                g.apply(1, 2 * (a[0] - used[0] - 1)),
                IntStream.range(1, n - 1).flatMap(i -> g.apply(i + 1, 2 * (a[i] - used[i]))),
                IntStream.of(n)).flatMapToInt(y -> y).mapToObj(String::valueOf).collect(Collectors.joining(" "))
            : ""));

    }
}

