import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            Optional.of(IntStream.generate(s::nextInt).limit(6).toArray()).ifPresent(v ->
                System.out.print(IntStream.rangeClosed(v[4], v[5]).filter(x ->
                    IntStream.range(0, 256).filter(m -> (m & 3) != (m >> 2 & 3) && (m & 3) != (m >> 4 & 3) && (m & 3) != (m >> 6 & 3) && (m >> 2 & 3) != (m >> 4 & 3) && (m >> 2 & 3) != (m >> 6 & 3) && (m >> 4 & 3) != (m >> 6 & 3))
                        .filter(m -> x % v[m & 3] % v[m >> 2 & 3] % v[m >> 4 & 3] % v[m >> 6 & 3] == x).count() >= 7).count())));
    }
}
