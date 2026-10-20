import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Arrays.stream(l.trim().split("\\s+"))).filter(w -> !w.isEmpty()).mapToInt(Integer::parseInt).toArray() instanceof int[] t
            && Integer.valueOf(t[0]) instanceof Integer n && Integer.valueOf(t[1]) instanceof Integer m
            ? (n <= 7
                ? Integer.valueOf(n * (n - 1) / 2) instanceof Integer P
                && ((BinaryOperator<Integer>) (u, v) -> Integer.valueOf(Math.min(u, v)) instanceof Integer a && Integer.valueOf(Math.max(u, v)) instanceof Integer b ? b * (b - 1) / 2 + a : 0) instanceof BinaryOperator<Integer> pid
                && Integer.valueOf(IntStream.range(0, m).map(i -> 1 << pid.apply(t[2 + 2 * i] - 1, t[3 + 2 * i] - 1)).reduce(0, (x, y) -> x | y)) instanceof Integer orig
                && IntStream.range(0, n).map(v -> IntStream.range(0, n).filter(u -> u != v).map(u -> 1 << pid.apply(u, v)).reduce(0, (x, y) -> x | y)).toArray() instanceof int[] vm
                && IntStream.range(0, 1 << P).filter(mask -> (mask & orig) == 0 && Integer.bitCount(mask) == m && Arrays.stream(vm).allMatch(x -> Integer.bitCount(mask & x) <= 2)).findFirst() instanceof OptionalInt f
                ? (f.isPresent() ? IntStream.range(0, n).boxed().flatMap(b -> IntStream.range(0, b).filter(a -> (f.getAsInt() >> (b * (b - 1) / 2 + a) & 1) != 0).mapToObj(a -> (a + 1) + " " + (b + 1))).collect(Collectors.joining("\n")) : "-1") : ""
                : IntStream.range(0, m).mapToObj(i -> Math.min(t[2 + 2 * i], t[3 + 2 * i]) * (long) (n + 1) + Math.max(t[2 + 2 * i], t[3 + 2 * i])).collect(Collectors.toSet()) instanceof Set<Long> es
                && new Random(20130625L) instanceof Random rnd
                && Stream.generate(() -> rnd.doubles(n).toArray() instanceof double[] key ? IntStream.range(0, n).boxed().sorted(Comparator.comparingDouble(i -> key[i])).mapToInt(i -> i + 1).toArray() : null).limit(20000)
                    .filter(p -> IntStream.range(0, m).noneMatch(i -> es.contains(Math.min(p[i], p[(i + 1) % n]) * (long) (n + 1) + Math.max(p[i], p[(i + 1) % n])))).findFirst() instanceof Optional<int[]> res
                ? (res.isPresent() ? IntStream.range(0, m).mapToObj(i -> res.get()[i] + " " + res.get()[(i + 1) % n]).collect(Collectors.joining("\n")) : "-1") : "") : "");
    }
}
