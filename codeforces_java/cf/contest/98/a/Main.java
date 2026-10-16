import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc -> System.out.println(
            sc.next() instanceof String c
            && List.of(List.of(0, 1, 4, 5, 3, 2), List.of(3, 2, 0, 1, 4, 5)) instanceof List<List<Integer>> gens
            && Stream.iterate(Set.<List<Integer>>of(List.of(0, 1, 2, 3, 4, 5)), grp ->
                Stream.concat(grp.stream(), grp.stream().flatMap(x -> gens.stream().map(g -> IntStream.range(0, 6).mapToObj(i -> x.get(g.get(i))).toList())))
                    .collect(Collectors.toSet())).limit(8).reduce((x, y) -> y).get() instanceof Set<List<Integer>> rots
            ? IntStream.range(0, 46656)
                .filter(v -> IntStream.range(0, 6).map(i -> v / (int) Math.pow(6, i) % 6).distinct().count() == 6)
                .mapToObj(v -> IntStream.range(0, 6).map(i -> v / (int) Math.pow(6, i) % 6).mapToObj(j -> String.valueOf(c.charAt(j))).collect(Collectors.joining()) instanceof String a
                    ? rots.stream().map(p -> p.stream().map(j -> String.valueOf(a.charAt(j))).collect(Collectors.joining())).min(Comparator.naturalOrder()).get()
                    : "")
                .distinct().count()
            : 0));
    }
}



