import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in).nextInt()).ifPresent(n -> Optional.<IntPredicate>of(x -> IntStream.rangeClosed(2, (int) Math.sqrt(x)).anyMatch(d -> x % d == 0)).ifPresent(c -> System.out.print(IntStream.iterate(4, i -> i + 1).filter(i -> c.test(i) && c.test(n - i)).boxed().findFirst().map(i -> i + " " + (n - i)).get())));
    }
}
