import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc && Integer.valueOf(sc.nextInt()) instanceof Integer n && Integer.valueOf(sc.nextInt()) instanceof Integer m
            && IntStream.rangeClosed(0, n).toArray() instanceof int[] p && ((IntUnaryOperator) v -> IntStream.iterate(v, x -> p[x] != x, x -> p[x]).reduce(v, (x, y) -> p[y])) instanceof IntUnaryOperator find
            && IntStream.range(0, m).allMatch(i -> (p[find.applyAsInt(sc.nextInt())] = find.applyAsInt(sc.nextInt())) >= 0)
            && IntStream.iterate(n, v -> v >= 1, v -> v - 1).boxed().collect(Collectors.groupingBy(v -> find.applyAsInt(v), TreeMap::new, Collectors.toList())).values().stream().toList() instanceof List<List<Integer>> comps
            && comps.stream().filter(c -> c.size() == 1).toList() instanceof List<List<Integer>> c1 && comps.stream().filter(c -> c.size() == 2).toList() instanceof List<List<Integer>> c2
            && comps.stream().filter(c -> c.size() == 3).toList() instanceof List<List<Integer>> c3
            ? comps.stream().anyMatch(c -> c.size() > 3) || c2.size() > c1.size() || (c1.size() - c2.size()) % 3 != 0 ? "-1"
                : Stream.of(c3.stream(), IntStream.range(0, c2.size()).mapToObj(i -> Stream.concat(c2.get(i).stream(), c1.get(i).stream()).toList()),
                    IntStream.range(0, (c1.size() - c2.size()) / 3).mapToObj(i -> IntStream.range(0, 3).mapToObj(j -> c1.get(c2.size() + 3 * i + j).get(0)).toList())).flatMap(x -> x)
                    .map(t -> t.stream().sorted(Comparator.reverseOrder()).map(String::valueOf).collect(Collectors.joining(" "))).collect(Collectors.joining("\n")) : "");
    }
}

