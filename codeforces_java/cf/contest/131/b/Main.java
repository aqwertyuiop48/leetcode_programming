import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(IntStream.generate(s::nextInt).limit(s.nextInt()).toArray()).ifPresent(a -> System.out.print(IntStream.rangeClosed(1, 10).mapToLong(v -> Arrays.stream(a).filter(x -> x == v).count() * Arrays.stream(a).filter(x -> x == -v).count()).sum() + Arrays.stream(a).filter(x -> x == 0).count() * (Arrays.stream(a).filter(x -> x == 0).count() - 1) / 2)));
    }
}
