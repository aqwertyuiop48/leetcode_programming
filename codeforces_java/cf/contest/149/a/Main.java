import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(k -> Optional.of(IntStream.generate(s::nextInt).limit(12).boxed().sorted(Comparator.reverseOrder()).mapToInt(x -> x).toArray()).ifPresent(a -> System.out.print(IntStream.rangeClosed(0, 12).filter(c -> IntStream.range(0, c).map(i -> a[i]).sum() >= k).findFirst().orElse(-1)))));
    }
}
