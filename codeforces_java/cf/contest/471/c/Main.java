import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in).nextLong()).ifPresent(n -> System.out.print(LongStream.rangeClosed(1, 1000000).filter(h -> h * (3 * h + 1) / 2 <= n && (n + h) % 3 == 0).count()));
    }
}
