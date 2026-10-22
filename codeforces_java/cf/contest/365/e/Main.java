import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Integer.valueOf(new Scanner(System.in).nextInt()) instanceof Integer k
            && Long.valueOf(2L * k * k) instanceof Long lim
            && new long[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37} instanceof long[] P
            ? IntStream.rangeClosed(1, 12).mapToObj(m -> LongStream.of(P).limit(m).boxed().reduce(List.of(1L), (L, p) -> L.stream().flatMap(x -> LongStream.iterate(x, y -> y <= lim, y -> y * p).boxed()).toList(), (u, v) -> u).stream().sorted().toList() instanceof List<Long> all
                    && all.size() >= k && all.subList(all.size() - k, all.size()) instanceof List<Long> top
                    && LongStream.of(P).limit(m).allMatch(p -> 2 * top.stream().filter(x -> x % p == 0).count() >= k)
                    ? top : null)
                .filter(Objects::nonNull).findFirst().get().stream().map(String::valueOf).collect(Collectors.joining(" ")) : "");
    }
}
