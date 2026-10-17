import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> System.out.println(
            (Integer) s.nextInt() instanceof Integer n
            && IntStream.rangeClosed(0, 245).boxed().flatMap(a -> IntStream.rangeClosed(0, a).filter(b -> a * a + b * b > 0 && a * a + b * b <= 60000).mapToObj(b -> new int[]{a * a + b * b, a, b}))
                .collect(Collectors.groupingBy(p -> p[0], TreeMap::new, Collectors.toList())) instanceof TreeMap<Integer, List<int[]>> byV
            && byV.keySet().stream().mapToInt(x -> x).toArray() instanceof int[] vals
            && (Integer) IntStream.of(vals).limit(n).sum() instanceof Integer s1
            && (s1 % 2 == 0
                ? IntStream.of(vals).limit(n).toArray()
                : IntStream.of(vals).limit(n + 1).toArray() instanceof int[] f
                    && (Integer) ((s1 + f[n]) % 2) instanceof Integer par
                    && (Integer) IntStream.of(f).filter(x -> x % 2 == par).max().getAsInt() instanceof Integer rm
                    ? IntStream.of(f).filter(x -> x != rm).toArray()
                    : new int[0]) instanceof int[] chosen
            && new long[]{0, 0} instanceof long[] sm
            && IntStream.of(chosen).boxed().sorted(Comparator.reverseOrder()).map(v ->
                byV.get(v).stream().flatMap(p -> Stream.of(new int[]{p[1], p[2]}, new int[]{p[1], -p[2]}, new int[]{-p[1], p[2]}, new int[]{-p[1], -p[2]},
                        new int[]{p[2], p[1]}, new int[]{p[2], -p[1]}, new int[]{-p[2], p[1]}, new int[]{-p[2], -p[1]}))
                    .sorted(Comparator.<int[]>comparingInt(c -> c[0]).thenComparingInt(c -> c[1]))
                    .min(Comparator.comparingLong(c -> (sm[0] + c[0]) * (sm[0] + c[0]) + (sm[1] + c[1]) * (sm[1] + c[1]))).get() instanceof int[] best
                && (sm[0] += best[0]) != Long.MIN_VALUE && (sm[1] += best[1]) != Long.MIN_VALUE ? best : null).toList() instanceof List<int[]> vec
            && sm[0] == 0 && sm[1] == 0
            && new long[]{0, 0} instanceof long[] cur
            && vec.stream().sorted((u, w) -> (u[1] > 0 || u[1] == 0 && u[0] > 0 ? 0 : 1) != (w[1] > 0 || w[1] == 0 && w[0] > 0 ? 0 : 1)
                    ? (u[1] > 0 || u[1] == 0 && u[0] > 0 ? 0 : 1) - (w[1] > 0 || w[1] == 0 && w[0] > 0 ? 0 : 1)
                    : -Long.signum((long) u[0] * w[1] - (long) u[1] * w[0]))
                .map(u -> cur[0] + " " + cur[1] + ((cur[0] += u[0]) != Long.MIN_VALUE && (cur[1] += u[1]) != Long.MIN_VALUE ? "" : "")).toList() instanceof List<String> lines
            ? "YES\n" + String.join("\n", lines)
            : "NO"));
    }
}

