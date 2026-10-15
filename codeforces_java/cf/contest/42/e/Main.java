import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            Integer.valueOf(s.nextInt()) instanceof Integer n && Integer.valueOf(s.nextInt()) instanceof Integer m
            && IntStream.range(0, m).mapToObj(i -> new int[]{s.nextInt() - 1, s.nextInt() - 1, s.nextInt()}).sorted(Comparator.comparingInt(e -> e[2])).toList() instanceof List<int[]> es
            && IntStream.range(0, n).toArray() instanceof int[] p
            && IntStream.generate(() -> 1).limit(n).toArray() instanceof int[] sz
            && IntStream.generate(() -> Integer.MAX_VALUE).limit(n).toArray() instanceof int[] w
            && new long[2] instanceof long[] acc
            && ((IntUnaryOperator) x -> IntStream.iterate(x, v -> p[v]).filter(v -> p[v] == v).findFirst().getAsInt()) instanceof IntUnaryOperator find
            && es.stream().allMatch(e -> Integer.valueOf(find.applyAsInt(e[0])) instanceof Integer ra && Integer.valueOf(find.applyAsInt(e[1])) instanceof Integer rb
                && !ra.equals(rb)
                && Integer.valueOf(sz[ra] < sz[rb] ? ra : rb) instanceof Integer lo && Integer.valueOf(sz[ra] < sz[rb] ? rb : ra) instanceof Integer hi
                && (p[lo] = hi) >= 0 && (w[lo] = e[2]) > 0 && (sz[hi] += sz[lo]) > 0 && (acc[0] += e[2]) > 0 && acc[1]++ >= 0 || true)
            && Integer.valueOf(s.nextInt()) instanceof Integer q
            ? IntStream.range(0, q).mapToObj(i -> new int[]{s.nextInt() - 1, s.nextInt() - 1}).map(ab ->
                Integer.valueOf(find.applyAsInt(ab[0])) instanceof Integer ra && Integer.valueOf(find.applyAsInt(ab[1])) instanceof Integer rb
                ? (n - acc[1] == 1
                    ? acc[0] - Stream.iterate(new int[]{ab[0], ab[1], 0}, st -> w[st[0]] < w[st[1]]
                            ? new int[]{p[st[0]], st[1], Math.max(st[2], w[st[0]])} : new int[]{st[0], p[st[1]], Math.max(st[2], w[st[1]])})
                        .dropWhile(st -> st[0] != st[1]).findFirst().get()[2]
                    : n - acc[1] == 2 && !ra.equals(rb) ? acc[0] : -1L)
                : -1L).map(String::valueOf).collect(Collectors.joining("\n"))
            : ""));
    }
}



