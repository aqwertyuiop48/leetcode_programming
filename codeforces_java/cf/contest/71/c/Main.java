import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            Optional.of(s.nextInt()).ifPresent(n ->
            Optional.of(IntStream.generate(s::nextInt).limit(n).toArray()).ifPresent(a ->
                System.out.print(IntStream.rangeClosed(1, n / 3).filter(d -> n % d == 0).anyMatch(d -> IntStream.range(0, d).anyMatch(o -> IntStream.iterate(o, i -> i < n, i -> i + d).allMatch(i -> a[i] == 1))) ? "YES" : "NO"))));
    }
}
