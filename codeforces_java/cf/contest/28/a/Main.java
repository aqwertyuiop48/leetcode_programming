import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.util.concurrent.atomic.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            Integer.valueOf(s.nextInt()) instanceof Integer n
            && Integer.valueOf(s.nextInt()) instanceof Integer m
            && IntStream.range(0, n).mapToObj(i -> new int[]{s.nextInt(), s.nextInt()}).toArray(int[][]::new) instanceof int[][] P
            && IntStream.generate(s::nextInt).limit(m).toArray() instanceof int[] l
            && ((IntFunction<String>) p -> new int[n] instanceof int[] r
                && IntStream.range(0, n).allMatch(i -> (r[i] = -1) < 0)
                && IntStream.range(0, m).boxed().collect(Collectors.groupingBy(i -> l[i], Collectors.toCollection(() -> new ArrayDeque<Integer>()))) instanceof Map<Integer, ArrayDeque<Integer>> mp
                && IntStream.range(0, n).filter(i -> i % 2 == p).allMatch(i ->
                    Integer.valueOf(Math.abs(P[i][0] - P[(i + n - 1) % n][0]) + Math.abs(P[i][1] - P[(i + n - 1) % n][1])
                        + Math.abs(P[i][0] - P[(i + 1) % n][0]) + Math.abs(P[i][1] - P[(i + 1) % n][1])) instanceof Integer len
                    && mp.get(len) instanceof ArrayDeque<Integer> d && !d.isEmpty() && (r[i] = d.poll() + 1) > 0)
                ? Arrays.stream(r).mapToObj(String::valueOf).collect(Collectors.joining(" ")) : "") instanceof IntFunction<String> f
            ? Stream.of(0, 1).map(f::apply).filter(x -> !x.isEmpty()).findFirst().map(x -> "YES\n" + x).orElse("NO")
            : ""));

    }
}




