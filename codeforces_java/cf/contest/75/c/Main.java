import java.math.BigInteger;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s ->
            System.out.println(
                Long.valueOf(BigInteger.valueOf(s.nextLong()).gcd(BigInteger.valueOf(s.nextLong())).longValue()) instanceof Long g
                && LongStream.rangeClosed(1, (long) Math.sqrt(g)).filter(i -> g % i == 0).flatMap(i -> LongStream.of(i, g / i)).sorted().distinct().toArray() instanceof long[] d
                ? IntStream.range(0, s.nextInt())
                    .mapToObj(i -> new long[]{s.nextLong(), s.nextLong()})
                    .map(q -> Long.valueOf(LongStream.of(d).filter(v -> v <= q[1]).max().orElse(-1)) instanceof Long b && b >= q[0] ? b : -1L)
                    .map(String::valueOf)
                    .collect(Collectors.joining("\n"))
                : ""));
    }
}





