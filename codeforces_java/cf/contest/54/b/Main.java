import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n -> Optional.of(s.nextInt()).ifPresent(m ->
            System.out.println(
                IntStream.range(0, n).mapToObj(i -> s.next()).toList() instanceof List<String> g
                && ((UnaryOperator<String>) x -> new StringBuilder(x).reverse().toString()) instanceof UnaryOperator<String> rev
                && IntStream.rangeClosed(1, n).filter(a -> n % a == 0).boxed()
                    .flatMap(a -> IntStream.rangeClosed(1, m).filter(b -> m % b == 0).mapToObj(b -> new int[]{a, b}))
                    .filter(ab -> IntStream.range(0, n / ab[0]).boxed()
                        .flatMap(pi -> IntStream.range(0, m / ab[1]).mapToObj(pj -> IntStream.range(0, ab[0]).mapToObj(i -> g.get(pi * ab[0] + i).substring(pj * ab[1], (pj + 1) * ab[1])).collect(Collectors.joining())))
                        .map(f -> (ab[0] == ab[1]
                            ? Stream.of(f).map(x -> IntStream.range(0, x.length()).mapToObj(k -> String.valueOf(x.charAt((ab[0] - 1 - k % ab[0]) * ab[0] + k / ab[0]))).collect(Collectors.joining())).flatMap(y -> Stream.of(f, rev.apply(f), y, rev.apply(y)))
                            : Stream.of(f, rev.apply(f))).min(Comparator.naturalOrder()).get())
                        .distinct().count() == (long) (n / ab[0]) * (m / ab[1]))
                    .toList() instanceof List<int[]> v
                ? v.size() + "\n" + v.stream().min(Comparator.<int[]>comparingInt(ab -> ab[0] * ab[1]).thenComparingInt(ab -> ab[0])).map(ab -> ab[0] + " " + ab[1]).get()
                : ""))));
    }
}



