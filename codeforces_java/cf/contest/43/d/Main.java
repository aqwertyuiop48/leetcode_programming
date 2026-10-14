import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new int[]{s.nextInt(), s.nextInt()}).ifPresent(a -> System.out.println(
            ((BiFunction<Integer, Integer, Stream<String>>) (N, M) -> Stream.of(
                Stream.of("1 1"),
                IntStream.rangeClosed(1, N).boxed().flatMap(r -> IntStream.range(0, M - 1).mapToObj(j -> r + " " + (r % 2 == 1 ? 2 + j : M - j))),
                IntStream.range(0, N).mapToObj(i -> (N - i) + " 1")).flatMap(x -> x)) instanceof BiFunction<Integer, Integer, Stream<String>> g
            ? (a[0] * a[1] <= 2 || (a[0] >= 2 && a[1] >= 2 && (a[0] % 2 == 0 || a[1] % 2 == 0)) ? "0\n" : "1\n" + a[0] + " " + a[1] + " 1 1\n")
                + (a[0] >= 2 && a[1] >= 2 && (a[0] % 2 == 0 || a[1] % 2 == 0)
                    ? (a[0] % 2 == 0 ? g.apply(a[0], a[1]) : g.apply(a[1], a[0]).map(x -> x.split(" ")[1] + " " + x.split(" ")[0]))
                    : Stream.concat(IntStream.rangeClosed(1, a[0]).boxed().flatMap(r -> IntStream.rangeClosed(1, a[1]).mapToObj(c -> r + " " + (r % 2 == 1 ? c : a[1] + 1 - c))), Stream.of("1 1"))).collect(Collectors.joining("\n"))
            : "")));
    }
}

