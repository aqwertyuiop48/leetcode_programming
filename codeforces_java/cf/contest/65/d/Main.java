import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.next()).ifPresent(n -> Optional.of(Arrays.stream(s.next().split("")).reduce(Set.of(0L), (st, c) -> st.stream().flatMap(x -> Optional.of(IntStream.range(0, 4).map(h -> (int) (x >> 14 * h & 16383)).toArray()).map(cn -> "GHRS".contains(c) ? Stream.of(x + (1L << 14 * "GHRS".indexOf(c))) : IntStream.range(0, 4).filter(h -> cn[h] == Arrays.stream(cn).min().getAsInt()).mapToObj(h -> x + (1L << 14 * h))).get()).collect(Collectors.toSet()), (a, b) -> a).stream().flatMapToInt(x -> Optional.of(IntStream.range(0, 4).map(h -> (int) (x >> 14 * h & 16383)).toArray()).map(cn -> IntStream.range(0, 4).filter(h -> cn[h] == Arrays.stream(cn).min().getAsInt())).get()).distinct().sorted().mapToObj(h -> new String[]{"Gryffindor", "Hufflepuff", "Ravenclaw", "Slytherin"}[h]).collect(Collectors.joining("\n"))).ifPresent(System.out::print)));
    }
}




