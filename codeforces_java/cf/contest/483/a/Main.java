import java.math.BigInteger;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(
            new Scanner(System.in) instanceof Scanner sc
            && Long.valueOf(sc.nextLong()) instanceof Long l
            && Long.valueOf(sc.nextLong()) instanceof Long r
            && ((BiPredicate<Long, Long>) (x, y) -> BigInteger.valueOf(x).gcd(BigInteger.valueOf(y)).equals(BigInteger.ONE)) instanceof BiPredicate<Long, Long> cp
            && LongStream.rangeClosed(l, r).boxed().flatMap(a -> LongStream.rangeClosed(a + 1, r).boxed().filter(b -> cp.test(a, b)).flatMap(b -> LongStream.rangeClosed(b + 1, r).boxed().filter(c -> cp.test(b, c) && !cp.test(a, c)).map(c -> a + " " + b + " " + c))).findFirst() instanceof Optional<String> res
            ? res.orElse("-1")
            : "");
    }
}
