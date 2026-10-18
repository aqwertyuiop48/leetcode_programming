import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in).next()).ifPresent(s -> Optional.of(Stream.iterate(Set.of(List.of(0, 1, 2, 3, 4, 5)), st -> st.stream().flatMap(p -> Stream.of(p, IntStream.range(0, 6).mapToObj(i -> p.get(new int[]{0, 1, 4, 5, 3, 2}[i])).toList(), IntStream.range(0, 6).mapToObj(i -> p.get(new int[]{2, 3, 1, 0, 4, 5}[i])).toList())).collect(Collectors.toSet())).limit(12).reduce((x, y) -> y).get()).ifPresent(rots -> System.out.print(
            IntStream.range(0, 46656).mapToObj(m -> IntStream.iterate(m, x -> x / 6).limit(6).map(x -> x % 6).toArray()).filter(d -> Arrays.stream(d).distinct().count() == 6).map(d -> Arrays.stream(d).mapToObj(i -> "" + s.charAt(i)).collect(Collectors.joining())).distinct().map(arr -> rots.stream().map(p -> p.stream().map(i -> "" + arr.charAt(i)).collect(Collectors.joining())).min(Comparator.naturalOrder()).get()).distinct().count())));
    }
}




