import java.util.*;
import java.util.stream.*;


public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n -> System.out.println(
            Stream.iterate(List.of(1), l -> IntStream.range(0, l.size()).boxed().flatMap(i -> IntStream.range(i + 1, l.size()).mapToObj(j -> l.get(i) + l.get(j)))
                    .collect(Collectors.toSet()) instanceof Set<Integer> S
                ? Stream.concat(l.stream(), Stream.of(IntStream.iterate(l.get(l.size() - 1) + 1, x -> x + 1)
                    .filter(x -> l.stream().noneMatch(ai -> S.contains(x + ai))).findFirst().getAsInt())).toList()
                : l).skip(n - 1).findFirst().get() instanceof List<Integer> a
            ? IntStream.range(0, n).mapToObj(i -> IntStream.range(0, n).mapToObj(j -> "" + (i == j ? 0 : a.get(i) + a.get(j))).collect(Collectors.joining(" "))).collect(Collectors.joining("\n"))
            : "")));
    }
}





