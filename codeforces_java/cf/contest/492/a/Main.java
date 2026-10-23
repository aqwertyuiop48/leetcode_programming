import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(sc -> Optional.of(sc.nextInt()).ifPresent(n -> System.out.print(
            IntStream.iterate(1, h -> h + 1).takeWhile(h -> h * (h + 1) * (h + 2) / 6 <= n).count())));
    }
}
