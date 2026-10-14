import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.stream(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().collect(Collectors.joining(" ")).trim().split(" +")).skip(1).toList() instanceof List<String> w
            && w.stream().flatMap(x -> IntStream.range(0, x.length()).boxed().flatMap(i -> IntStream.rangeClosed(i + 1, x.length()).mapToObj(j -> x.substring(i, j)))).collect(Collectors.toSet()) instanceof Set<String> sub
            && new HashMap<String, long[]>() instanceof HashMap<String, long[]> memo
            && new AtomicReference<Function<String, long[]>>() instanceof AtomicReference<Function<String, long[]>> ref
            && ref.compareAndSet(null, s -> memo.containsKey(s) ? memo.get(s)
                : IntStream.rangeClosed('a', 'z').boxed().flatMap(c -> Stream.of((char) (int) c + s, s + (char) (int) c)).filter(sub::contains)
                    .map(t -> ref.get().apply(t) instanceof long[] o
                        ? new long[]{1 - o[0], o[2] + t.chars().map(ch -> ch - 'a' + 1).sum() * t.chars().map(ch -> ch - 'a' + 1).max().getAsInt() * w.stream().filter(x -> x.contains(t)).count() + 1, o[1]}
                        : null)
                    .max(Comparator.<long[]>comparingLong(o -> o[0]).thenComparingLong(o -> o[1]).thenComparingLong(o -> -o[2])).orElse(new long[]{0, 0, 0}) instanceof long[] r
                    && memo.put(s, r) == null ? r : memo.get(s))
            && ref.get().apply("") instanceof long[] res
            ? (res[0] == 1 ? "First" : "Second") + "\n" + res[1] + " " + res[2]
            : "");
    }
}
