import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            Integer.valueOf(s.nextInt()) instanceof Integer n
            && IntStream.range(0, n).mapToObj(i -> new int[]{s.nextInt(), s.nextInt(), i + 1}).map(x -> new int[]{x[0] - x[1], x[0] + x[1], x[2]}).toList() instanceof List<int[]> cr
            && cr.stream().flatMapToInt(x -> IntStream.of(x[0], x[1])).distinct().sorted().toArray() instanceof int[] xs
            && Integer.valueOf(xs.length) instanceof Integer N
            && cr.stream().map(x -> new int[]{Arrays.binarySearch(xs, x[0]), Arrays.binarySearch(xs, x[1]), x[2]}).collect(Collectors.groupingBy(x -> x[1])) instanceof Map<Integer, List<int[]>> byR
            && new int[N][N] instanceof int[][] P
            && ((IntBinaryOperator) (i, x) -> byR.getOrDefault(x, List.<int[]>of()).stream().filter(y -> y[0] == i).mapToInt(y -> 1).sum()) instanceof IntBinaryOperator hi
            && IntStream.iterate(N - 1, i -> i >= 0, i -> i - 1).allMatch(i -> IntStream.range(i + 1, N).allMatch(x ->
                (P[i][x] = Math.max(P[i][x - 1], byR.getOrDefault(x, List.<int[]>of()).stream().filter(y -> y[0] > i).mapToInt(y -> P[i][y[0]] + P[y[0]][x]).max().orElse(0))
                    + hi.applyAsInt(i, x)) >= 0))
            && new AtomicReference<BiFunction<Integer, Integer, List<Integer>>>() instanceof AtomicReference<BiFunction<Integer, Integer, List<Integer>>> rec
            && rec.compareAndSet(null, (i, x) -> x <= i ? List.<Integer>of()
                : Stream.of(
                    byR.getOrDefault(x, List.<int[]>of()).stream().filter(y -> y[0] == i).map(y -> y[2]).toList(),
                    P[i][x - 1] == P[i][x] - hi.applyAsInt(i, x)
                        ? rec.get().apply(i, x - 1)
                        : byR.get(x).stream().filter(y -> y[0] > i && P[i][y[0]] + P[y[0]][x] == P[i][x] - hi.applyAsInt(i, x)).findFirst()
                            .map(y -> Stream.of(rec.get().apply(i, y[0]), rec.get().apply(y[0], x)).flatMap(List::stream).toList()).orElse(List.<Integer>of()))
                    .flatMap(List::stream).toList())
            && rec.get().apply(0, N - 1).stream().sorted().map(String::valueOf).toList() instanceof List<String> ans
            ? ans.size() + "\n" + String.join(" ", ans) : ""));
    }
}



