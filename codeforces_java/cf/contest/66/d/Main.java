import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n -> System.out.print(n < 3 ? "-1" : IntStream.concat(IntStream.of(6, 10, 15), IntStream.range(2, n - 1).map(m -> 6 * m)).limit(n).mapToObj(String::valueOf).collect(Collectors.joining("\n")))));
    }
}


