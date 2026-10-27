import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in).nextLong()).ifPresent(n -> System.out.print(((LongUnaryOperator) x -> LongStream.rangeClosed(2, (long) Math.sqrt(x)).filter(d -> x % d == 0).findFirst().orElse(x)) instanceof LongUnaryOperator f && Long.valueOf(f.applyAsLong(n)) instanceof Long a ? (n == 1 || a.equals(n) ? "1\n0" : f.applyAsLong(n / a) == n / a ? "2" : "1\n" + a * f.applyAsLong(n / a)) : ""));
    }
}

