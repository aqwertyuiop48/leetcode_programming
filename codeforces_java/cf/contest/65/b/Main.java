import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(new int[]{1000}).ifPresent(p -> Optional.of(IntStream.generate(s::nextInt).limit(s.nextInt()).map(y -> Optional.of(IntStream.concat(IntStream.of(y), IntStream.range(0, 40).map(k -> y - y / (int) Math.pow(10, k / 10) % 10 * (int) Math.pow(10, k / 10) + k % 10 * (int) Math.pow(10, k / 10))).filter(c -> c >= p[0] && c <= 2011).min().orElse(-1)).map(c -> c < 0 ? -1 : (p[0] = c)).get()).toArray()).ifPresent(r -> System.out.print(IntStream.of(r).anyMatch(x -> x < 0) ? "No solution" : IntStream.of(r).mapToObj(String::valueOf).collect(Collectors.joining("\n"))))));
    }
}


