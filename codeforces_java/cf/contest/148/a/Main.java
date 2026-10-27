import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(IntStream.generate(s::nextInt).limit(5).toArray()).ifPresent(a -> System.out.print(IntStream.rangeClosed(1, a[4]).filter(i -> i % a[0] == 0 || i % a[1] == 0 || i % a[2] == 0 || i % a[3] == 0).count())));
    }
}

