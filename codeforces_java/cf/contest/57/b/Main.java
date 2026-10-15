import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n -> Optional.of(s.nextInt()).ifPresent(m -> Optional.of(s.nextInt()).ifPresent(k ->
            System.out.println(
                IntStream.range(0, m).mapToObj(i -> new long[]{s.nextLong(), s.nextLong(), s.nextLong()}).toList() instanceof List<long[]> o
                ? IntStream.range(0, k).mapToLong(i -> Optional.of(s.nextLong()).map(q -> o.stream().filter(r -> r[0] <= q && q <= r[1]).mapToLong(r -> r[2] + q - r[0]).sum()).get()).sum()
                : 0L)))));
    }
}

