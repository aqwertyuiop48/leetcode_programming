import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Long.valueOf(s.nextLong()) instanceof Long n
            && new long[]{n} instanceof long[] rest
            && LongStream.rangeClosed(2, 1_000_000).flatMap(p -> LongStream.generate(() -> p).takeWhile(q -> rest[0] > 1 && rest[0] % q == 0).peek(q -> rest[0] /= q)).boxed().toList() instanceof List<Long> small
            ? Stream.concat(small.stream(), rest[0] > 1 ? Stream.of(rest[0]) : Stream.<Long>empty()).map(String::valueOf).collect(Collectors.joining("*"))
            : "");
    }
}

