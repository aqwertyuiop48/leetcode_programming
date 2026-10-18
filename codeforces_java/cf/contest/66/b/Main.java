import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n -> Optional.of(IntStream.generate(s::nextInt).limit(n).toArray()).ifPresent(a -> System.out.print(IntStream.range(0, n).mapToLong(i -> IntStream.rangeClosed(1, i).takeWhile(k -> a[i - k] <= a[i - k + 1]).count() + IntStream.range(i + 1, n).takeWhile(k -> a[k] <= a[k - 1]).count() + 1).max().getAsLong()))));
    }
}




