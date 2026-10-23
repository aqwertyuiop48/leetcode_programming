import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n -> Optional.of(s.nextInt()).ifPresent(k -> Optional.of(IntStream.range(0, n).map(i -> s.nextInt()).sorted().toArray()).ifPresent(a -> System.out.print(IntStream.iterate(n - 1, i -> i >= 0, i -> i - k).map(i -> 2 * (a[i] - 1)).sum())))));
    }
}
