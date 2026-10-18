import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s
            && Long.valueOf(s.nextLong()) instanceof Long n
            && ((LongUnaryOperator) x -> LongStream.rangeClosed(2, 1_000_000).filter(p -> p * p <= x && x % p == 0).findFirst().orElse(x)) instanceof LongUnaryOperator f
            ? n == 1 || f.applyAsLong(n) == n ? "1\n0"
                : f.applyAsLong(n / f.applyAsLong(n)) == n / f.applyAsLong(n) ? "2"
                : "1\n" + f.applyAsLong(n) * f.applyAsLong(n / f.applyAsLong(n))
            : "");
    }
}
