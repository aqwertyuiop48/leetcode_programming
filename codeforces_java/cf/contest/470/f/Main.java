import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n -> Optional.of(IntStream.range(0, n).map(i -> s.nextInt()).toArray()).ifPresent(a -> System.out.print(IntStream.range(0, n).mapToObj(i -> String.valueOf(a[i] + a[(i + n - 1) % n])).collect(Collectors.joining(" "))))));
    }
}
