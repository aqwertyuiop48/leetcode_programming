import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextLong()).ifPresent(n ->
            System.out.println(
                IntStream.rangeClosed(1, 10).boxed()
                    .flatMap(len -> IntStream.range(0, 1 << (len - 1)).mapToObj(mask ->
                        IntStream.range(0, len).mapToObj(bit -> bit == 0 ? "1" : (((mask >> (bit - 1)) & 1) == 1 ? "1" : "0"))
                            .collect(Collectors.joining())))
                    .mapToLong(Long::parseLong)
                    .filter(v -> v <= n)
                    .count())));
    }
}



