import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(IntStream.generate(s::nextInt).limit(5).toArray()).ifPresent(a -> System.out.print(a[0] >= a[1] ? 0 : Stream.iterate((double) a[0] * a[2], p -> p * a[1] / (a[1] - a[0]) + a[0] * (p * a[1] / (a[1] - a[0]) / a[1] + a[3])).takeWhile(p -> p * a[1] / (a[1] - a[0]) < a[4] - 1e-9).count())));
    }
}

