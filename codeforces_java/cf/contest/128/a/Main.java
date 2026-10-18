import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc -> Optional.of(Stream.generate(sc::next).limit(8).collect(Collectors.joining())).ifPresent(g -> System.out.print(Arrays.asList(IntStream.range(0, 8).boxed().reduce(IntStream.range(0, 64).mapToObj(i -> i == 56).toArray(Boolean[]::new), (cur, t) -> IntStream.range(0, 64).mapToObj(p -> !(p / 8 - t >= 0 && g.charAt((p / 8 - t) * 8 + p % 8) == 'S') && !(p / 8 - t - 1 >= 0 && g.charAt((p / 8 - t - 1) * 8 + p % 8) == 'S') && IntStream.rangeClosed(-1, 1).anyMatch(dr -> IntStream.rangeClosed(-1, 1).anyMatch(dc -> p / 8 + dr >= 0 && p / 8 + dr < 8 && p % 8 + dc >= 0 && p % 8 + dc < 8 && cur[(p / 8 + dr) * 8 + p % 8 + dc]))).toArray(Boolean[]::new), (a, b) -> a)).contains(true) ? "WIN" : "LOSE")));
    }
}
