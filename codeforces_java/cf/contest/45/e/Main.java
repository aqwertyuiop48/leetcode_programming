import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n -> System.out.println(
            IntStream.range(0, 2 * n).mapToObj(i -> s.next()).toList() instanceof List<String> all
            && all.subList(0, n).stream().sorted().toList() instanceof List<String> nm
            && all.subList(n, 2 * n).stream().sorted().toList() instanceof List<String> sn
            && new boolean[n] instanceof boolean[] used
            && ((BiFunction<Integer, Integer, Long>) (from, ex) -> IntStream.range(0, 26).mapToLong(c -> Math.min(IntStream.range(from, n).filter(j -> nm.get(j).charAt(0) - 'A' == c).count(), IntStream.range(0, n).filter(j -> !used[j] && j != ex && sn.get(j).charAt(0) - 'A' == c).count())).sum()) instanceof BiFunction<Integer, Integer, Long> mt
            ? IntStream.range(0, n).mapToObj(i -> IntStream.range(0, n).filter(j -> !used[j] && (nm.get(i).charAt(0) == sn.get(j).charAt(0) ? 1 : 0) + mt.apply(i + 1, j) == mt.apply(i, -1)).mapToObj(j -> (used[j] = true) ? nm.get(i) + " " + sn.get(j) : "").findFirst().get()).collect(Collectors.joining(", "))
            : "")));
    }
}


