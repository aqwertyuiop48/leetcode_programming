import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(IntStream.generate(s::nextInt).limit(3).toArray()).ifPresent(v -> System.out.print(v[1] + v[2] >= v[0] || (v[2] == 0 && v[1] > 0 && v[0] == v[1] + 1) ? "-1" : IntStream.concat(IntStream.of(1), IntStream.concat(IntStream.rangeClosed(1, v[2]).map(j -> 1 << j), IntStream.concat(v[2] == 0 && v[1] > 0 ? IntStream.of(1) : IntStream.empty(), IntStream.concat(IntStream.rangeClosed(1, v[1]).map(j -> v[2] == 0 ? j + 1 : (1 << v[2]) + j), IntStream.generate(() -> 1))))).limit(v[0]).mapToObj(String::valueOf).collect(Collectors.joining(" ")))));
    }
}
