import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new int[]{s.nextInt(), s.nextInt()}).ifPresent(nk ->
            System.out.println(
                new int[]{nk[1], (nk[1] + 1) / 2} instanceof int[] kc
                && new boolean[kc[0] + 1][kc[0] + 1] instanceof boolean[][] occ
                && ((Function<int[], Boolean>) (arr -> IntStream.range(arr[1], arr[1] + arr[2]).allMatch(c -> !occ[arr[0]][c]))) instanceof Function<int[], Boolean> free
                && ((Function<int[], Integer>) (arr -> arr[2] * Math.abs(arr[0] - kc[1]) + IntStream.range(arr[1], arr[1] + arr[2]).map(c -> Math.abs(c - kc[1])).sum())) instanceof Function<int[], Integer> remoteness
                && ((Function<int[], Boolean>) (arr -> IntStream.range(arr[1], arr[1] + arr[2]).allMatch(c -> (occ[arr[0]][c] = true)))) instanceof Function<int[], Boolean> occupy
                && ((Function<Integer, int[]>) (m -> IntStream.rangeClosed(1, kc[0]).boxed()
                        .flatMap(row -> IntStream.rangeClosed(1, kc[0] - m + 1).mapToObj(c0 -> new int[]{row, c0}))
                        .filter(rc -> free.apply(new int[]{rc[0], rc[1], m}))
                        .map(rc -> new int[]{remoteness.apply(new int[]{rc[0], rc[1], m}), rc[0], rc[1]})
                        .min(Comparator.<int[]>comparingInt(x -> x[0]).thenComparingInt(x -> x[1]).thenComparingInt(x -> x[2]))
                        .map(b -> new int[]{b[1], b[2]})
                        .orElse(null))) instanceof Function<Integer, int[]> bestBlock
                && IntStream.range(0, nk[0]).mapToObj(i ->
                        new int[]{s.nextInt()} instanceof int[] mArr
                        && bestBlock.apply(mArr[0]) instanceof int[] b
                            ? (occupy.apply(new int[]{b[0], b[1], mArr[0]}) ? b[0] + " " + b[1] + " " + (b[1] + mArr[0] - 1) : "-1")
                            : "-1")
                    .collect(Collectors.joining("\n")) instanceof String out
                ? out
                : "")));
    }
}

